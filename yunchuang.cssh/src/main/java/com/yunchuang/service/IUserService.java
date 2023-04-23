package com.yunchuang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yunchuang.dto.LoginFormDTO;
import com.yunchuang.dto.Result;
import com.yunchuang.entity.User;

import javax.servlet.http.HttpSession;

/**
 * <p>
 *  服务类
 * </p>
 *
 */
public interface IUserService extends IService<User> {

    Result sendCode(String phone, HttpSession session);

    Result login(LoginFormDTO loginForm, HttpSession session);

    Result sign();

    Result signCount();

}
