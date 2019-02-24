package com.grk.controller;

import com.grk.entity.OptionHelp;
import com.grk.entity.Query;
import com.grk.entity.Subject;
import com.grk.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @ResponseBody
    @RequestMapping("getDatagrid")
    public Object getTree(Query query) {
        System.out.println(query);
        return subjectService.getAllDatagrid(query);
    }


    @RequestMapping("addSubject")
    public Object addSubject(Subject subject, OptionHelp options) {

        boolean mark = subjectService.addSubject(subject, options.getList());
        if (mark) {
            return "redirect:/add_success.jsp";
        }
        return "redirect:/add.jsp";
    }

    @RequestMapping("getSubjectById")
    public String getSubjectById(Model model, Integer id) {
        model.addAttribute("subject", subjectService.getSubjectById(id));
        return "forward:/vote.jsp";
    }

    @RequestMapping("showSunjectVote")
    public String showSunjectVote(Model model, Integer vsId) {
        model.addAttribute("map", subjectService.getSubjectVoteById(vsId));
        return "forward:/view.jsp";
    }

    @RequestMapping("showSubjectById")
    public String showSubjectById(Model model, Integer id) {
        model.addAttribute("subject", subjectService.getSubjectById(id));
        return "forward:/update.jsp";
    }

    @RequestMapping("updateSubject")
    public String updateSubject(Subject subject) {

        subjectService.updateSubject(subject);

        return "redirect:/index.jsp";
    }


}
