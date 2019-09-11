package org.mycompany;

import org.apache.camel.spi.MaskingFormatter;

public class MyCustomExchangeFormatter implements MaskingFormatter {

	@Override
	public String format(String arg0) {
		// TODO Auto-generated method stub
		return "abc";
	}

}
