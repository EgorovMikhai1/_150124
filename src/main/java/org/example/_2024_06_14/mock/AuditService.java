package org.example._2024_06_14.mock;

public interface AuditService {
	void logNewTrade(Trade trade);
}

class CreateTradeException extends RuntimeException {
	public CreateTradeException() {
		super("Cannot create such trade!");
	}
}

