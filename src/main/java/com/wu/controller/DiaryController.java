package com.wu.controller;

import com.wu.entity.Diary;
import com.wu.service.DiaryService;
import com.wu.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class DiaryController {
    @Autowired
    private DiaryService diaryService;

    @RequestMapping("/writeDiary")
    private String writeDiary(Diary diary){
        //获取当前日期
        Date currentTime = new Date();
        //将日期转化为指定格式
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format(currentTime);
        Date date= DateUtil.StringToDate(dateString,"yyyy-MM-dd HH:mm:ss");
        diary.setTime(date);
        this.diaryService.writeDiary(diary);
        return "Dsuccess";
    }

    @RequestMapping("/selectAllDiary")
    private String selectAllDiary(Model model){
        List<Diary> diarys= diaryService.selectAllDiary();
        model.addAttribute("diarys",diarys);
        return "saylist";
    }

    @RequestMapping("/admindiary")
    private String selectAllDiary2(Model model){
        List<Diary> diarys= diaryService.selectAllDiary();
        model.addAttribute("diarys",diarys);
        return "admindiary";
    }

    @RequestMapping("/deleteDiaryById")
    private String deleteDiary(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("diaryid"));
        diaryService.deleteDiaryById(id);
        return "redirect:admindiary";
    }
}
