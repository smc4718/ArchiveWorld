package com.ArchiveWorld.note;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@Service
public class NoteServiceImpl implements NoteService {

    private final NoteMapper noteMapper;

    @Override
    public NoteDto addNote(NoteDto noteDto) {
        noteDto.setCreatedAt(LocalDateTime.now()); // DB에 들어있지만, http응답용으로 넣어놨음

        noteMapper.insertNote(noteDto); // 매퍼xml에 useGeneratedKeys로 PK 세팅됨
        return noteDto;
    }


}
