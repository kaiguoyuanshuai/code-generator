package com.zcoco.code.codegenerator.controller;

import com.zcoco.code.codegenerator.config.bean.EntityAttrConfig;
import com.zcoco.code.codegenerator.config.bean.EntityConfig;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/20
 */
@RestController
public class RestFController {

    @Autowired
    private VelocityEngine velocityEngine;


    @RequestMapping("hi")
    public void hi() throws IOException {

        Set<EntityAttrConfig> entityAttrConfigs = new HashSet<>();
        EntityAttrConfig entityAttrConfig = new EntityAttrConfig();
        entityAttrConfig.setAttrName("userName");
        entityAttrConfig.setAttrNameUp("UserName");
        entityAttrConfig.setAttrType("String");
        entityAttrConfig.setAttrTypeFull("java.lang.String");
        entityAttrConfigs.add(entityAttrConfig);

        Set<String> attrTypeFullSet = new HashSet<>();
        attrTypeFullSet.add(entityAttrConfig.getAttrTypeFull());

        EntityConfig entityConfig = new EntityConfig();
        entityConfig.setBasePackage("com.zcoco.gupao");
        entityConfig.setFunctionModelPackage("coco");
        entityConfig.setFunctionDev("zhengkk@126.com");
        entityConfig.setFunctionModelName("en");
        entityConfig.setFunctionModelDesc("藐视");
        entityConfig.setEntityName("User");
        entityConfig.setAttrTypeFullSet(attrTypeFullSet);
        entityConfig.setEntityAttrConfigs(entityAttrConfigs);


        Template template = velocityEngine.getTemplate("/templates/temp.vm", "UTF-8");

        VelocityContext ctx = new VelocityContext();
        ctx.put("item", entityConfig);

        // 流
        FileWriter writer = new FileWriter("d:/html/index.java");
        // 合并
        template.merge(ctx, writer);
        // 11.必须关闭流，写入内容
        writer.close();
    }


}
