package com.wu.dao;

import com.wu.entity.Diary;

import java.util.List;

public interface DiaryMapper {
    void writeDiary(Diary diary);
    List<Diary> selectAllDiary();
    void deleteDiaryById(int id);
}
