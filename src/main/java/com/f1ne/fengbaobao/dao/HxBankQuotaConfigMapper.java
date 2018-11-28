package com.f1ne.fengbaobao.dao;

import com.f1ne.fengbaobao.domain.HxBankQuotaConfig;

public interface HxBankQuotaConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HxBankQuotaConfig record);

    int insertSelective(HxBankQuotaConfig record);

    HxBankQuotaConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HxBankQuotaConfig record);

    int updateByPrimaryKeyWithBLOBs(HxBankQuotaConfig record);

    int updateByPrimaryKey(HxBankQuotaConfig record);
}