package org.koreait.order.controllers;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/order")

public class OrderController {
    // 주문관련
    @GetMapping("/list")
    public String list(@ModelAttribute @Valid RequestOrder form, Errors errorS){

        log.info(form.toString());

        return "order/list";

    }
}
