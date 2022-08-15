package cn.wkx.pro081501;

import cn.wkx.pro081501.controller.BookController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.print.Book;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class Pro081501Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext pa = SpringApplication.run(Pro081501Application.class, args);
		BookController b = pa.getBean(BookController.class);//取得·bean

	}

}
