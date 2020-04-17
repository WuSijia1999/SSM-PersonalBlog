package com.wu.service;

import com.wu.entity.Diary;

import java.util.List;

public interface DiaryService {
    void writeDiary(Diary diary);
    List<Diary> selectAllDiary();
    void deleteDiaryById(int id);
}
