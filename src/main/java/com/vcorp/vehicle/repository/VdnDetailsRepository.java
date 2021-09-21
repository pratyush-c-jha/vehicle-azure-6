package com.vcorp.vehicle.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.vcorp.vehicle.entity.VdnDetailsEntity;

@Transactional
public interface VdnDetailsRepository extends MongoRepository<VdnDetailsEntity, String> {
	
	List<VdnDetailsEntity> findByFromWeekAndToWeek(String fromWeek, String toWeek);

}
