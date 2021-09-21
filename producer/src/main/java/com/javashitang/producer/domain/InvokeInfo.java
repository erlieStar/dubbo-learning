package com.javashitang.producer.domain;

import lombok.Data;

import java.util.List;

/**
 * @author lilimin
 * @since 2021-09-21
 */
@Data
public class InvokeInfo {

    private String className;

    private String methodName;

    private List<String> params;
}
