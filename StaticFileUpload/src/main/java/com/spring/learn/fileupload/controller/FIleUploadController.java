package com.spring.learn.fileupload.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.spring.learn.fileupload.helper.FileUploadHelper;

@RestController
public class FIleUploadController {

	@Autowired
	private FileUploadHelper fileuploadhelper;
	
	@PostMapping("/file")
	public ResponseEntity<String> FileUpload(@RequestParam("file") MultipartFile file){
		
	  System.out.println(file.getOriginalFilename());
	  System.out.println(file.getName());
	  System.out.println(file.getContentType());
	  System.out.println(file.getSize());

	  try {
	  if(file.isEmpty()) {
		  return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Request must contain file");
	  }
	  
//	  if(file.getContentType().equals("image/jpeg")) {
//		  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Must have JPG format");
//	  }
	  
	 boolean f =fileuploadhelper.uploadFile(file);
	  
	 if(f) {
	
//		 return ResponseEntity.ok("file is successfully uploaded");
		 return ResponseEntity.ok(ServletUriComponentsBuilder.fromCurrentContextPath().path("/image/").path(file.getOriginalFilename()).toUriString());
	 }
	 
	  }catch(Exception e) {
		  e.printStackTrace();
	  }
	  return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something went wrong");
	}
	
}
