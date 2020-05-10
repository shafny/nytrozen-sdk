package com.nytrozen.sdk.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = "com.nytrozen")
public class SpringbootwildflyApplication extends SpringBootServletInitializer
{
  public static void main(final String[] args)
  {
    SpringApplication.run(SpringbootwildflyApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(final SpringApplicationBuilder application)
  {
    return application.sources(SpringbootwildflyApplication.class);
  }
}
