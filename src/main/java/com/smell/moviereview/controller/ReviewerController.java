package com.smell.moviereview.controller;

import com.smell.moviereview.service.ReviewerService;
import com.smell.moviereview.vo.ReviewerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class ReviewerController {

    @Autowired
    ReviewerService reviewerService;

    @GetMapping("/reviewers")
    public @ResponseBody List<ReviewerVO> selectListReviewers(){
        List<ReviewerVO> allReviewers = reviewerService.selectAllReviewers();
        return allReviewers;
    }
}
