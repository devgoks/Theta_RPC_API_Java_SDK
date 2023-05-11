# Theta_RPC_API_Java_SDK

### Steps to use the Theta Java SpringBoot SDK

### Add the dependency to your Pom file:
```
        <dependency>
            <groupId>io.github.devgoks</groupId>
            <artifactId>Theta_RPC_API_Java_SDK</artifactId>
            <version>1.0.0</version>
        </dependency>
```

### Sample usage in your codebase:
#### 1. GetVersion
``` 
    ThetaRequest<Object> request = new ThetaRequest<>("2.0","theta.GetVersion",Collections.emptyList(),1);
    ThetaResponse<GetVersionResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request);
    System.out.println(response.toString());
```
#### 2. GetAccount
``` 
    ThetaRequest<GetAccountParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetAccount");
    request.setId(1);
    GetAccountParam getAccountParam = new GetAccountParam();
    getAccountParam.setAddress("0x2E833968E5bB786Ae419c4d13189fB081Cc43bab");
    request.setParams(Collections.singletonList(getAccountParam));
    ThetaResponse<GetAccountResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request);
    System.out.println(response.toString());
```
#### 3. GetBlock
``` 
    ThetaRequest<GetBlockParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetBlock");
    request.setId(1);
    GetBlockParam getBlockParam = new GetBlockParam();
    getBlockParam.setHash("0x9f1e77b08c9fa8984096a735d0aae6b0e43aee297e42c54ce36334103ddd67a7");
    getBlockParam.setIncludeEthTxHashes(false);
    request.setParams(Collections.singletonList(getBlockParam));
    ThetaResponse<GetBlockResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request);
    System.out.println(response.toString());
```
#### 4. GetBlockByHeight
``` 
    ThetaRequest<GetBlockByHeightParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetBlockByHeight");
    request.setId(1);
    GetBlockByHeightParam param = new GetBlockByHeightParam();
    param.setHeight("3");
    param.setIncludeEthTxHashes(false);
    request.setParams(Collections.singletonList(param));
    ThetaResponse<GetBlockByHeightResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request);
    System.out.println(response.toString());
```
#### 5. GetTransaction
``` 
    ThetaRequest<GetTransactionParam> request = new ThetaRequest<>();
    request.setJsonRpc("2.0");
    request.setMethod("theta.GetTransaction");
    request.setId(1);
    GetTransactionParam param = new GetTransactionParam();
    param.setHash("0xf3cc94af7a1520b384999ad106ade9738b6cde66e2377ceab37067329d7173a0");
    request.setParams(Collections.singletonList(param));
    ThetaResponse<GetTransactionResult> response = ThetaRPCService.request("http://localhost:16888/rpc", request);
    System.out.println(response.toString());
```
