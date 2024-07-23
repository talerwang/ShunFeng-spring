package com.great.javabean;

import java.time.LocalDateTime;

public class Role {
    private int roleId;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
    private int status;
    private String roleName;


    public Role(int roleId, LocalDateTime createTime, LocalDateTime updateTime, int status, String roleName) {
        this.roleId = roleId;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
        this.roleName = roleName;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
