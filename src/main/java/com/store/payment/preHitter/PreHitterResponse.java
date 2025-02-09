package com.store.payment.preHitter;

import com.store.payment.enums.MICROSERVICE;
import com.store.payment.enums.RESPONSE_TYPE;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreHitterResponse {
    RESPONSE_TYPE responseType;
    MICROSERVICE microservice;
}
