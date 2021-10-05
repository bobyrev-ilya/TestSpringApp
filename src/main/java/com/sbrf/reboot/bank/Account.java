package com.sbrf.reboot.bank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Component("account")
public class Account {
    private BigDecimal amount;
    private String currency;
    private LocalDate createDate;

    public void test(){
        System.out.println(this.getClass().getName());
    }
}
