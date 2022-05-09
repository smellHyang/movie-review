package com.smell.moviereview.service;

import com.smell.moviereview.dao.ReviewerDAO;
import com.smell.moviereview.vo.ReviewerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewerService {

    @Autowired
    ReviewerDAO reviewerDao;

    public List<ReviewerVO> selectAllReviewers(){
        return reviewerDao.selectAllReviewers();
    }
}
