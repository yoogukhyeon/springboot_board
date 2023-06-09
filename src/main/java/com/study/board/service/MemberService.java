package com.study.board.service;

import com.study.board.dto.LoginDTO;
import com.study.board.dto.SignUpFormDTO;
import org.springframework.http.ResponseEntity;

public interface MemberService {
    ResponseEntity signup(SignUpFormDTO formDTO);

    ResponseEntity login(LoginDTO loginDTO);
}

