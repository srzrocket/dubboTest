package com.dubbo.test.service.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.dubbo.test.service.DemoService;
@Service("demoServiceImpl")
public class DemoServiceImpl implements DemoService,Serializable
{

    /**
     * 
     */
    private static final long serialVersionUID = -8022813524406374565L;

    @Override
    public List<String> getPermissions(Long id)
    {
        List<String> demo = new ArrayList<String>();
        demo.add(String.format("Permission_%d", id - 1));
        demo.add(String.format("Permission_%d", id));
        demo.add(String.format("Permission_%d", id + 1));
        return demo;
    }

}
