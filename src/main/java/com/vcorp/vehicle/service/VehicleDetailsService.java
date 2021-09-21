package com.vcorp.vehicle.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcorp.vehicle.entity.VehicleDetailsEntity;
import com.vcorp.vehicle.entity.VdnDetailsEntity;
import com.vcorp.vehicle.exception.VehicleException;
import com.vcorp.vehicle.repository.VdnDetailsRepository;
import com.vcorp.vehicle.repository.VehicleDetailsRepository;
import com.vcorp.vehicle.request.dto.VehicleRequestDTO;
import com.vcorp.vehicle.response.dto.VehicleResponseDTO;

@Service
public class VehicleDetailsService {
	
	@Autowired
	private VehicleDetailsRepository vehicleDetailsRepository;
	
	@Autowired
	private VdnDetailsRepository vdnDetailsRepository;
	
	public VehicleResponseDTO getVehicleDetailsForVIN(VehicleRequestDTO vehicleRequestDTO) throws Exception {

		// List<VehicleDetailsEntity> vehicleDetailsEntity =
		// vehicleDetailsRepository.findByVin(vehicleRequestDTO.getVin());
		List<VehicleDetailsEntity> vehicleDetailsEntity = vehicleDetailsRepository.findAll();

		List<VdnDetailsEntity> vdnDetailsEntity = vdnDetailsRepository.findByFromWeekAndToWeek(
				vehicleDetailsEntity.get(0).getFromWeek(), vehicleDetailsEntity.get(0).getToWeek());
		return populateVehicleResponseDTO(vehicleDetailsEntity.get(0), vdnDetailsEntity);

	}
	
	private VehicleResponseDTO populateVehicleResponseDTO(VehicleDetailsEntity vehicleDetailsEntity,List<VdnDetailsEntity> vdnDetailsEntity){
		
		VehicleResponseDTO vehicleResponseDTO = new VehicleResponseDTO();
		List<String> vdnList = new ArrayList<String>();
		
		vehicleResponseDTO.setVin(vehicleDetailsEntity.getVin());
		vehicleResponseDTO.setBuildFrom(vehicleDetailsEntity.getFromWeek());
		vehicleResponseDTO.setBuildTo(vehicleDetailsEntity.getToWeek());
		
		for (VdnDetailsEntity vdnDetails : vdnDetailsEntity) {

			vdnList.add(vdnDetails.getVdn());

		}
		
		vehicleResponseDTO.setVdn(vdnList);
		
		return vehicleResponseDTO;
	}

}
