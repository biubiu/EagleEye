/*
 * Copyright (C) 2018 Covata Limited or its affiliates
 *
 * Information contained within this file cannot be copied,
 * distributed and/or practised without the written consent of
 * Covata Limited or its affiliates.
 */

package com.thoughtmechanix.confsvr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class);
    }
}
