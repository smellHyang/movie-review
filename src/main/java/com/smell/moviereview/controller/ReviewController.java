package com.smell.moviereview.controller;

import com.smell.moviereview.service.ReviewServiceImpl;
import com.smell.moviereview.vo.ReviewVO;
import com.smell.moviereview.vo.ReviewerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/review")
public class ReviewController {

    @Autowired
    ReviewServiceImpl reviewService;

    @PostMapping("/write")
    public List<ReviewVO> writeReview(@RequestBody ReviewVO review){
        reviewService.writeReview(review);
        return reviewService.getReviewList();
    }

    @PutMapping("/{id}")
    public List<ReviewVO> modifyReview(@PathVariable int id, @RequestBody ReviewVO review){
        reviewService.modifyReview(id, review);
        return reviewService.getReviewList();
    }

    @DeleteMapping("/{id}")
    public List<ReviewVO> removeReview(@PathVariable int id){
        reviewService.removeReview(id);
        return reviewService.getReviewList();
    }

    //조회
    @GetMapping
    public List<ReviewVO> selectListReviews(){
        List<ReviewVO> allReviews = reviewService.getReviewList();
        return allReviews;
    }


}
