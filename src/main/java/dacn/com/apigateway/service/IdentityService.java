package dacn.com.apigateway.service;

import dacn.com.apigateway.dto.ApiResponse;
import dacn.com.apigateway.dto.response.IntrospectResponse;
import reactor.core.publisher.Mono;

public interface IdentityService {
    Mono<ApiResponse<IntrospectResponse>> introspect(String token);
}
