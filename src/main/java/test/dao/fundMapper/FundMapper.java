package test.dao.fundMapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Service;

/**
 * @Author 王猛
 * @Date 2017/4/18 14:12
 * @Discribe:
 */
@Mapper
public interface FundMapper {

    @Select("select department_name from fraud_risk_event where id=#{id}")
    public String getName(String id);
}
