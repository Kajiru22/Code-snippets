package io.everyonecodes.livecoding.marathon_integration.data;

import java.util.Objects;

public class TestResult {

    private String message;
    private String result;

    public TestResult(String message, String result) {
        this.message = message;
        this.result = result;
    }

    public TestResult() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestResult that = (TestResult) o;
        return Objects.equals(message, that.message) && Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, result);
    }

    @Override
    public String toString() {
        return "TestResult{" +
                "message='" + message + '\'' +
                ", result='" + result + '\'' +
                '}';
    }
}
