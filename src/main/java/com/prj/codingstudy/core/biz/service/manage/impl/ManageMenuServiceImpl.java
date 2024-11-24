package com.prj.codingstudy.core.biz.service.manage.impl;

import com.prj.codingstudy.core.biz.domain.manage.ManageMenuInf;
import com.prj.codingstudy.core.biz.mapper.manage.ManageMenuMapper;
import com.prj.codingstudy.core.biz.service.manage.ManageMenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class ManageMenuServiceImpl implements ManageMenuService {
    private final ManageMenuMapper manageMenuMapper;

    @Override
    public List<ManageMenuInf> selectMenuList() throws Exception {
        log.info("======================== MENU LIST");

        List<ManageMenuInf> rList = manageMenuMapper.getMenuList("11");

        return rList;
    }
}
