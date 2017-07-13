package test.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * Created by 庞亮 on 2017/3/14.
 */
@Configuration
@MapperScan(basePackages = {"test.dao.springMapper"},
        sqlSessionFactoryRef = "springSqlSessionFactory")
public class DruidConfig {

    @Bean(name = "springDataSource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource druidDataSource() {
        System.out.println("druidDataSource:" + new DruidDataSource().toString());
        DruidDataSource druidDataSource = new DruidDataSource();
        return new DruidDataSource();
    }

    @Bean(name = "springSqlSessionFactory")
    @Primary
    public SqlSessionFactory springSqlSessionFactory(@Qualifier("springDataSource") DataSource dataSource) throws Exception {
        final SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);
        return sessionFactoryBean.getObject();
    }


}