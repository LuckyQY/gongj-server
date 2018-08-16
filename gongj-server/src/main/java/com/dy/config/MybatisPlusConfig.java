package com.dy.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;
import com.dy.datasource.DruidProperties;

/**
 * <p>MybatisPlus配置</p>
 *
 * @author dy
 * @date 2018-07-16 14:52
 */
@Configuration
@EnableTransactionManagement(order = 1)//由于引入多数据源，所以让spring事务的aop要在多数据源切换aop的后面
@MapperScan(basePackages = {"com.dy.*.dao"})
public class MybatisPlusConfig {

    @Autowired
    private DruidProperties druidProperties;

    /**
     * 数据源
     */
    private DruidDataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        druidProperties.config(dataSource);
        return dataSource;
    }
}
