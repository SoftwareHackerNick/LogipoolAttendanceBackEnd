package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.BatchMasterRepository;
import com.model.BatchMaster;



@Service
public class BatchMasterServiceImpl implements BatchMasterService{
	
	@Autowired
	BatchMasterRepository batchMasterRepo;

	@Override
	public BatchMaster addBatchMaster(BatchMaster batch) {
		// TODO Auto-generated method stub
		return batchMasterRepo.save(batch);
	}

	@Override
	public List<BatchMaster> getBatchMaster() {
		// TODO Auto-generated method stub
		return batchMasterRepo.findAll();
	}

	@Override
	public String deleteBatch(int B_id) {
		// TODO Auto-generated method stub
		batchMasterRepo.deleteById(B_id);
		return "Batch Data deleted Successfully.";
	}

	@Override
	public BatchMaster updateBatch(BatchMaster batch, int B_id) {
		// TODO Auto-generated method stub
		BatchMaster existingBatch =batchMasterRepo.findById(B_id).orElse(null);
		
		if(existingBatch!=null) {
			existingBatch.setBname(batch.getBname());
			existingBatch.setCourse(batch.getCourse());
			existingBatch.setSdate(batch.getSdate());
			existingBatch.setEdate(batch.getEdate());
			existingBatch.setTrainer(batch.getTrainer());

		}
		else {
			System.out.println("Batch Master Record is null");
		}
		
		return batchMasterRepo.save(existingBatch);
	}

}
