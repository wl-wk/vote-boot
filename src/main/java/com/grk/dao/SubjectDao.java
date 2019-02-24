package com.grk.dao;


import com.grk.entity.Subject;
import com.grk.entity.Option;

import com.grk.entity.Query;

import java.util.List;

public interface SubjectDao {
    List<Subject> selectAll();

    List<Subject> selectCountSubject(Query query);

    List<Subject> selectCountVote(Query query);

    int insertSubject(Subject subject);

    Subject selectSubjectById(Integer id);

    Subject selectSubjectCount(Integer id);

    List<Option> selectById(Integer id);

    Integer selectVoteCountById(Integer id);

    void updateSubject(Subject subject);

}
