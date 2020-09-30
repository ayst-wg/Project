package com.wanggang.springcloud.contorller;

import com.wanggang.springcloud.result.CommonResult;
import com.wanggang.springcloud.result.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName : ConfigClientContorller
 * @Description : ConfigClientContorller
 * @Author : wanggang
 * @Date: 2020-09-30 17:36
 * @Version 1.0
 **/
@RestController
@Slf4j
public class ConfigClientContorller {

    @Value("${config.label}")
    private String configlabel;

    @Value("${config.name}")
    private String configName;

    @Value("${config.version}")
    private String configVersion;

    @GetMapping(value = "/config/getConfigInfo")
    public CommonResult<String> getConfigInfo(){
        return new CommonResult<>("读取配置服务器信息：label：" + configlabel + "，name：" + configName + "，version：" + configVersion, StatusCode.SUCCESS);
    }
}
