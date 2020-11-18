/* 인터페이스를 사용하는 이유? 
 * Controller나 Service단에서 호출할 경우
 * 인터페이스에 연결된 하나의 메소드를 읽는것이 빠름
 * 코드 유무 파악이 용이, 오탈자 찾기 쉬움
 * */

package com.prac.keepgoing.dao;

import java.util.List;

import com.prac.keepgoing.bean.TestBean;

public interface TestDAO {
	public List<TestBean> test() throws Exception;
}
