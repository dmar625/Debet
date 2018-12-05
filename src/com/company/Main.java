package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        accountRegular kontoZwykle = new accountRegular();
        accountVIP kontoVIP = new accountVIP();
        accountCompany kontoFirmowe = new accountCompany();

        kontoZwykle.AccountType();
        kontoZwykle.DecreaseAccountValue();
        kontoZwykle.DebitNotExceeded();

        kontoVIP.AccountType();
        kontoVIP.VipStatusValueNegative();
        kontoVIP.VipStatusValuePositive();

        kontoFirmowe.AccountType();
        kontoFirmowe.CompanyDebitIncrease();

    }
}
