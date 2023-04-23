package com.yunchuang.service.impl;

import com.yunchuang.entity.UserInfo;
import com.yunchuang.mapper.UserInfoMapper;
import com.yunchuang.service.IUserInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
