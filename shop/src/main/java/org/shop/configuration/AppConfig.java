package org.shop.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DataInitConfig.class)
public class AppConfig {
}
