package yidong;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("yidong.mapper")
public class WebSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebSystemApplication.class, args);
	}
}
