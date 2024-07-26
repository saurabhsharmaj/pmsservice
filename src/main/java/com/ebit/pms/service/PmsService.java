package com.ebit.pms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ebit.pms.dto.Patient;

import jakarta.annotation.PostConstruct;

@Service
public class PmsService {

	List<Patient> list = new ArrayList<Patient>();
	
	@PostConstruct
	void init() {
		list.add(new Patient(1,"saurabh", 37, "jaipur"));
		list.add(new Patient(2,"Jagdish", 37, "kota"));
	}
	public List<Patient> findAllPatient(){
		return list;
	}
	public Optional<Patient> findPatientById(Integer id) {
		return list.stream().filter(p->p.getId()==id).findFirst();
	}
}
