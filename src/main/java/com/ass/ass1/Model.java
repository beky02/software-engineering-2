package com.ass.ass1;

/**
 * Created by kalu on 3/22/2018.
 */

public class Model {
    public double birr_to_dollar(double amount){
        return amount * 0.0437;
    }
    public double birr_to_pound(double amount){
        return amount * 0.0337;
    }
    public double yen_to_birr(double amount){
        return amount * 0.204;
    }
    public double dollar_to_birr(double amount){
        return amount * 28.9;
    }
    public double dollar_to_pound(double amount){
        return amount * 20;
    }
    public double euro_to_birr(double amount){
        return amount * 25.6755;
    }
    public double euro_to_pound(double amount){
        return amount * 0.8665;
    }
    public double defualt(double amount){
        return amount * 0.0437;
    }
}
