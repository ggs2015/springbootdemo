# 设计模式示例：支付系统

本示例展示了三种设计模式的组合使用：

## 设计模式说明

### 1. 模板方法模式 (Template Method Pattern)
- **类**: `AbstractPaymentTemplate`
- **作用**: 定义支付流程的骨架，包括验证金额、计算手续费、执行支付、发送通知等步骤
- **好处**: 确保支付流程的一致性，子类只需实现特定的步骤

### 2. 策略模式 (Strategy Pattern)
- **接口**: `PaymentStrategy`
- **作用**: 定义不同支付方式的支付算法
- **好处**: 可以在运行时切换不同的支付策略，符合开闭原则

### 3. 工厂模式 (Factory Pattern)
- **类**: `PaymentFactory`
- **作用**: 根据类型创建对应的支付策略实例
- **好处**: 将对象的创建逻辑集中管理，客户端无需知道具体实现细节

## 类结构

```
PaymentStrategy (接口)
    ↑
AbstractPaymentTemplate (抽象类 - 模板方法)
    ↑                   ↑
    ├─ CreditCardPayment (具体策略)
    ├─ AlipayPayment    (具体策略)
    └─ WeChatPayment    (具体策略)

PaymentFactory (工厂类)
```

## 编译和运行

```bash
javac *.java
java PaymentDemo
```
