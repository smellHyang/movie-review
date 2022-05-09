package com.smell.moviereview.dao;

import com.smell.moviereview.vo.ReviewerVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReviewerDAO {
    public List<ReviewerVO> selectAllReviewers();
}
