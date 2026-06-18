package com.ai.aicodermaster.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.ai.aicodermaster.model.entity.App;
import com.ai.aicodermaster.mapper.AppMapper;
import com.ai.aicodermaster.service.AppService;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author <a href="https://github.com/haielysia">hby</a>
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
