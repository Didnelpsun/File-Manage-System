package org.didnelpsun.mybatis.sqlsession;

import java.io.InputStream;

// SqlSessionFactory的默认实现类

import org.didnelpsun.mybatis.cfg.Configuration;

public class DefaultSqlSessionFactory implements SqlSessionFactory {
    private Configuration config;

    public Configuration getConfig() {
        return config;
    }

    public void setConfig(Configuration config) {
        this.config = config;
    }

    public DefaultSqlSessionFactory(Configuration config){
        this.config = config;
    }

    @Override
    public SqlSession openSqlSession(){
        return new DefaultSqlSession(config);
    }
}
