package com.megvii.demo.vo;


import com.megvii.biz.core.utils.DateFormatUtils;
import com.megvii.biz.core.vo.VO;
import com.megvii.demo.po.User;

public class UserVO extends VO<User, UserVO> {

    private static final long serialVersionUID = -3339309538994472303L;

    public String getUserName() {
        return this.source.getUserName();
    }

    public String getRoleName() {
        return this.source.getRole().getRoleName();
    }

    public String getCreareTime() {
        return DateFormatUtils.format(this.source.getCreateDate(), "yyyy-MM-dd");
    }

}
