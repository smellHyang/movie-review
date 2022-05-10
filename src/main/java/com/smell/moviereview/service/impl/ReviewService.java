package com.smell.moviereview.service.impl;

import com.smell.moviereview.vo.ReviewVO;

import java.util.List;

public interface ReviewService {
    void writeReview(ReviewVO review);
    void modifyReview(int id, ReviewVO review);
    void removeReview(int id);
    List<ReviewVO> getReviewList();
    ReviewVO getReview(int id);
}
