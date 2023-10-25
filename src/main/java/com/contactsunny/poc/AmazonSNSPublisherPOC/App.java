package com.contactsunny.poc.AmazonSNSPublisherPOC;

import com.contactsunny.poc.AmazonSNSPublisherPOC.models.SamsungPhone;
import com.contactsunny.poc.AmazonSNSPublisherPOC.utils.SNSUtil;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private SNSUtil snsUtil;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        List<SamsungPhone> samsungPhones = new ArrayList<>();

        SamsungPhone galaxyNote10Plus = new SamsungPhone();
        galaxyNote10Plus.setName("Samsung Galaxy Note 10 Plus");;
        galaxyNote10Plus.setDescription("2019 flagship phone with a 6.8 inch Super AMOLED display, S Pen, and much more");
        galaxyNote10Plus.setTimestamp(System.currentTimeMillis());
        samsungPhones.add(galaxyNote10Plus);

        SamsungPhone galaxyNote10 = new SamsungPhone();
        galaxyNote10.setName("Samsung Galaxy Note 10");;
        galaxyNote10.setDescription("2019 flagship phone with a 6.5 inch Super AMOLED display, S Pen, and much more");
        galaxyNote10.setTimestamp(System.currentTimeMillis());
        samsungPhones.add(galaxyNote10);

        SamsungPhone galaxyS10Plus = new SamsungPhone();
        galaxyS10Plus.setName("Samsung Galaxy S 10 Plus");;
        galaxyS10Plus.setDescription("Early 2019 flagship phone with a 6.5 inch Super AMOLED display, " +
                "dual punch hole selfie cameras, and much more");
        galaxyS10Plus.setTimestamp(System.currentTimeMillis());
        samsungPhones.add(galaxyS10Plus);

        SamsungPhone galaxyS10 = new SamsungPhone();
        galaxyS10.setName("Samsung Galaxy S 10");;
        galaxyS10.setDescription("Early 2019 flagship phone with a 6.3 inch Super AMOLED display, " +
                "dual punch hole selfie cameras, and much more");
        galaxyS10.setTimestamp(System.currentTimeMillis());
        samsungPhones.add(galaxyS10);

        for (SamsungPhone samsungPhone : samsungPhones) {
            this.snsUtil.publishSNSMessage(new Gson().toJson(samsungPhone));
        }
    }
}
