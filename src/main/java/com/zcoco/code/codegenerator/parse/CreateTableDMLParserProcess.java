package com.zcoco.code.codegenerator.parse;

import com.zcoco.code.codegenerator.parse.metadata.ParseInfo;
import com.zcoco.code.codegenerator.parse.metadata.TableParserInfo;

/**
 * 解析建表语句返回建表信息
 * 作者：Administrator
 * 时间：2018/12/23
 */
public class CreateTableDMLParserProcess implements DMLParserProcess {

    @Override
    public ParseInfo parser(String sqlDml) {
        String tableName = "";
        String tableEntityName = "";
        if (sqlDml.contains("CREATE")) {
            tableName = this.getTableName(sqlDml);
            tableEntityName = this.getTableEntityName(tableName);
        }
        return new TableParserInfo(tableName, tableEntityName);
    }

    /**
     * 获取建表语句中的表名
     *
     * @param sqlDml
     * @return
     */
    private String getTableName(String sqlDml) {
        return sqlDml.substring(sqlDml.indexOf("`") + 1, sqlDml.lastIndexOf("`"));
    }


    /**
     * 转化为驼峰命名的表名,abc_table -> AbcTable
     *
     * @param tempDelimiter
     * @return
     */
    private String getTableEntityName(String tempDelimiter) {
        String tempDelimiterArray[] = tempDelimiter.split("_");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < tempDelimiterArray.length; i++) {
            sb.append(tempDelimiterArray[i].substring(0, 1).toUpperCase() + tempDelimiterArray[i].substring(1));
        }//for
        return sb.toString();
    }

}
