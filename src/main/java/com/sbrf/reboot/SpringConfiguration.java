package com.sbrf.reboot;

import com.sbrf.reboot.bank.Account;
import com.sbrf.reboot.bank.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Account account(){
        return new Account();
    }

    @Bean
    public Customer customer(){
        return new Customer();
    }
}
