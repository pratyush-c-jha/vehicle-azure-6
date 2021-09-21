package com.vcorp.vehicle.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.MatrixVariable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vcorp.vehicle.request.dto.VehicleRequestDTO;
import com.vcorp.vehicle.response.dto.VehicleResponseDTO;
import com.vcorp.vehicle.service.VehicleDetailsService;

@RestController
@RequestMapping("/vehicle")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class VehicleDetailsController {

	@Autowired
	private VehicleDetailsService vehicleDetailsService;

	@GetMapping(produces = { "application/json", "application/xml" })
	@RequestMapping("/getVehicleDetailsForVIN")
	//@CrossOrigin(origins = "*", allowedHeaders = "*")
	public ResponseEntity<VehicleResponseDTO> getVehicleDetailsForVIN(/*@Valid
																			 * @RequestBody VehicleRequestDTO
																			 * vehicleRequestDTO
																			 */) throws Exception {
		final Logger logger = LoggerFactory.getLogger(VehicleDetailsController.class);

		VehicleRequestDTO vehicleRequestDTO = new VehicleRequestDTO(); // remove later
		vehicleRequestDTO.setVin("YV1234567");
		
		logger.info("VIN received :"+"YV1234567");

		VehicleResponseDTO vehicleResponseDTO = vehicleDetailsService.getVehicleDetailsForVIN(vehicleRequestDTO);

		ResponseEntity<VehicleResponseDTO> vehicleResponse = new ResponseEntity<VehicleResponseDTO>(
				vehicleResponseDTO, HttpStatus.OK);

		return vehicleResponse;

	}

	@GetMapping(produces = "applicationjson")
	@RequestMapping("/getVehicleDetailsForVINQUeryParameter")
	public ResponseEntity<VehicleResponseDTO> getVehicleDetailsForVINQUeryParameter(@RequestParam String vin) throws Exception {

		VehicleRequestDTO vehicleRequestDTO = new VehicleRequestDTO(); // remove later
		vehicleRequestDTO.setVin(vin);

		VehicleResponseDTO vehicleResponseDTO = vehicleDetailsService.getVehicleDetailsForVIN(vehicleRequestDTO);

		ResponseEntity<VehicleResponseDTO> vehicleResponse = new ResponseEntity<VehicleResponseDTO>(
				vehicleResponseDTO, HttpStatus.OK);
		
		return vehicleResponse;

	}

	@GetMapping(produces = "applicationjson")
	@RequestMapping("/{vin}")
	public VehicleResponseDTO getVehicleDetailsForVINPathVariable(@PathVariable String vin) throws Exception {

		VehicleRequestDTO vehicleRequestDTO = new VehicleRequestDTO(); // remove later
		vehicleRequestDTO.setVin(vin);

		VehicleResponseDTO vehicleResponseDTO = vehicleDetailsService.getVehicleDetailsForVIN(vehicleRequestDTO);

		return vehicleResponseDTO;

	}

	@GetMapping(produces = "applicationjson")
	@RequestMapping("/{vin}/getVehicleDetailsForVINMatrixParam")
	public VehicleResponseDTO getVehicleDetailsForVINMatrixParam(@MatrixVariable String vin) throws Exception {

		VehicleRequestDTO vehicleRequestDTO = new VehicleRequestDTO(); // remove later
		vehicleRequestDTO.setVin(vin);

		VehicleResponseDTO vehicleResponseDTO = vehicleDetailsService.getVehicleDetailsForVIN(vehicleRequestDTO);

		return vehicleResponseDTO;

	}

}
