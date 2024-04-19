package com.prj.codingstudy.controller.test;

import com.prj.codingstudy.domain.test.TestInput;
import com.prj.codingstudy.service.TestService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/test")
public class TestController {
    private final TestService testService;

    @GetMapping("/connect")
    @CrossOrigin(origins = "http://localhost:5173")
    public ResponseEntity<Object> selectContent(@PathParam("input") String input)
    {
        log.info("################## TestController.selectContent START ##################");

        // List<HomeOutput> result = new ArrayList<HomeOutput>();
        TestInput testInput = new TestInput();
        testInput.setInputStr(input);

        String result;

        try {
            result = testService.selectTest(testInput);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }

        log.info("################## TestController.selectContent END ##################");
        return ResponseEntity.status(HttpStatus.OK).body(result);
    }
}
