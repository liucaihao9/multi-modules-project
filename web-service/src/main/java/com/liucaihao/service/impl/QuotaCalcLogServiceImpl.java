package com.liucaihao.service.impl;

import com.liucaihao.dao.QuotaCalcLogDao;
import com.liucaihao.dto.QuotaCalcLogInsertDto;
import com.liucaihao.service.QuotaCalcLogService;
import com.liucaihao.service.params.QuotaCalcLogParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class QuotaCalcLogServiceImpl implements QuotaCalcLogService {
    @Autowired
    private QuotaCalcLogDao quotaCalcLogDao;

    @Override
    public void addQuotaCalcLog(QuotaCalcLogParam quotaCalcLogParam) {
        Assert.notNull(quotaCalcLogParam , "入参不能为空");
        QuotaCalcLogInsertDto quotaCalcLogInsertDto = new QuotaCalcLogInsertDto();
        BeanUtils.copyProperties(quotaCalcLogParam , quotaCalcLogInsertDto);
        quotaCalcLogDao.insert(quotaCalcLogInsertDto);
    }
}
