package com.wu.service.impl;

import com.wu.dao.DiaryMapper;
import com.wu.entity.Diary;
import com.wu.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiaryServiceImpl implements DiaryService {
    @Autowired
    private DiaryMapper diaryMapper;
    public void writeDiary(Diary diary) {
        diaryMapper.writeDiary(diary);
    }

    public List<Diary> selectAllDiary() {
        return diaryMapper.selectAllDiary();
    }

    public void deleteDiaryById(int id) {
        diaryMapper.deleteDiaryById(id);
    }
}
