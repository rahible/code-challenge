package com.aaronhible.savvis.model;

import java.math.BigDecimal;

public class DeveloperType extends EmployeeType {

	private static final BigDecimal EXPENSE_ALLOCATION = new BigDecimal(1000);

	@Override
	public BigDecimal getExpenseAllocation() {
		return EXPENSE_ALLOCATION;
	}

}
