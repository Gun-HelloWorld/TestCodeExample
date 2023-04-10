package com.gun.testcodeexample.common.state

sealed class ErrorState(val throwable: Throwable) {
    class HttpExceptionState(throwable: Throwable) : ErrorState(throwable)
    class IOExceptionState(throwable: Throwable) : ErrorState(throwable)
    class ExceptionState(throwable: Throwable) : ErrorState(throwable)
}
