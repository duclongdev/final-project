package com.example.currencyexcange.controller;

import com.example.currencyexcange.model.CurrencyExchangeDTO;
import com.example.currencyexcange.repository.CurrencyExchangeRepo;
import com.example.currencyexcange.service.CurrencyExchangeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api/currencyExchange")
public class CurrencyExchangeController {
    @Resource
    private CurrencyExchangeService currencyExchangeService;
    @GetMapping("{foreign}")
    public String getData(@PathVariable String foreign){
        return currencyExchangeService.getByForeign(foreign);
    }

}
