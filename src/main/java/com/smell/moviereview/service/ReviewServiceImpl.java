package com.smell.moviereview.service;

import com.smell.moviereview.dao.ReviewDAO;
import com.smell.moviereview.service.impl.ReviewService;
import com.smell.moviereview.vo.ReviewVO;
import com.smell.moviereview.vo.ReviewerVO;
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
    public void modifyReview(int id, ReviewVO modifyReview) {
        ReviewVO review = reviewDao.selectOneReview(id);

        if(review != null){
            review.setRating(modifyReview.getRating());
            review.setTitle(modifyReview.getTitle());
            review.setDirector(modifyReview.getDirector());
            review.setActor(modifyReview.getActor());
            review.setContents(modifyReview.getContents());
            reviewDao.modify(review);
        }else{
            throw new IllegalStateException("해당 리뷰는 존재하지 않습니다.");
        }

    }

    @Override
    public void removeReview(int id) {
        if(reviewDao.selectOneReview(id) != null){
            reviewDao.remove(id);
        }else{
            throw new IllegalStateException("이미 삭제되었습니다.");
        }
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
