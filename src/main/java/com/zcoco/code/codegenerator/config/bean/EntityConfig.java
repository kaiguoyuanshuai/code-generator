package com.zcoco.code.codegenerator.config.bean;

import java.util.Set;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/20
 */
public class EntityConfig extends FunctionConfig {

    /**
     * 实体类名称
     */
    private String entityName;

    /**
     * 属性列表
     */
    private Set<EntityAttrConfig> entityAttrConfigs;

    private Set<String> attrTypeFullSet;


    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public Set<EntityAttrConfig> getEntityAttrConfigs() {
        return entityAttrConfigs;
    }

    public void setEntityAttrConfigs(Set<EntityAttrConfig> entityAttrConfigs) {
        this.entityAttrConfigs = entityAttrConfigs;
    }

    public Set<String> getAttrTypeFullSet() {
        return attrTypeFullSet;
    }

    public void setAttrTypeFullSet(Set<String> attrTypeFullSet) {
        this.attrTypeFullSet = attrTypeFullSet;
    }
}
