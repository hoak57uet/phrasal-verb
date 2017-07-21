package com.wingsmedia.config;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by HoaPham on 7/19/17.
 */

@Configuration
public class MappingConfig {
  @Bean
  public DozerBeanMapper mapper() throws Exception {
    DozerBeanMapper mapper = new DozerBeanMapper();
    return mapper;
  }
}
