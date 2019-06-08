package com.garrettestrin.helloworld.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Clap {
    private String message;
}
