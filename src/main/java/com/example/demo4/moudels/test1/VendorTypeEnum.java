package com.example.demo4.moudels.test1;

/**
 　* @Description: 厂商类型枚举
 　* @author jieliu
 　* @date 2019/2/17 2019/2/17
 　*/
public enum VendorTypeEnum {


    /**
     * AWS s3
     */
    VENDOR_S3("transcode_aws", "AwsS3存储"),

    /**
     * 腾讯云 cos
     */
    VENDOR_COS("transcode_tencent", " 腾讯云cos");

    /**
     * 编码
     */
    private String code;
    /**
     * 描述
     */
    private String desc;

    VendorTypeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static VendorTypeEnum getEnum(String code) {
        for (VendorTypeEnum pEnum : VendorTypeEnum.values()) {
            if (pEnum.getCode().equals(code)) {
                return pEnum;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }


}
