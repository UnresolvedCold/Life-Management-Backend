package com.schwiftycold.lifemanagement.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "MonthlyIncomeBifurcation")
public class MonthlyIncomeBifurcation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column
    private Date month;

    @Column
    private Double mainIncome;

    @Column
    private Double sideIncome;

    @Column
    private Double totalIncome;     // Sum of side income and main income

    @Column
    private Double saveForEMIs;     // Derive from EMIs table

    @Column
    private Double saveForPremiums; // Derve from Premiums table

    @Column
    private Double emergencyFunds;  // Calculate using percentage

    @Column
    private Double familyFunds;     // Calculate using percentage

    @Column
    private Double investInStockMarket; // Calculate using percentage

    @Column
    private Double availableForFreeUse; // Amount left from income

    @Column
    private Double totalIncomeUsed;     // How much money used this month

    @Column
    private Double saveForEMIsUsed;     // How much used for EMIs

    @Column
    private Double saveForPremiumsUsed; // How much used for premiums

    @Column
    private Double emergencyFundsUsed;  // If you used any amount from emergency

    @Column
    private Double familyFundsUsed;     // Amount used from family funds

    @Column
    private Double investInStockMarketUsed; // How much used for stock market

    @Column
    private Double availableForFreeUseUsed; // Get this from Monthly expenditure table

    @Column
    private Double saveForEMIsReserve;     // How much you have in reserve for this thing

    @Column
    private Double saveForPremiumsReserve;

    @Column
    private Double emergencyFundsReserve;

    @Column
    private Double familyFundsReserve;

    @Column
    private Double investInStockMarketReserve;

    @Column
    private Double availableForFreeUseReserve;
}
