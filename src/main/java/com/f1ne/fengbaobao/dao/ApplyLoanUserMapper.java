package com.f1ne.fengbaobao.dao;

import com.f1ne.fengbaobao.domain.ApplyLoanUser;

public interface ApplyLoanUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ApplyLoanUser record);

    int insertSelective(ApplyLoanUser record);

    ApplyLoanUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ApplyLoanUser record);

    int updateByPrimaryKey(ApplyLoanUser record);
}