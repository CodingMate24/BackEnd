package com.prj.codingstudy.core.service.auth.impl;

import com.prj.codingstudy.core.domain.auth.AuthAccessLog;
import com.prj.codingstudy.core.domain.auth.AuthRefreshToken;
import com.prj.codingstudy.core.mapper.AuthAccessLogMapper;
import com.prj.codingstudy.core.mapper.AuthRefreshTokenMapper;
import com.prj.codingstudy.core.service.auth.AuthAccessLogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthAccessLogServiceImpl implements AuthAccessLogService {

    private final AuthAccessLogMapper authAccessLogMapper;
    private final AuthRefreshTokenMapper authRefreshTokenMapper;

    @Override
    public int insertAccessLog(AuthAccessLog authAccessLog) {
        try {
            return authAccessLogMapper.insertAccessLog(authAccessLog);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int insertRefreshToken(AuthRefreshToken authRefreshToken) {
        try {
            return authRefreshTokenMapper.insertRefreshToken(authRefreshToken);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int updateRefreshToken(AuthRefreshToken authRefreshToken) {
        try {
            return authRefreshTokenMapper.updateRefreshToken(authRefreshToken);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
