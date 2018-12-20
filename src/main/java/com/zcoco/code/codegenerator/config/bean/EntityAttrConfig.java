package com.zcoco.code.codegenerator.config.bean;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/20
 */
public class EntityAttrConfig {

    private String attrName;

    private String attrNameUp;

    private String attrType;

    /**
     * 类名类名全路径
     */
    private String attrTypeFull;


    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName;
    }

    public String getAttrNameUp() {
        return attrNameUp;
    }

    public void setAttrNameUp(String attrNameUp) {
        this.attrNameUp = attrNameUp;
    }

    public String getAttrType() {
        return attrType;
    }

    public void setAttrType(String attrType) {
        this.attrType = attrType;
    }

    public String getAttrTypeFull() {
        return attrTypeFull;
    }

    public void setAttrTypeFull(String attrTypeFull) {
        this.attrTypeFull = attrTypeFull;
    }
}
