package com.example.jodamoney;

import org.joda.money.BigMoney;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.math.RoundingMode;

public class JodaMoneyExample {
    public static void main(String[] args) {
        // create a monetary value
        Money money = Money.parse("USD 23.87");
        System.out.println("1 Money: " + money);

        // add another amount with safe double conversion
        CurrencyUnit usd = CurrencyUnit.of("USD");
        money = money.plus(Money.of(usd, 12.43d));
        System.out.println("2 Money: " + money);

        // subtracts an amount in dollars
        money = money.minusMajor(2);
        System.out.println("3 Money: " + money);

        // multiplies by 3.5 with rounding
        money = money.multipliedBy(3.5d, RoundingMode.DOWN);
        System.out.println("4 Money: " + money);

        // use a BigMoney for more complex calculations where scale matters
        BigMoney moneyCalc = money.toBigMoney();
        System.out.println("Big Money: " + moneyCalc);
    }
}
