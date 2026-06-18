package com.ai.aicodermaster.service;

import com.ai.aicodermaster.model.dto.AppQueryRequest;
import com.ai.aicodermaster.model.entity.User;
import com.ai.aicodermaster.model.vo.AppVO;
import com.mybatisflex.core.query.QueryWrapper;
import com.mybatisflex.core.service.IService;
import com.ai.aicodermaster.model.entity.App;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * 应用 服务层。
 *
 * @author <a href="https://github.com/haielysia">hby</a>
 */
public interface AppService extends IService<App> {

    /**
     * 获取脱敏的应用信息
     *
     * @param app 应用
     * @return 脱敏后的应用信息
     */
    AppVO getAppVO(App app);

    /**
     * 获取脱敏的应用列表
     *
     * @param appList 应用列表
     * @return 脱敏后的应用列表
     */
    List<AppVO> getAppVOList(List<App> appList);

    /**
     * 查询
     * @param appQueryRequest
     * @return
     */
    QueryWrapper getQueryWrapper(AppQueryRequest appQueryRequest);

    /**
     * 生成代码
     * @param appId
     * @param message
     * @param loginUser
     * @return
     */
    Flux<String> chatToGenCode(Long appId, String message, User loginUser);

    /**
     * 部署服务
     * @param appId
     * @param loginUser
     * @return
     */
    String deployApp(Long appId, User loginUser);
}
