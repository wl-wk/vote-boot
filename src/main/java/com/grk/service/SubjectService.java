package com.grk.service;

import com.grk.entity.Option;
import com.grk.entity.Query;
import com.grk.entity.Subject;

import java.util.List;
import java.util.Map;

public interface SubjectService {

    Object getAllDatagrid(Query query);

    boolean addSubject(Subject subject, List<Option> list);

    Subject getSubjectById(Integer id);


    Map<String, Object> getSubjectVoteById(Integer id);


    void updateSubject(Subject subject);

}
