package com.study.board.service;

import com.study.board.domain.Board;
import com.study.board.domain.Member;
import com.study.board.dto.BoardFormDTO;
import com.study.board.repository.BoardRepository;
import com.study.board.repository.MemberRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final MemberRepository memberRepository;
    private final BoardRepository boardRepository;

    @Override
    public ResponseEntity save(BoardFormDTO formDTO) {

        Optional<Member> member = memberRepository.findById(formDTO.getMemberId());
        if(member.isPresent()){
            Member memberEntity = member.get();

            Board post = Board.builder()
                    .title(formDTO.getTitle())
                    .content(formDTO.getContent())
                    .createdAt(LocalDateTime.now())
                    .updatedAt(LocalDateTime.now())
                    .adminViews(0)
                    .userViews(0)
                    .likes(0)
                    .member(memberEntity)
                    .build();

            boardRepository.save(post);

            return new ResponseEntity("success", HttpStatus.OK);
        } else {
            return new ResponseEntity("fail", HttpStatus.BAD_REQUEST);
        }

    }
}