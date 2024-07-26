package com.ebit.pms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ebit.pms.dto.Patient;
import com.ebit.pms.service.PmsService;

@RestController
@RequestMapping("/pms")
public class PmsController {

	@Autowired
	PmsService pmsService;
	
	@GetMapping("")
	public ResponseEntity<List<Patient>> findAllPatient(){		
		return ResponseEntity.ok(pmsService.findAllPatient());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Patient> findPatientById(@PathVariable Integer id){		
		return ResponseEntity.ok(pmsService.findPatientById(id).get());
	}
}
