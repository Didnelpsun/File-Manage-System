package org.didnelpsun.dao;

import org.didnelpsun.entity.Role;

import java.util.List;

public interface RoleDAO {
    // 查询所有用户
    List<Role> selectAllRoles();
}
