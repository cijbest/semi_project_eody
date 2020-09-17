package com.controller;

import java.io.FileOutputStream;

import org.springframework.web.multipart.MultipartFile;

public class Util {

	public static void saveFile(MultipartFile mf, String k) {
		String dir = "C:\\spring\\eody.zip_expanded\\eody\\web\\img\\";
		byte [] data;
		String imgname = mf.getOriginalFilename();
		try {
			data = mf.getBytes();
			FileOutputStream fo = 
					new FileOutputStream(dir+imgname);
			
			fo.write(data);
			fo.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}




