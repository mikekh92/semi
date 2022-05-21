package com.kh.notice.model.service;
import static com.kh.common.JDBCTemplate.*;
import java.sql.Connection;

import com.kh.notice.model.dao.NoticeDao;
import com.kh.notice.model.vo.Notice;

public class NoticeService {

	public int insertNotice(Notice n) {
		
		Connection conn = getConnection();
		
		int result=new NoticeDao().insertNotice(conn,n);
		
		if(result>0) {
			commit(conn);
		}else {
			rollback(conn);
		}
		close(conn);
		return result;
	}

	public void selectNoticeList() {
		
		Connection conn =getConnection();
		
		new NoticeDao().selectNoticeList();
		
	}

}
