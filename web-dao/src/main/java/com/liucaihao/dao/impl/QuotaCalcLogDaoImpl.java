package com.liucaihao.dao.impl;

import com.liucaihao.dao.QuotaCalcLogDao;
import com.liucaihao.domain.QuotaCalcLog;
import com.liucaihao.dto.QuotaCalcLogInsertDto;
import com.liucaihao.enums.QuotaCalcLogStage;
import com.liucaihao.mapper.QuotaCalcLogMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

@Repository
public class QuotaCalcLogDaoImpl implements QuotaCalcLogDao {
    @Autowired
    private QuotaCalcLogMapper quotaCalcLogMapper;
    @Override
    public void insert(QuotaCalcLogInsertDto quotaCalcLogInsertDto) {
        Assert.notNull(quotaCalcLogInsertDto , "入参不能为空");
        QuotaCalcLog quotaCalcLog = new QuotaCalcLog();
        BeanUtils.copyProperties(quotaCalcLogInsertDto , quotaCalcLog);
        quotaCalcLogMapper.insert(quotaCalcLog);
    }
}
