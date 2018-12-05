package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class accountRegular {

    private int account_value_K;
    private int account_debit_D;
    private int decrease_debit_D;
    private int account_limit_M;

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

    public accountRegular() {
    }

    protected void AccountType() throws IOException {

        System.out.println("Podaj typ konta: ");
        String account_type = input.readLine();
        System.out.println("Typ konta: "+account_type+"/n");
    }

    protected void DecreaseAccountValue() throws IOException {

        System.out.println("Podaj bilans swojego konta: ");
        account_value_K = Integer.parseInt(input.readLine());
        System.out.println("Bilans Twojego konta wynosi: "+account_value_K+"/n");

        System.out.println("Ile wynosi Twój debet?");
        account_debit_D = Integer.parseInt(input.readLine());
        System.out.println("Debet wynosi: "+account_debit_D+"/n");

        if (account_debit_D > 300) {
            System.out.println("Nie można zmienić stanu konta.");
        } else {
            System.out.println("O ile zmniejszyć debet? ");
            int debit_d = Integer.parseInt(input.readLine());
            decrease_debit_D = account_debit_D - debit_d;
            System.out.println("Debet zmniejszono o:"+decrease_debit_D);
        }
    }

    protected void DebitNotExceeded() {

        if (account_debit_D > 300 ){
            account_limit_M = 100;
            System.out.println("Możesz dokonać zakupu do kwoty bez przekraczania limitu "+account_limit_M+" zł.");
        } else {
            System.out.println("Debet został przekroczony.");
        }
    }
}
