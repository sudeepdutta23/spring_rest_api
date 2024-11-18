package com.exampleapi.Example_Api.service;

import com.exampleapi.Example_Api.modal.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public  String createCloudVendor(CloudVendor cloudVendor);
    public  String updateCloudVendor(CloudVendor cloudVendor);
    public  String deleteCloudVendor(String cloudVendorId);
    public  CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
