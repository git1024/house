package com.honghu.cloud.modules.house.controller;


import com.honghu.cloud.common.utils.R;
import com.honghu.cloud.common.validator.Assert;
import com.honghu.cloud.modules.api.annotation.AuthIgnore;
import com.honghu.cloud.modules.api.entity.TokenEntity;
import com.honghu.cloud.modules.api.service.UserService;
import com.honghu.cloud.modules.house.entity.InputDataEntity;
import com.honghu.cloud.modules.house.service.InputDataService;
import com.honghu.cloud.modules.house.vo.InputDataRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 录入数据
 * @author honghu cloud
 * @technology +QQ： 2170983087
 * @date 2017-03-26 17:27
 */
@RestController
@RequestMapping("/api")
public class ApiInputDataController {

    @Autowired
    private InputDataService inputDataService;

    /**
     * 录入
     */
    @AuthIgnore
    @PostMapping("input")
    public R register( @RequestBody InputDataRequest request){

        try {
            InputDataEntity entity = new InputDataEntity();
            BeanUtils.copyProperties(request,entity);
            entity.setCreateTime(new Date());
            entity.setUpdateTime(new Date());
            entity.setVersion(0);
            inputDataService.save(entity);
        } catch (Exception e) {
            e.printStackTrace();
            R.error("录入异常");
        }

        return R.ok("录入成功");
    }
}
