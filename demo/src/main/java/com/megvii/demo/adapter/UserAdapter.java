package com.megvii.demo.adapter;

import com.megvii.biz.core.annotation.Adapter;
import com.megvii.biz.core.dto.DefaultConvert;



import com.megvii.biz.core.page.Page;
import com.megvii.biz.core.page.PageHelper;
import com.megvii.demo.service.UserService;
import com.megvii.vo.UserVO;
import com.megvii.po.User;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

@Adapter
public class UserAdapter {

    @Autowired
    private UserService userService;

    /**
     * 新增一个用户
     * @param user
     */
    public void save(User user) {
        user.setId(Long.valueOf(UUID.randomUUID().toString()));
        userService.insert(user);
    }

    /**
     * 删除用户
     * @param id
     */
    public void delete(String id) {
        userService.delete(id);
    }

    /**
     * 更新用户
     * @param user
     */
    public void update(User user) {
        userService.update(user);
    }

    /**
     * 查询单个用户
     * @param id
     * @return
     */
    public UserVO select(String id) {
        User user = userService.selectByPK(id);
        return new UserVO().convert(user);
    }

    /**
     * 分页查询复合条件的用户
     * @param user
     * @return
     */
    public Page<UserVO> page(User user) {
        List<User> list = userService.query(user);
        List<UserVO> voList = (new DefaultConvert<User, UserVO>(UserVO.class).listConvert(list));
        return PageHelper.getPage(voList);
    }
}
