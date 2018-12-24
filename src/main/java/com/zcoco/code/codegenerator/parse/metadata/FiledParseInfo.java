package com.zcoco.code.codegenerator.parse.metadata;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/24
 */
public class FiledParseInfo implements ParseInfo {

    private String sqlFiledName;

    private String entityFiledName;

    public FiledParseInfo(String sqlFiledName, String entityFiledName) {
        this.sqlFiledName = sqlFiledName;
        this.entityFiledName = entityFiledName;
    }

    public String getSqlFiledName() {
        return sqlFiledName;
    }

    public void setSqlFiledName(String sqlFiledName) {
        this.sqlFiledName = sqlFiledName;
    }

    public String getEntityFiledName() {
        return entityFiledName;
    }

    public void setEntityFiledName(String entityFiledName) {
        this.entityFiledName = entityFiledName;
    }
}
