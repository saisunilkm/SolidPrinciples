package com.thoughtfocus.solidprinciples.isp;

public class DataTypeConversion implements ConvertIntToDouble, ConvertCharToString {

    @Override
    public String charToString() {
        return "Here I'm converting the Data Type from Char to String";

    }

    @Override
    public String intToDouble() {
        return "Here I'm converting the Data Type from integer to Double";

    }
}
