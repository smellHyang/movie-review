package com.smell.moviereview.controller;

import com.smell.moviereview.service.ReviewerServiceImpl;
import com.smell.moviereview.vo.ReviewerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReviewerController {

    @Autowired
    ReviewerServiceImpl reviewerService;

    //조회
    @GetMapping("/reviewers")
    public List<ReviewerVO> selectListReviewers(){
        List<ReviewerVO> allReviewers = reviewerService.selectAllReviewers();
        return allReviewers;
    }

    @PostMapping("/reviewers/new")
    public List<ReviewerVO> insertReviewer(@RequestBody ReviewerVO reviewer){
        reviewerService.insertReviewer(reviewer);
        return reviewerService.selectAllReviewers();
    }
    
    @PutMapping("/reviewers/{id}")
    public List<ReviewerVO> updateReviewer(@PathVariable String id, @RequestBody ReviewerVO reviewer){
        reviewerService.updateReviewer(id, reviewer);
        return reviewerService.selectAllReviewers();
    }
}
