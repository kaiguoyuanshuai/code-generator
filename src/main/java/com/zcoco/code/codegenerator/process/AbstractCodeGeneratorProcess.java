package com.zcoco.code.codegenerator.process;

import com.zcoco.code.codegenerator.config.bean.EntityConfig;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/20
 */
public abstract class AbstractCodeGeneratorProcess implements CodeGeneratorProcess {

    @Autowired
    private VelocityEngine velocityEngine;

    /**
     * 构建所需要的数据结构
     *
     * @return
     */
    public abstract EntityConfig buildEntityConfig();

    /**
     * 构建所需要的数据结构
     *
     * @return
     */
    public abstract EntityConfig buildFile();

    @Override
    public void generator() throws IOException {

        Template template = velocityEngine.getTemplate("/templates/temp.vm", "UTF-8");

        VelocityContext ctx = new VelocityContext();
        ctx.put("item", buildEntityConfig());
        // 流
        FileWriter writer = new FileWriter("d:/html/index.java");
        // 合并
        template.merge(ctx, writer);
        // 11.必须关闭流，写入内容
        writer.close();
    }
}
