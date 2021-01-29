package cn.zxk.service;

import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.serveEntity.enmus.UserStatus;
import cn.zxk.service.sysService.impl.RoleServiceImpl;
import cn.zxk.service.sysService.impl.UserServiceImpl;
import cn.zxk.util.GetMapperUtil;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Data
@Accessors(chain = true)
public class DefaultUserDetails implements UserDetails {

    private static final long serialVersionUID = 7595960008450636802L;


    private User user;
    private Collection<? extends GrantedAuthority> authorities;
    private Set<Menu> menus;
    private JSONObject permissions;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
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
