package com.test;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.vo.SearcherVO;

public class App2 {

	public static void main(String[] args) {
		System.out.println("App Start.........");
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring Started...........");

		Biz<String, SearcherVO> biz = (Biz) factory.getBean("sbiz");

//		// SEARCH
//		ArrayList<ContentsVO> list = null;
//		HashMap<String, Integer> smap = new HashMap<>();
//		smap.put("start", 20);
//		smap.put("end", 30);
//		try {
//			list = biz.search(smap);
//			for(ContentsVO cv : list) {
//				System.out.println(cv);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		// INSERT
//		UserVO u = new UserVO("id03", "pwd03", "LEE", "서울시 삼성구", "010-222-2222", "ELLA", "2000-08-08", "EE@naver.com", "W");
//		
//		try {
//			biz.register(u);
//			System.out.println("OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		// DELETE
//		try {
//			biz.remove("id03");
//			System.out.println("OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

//		// UPDATE
//		ContentsVO c = new ContentsVO(101, "title888", "content888");
//		try {
//			biz.modify(c);
//			System.out.println("OK");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		// SELECT
//		UserVO u = null;
//		try {
//			u = biz.get("id03");
//			System.out.println(u);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}


		// SELECTALL
		ArrayList<SearcherVO> list = null;
		try {
			list = biz.get();
			for (SearcherVO c : list) {
				System.out.println(c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		factory.close();
		System.out.println("Spring End...............");
		System.out.println("App End.............");
	}

}