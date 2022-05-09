package com.smell.moviereview.service.impl;

import com.smell.moviereview.vo.ReviewerVO;

import java.util.List;

public interface ReviewerService {
    List<ReviewerVO> selectAllReviewers();
    void insertReviewer(ReviewerVO reviewer);
    void updateReviewer(String id, ReviewerVO reviewer);
    void deleteReviewer(String id);
}
