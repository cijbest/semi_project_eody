package com.test;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.vo.BookingVO;

public class App_booking {
	public static void main(String[] args) {
		System.out.println("App start");
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("spring start");
		
		Biz<String,BookingVO> biz = (Biz)factory.getBean("bookingbiz");
		
		
		// INSERT TEST //
//		BookingVO bvo_r = new BookingVO("a11","b11","c02","2020-09-11","e11","f11","g11","h11","i11","j11");
//		try {
//			biz.register(bvo_r);
//			System.out.println("Register is Completed");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		// BOOKINGSELECT_SHOP TEST//
		ArrayList<BookingVO> list = null;
		try {
			list = biz.bookingget_shop("c01");
			for (BookingVO c: list) {
				System.out.println(c);
			}
			System.out.println("Select Complete!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
