package com.gui.zookeeper.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service
@Component
public class TicketServiceImpl implements TicketService {
    @Override
    public void getTicket() {
        System.out.println("厉害了，我的国");
    }
}
