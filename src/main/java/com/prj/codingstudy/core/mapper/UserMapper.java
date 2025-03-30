package com.prj.codingstudy.core.mapper;


import com.prj.codingstudy.config.model.UserDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

/**
 * 사용자 관련 SQL Mapper 인터페이스 입니다.
 */
@Repository
public interface UserMapper {

    Optional<UserDto> login(UserDto userDto);

    List<UserDto> selectUserList(UserDto userDto);

}
