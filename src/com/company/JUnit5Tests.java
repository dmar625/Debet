package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JUnit5Tests {

    public int account_value_K, vip_account_value_K, company_account_value_K;
    public int account_limit_M;
    public int account_debit_D;
    public int vip_account_debit_D;
    public int company_account_limit_M;
    public int company_account_debit_D;
    public String number;


    @DisplayName("Czy debet dla zwykłego konta jest przekroczony.")
    @Test
    void IsDebitExceeded()
    {
        assertEquals(account_debit_D > 300, "Limit przekroczony, nie można zmniejszać stanu konta!");
    }

    @DisplayName("O ile debet został przekroczony dla zwykłego konta.")
    @Test
    void DebitExceededBy()
    {
        assertEquals(number = String.valueOf(account_debit_D-(account_value_K+account_limit_M)), "Debet dla zwykłego konta został przekroczony o: "+ number);
    }


    @DisplayName("Debet dla zwykłego konta nie został przekroczony.")
    @Test
    void DebitNotExceeded()
    {
    assertEquals(account_debit_D < account_value_K+account_limit_M, "Debet nie został przekroczony");
    }

    @DisplayName("Czy konto posiada status VIP? ")
    @Test
    void IsAccountTypeVIP(String account_type)
    {
    assertEquals(account_type == "Konto VIP", "Konto posiada status VIP: "+account_type);
    }


    @DisplayName("Konto VIP nie ma debetu. Można zwiększyć")
    @Test
    void IsAccountVIP_Positive()
    {
        assertEquals(vip_account_value_K > 0, vip_account_debit_D >= 2000);
    }


    @DisplayName("Konto VIP ma debet.")
    @Test
    void IsAccountVIP_Negative()
    {
        assertEquals(vip_account_value_K < 0, vip_account_debit_D <= 1000);
    }


    @DisplayName("Czy konto jest kontem firmowym.")
    @Test
    void IsAccountTypeCompany(String account_type)
    {
        assertEquals(account_type == "Konto firmowe", "Konto posiada status firmy: "+account_type);

    }


    @DisplayName("Konto firmowe może zwiększyć debet maksymalnie o 2000 zł.")
    @Test
    void IsAccountCompany_DebitIncrease()
    {
        assertEquals(company_account_value_K < company_account_debit_D, company_account_limit_M <= 2000 );
    }
}
