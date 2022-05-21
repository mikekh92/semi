<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

    <!--Latest compiled and minified CSS-->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

    <!-- Popper JS -->
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>

	<link rel="stylesheet" href="/Semi/views/admin-css/admin_b_3_1.css">
<style>
    #content_2_2{
            background-color: rgb(203, 230, 235);
            color: black;
            width:70%;
            margin: auto;
            height: 50%;
			
			
        }
  	.table{
        	border: 1px solid black;
        	text-align: center;
        	width: 50%;
        	height : 40%;
			margin-top: 20px;
			border-collapse: separate;
			
			
			
			
        }
	#content_2_3{
         text-align: center;
    }
   
 </style>       	
</head>
<body>
		<%@include file="/views/common/adminMenubar.jsp" %>
        
        <div class="content_2">
       						<div id="content_2_empty"></div>
        <div id="content_2_1">
        	<h2 align="center">리뷰상세보기</h2>
		</div>	
       		<div id="content_2_2">
        	<br>
			
        	<table align="center" class="table">
		        <tr >
		            <td >대표사진</td>
		            <td colspan="3">
		            	<div>
		                <img src="/Semi/views/image/search.png" width="200" height="200" alt="">
		            	</div>
		            </td>
		        </tr>
		        <tr>
		            <td>제목</td>
		            <td colspan="2"></td>
		            <td>상품명</td>
		            <td></td>
		        </tr>
		        <tr>
		            <td colspan="2">작성자</td>
		            <td></td>
		            <td colspan="2">작성일</td>
		            <td></td>
		            <td>처리결과</td>
		            <td></td>
		        </tr>
		        <tr>
		            <td>리뷰내용</td>
		            <td colspan="3"><p style="height: 50px;"></p></td>
		        </tr>
		        <tr>
		            <td>리뷰답변</td>
		            <td colspan="3">
						<textarea name="" id="" cols="40" rows="3"></textarea>
					</p></td>
		        </tr>
			</table>
		        <div id="content_2_3" align="center">
		        	<button type="button" class="btn btn-warning">리뷰답변 등록</button>
		        </div>   
		</div>
		</div>
</body>
</html>