package com.test;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.vo.ShopVO;

public class App {

	public static void main(String[] args) {
		System.out.println("App start");
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("spring start");
		
		@Resource(name = "shopbiz")
		Biz<String,Integer,ShopVO> biz = (Biz)factory.getBean("shopbiz");
		
		
		//INSERT TEST//
//		ShopVO svo_r = new ShopVO("13","a3","b3","c3","d3","e3","f3","g3",0,1,"h3");
//				try {
//					biz.register(svo_r);
//					System.out.println("Register is Completed");
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
			
				
		//UPDATE TEST//		
//		ShopVO svo_u = new ShopVO("12","연남동","취기를빌려","주점","18:00~23:00","서울시 마포구 ..","오늘은 취하고 싶다","h2.png",0,1,"010-1577-1577");
//				try {
//					biz.modify(svo_u);
//					System.out.println("Update is Completed");
//				} catch (Exception e) {
//					e.printStackTrace();
//				}		
				
				
		//SHOP_SELECT TEST//		
//		ArrayList<ShopVO> list = null;
//		try {
//			list = biz.shop_get("id01");
//			for(ShopVO co:list) {
//				System.out.println(co);
//			}
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		
}