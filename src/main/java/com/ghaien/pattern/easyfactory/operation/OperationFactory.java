package com.ghaien.pattern.easyfactory.operation;

/**
 * 运算工厂
 *
 * @author guo.haien
 * @date 2019/2/21 14:32
 */
public class OperationFactory {

    public static final String OPERATION_TYPE_ADD = "+";

    public static final String OPERATION_TYPE_SUB = "-";

    public static final String OPERATION_TYPE_MUL = "*";

    public static final String OPERATION_TYPE_DIV = "/";

    /**
     * 通过运算符号类型创建相对应的运算类
     *
     * @param operationType 运算符号
     * @return 运算类
     */
    public AbstractOperation createOperation(String operationType) {
        switch (operationType) {
            case OPERATION_TYPE_ADD:
                return new OperationAdd();
            case OPERATION_TYPE_SUB:
                return new OperationSub();
            case OPERATION_TYPE_MUL:
                return new OperationMul();
            case OPERATION_TYPE_DIV:
                return new OperationDiv();
            default:
                throw new RuntimeException("输入的运算符号错误：" + operationType);
        }
    }
}
