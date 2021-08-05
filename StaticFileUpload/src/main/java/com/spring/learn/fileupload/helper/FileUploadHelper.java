package com.spring.learn.fileupload.helper;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadHelper {

//	public final String UPLOAD_DIR="C:\\Users\\Virender Negi\\Desktop\\FullStack_Trainee\\StaticFileUpload\\src\\main\\resources\\static\\image";

	public final String UPLOAD_DIR= new ClassPathResource("static/image/").getFile().getPath();

	public FileUploadHelper()throws IOException{
		
	}
	
	
    public boolean uploadFile(MultipartFile f) {
		
    	boolean f1 = false;
    	
    	try {
    		
    		Files.copy(f.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+f.getOriginalFilename()), StandardCopyOption.REPLACE_EXISTING);
    		f1=true; 
    	}catch(Exception e) {
    		e.printStackTrace();
    	}
    	
    	
    	return f1;
    
    }
	
	
}
