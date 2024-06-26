package org.example._2024_06_14.mock;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class SimpleTradingServiceTest {

    @Mock  // actually, this is a stub
    TradeRepository tradeRepository;

    @Mock
    Trade trade;

    @Mock  // and this one is indeed a mock
    AuditService auditService;

    @Test
    public void testAuditLogEntryMadeForNewTrade() throws Exception {
        //	Trade trade = new Trade("Ref 1.txt", "Description 1.txt");

        when(tradeRepository.createTrade(trade)).thenReturn(anyLong());

        TradingService tradingService = new SimpleTradingService(tradeRepository, auditService);
        tradingService.createTrade(trade);

        verify(auditService).logNewTrade(trade);
    }
}