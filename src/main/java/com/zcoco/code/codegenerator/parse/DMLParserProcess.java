package com.zcoco.code.codegenerator.parse;

import com.zcoco.code.codegenerator.parse.metadata.ParseInfo;

/**
 * 作者：Administrator
 * 时间：2018/12/23
 */
public interface DMLParserProcess {
    /**
     * 解析SQL语句
     *
     * @param sqlDml
     */
    ParseInfo parser(String sqlDml);
}
