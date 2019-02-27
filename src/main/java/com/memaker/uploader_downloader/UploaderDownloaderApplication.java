package com.memaker.uploader_downloader;

import com.memaker.uploader_downloader.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({FileStorageProperties.class})
public class UploaderDownloaderApplication {

    public static void main(String[] args) {
        SpringApplication.run(UploaderDownloaderApplication.class, args);
    }

}
