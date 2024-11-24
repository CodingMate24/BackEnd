package com.prj.codingstudy.core.biz.controller.manage;

import com.prj.codingstudy.core.biz.domain.manage.ManageMenuInf;
import com.prj.codingstudy.core.biz.service.manage.ManageMenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/menu")
@RequiredArgsConstructor
public class MenuController {
    private final ManageMenuService manageMenuService;

    @GetMapping("/menuList")
    public ResponseEntity<?> getMenuList(){
        List<ManageMenuInf> result = new ArrayList<ManageMenuInf>();

        try {
            result = manageMenuService.selectMenuList();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        log.info("##############");

        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
