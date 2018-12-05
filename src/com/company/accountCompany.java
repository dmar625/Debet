package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class accountCompany {

    private int company_account_value_K;
    private int company_account_debit_D;
    private int company_account_limit_M;
    private String account_type;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public accountCompany(){

    }

    protected void AccountType() throws IOException {

        System.out.println("Podaj typ konta: ");
        account_type = input.readLine();
        System.out.println("Typ konta: "+account_type+"/n");
    }


    protected void CompanyDebitIncrease() throws IOException {

        System.out.println("Podaj wartośc konta firmowego: ");
        company_account_value_K = Integer.parseInt(input.readLine());
        System.out.println("Podaj debet konta firmowego: ");
        company_account_debit_D = Integer.parseInt(input.readLine());

        if (company_account_value_K < company_account_debit_D) {
            System.out.println("Debet można maksymalnie zwiększyć o 2000zł./n");
            company_account_debit_D =+ 2000;
            System.out.println("Nowy debet wynosi: "+company_account_debit_D);
        }
        else {
            System.out.println("Nie można zwiększyć debetu.");
        }
    }
}
