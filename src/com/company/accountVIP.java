package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class accountVIP {

    private int vip_account_value_K;
    private int vip_account_limit_M;
    private String account_type;
    private String VIP_yes_no;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public accountVIP() {
    }

    protected void AccountType() throws IOException {

        System.out.println("Podaj typ konta: ");
        account_type = input.readLine();
        System.out.println("Typ konta: "+account_type+"/n");
    }


    protected void VipStatusValueNegative() throws IOException {

        System.out.println("Czy Twoje konto posiada status VIP? (tak/nie)");
        VIP_yes_no = input.readLine();
        System.out.print("Podaj stan konta VIP: ");
        vip_account_value_K = Integer.parseInt(input.readLine());

        if (VIP_yes_no == "tak") {
            if (vip_account_value_K < 0){
                System.out.println("Maksymalna kwota przekroczenia limitu wynosi 1000zł");
                vip_account_limit_M = 1000;
            } else {
                System.out.println("Nie można przekroczyć limitu.");
            }
        } else {
            System.out.println("Niespełniony warunek, proszę wprowadzić poprawną wartość.");
        }
    }

    protected void VipStatusValuePositive() throws IOException {

        System.out.println("Czy Twoje konto posiada status VIP? (tak/nie)");
        VIP_yes_no = input.readLine();
        System.out.print("Podaj stan konta VIP: ");
        vip_account_value_K = Integer.parseInt(input.readLine());

        if (VIP_yes_no == "tak") {
            if (vip_account_value_K > 0){
                System.out.println("Maksymalna kwota przekroczenia limitu wynosi 2000zł");
                vip_account_limit_M = 2000;
            } else {
                System.out.println("Nie można przekroczyć limitu.");
            }
        } else {
            System.out.println("Niespełniony warunek, proszę wprowadzić poprawną wartość.");
        }
    }
}
