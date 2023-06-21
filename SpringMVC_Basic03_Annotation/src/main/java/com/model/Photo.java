package com.model;
/*
DB 에 테이블 (게시판 자료실)
create table photo(
	name
	age
	image >> 업로드한 파일명 1.jpg , 2.jpg
	기타 : 파일의 용량 , 생성일 , 수정일 
)

실제 파일은 I/O 작업을 통해서 서버의 특정 폴더에 >> AWS >> S3 서버 > 파일서버

클라이언트 전송 서버 ---> public String form(Photo photo)
(이름,나이,파일)
*/

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class Photo {
	private String name;
	private int age;
	private String image;
	
	//파일을 담을 수 있는 객체를 제공
	//POINT
	//input 태그의 name 와 memberfield 의 이름이 같아야 함
	private CommonsMultipartFile file;	//업로드한 파일을 담아요
	//<input type="file" name="file">
	//<form method="post" enctype="multipart/form-data">

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public CommonsMultipartFile getFile() {
		return file;
	}

	public void setFile(CommonsMultipartFile file) {
		this.file = file;
	}

	@Override
	public String toString() {
		return "Photo [name=" + name + ", age=" + age + ", image=" + image + ", file=" + file + "]";
	}
	
	
}
