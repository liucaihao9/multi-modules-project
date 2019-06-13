package com.liucaihao.controller;

import com.liucaihao.enums.QuotaCalcLogStage;
import com.liucaihao.service.QuotaCalcLogService;
import com.liucaihao.service.params.QuotaCalcLogParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class TestController {

    @Autowired
    private QuotaCalcLogService quotaCalcLogService;

    @RequestMapping(value = "/" , method = RequestMethod.GET)
    public String hello(){
        QuotaCalcLogParam quotaCalcLogParam = new QuotaCalcLogParam();
        quotaCalcLogParam.setApplicationName("applicationName");
        quotaCalcLogParam.setCreateTime(new Date());
        quotaCalcLogParam.setEndDate(new Date());
        quotaCalcLogParam.setEnterpriseCode("enterpriseCode");
        quotaCalcLogParam.setQuotaName("quotaName");
        quotaCalcLogParam.setStage(QuotaCalcLogStage.BEFORE_MAPPER.code);
        quotaCalcLogService.addQuotaCalcLog(quotaCalcLogParam);
        return "hello world";
    }
}
