package com.zcoco.code.codegenerator;

import com.zcoco.code.codegenerator.parse.CreateTableDMLParserProcess;
import com.zcoco.code.codegenerator.parse.metadata.ParseInfo;
import com.zcoco.code.codegenerator.parse.metadata.TableParserInfo;

/**
 * 作者：Administrator
 * 时间：2018/12/23
 */
public class CreateTableDMLParserProcessTest {


    public static void main(String[] args) {
        CreateTableDMLParserProcess createTableDMLParserProcess = new CreateTableDMLParserProcess();
        TableParserInfo parser = (TableParserInfo) createTableDMLParserProcess.parser("CREATE TABLE `abc_table` (");
        System.out.println(parser);
    }
}
