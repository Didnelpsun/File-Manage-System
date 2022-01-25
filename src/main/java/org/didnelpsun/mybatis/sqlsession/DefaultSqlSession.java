package org.didnelpsun.mybatis.sqlsession;

import org.didnelpsun.mybatis.cfg.Configuration;

public class DefaultSqlSession implements SqlSession {
    private Configuration config;

    public Configuration getConfig() {
        return config;
    }

    public void setConfig(Configuration config) {
        this.config = config;
    }

    public DefaultSqlSession(Configuration config){};

    @Override
    public <T> T getMapper(Class<T> daoInterfaceClass) {
        return null;
    }

    @Override
    public void close() {
    }
}
