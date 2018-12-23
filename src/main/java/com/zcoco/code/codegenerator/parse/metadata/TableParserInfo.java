package com.zcoco.code.codegenerator.parse.metadata;

/**
 * 作者：Administrator
 * 时间：2018/12/23
 */
public class TableParserInfo implements ParseInfo {

    private String tableName;

    private String tableEntityName;


    public TableParserInfo(String tableName, String tableEntityName) {
        this.tableName = tableName;
        this.tableEntityName = tableEntityName;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableEntityName() {
        return tableEntityName;
    }

    public void setTableEntityName(String tableEntityName) {
        this.tableEntityName = tableEntityName;
    }

    @Override
    public String toString() {
        return "TableParserInfo{" +
                "tableName='" + tableName + '\'' +
                ", tableEntityName='" + tableEntityName + '\'' +
                '}';
    }
}
