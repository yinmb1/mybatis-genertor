package com.yinmb.mybatisgenertor.mysql.controller;

/**
 * @author ：yinmb@ruyi.ai
 * @date ：Created in 2020/6/12 上午10:30
 */
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
//上传文件控制器
//直接上传到服务器
@RestController
public class UploadController {
	//指定一个临时路径作为上传目录
//private static String UPLOAD_FOLDER = "C:\Users\Liuyu\Desktop\UPLOAD";
//遇到http://localhost:8080，则跳转至upload.html页面
	@GetMapping("/")
	public String index() {
		return "upload";
	}
	@PostMapping("upload")
	public String fileUpload(@RequestParam("file")MultipartFile file) {

		StringBuilder result = new StringBuilder();

		//选择了文件，开始上传操作
		try (BufferedReader br = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
			String line;
			line = br.readLine();
			int count = 0;
			while (line != null && count <= 20) {
				result.append(line).append("\n");
				line = br.readLine();
				count++;
			}
			System.out.println(result.toString());
			return result.toString();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	//匹配upload_status页面
	@GetMapping("upload_status")
	public String uploadStatusPage() {
		return "upload_status";
	}
}

