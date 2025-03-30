package com.prj.codingstudy.core.service.auth;

import com.prj.codingstudy.core.domain.auth.AuthAccessLog;
import com.prj.codingstudy.core.domain.auth.AuthRefreshToken;

public interface AuthAccessLogService {
    int insertAccessLog(AuthAccessLog authAccessLog);

    int insertRefreshToken(AuthRefreshToken authRefreshToken);

    int updateRefreshToken(AuthRefreshToken authRefreshToken);
}
