package com.ai.aicodermaster.service;

import com.mybatisflex.core.service.IService;
import com.ai.aicodermaster.model.entity.ChatHistory;

/**
 * 对话历史 服务层。
 *
 * @author <a href="https://github.com/haielysia">hby</a>
 */
public interface ChatHistoryService extends IService<ChatHistory> {

    /**
     * 新增对话历史
     * @param appId
     * @param message
     * @param messageType
     * @param userId
     * @return
     */
    boolean addChatMessage(Long appId, String message, String messageType, Long userId);
}
