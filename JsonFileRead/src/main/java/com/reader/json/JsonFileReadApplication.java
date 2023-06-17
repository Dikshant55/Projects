package com.reader.json;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.reader.json.payload.Address;

@SpringBootApplication
public class JsonFileReadApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JsonFileReadApplication.class, args);
//		 readFile("C:\\Records\\new.json"); 

	}

	private static void readFile(String fileAddress) {

		Gson gson = new Gson();

		try {
			Address address = gson.fromJson(new FileReader(fileAddress), Address.class);

			System.out.println(gson.toJson(address));
		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		readFile("C:\\Records\\new.json");
	}

}
