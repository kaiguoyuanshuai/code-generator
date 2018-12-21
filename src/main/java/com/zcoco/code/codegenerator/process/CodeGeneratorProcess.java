package com.zcoco.code.codegenerator.process;

import java.io.IOException;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/20
 */
public interface CodeGeneratorProcess {

    /**
     * 生成代码
     */
    public void generator(GeneratorContext generatorContext) throws IOException;
}
