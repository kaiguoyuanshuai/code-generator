package com.zcoco.code.codegenerator.process;

import com.zcoco.code.codegenerator.config.bean.EntityConfig;
import org.springframework.stereotype.Component;

import java.io.File;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/21
 */
@Component("entityCodeGeneratorProcess")
public class EntityCodeGeneratorProcess extends AbstractCodeGeneratorProcess {
    @Override
    public EntityConfig buildEntityConfig(GeneratorContext generatorContext) {
        return null;
    }

    @Override
    public String getTempFilePath(GeneratorContext generatorContext) {
        return null;
    }

    @Override
    public File buildFile(EntityConfig entityConfig) {
        return null;
    }
}
