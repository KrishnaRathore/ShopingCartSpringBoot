package com.shopingcart.shopingcart;

import com.shopingcart.shopingcart.fileupload.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class ShopingcartApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopingcartApplication.class, args);
	}

}
