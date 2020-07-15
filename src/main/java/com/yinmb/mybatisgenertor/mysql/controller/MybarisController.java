package com.yinmb.mybatisgenertor.mysql.controller;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.yinmb.mybatisgenertor.mysql.mapper.SysUserMapper;
import com.yinmb.mybatisgenertor.mysql.model.SysUser;
import com.yinmb.mybatisgenertor.mysql.model.SysUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：yinmb@ruyi.ai
 * @date ：Created in 2020/5/4 下午11:41
 */
@RestController
public class MybarisController {

    @Autowired
	SysUserMapper sysUserMapper;


    /**
     * 社区发现算法查询
     * @return
     */
    @GetMapping("/user")
    public void community() {
       SysUserExample sysUserExample  = new SysUserExample();
       sysUserExample.createCriteria().andIdEqualTo(1);
       List<SysUser> sysUsers = sysUserMapper.selectByExample(sysUserExample);
       if(!CollectionUtils.isEmpty(sysUsers)) {
		   sysUsers.forEach(sysUser -> {
			   System.out.println(JSON.toJSONString(sysUser));
		   });
	   }

    }
}
