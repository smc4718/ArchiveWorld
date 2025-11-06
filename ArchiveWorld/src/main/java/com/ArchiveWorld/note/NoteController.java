package com.ArchiveWorld.note;

import com.ArchiveWorld.common.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/notes")
public class NoteController {

    private final NoteService noteService;

    @PostMapping
    public ResponseEntity<ApiResponse<NoteDto>> addNote(@RequestBody NoteDto noteDto) {
        NoteDto saved = noteService.addNote(noteDto); // PK 포함된 NoteDto 반환
        return ResponseEntity
                .status(201)
                .body(ApiResponse.success(saved, "등록 완료"));
    }
}
