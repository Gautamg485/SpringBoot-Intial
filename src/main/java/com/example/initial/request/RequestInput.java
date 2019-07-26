package com.example.initial.request;

import com.google.gson.annotations.SerializedName;
import com.gowtham.initial.request.InputData;
import org.jetbrains.annotations.NotNull;

public class RequestInput {

    @NotNull
    @SerializedName("inputs")
    private InputData inputs;

    @NotNull
    @SerializedName("leadId")
    private int leadId;

    @NotNull
    @SerializedName("userId")
    private int userId;

    @NotNull
    @SerializedName("productType")
    private String productType;

    private String[] products;

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public InputData getInputs() {
        return inputs;
    }

    public void setInputs(InputData inputs) {
        this.inputs = inputs;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getLeadId() {
        return leadId;
    }

    public void setLeadId(int leadId) {
        this.leadId = leadId;
    }

    public int getProductType() {
        return leadId;
    }

    public void setProductType(String leadId) {
        this.productType = productType;
    }
}
