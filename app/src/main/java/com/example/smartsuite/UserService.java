package com.example.smartsuite;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
public interface UserService {
        @POST("api/customers/validateCode")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest
            ,
                                  @Header("Content-Type") String contentType,
                                  @Header("token") String token,
                                  @Header("X-ApiKey") String apiKey
    );



}
