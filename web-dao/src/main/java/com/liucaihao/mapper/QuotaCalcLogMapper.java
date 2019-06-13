package com.liucaihao.mapper;

import com.liucaihao.domain.QuotaCalcLog;

public interface QuotaCalcLogMapper {
    int insert(QuotaCalcLog record);

    int insertSelective(QuotaCalcLog record);
}