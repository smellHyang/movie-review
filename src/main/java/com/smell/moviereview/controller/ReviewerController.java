package com.smell.moviereview.controller;

import com.smell.moviereview.service.ReviewerServiceImpl;
import com.smell.moviereview.vo.ReviewerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/reviewers")
public class ReviewerController {

    @Autowired
    ReviewerServiceImpl reviewerService;

    //조회
    @GetMapping
    public List<ReviewerVO> selectListReviewers(){
        List<ReviewerVO> allReviewers = reviewerService.selectAllReviewers();
        return allReviewers;
    }

    @PostMapping("/new")
    public List<ReviewerVO> insertReviewer(@RequestBody ReviewerVO reviewer){
        reviewerService.insertReviewer(reviewer);
        return reviewerService.selectAllReviewers();
    }
    
    @PutMapping("/{id}")
    public List<ReviewerVO> updateReviewer(@PathVariable String id, @RequestBody ReviewerVO reviewer){
        reviewerService.updateReviewer(id, reviewer);
        return reviewerService.selectAllReviewers();
    }

    @DeleteMapping("/{id}")
    public List<ReviewerVO> deleteReviewer(@PathVariable String id){
        reviewerService.deleteReviewer(id);
        return reviewerService.selectAllReviewers();
    }
}
