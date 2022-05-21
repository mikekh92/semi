package com.kh.notice.model.vo;

import java.sql.Date;

public class Notice {

		private int noticeNo;						//NOTICE_NO(공지사항)
		private String noticeTitle;				//NOTICE_TITLE(제목)
		private String noticeContent;		//NOTICE_CONTENT(내용)
		private Date noticeDate;				//NOTICE_DATE(작성일)
		private int noticeViewNo;				//NOTICE_VIEWNO(조회수)
																	//USER_NO(회원번호)-> 왜래키
		public Notice() {
			super();
		}
		public Notice(int noticeNo, String noticeTitle,
				String noticeContent, Date noticeDate,
				int noticeViewNo) {
			super();
			this.noticeNo = noticeNo;
			this.noticeTitle = noticeTitle;
			this.noticeContent = noticeContent;
			this.noticeDate = noticeDate;
			this.noticeViewNo = noticeViewNo;
			
		}
		public int getNoticeNo() {
			return noticeNo;
		}
		public void setNoticeNo(int noticeNo) {
			this.noticeNo = noticeNo;
		}
		public String getNoticeTitle() {
			return noticeTitle;
		}
		public void setNoticeTitle(String noticeTitle) {
			this.noticeTitle = noticeTitle;
		}
		public String getNoticeContent() {
			return noticeContent;
		}
		public void setNoticeContent(String noticeContent) {
			this.noticeContent = noticeContent;
		}
		public Date getNoticeDate() {
			return noticeDate;
		}
		public void setNoticeDate(Date noticeDate) {
			this.noticeDate = noticeDate;
		}
		public int getNoticeViewNo() {
			return noticeViewNo;
		}
		public void setNoticeViewNo(int noticeViewNo) {
			this.noticeViewNo = noticeViewNo;
		}
	
		@Override
		public String toString() {
			return "Notice [noticeNo=" + noticeNo + ", noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent
					+ ", noticeDate=" + noticeDate + ", noticeViewNo=" + noticeViewNo+ "]";
		}
		
		
		
		
		
		
		
		
		
}
