package com.bogon.ioc.persistence.dao;

import com.bogon.ioc.persistence.entity.EventEntity;

public interface EventDao {

    void save(EventEntity entity);

}
