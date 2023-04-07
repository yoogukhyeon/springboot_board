package com.study.board.controller;

import com.study.board.dto.BoardFormDTO;
import com.study.board.dto.LoginDTO;
import com.study.board.dto.SignUpFormDTO;
import com.study.board.service.BoardService;
import com.study.board.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final MemberService memberService;
    private final BoardService boardService;

    @GetMapping("/name")
    public String name() {
        return "내 이름";
    }

    @PostMapping("/signup")
    public ResponseEntity userSignup(@RequestBody SignUpFormDTO fromDTO){
        return memberService.signup(fromDTO);
    }

    @PostMapping("/login")
    public  ResponseEntity login(@RequestBody LoginDTO loginDTO){
        return memberService.login(loginDTO);
    }

    @PostMapping("/board")
    public ResponseEntity save(@RequestBody BoardFormDTO boardDTO){
        ResponseEntity responseEntity = boardService.save(boardDTO);
        return responseEntity;
    }
}
