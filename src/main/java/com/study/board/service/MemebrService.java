package com.study.board.service;

import com.study.board.dto.SignUpFormDTO;
import org.springframework.http.ResponseEntity;

public interface MemebrService {
    ResponseEntity signup(SignUpFormDTO formDTO);
}
