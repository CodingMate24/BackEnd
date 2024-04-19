package com.prj.codingstudy.service.impl;

import com.prj.codingstudy.domain.test.TestInput;
import com.prj.codingstudy.dao.test.TestDao;
import com.prj.codingstudy.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class TestServiceimpl implements TestService {
    private final TestDao testDao;

    @Override
    public String selectTest(TestInput input) throws Exception {
        log.info("TestService !! ");

        String result;

        result = testDao.selectTest(input);

        return result;
    }
}
