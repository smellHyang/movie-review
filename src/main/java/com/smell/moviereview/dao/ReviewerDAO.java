package com.smell.moviereview.dao;

import com.smell.moviereview.vo.ReviewerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewerDAO {
    List<ReviewerVO> selectAllReviewers();
    ReviewerVO selectById(String id);
    void insert(ReviewerVO reviewer);
    void update(ReviewerVO reviewer);
    void delete(String id);
}
