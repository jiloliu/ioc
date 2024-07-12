package com.bogon.ioc.persistence.dao;

import com.bogon.ioc.persistence.entity.EventEntity;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<EventEntity, String> {
}
