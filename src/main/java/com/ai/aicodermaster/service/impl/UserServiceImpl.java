package com.ai.aicodermaster.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.ai.aicodermaster.model.entity.User;
import com.ai.aicodermaster.mapper.UserMapper;
import com.ai.aicodermaster.service.UserService;
import org.springframework.stereotype.Service;

/**
 * 用户 服务层实现。
 *
 * @author <a href="https://github.com/haielysia">hby</a>
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>  implements UserService{

}
