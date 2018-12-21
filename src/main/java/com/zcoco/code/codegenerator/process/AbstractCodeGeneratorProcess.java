package com.zcoco.code.codegenerator.process;

import com.zcoco.code.codegenerator.config.bean.EntityConfig;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
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
     * @param generatorContext
     * @return
     */
    public abstract EntityConfig buildEntityConfig(GeneratorContext generatorContext);

    /**
     * 构建所需要的数据结构
     *
     * @param generatorContext
     * @return
     */
    public abstract String getTempFilePath(GeneratorContext generatorContext);

    /**
     * 构建所需要的数据结构
     *
     * @return
     */
    public abstract File buildFile(EntityConfig entityConfig);

    @Override
    public void generator(GeneratorContext generatorContext) throws IOException {
        Template template = velocityEngine.getTemplate(getTempFilePath(generatorContext), "UTF-8");
        EntityConfig entityConfig = buildEntityConfig(generatorContext);
        VelocityContext ctx = new VelocityContext();
        ctx.put("item", entityConfig);
        // 流
        FileWriter writer = new FileWriter(buildFile(entityConfig));
        // 合并
        template.merge(ctx, writer);
        // 11.必须关闭流，写入内容
        writer.close();
    }
}
