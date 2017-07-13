package test.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * Created by 庞亮 on 2017/3/14.
 */
@Configuration
@MapperScan(basePackages = {"test.dao.fundMapper"},
        sqlSessionFactoryRef = "fundSqlSessionFactory")
public class DruidConfig2 {

    @Bean(name = "druidFundDataSource")
    @ConfigurationProperties(prefix = "fraud")
    public DataSource druidFundDataSource() {
        System.out.println("fraud:" + new DruidDataSource().toString());
        DruidDataSource druidDataSource = new DruidDataSource();
        return new DruidDataSource();
    }

    @Bean(name = "fundSqlSessionFactory")
    public SqlSessionFactory fundSqlSessionFactory(@Qualifier("druidFundDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        return sessionFactoryBean.getObject();
    }


}