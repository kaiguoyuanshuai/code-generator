package com.zcoco.code.codegenerator.config.bean;

/*
 * 描述:
 * 功能整体结构
 * @auth zhengkk19738
 * @time 2018/12/20
 */
public class FunctionConfig {

    /**
     * 基础包名称
     */
    private String basePackage;

    /**
     * 功能模块包名称
     */
    private String functionModelPackage;

    /**
     * 业务模块名称
     */
    private String functionModelName;

    /**
     * 业务功能描述
     */
    private String functionModelDesc;

    /**
     * 功能开发人员
     */
    private String functionDev;

    public String getFunctionModelPackage() {
        return functionModelPackage;
    }

    public void setFunctionModelPackage(String functionModelPackage) {
        this.functionModelPackage = functionModelPackage;
    }

    public String getBasePackage() {
        return basePackage;
    }

    public void setBasePackage(String basePackage) {
        this.basePackage = basePackage;
    }

    public String getFunctionModelName() {
        return functionModelName;
    }

    public void setFunctionModelName(String functionModelName) {
        this.functionModelName = functionModelName;
    }

    public String getFunctionModelDesc() {
        return functionModelDesc;
    }

    public void setFunctionModelDesc(String functionModelDesc) {
        this.functionModelDesc = functionModelDesc;
    }

    public String getFunctionDev() {
        return functionDev;
    }

    public void setFunctionDev(String functionDev) {
        this.functionDev = functionDev;
    }
}
