package com.honghu.cloud.modules.house.service.impl;


import com.honghu.cloud.modules.house.dao.InputDataDao;
import com.honghu.cloud.modules.house.entity.InputDataEntity;
import com.honghu.cloud.modules.house.service.InputDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("inputDataService")
public class InputDataServiceImpl implements InputDataService {
	@Autowired
	private InputDataDao inputDataDao;

	@Override
	public void save(InputDataEntity data) {
		inputDataDao.save(data);
	}
}
