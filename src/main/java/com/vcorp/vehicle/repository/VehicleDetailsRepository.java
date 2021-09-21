package com.vcorp.vehicle.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.vcorp.vehicle.entity.VehicleDetailsEntity;

@Transactional
public interface VehicleDetailsRepository extends MongoRepository<VehicleDetailsEntity, String> {
	
	List<VehicleDetailsEntity> findByVin(String vin);

}
