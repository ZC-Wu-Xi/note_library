package com.roy.entity;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @author ：楼兰
 * @date ：Created in 2020/11/12
 * @description:
 **/
@TableName("t_user")
public class User {
    private Long userId;
    private String username;
    private String ustatus;
    private int uage;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", ustatus='" + ustatus + '\'' +
                ", uage=" + uage +
                '}';
    }

    public int getUage() {
        return uage;
    }

    public void setUage(int uage) {
        this.uage = uage;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUstatus() {
        return ustatus;
    }

    public void setUstatus(String ustatus) {
        this.ustatus = ustatus;
    }

}
