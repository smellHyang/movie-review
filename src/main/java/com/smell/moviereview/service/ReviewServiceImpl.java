package com.smell.moviereview.service;

import com.smell.moviereview.dao.ReviewDAO;
import com.smell.moviereview.service.impl.ReviewService;
import com.smell.moviereview.vo.ReviewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewDAO reviewDao;


    @Override
    public void writeReview(ReviewVO review) {
        reviewDao.write(review);
    }

    @Override
    public void modifyReview(ReviewVO review) {
        reviewDao.modify(review);
    }

    @Override
    public void removeReview(int id) {
        reviewDao.remove(id);
    }

    @Override
    public List<ReviewVO> getReviewList() {
        return reviewDao.selectAllReviews();
    }

    @Override
    public ReviewVO getReview(int id) {
        return reviewDao.selectOneReview(id);
    }
}
