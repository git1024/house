package com.honghu.cloud.modules.api.controller;


import com.honghu.cloud.common.utils.R;
import com.honghu.cloud.modules.api.annotation.AuthIgnore;
import com.honghu.cloud.modules.api.annotation.LoginUser;
import com.honghu.cloud.modules.api.entity.TokenEntity;
import com.honghu.cloud.modules.api.entity.UserEntity;
import org.springframework.web.bind.annotation.*;

/**
 * API测试接口
 *
 * @author honghu cloud
 * @technology +QQ： 2170983087
 * @date 2017-03-23 15:47
 */
@RestController
@RequestMapping("/api")
public class ApiTestController {

    /**
     * 获取用户信息
     */
    @GetMapping("userInfo")
    public R userInfo(@LoginUser UserEntity user){
        return R.ok().put("user", user);
    }

    /**
     * 获取用户ID
     */
    @GetMapping("userId")
    public R userInfo(@RequestAttribute("userId") Integer userId){
        return R.ok().put("userId", userId);
    }

    /**
     * 忽略Token验证测试
     */
    @AuthIgnore
    @GetMapping("notToken")
    public R notToken(){
        return R.ok().put("msg", "无需token也能访问。。。");
    }

    /**
     * 接收JSON数据
     */
    @PostMapping("jsonData")
    public R jsonData(@LoginUser UserEntity user, @RequestBody TokenEntity token){
        return R.ok().put("user", user).put("token", token);
    }
}
