package com.pinkpig.aoplog.handler.support;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component
public class LogContentResolver {
    public String parseStart(String[] keywords, String description, String methodSignayure, String args) {
        return String.format("%s开始。方法签名：[%s]；入参：[%s]", getCoreContent(keywords, description), methodSignayure, args);
    }

    public String parseFinish(String[] keywords, String description, String methodSignayure, String result) {
        return String.format("%s成功。方法签名：[%s]；入参：[%s]", getCoreContent(keywords, description), methodSignayure, result);
    }

    public String parseFail(String[] keywords, String description, String methodSignayure, String args) {
        return String.format("%s失败！方法签名：[%s]", getCoreContent(keywords, description), methodSignayure);
    }

    private String getCoreContent(String[] keywords, String description) {
        String keyWordsStr = keywords == null || keywords.length == 0
                ? "无关键字" : StringUtils.join(keywords, ",");
        String descrptionStr = StringUtils.isBlank(description) ? "方法执行" : description;
        return String.format("[%s]%s", keyWordsStr, descrptionStr);
    }
}
