package com.gui.consumer.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gui.zookeeper.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerService {

    @Reference
    TicketService ticketService;

    public void get(){
        ticketService.getTicket();
    }

}
