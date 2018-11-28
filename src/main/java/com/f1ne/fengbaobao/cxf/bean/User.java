package com.f1ne.fengbaobao.cxf.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: com.f1ne.fengbaobao.cxf.bean
 * @description:
 * @author: qiyunfei
 * @create: 2018-2018-12 15:56
 **/
public class User implements Serializable {

    private static final long serialVersionUID = -5939599230753662529L;
    private Long userId;
    private String username;
    private String email;
    private Date gmtCreate;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}
