package com.ArchiveWorld.note;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface NoteMapper {
    public void insertNote(NoteDto noteDto);
}
