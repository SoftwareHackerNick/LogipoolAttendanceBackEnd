package com.service;

import java.util.List;

import com.model.BatchMaster;


public interface BatchMasterService {

	BatchMaster addBatchMaster(BatchMaster batch);
	
	List<BatchMaster> getBatchMaster();
	
    String deleteBatch(int B_id);
	
    BatchMaster updateBatch(BatchMaster batch,int B_id);

}
