package com.great.javabean;

import java.time.LocalDateTime;

public class Admin {
    private int adminID;
    private String adminName;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    private int status;
    private int roleId;
    private Role role;


    public Admin(int adminID, String adminName, LocalDateTime createtime, LocalDateTime updatetime, int status, int roleId, Role role) {
        this.adminID = adminID;
        this.adminName = adminName;
        this.createtime = createtime;
        this.updatetime = updatetime;
        this.status = status;
        this.roleId = roleId;
        this.role = role;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setAdminID(int adminID) {
        this.adminID = adminID;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
