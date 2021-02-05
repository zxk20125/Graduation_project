package cn.zxk.service.sysService.impl;

import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.serveEntity.Role;
import cn.zxk.entity.serveEntity.User;
import cn.zxk.entity.utilEntity.QueryEntity;
import cn.zxk.entity.utilEntity.Range;
import cn.zxk.entity.utilEntity.RespMessage;
import cn.zxk.mappers.serveMapper.RoleMapper;
import cn.zxk.mappers.serveMapper.UserMapper;
import cn.zxk.service.DefaultUserDetails;
import cn.zxk.service.sysService.IUserService;
import cn.zxk.util.StringUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
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
    private UserMapper userMapper;
    @Autowired
    private RoleMapper roleMapper;

    public RespMessage query(QueryEntity<User> query) {
        QueryEntity.Order order = query.getOrders().get(0);
        Range range = query.getRanges().get(0);
        return RespMessage.ok("success", userMapper.selectPage(new Page<>(query.getPageNum(), query.getPageSize()), new QueryWrapper<User>()
                .like(!StringUtil.isBlank(query.getQuery().getName()), "NAME", query.getQuery().getName())
                .like(!StringUtil.isBlank(query.getQuery().getStatus()), "STATUS", query.getQuery().getStatus())
                .orderBy(true, !order.getOrder().equals("desc"), "create_time")
                ));
    }

    private User userWithDetail(String username) {
//    UserPO userPO = Optional.ofNullable(userDao.findByNameWithRoles(username))
//        .orElseThrow(() -> new UsernameNotFoundException("User '" + username + "' not found"));

        User User = Optional.ofNullable(userMapper.selectOne(new QueryWrapper<User>().eq("NAME", username)))
                .orElseThrow(() -> new UsernameNotFoundException("User '" + username + "' not found"));
        return User;
    }

    public User findByName(String username) {
        return userMapper.selectOne(new QueryWrapper<User>().eq("NAME", username));
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
                    .setDeploy(menu.getDeploy())
                    .setParentId(menu.getParentId())));
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
