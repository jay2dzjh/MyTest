package com.megvii.demo.po;

import com.megvii.biz.core.po.Model;

import com.megvii.po.ext.UserExt;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;


@Data
public class User implements Model<Long> {

    private static final long serialVersionUID = -3621835809690077868L;

    private Long id;
    @NotNull(message = "userName不能为空")
    private String userName;
    @NotNull(message = "userPwd不能为空")
    private String userPwd;
    private Date createDate;
    private Role role;

    private UserExt userExt = new UserExt();

    @Override
    public Long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
