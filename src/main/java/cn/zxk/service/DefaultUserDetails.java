package cn.zxk.service;

import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.serveEntity.enmus.UserStatus;
import cn.zxk.mappers.serveMapper.RoleMapper;
import cn.zxk.mappers.serveMapper.UserMapper;
import cn.zxk.service.sysService.IUserService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.tomcat.util.http.fileupload.util.LimitedInputStream;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.*;

@Data
@Accessors(chain = true)
@MapperScan("cn.zxk.mapper.*")
public class DefaultUserDetails implements UserDetails {

    private static final long serialVersionUID = 7595960008450636802L;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    private User user;
    private Collection<? extends GrantedAuthority> authorities;
    private Set<Menu> menus;
    private JSONObject permissions;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public DefaultUserDetails(User user) {
        Set authoritySet = new HashSet();
        Set menuSet = new HashSet();
        userMapper.getRoles(user.getID()).forEach(role -> {
            authoritySet.add(new Authority().setName(role.getName()).setDescription(role.getDescription()));
            roleMapper.getAuthority(role.getID()).forEach(authority -> authoritySet.add(new Authority().setName(authority.getName())
                    .setDescription(authority.getDescription())));
            roleMapper.getMenu(role.getID()).forEach(menu -> menuSet.add(new Menu().setID(menu.getID())
                    .setName(menu.getName())
                    .setTitle(menu.getTitle())
                    .setPath(menu.getPath())
                    .setDescription(menu.getDescription())
                    .setIcon(menu.getIcon())
                    .setOrder(menu.getOrder())
                    .setDeploy(menu.getDeploy())));
            this.setPermissions(JSON.parseObject(role.getPermissions()));
        });
        this.setAuthorities(authoritySet);
        this.setMenus(menuSet);
        this.setUser(
                new User().setID(user.getID()).setName(user.getName()).setNickname(user.getNickname())
                        .setStatus(user.getStatus()).setPassword(user.getPassword()).setEmail(user.getEmail())
                        .setPhone(user.getPhone()));
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public String getUsername() {
        return user.getName();
    }

    @Override
    public boolean isAccountNonExpired() {
        Optional<UserStatus> userStatus = UserStatus.fromCode(user.getStatus());
        return userStatus.isPresent() && userStatus.get().equals(UserStatus.AVAILABLE);
    }

    @Override
    public boolean isAccountNonLocked() {
        Optional<UserStatus> userStatus = UserStatus.fromCode(user.getStatus());
        return userStatus.isPresent() && userStatus.get().equals(UserStatus.AVAILABLE);
    }

    @Override
    public boolean isCredentialsNonExpired() {
        Optional<UserStatus> userStatus = UserStatus.fromCode(user.getStatus());
        return userStatus.isPresent() && userStatus.get().equals(UserStatus.AVAILABLE);
    }

    @Override
    public boolean isEnabled() {
        Optional<UserStatus> userStatus = UserStatus.fromCode(user.getStatus());
        return userStatus.isPresent() && userStatus.get().equals(UserStatus.AVAILABLE);
    }
}
