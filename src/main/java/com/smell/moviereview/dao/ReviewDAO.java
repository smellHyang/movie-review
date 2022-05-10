package com.smell.moviereview.dao;

import com.smell.moviereview.vo.ReviewVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewDAO {
    void write(ReviewVO review);
    void modify(ReviewVO review);
    void remove(int id);
    ReviewVO selectOneReview(int id);
    List<ReviewVO> selectAllReviews();

}
