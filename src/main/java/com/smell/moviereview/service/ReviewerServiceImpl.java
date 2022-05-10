package com.smell.moviereview.service;

import com.smell.moviereview.dao.ReviewerDAO;
import com.smell.moviereview.service.impl.ReviewerService;
import com.smell.moviereview.vo.ReviewerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewerServiceImpl implements ReviewerService {

    @Autowired
    ReviewerDAO reviewerDao;

    @Override
    public List<ReviewerVO> selectAllReviewers() {
        return reviewerDao.selectAllReviewers();
    }

    @Override
    public void insertReviewer(ReviewerVO reviewer) {
        reviewerDao.insert(reviewer);
    }

    @Override
    public void updateReviewer(String id, ReviewerVO updateReviewer){
        ReviewerVO reviewer = reviewerDao.selectById(id);

        if(reviewer != null){
            reviewer.setName(updateReviewer.getName());
            reviewerDao.update(reviewer);
        }else{
            throw new IllegalStateException("평자가가 존재하지 않습니다.");
        }
    }

    @Override
    public void deleteReviewer(String id){
        if(reviewerDao.selectById(id) != null){
            reviewerDao.delete(id);
        }else{
            throw new IllegalStateException("평자가가 존재하지 않습니다.");
        }
    }

}
