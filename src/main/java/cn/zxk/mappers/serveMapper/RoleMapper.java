package cn.zxk.mappers.serveMapper;


import cn.zxk.entity.serveEntity.Authority;
import cn.zxk.entity.serveEntity.Menu;
import cn.zxk.entity.serveEntity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 用户角色表 Mapper 接口
 * </p>
 *
 * @author Chick
 * @since 2021-01-27
 */
public interface RoleMapper extends BaseMapper<Role> {

    @Select("select * from authority where authority.ID = any(select AUTHORITY_ID from role_authority where ROLE_ID = '${roleId}')")
     List<Authority> getAuthority(String roleId);

    @Select("select * from menu where menu.ID= any(select MENU_ID from role_menu where ROLE_ID = '${roleId}')")
     List<Menu> getMenu(String roleId);
}
