package io.github.devgoks.Theta_RPC_API_Java_SDK.ApiModels.BroadcastRawTransactionAsync;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BroadcastRawTransactionAsyncParam {
    @JsonProperty("tx_bytes")
    private String txBytes;
}
