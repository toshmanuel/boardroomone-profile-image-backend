package com.boardroomone.profilephotoservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
@Data
public class CloudinaryConfig {


    @Value("${CLOUD_NAME}")
    private String cloudName;

    @Value("${API_KEY}")
    private String apiKey;

    @Value("${API_SECRET}")
    private String apiSecret;

    @Value("${API_SECRET_KEY_REMOVE_BG}")
    private String apiSecretKeyRemoveBg;


}
