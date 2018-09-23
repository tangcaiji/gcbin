package cn.wdq.service;

import cn.wdq.entities.GroupPermission;

import java.util.List;

public interface UserPermission {
    List<GroupPermission> getPermissionList();
    int savePermission(GroupPermission groupPermission);
    int deletePermission(GroupPermission groupPermission);
}
