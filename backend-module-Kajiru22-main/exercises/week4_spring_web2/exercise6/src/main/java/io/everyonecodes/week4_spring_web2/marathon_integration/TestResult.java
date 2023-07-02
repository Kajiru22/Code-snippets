package io.everyonecodes.week4_spring_web2.marathon_integration;

import java.util.Objects;

public class TestResult {

    private String result;
    private String message;

    public TestResult(String result, String message) {
        this.result = result;
        this.message = message;
    }

    public TestResult() {
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResult that = (TestResult) o;
        return Objects.equals(result, that.result) && Objects.equals(message, that.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, message);
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "result='" + result + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
