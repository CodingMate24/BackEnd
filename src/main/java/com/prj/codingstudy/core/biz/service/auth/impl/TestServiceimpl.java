package com.prj.codingstudy.core.biz.service.auth.impl;

import com.prj.codingstudy.core.biz.service.auth.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TestServiceimpl implements TestService {

    @Override
    public String selectTest(String input) throws Exception {
        log.info("TestService !! ");

        String result = "";

        return result;
    }
}
