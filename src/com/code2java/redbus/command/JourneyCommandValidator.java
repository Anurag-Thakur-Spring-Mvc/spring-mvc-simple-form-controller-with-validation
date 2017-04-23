package com.code2java.redbus.command;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class JourneyCommandValidator implements Validator {

	@Override
	public boolean supports(Class<?> classType) {
		if (classType.isAssignableFrom(JourneyCommand.class)) {
			return true;
		}
		return false;
	}

	@Override
	public void validate(Object commond, Errors errors) {
		JourneyCommand jCommand = null;

		jCommand = (JourneyCommand) commond;

		if (jCommand.getSource() == null || "".equals(jCommand.getSource())) {
			errors.rejectValue("source", "source.blank");
		}

		if (jCommand.getDestination() == null || "".equals(jCommand.getDestination())) {
			errors.rejectValue("destination", "destination.blank");
		}

		if (jCommand.getAmount() <= 0) {
			errors.rejectValue("amount", "amount.invalid");
		}

		if (jCommand.getJourneyDate() == null) {
			errors.rejectValue("journeyDate", "journeyDate.invalid");
		}
	}

}
