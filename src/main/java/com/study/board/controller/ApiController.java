package com.study.board.controller;

import com.study.board.dto.SignUpFormDTO;
import com.study.board.service.MemebrService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final MemebrService memberService;

    @GetMapping("/name")
    public String name() {
        return "내 이름";
    }

    @PostMapping("/signup")
    public ResponseEntity userSignup(@RequestBody SignUpFormDTO fromDTO){
        return memberService.signup(fromDTO);
    }
}
