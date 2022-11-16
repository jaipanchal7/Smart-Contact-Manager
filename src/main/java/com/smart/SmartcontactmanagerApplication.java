package com.smart;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmartcontactmanagerApplication implements CommandLineRunner  {
	
	public static void main(String[] args) {
		SpringApplication.run(SmartcontactmanagerApplication.class, args);
		System.out.println("Hii");
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		
//		String str="jai";
//		String encode = this.bryBCryptPasswordEncoder.encode(str);
//		System.out.println(encode);		
//		String str1="jai2";
//		String encode2 = this.bryBCryptPasswordEncoder.encode(str1);		
//		System.out.println(this.bryBCryptPasswordEncoder.matches("jai7h",encode));
	}
}
