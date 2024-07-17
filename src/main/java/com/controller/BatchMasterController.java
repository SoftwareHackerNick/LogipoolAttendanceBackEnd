package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.BatchMaster;

import com.service.BatchMasterServiceImpl;

@RestController
@RequestMapping("/BatchMaster")
@CrossOrigin("*")
public class BatchMasterController {
	
	@Autowired
	BatchMasterServiceImpl batchMasterService;

	@PostMapping("addBatch")
	public BatchMaster addBatchMaster(@RequestBody BatchMaster batch) {
		//TODO: process POST request
		
		return batchMasterService.addBatchMaster(batch);
	}
	
	
	@GetMapping("getBatch")
	List<BatchMaster> getBatchMaster(){
		return batchMasterService.getBatchMaster();
	}
	
	@DeleteMapping("/deleteBatch/{id}")
	public String deleteBatch(@PathVariable int B_id) {
		return batchMasterService.deleteBatch(B_id);
				
	}
	
	@PutMapping("updateBatch/{id}")
	public BatchMaster updateBatch( @RequestBody BatchMaster batch,@PathVariable int B_id) {
		//TODO: process PUT request	
		return batchMasterService.updateBatch(batch, B_id);
	}

	
	
}
