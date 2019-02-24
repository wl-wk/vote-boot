package com.grk.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.grk.dao.OptionDao;
import com.grk.dao.SubjectDao;
import com.grk.entity.Option;
import com.grk.entity.Query;
import com.grk.entity.Subject;
import com.grk.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectDao subjectDao;

    @Autowired
    private OptionDao optionDao;

    @Override
    public Object getAllDatagrid(Query query) {

        Map<String, Object> map = new HashMap<>();
        Page<Object> page = PageHelper.startPage(query.getPage(), query.getRows());
        //选项数
        List<Subject> subjects = subjectDao.selectCountSubject(query);

        //数量
        List<Subject> count = subjectDao.selectCountVote(query);

        count.forEach(System.out::println);

        map.put("total", page.getTotal());
        List<Object> rows = new ArrayList<>();

/*        for(Subject s : subjects){
            Map<String,Object> m = new HashMap<>();
            m.put("id",s.getVsId());
            m.put("title",s.getVsTitle());
            m.put("options",s.getChildren().size());
            m.put("participants",count[])
        }*/

        for (int i = 0; i < subjects.size(); i++) {
            Map<String, Object> m = new HashMap<>();
            m.put("id", subjects.get(i).getVsId());
            m.put("title", subjects.get(i).getVsTitle());
            m.put("options", subjects.get(i).getCount());
            m.put("participants", count.get(i).getCount());
            rows.add(m);
        }
        map.put("rows", rows);


        return map;
    }

    @Override
    public boolean addSubject(Subject subject, List<Option> list) {

        int sub = subjectDao.insertSubject(subject);

        for (int i = 0; i < list.size(); i++) {
            if (i <= 1) {
                list.get(i).setVoIdDelete(1);
            } else {
                list.get(i).setVoIdDelete(0);
            }
            list.get(i).setVsId(subject.getVsId());
            list.get(i).setVoOrder(i);
        }
        int opitonCount = optionDao.insertOption(list);


        //判断的不准确
        if (sub > 0 && opitonCount > 0)
            return true;
        return false;
    }

    @Override
    public Subject getSubjectById(Integer id) {
        Subject subject = subjectDao.selectSubjectById(id);
        Subject sub = subjectDao.selectSubjectCount(id);
        subject.setCount(sub.getCount());
        return subject;
    }

    @Override
    public Map<String, Object> getSubjectVoteById(Integer id) {
        Map<String, Object> map = new HashMap<>();
        Subject subject = subjectDao.selectSubjectById(id);
        Subject sub = subjectDao.selectSubjectCount(id);
        subject.setCount(sub.getCount());
        map.put("sub", subject);
        List<Option> option = subjectDao.selectById(id);
        map.put("option", option);
        Integer count = subjectDao.selectVoteCountById(id);
        map.put("count", count);
        return map;
    }

    @Override
    public void updateSubject(Subject subject) {

        //修改题目
        subjectDao.updateSubject(subject);


        List<Option> listAdd = new ArrayList<>();
        //将增加和修改分开
        for (Option option : subject.getChildren()) {
            if (option != null) {
                if (option.getVoId() != null) {
                    optionDao.updateOption(option);
                } else {
                    option.setVoIdDelete(0);
                    option.setVsId(subject.getVsId());
                    listAdd.add(option);
                }
            }
        }


        System.out.println("打印---------------------------------------");
        listAdd.forEach(System.out::println);
        System.out.println("打印---------------------------------------");
        optionDao.insertOption(listAdd);

    }
}
