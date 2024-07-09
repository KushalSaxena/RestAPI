package com.example.RestAPIdemo.exception;

public class CloudVendorException extends RuntimeException{
    public CloudVendorException(String message) {
        super(message);
    }

    public CloudVendorException(String message, Throwable cause) {
        super(message, cause);
    }
}
