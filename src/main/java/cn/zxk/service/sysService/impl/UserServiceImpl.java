package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.mappers.serveMapper.RoleMapper;
import cn.zxk.mappers.serveMapper.UserMapper;
import cn.zxk.service.DefaultUserDetails;
import cn.zxk.service.sysService.IUserService;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService, UserDetailsService {

    @Autowired
    private IUserService userService;

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    public List<User> query(QueryEntity<User>queryEntity){
        return null;
    }

    private User userWithDetail(String username) {
//    UserPO userPO = Optional.ofNullable(userDao.findByNameWithRoles(username))
//        .orElseThrow(() -> new UsernameNotFoundException("User '" + username + "' not found"));

        User User = Optional.ofNullable(userService.getOne(new QueryWrapper<User>().eq("NAME", username)))
                .orElseThrow(() -> new UsernameNotFoundException("User '" + username + "' not found"));
        return User;
    }

    public User findByName(String username) {
        return userService.getOne(new QueryWrapper<User>().eq("NAME", username));
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        DefaultUserDetails dud = new DefaultUserDetails();
        Set authoritySet = new HashSet();
        Set menuSet = new HashSet();
        User user = userWithDetail(s);
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
            dud.setPermissions(JSONObject.parseObject(role.getPermissions()));
        });
        dud.setAuthorities(authoritySet);
        dud.setMenus(menuSet);
        dud.setUser(
                new User().setID(user.getID()).setName(user.getName()).setNickname(user.getNickname())
                        .setStatus(user.getStatus()).setPassword(user.getPassword()).setEmail(user.getEmail())
                        .setPhone(user.getPhone()));
        return dud;
    }
}
