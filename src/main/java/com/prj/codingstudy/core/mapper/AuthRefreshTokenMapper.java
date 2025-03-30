package com.prj.codingstudy.core.mapper;

import com.prj.codingstudy.core.domain.auth.AuthRefreshToken;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthRefreshTokenMapper {
    int insertRefreshToken(AuthRefreshToken authRefreshToken);

    int updateRefreshToken(AuthRefreshToken authRefreshToken);
}
