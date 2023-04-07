package com.study.board.service;

import com.study.board.dto.BoardFormDTO;
import org.springframework.http.ResponseEntity;

public interface BoardService {

    ResponseEntity save(BoardFormDTO boardFormDTO);
}
