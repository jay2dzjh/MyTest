package com.megvii.demo.configuration;

import com.megvii.biz.core.codes.Codes;
import com.megvii.biz.core.codes.impl.CoreCodes;
import com.megvii.biz.core.codes.impl.DelegatingCodes;
import com.megvii.demo.codes.DemoCodes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ErrorCodeConfiguration {
    @Bean
    public Codes getCodes() {
        return new DelegatingCodes().addCodes(new CoreCodes()).addCodes(new DemoCodes());
    }
}
