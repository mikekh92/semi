package com.kh.review.model.service;
import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;

import com.kh.review.model.dao.ReviewDao;

public class ReviewService {

	public int selectListCount() {
		
		Connection conn = getConnection();
		
		new ReviewDao().selectListCount(conn);
		return 0;
	}

}
