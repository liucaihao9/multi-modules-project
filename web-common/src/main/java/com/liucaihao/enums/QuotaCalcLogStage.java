package com.liucaihao.enums;

public enum QuotaCalcLogStage {
    BEFORE_MANAGER_CALL("BEFORE_MANAGER_CALL" , "指标调用前"),
    MANAGER_CALL_SUCCESS("MANAGER_CALL_SUCCESS" , "指标调用成功"),
    MANAGER_CALL_EXCEPTION("MANAGER_CALL_EXCEPTION" , "指标调用异常"),
    BEFORE_MAPPER("BEFORE_MAPPER" , "mapper阶段开始"),
    MAPPER_EXCEPTION("MAPPER_EXCEPTION" , "mapper阶段异常"),
    MAPPER_FINISH("MAPPER_FINISH" , "mapper阶段结束"),
    BEFORE_REDUCE("BEFORE_REDUCE" , "reduce阶段开始"),
    REDUCE_EXCEPTION("REDUCE_EXCEPTION" , "reduce阶段异常"),
    REDUCE_FINISH("REDUCE_FINISH" , "reduce阶段结束"),
    BEFORE_OUPUT("BEFORE_OUPUT" , "output阶段开始"),
    OUTPUT_EXCEPTION("OUPUT_EXCEPTION" , "output阶段异常"),
    OUTPUT_FINISH("OUTPUT_FINISH" , "output阶段结束");

    public final String code;

    public final String message;

    private QuotaCalcLogStage(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
