package org.javaboy.vhr.mapper;

import org.javaboy.vhr.model.EmpSalary;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpSalaryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(EmpSalary record);

    int insertSelective(EmpSalary record);

    EmpSalary selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(EmpSalary record);

    int updateByPrimaryKey(EmpSalary record);
}