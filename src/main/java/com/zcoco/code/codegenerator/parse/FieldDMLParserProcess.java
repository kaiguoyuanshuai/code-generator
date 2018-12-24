package com.zcoco.code.codegenerator.parse;

import com.zcoco.code.codegenerator.parse.metadata.FiledParseInfo;
import com.zcoco.code.codegenerator.parse.metadata.ParseInfo;

/*
 * 描述:
 * @auth zhengkk19738
 * @time 2018/12/24
 */
public class FieldDMLParserProcess implements DMLParserProcess {
    @Override
    public ParseInfo parser(String sqlDml) {
        String sqlFieldName = "";
        String entityFieldName = "";
        if (sqlDml.startsWith("`") && !sqlDml.contains("CREATE") && !sqlDml.contains("PRIMARY") && !sqlDml.contains("KEY") && !sqlDml.contains("ENGINE=")) {

        }
        return new FiledParseInfo(sqlFieldName, entityFieldName);
    }
}
