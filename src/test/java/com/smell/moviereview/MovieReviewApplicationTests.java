package com.smell.moviereview;

import com.smell.moviereview.dao.ReviewDAO;
import com.smell.moviereview.service.impl.ReviewService;
import com.smell.moviereview.service.impl.ReviewerService;
import com.smell.moviereview.vo.ReviewVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;


@SpringBootTest
class MovieReviewApplicationTests {

	@Autowired
	private ReviewerService reviewerService;

	@Autowired
	private ReviewService reviewService;

	@Test
	public void reviewTest() {



		ReviewVO review = new ReviewVO();
		review.setRating(4);
		//review.setDate();
	}

}
