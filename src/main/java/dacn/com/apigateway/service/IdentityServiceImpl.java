package dacn.com.apigateway.service;

import dacn.com.apigateway.dto.ApiResponse;
import dacn.com.apigateway.dto.request.IntrospectRequest;
import dacn.com.apigateway.dto.response.IntrospectResponse;
import dacn.com.apigateway.repository.IdentityClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class IdentityServiceImpl implements IdentityService {
    private final IdentityClient identityClient;
    @Override
    public Mono<ApiResponse<IntrospectResponse>> introspect(String token) {
        return identityClient.introspect(IntrospectRequest.builder()
                        .token(token)
                .build());
    }
}
