package com.bogon.ioc.persistence.dao.impl;

import com.bogon.ioc.persistence.dao.EventDao;
import com.bogon.ioc.persistence.dao.EventRepository;
import com.bogon.ioc.persistence.entity.EventEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class EventJpaDao implements EventDao {

    private final EventRepository eventRepository;

    @Override
    public void save(EventEntity entity) {
        eventRepository.save(entity);
    }
}
