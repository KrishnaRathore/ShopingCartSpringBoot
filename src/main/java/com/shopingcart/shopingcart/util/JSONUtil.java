/*
package com.shopingcart.shopingcart.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSONUtil {

    */
/**
     * This will convert the Object to JSON in Pretty format.
     * @param obj
     * @return
     *//*

    public static String toJSON(Object obj) {
        if (obj == null) {
            return null;
        }

        try {
            return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (Exception e) {
            MyLogger.logError(e);
            throw AppException.create(ErrorCode.JSON_CONVERSION_ERROR);
        }
    }

    */
/**
     * This will convert the Object to JSON in plain text.
     * @param obj
     * @return
     *//*

    public static String toPlainJSON(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            MyLogger.logError(e);
            throw AppException.create(ErrorCode.JSON_CONVERSION_ERROR);
        }
    }

    */
/**
     * This will convert the JSON into Object of provided class.
     * @param json
     * @param aClass
     * @param <T>
     * @return
     *//*

    public static <T> T fromJSON(String json, Class<T> aClass) {
        if (json == null) {
            return null;
        }

        try {
            return new ObjectMapper().readValue(json, aClass);
        } catch (Exception e) {
            MyLogger.logError("fromJSON", json);
            MyLogger.logError(e);
            throw AppException.create(ErrorCode.JSON_CONVERSION_ERROR);
        }
    }

    */
/**
     * This will convert the String into Object of type MAP which is generic for all JSON.
     * @param content-Json String
     * @return Map object representing json
     *//*

    public static Map toMap(String content) {
        HashMap<String, Object> map = new HashMap<>();
        try {
            ObjectMapper mapper = new ObjectMapper();
            map = mapper.readValue(content, new TypeReference<HashMap<String, Object>>() {
            });
        } catch (Exception e) {
            MyLogger.logError(e);
            map.put("error", content);
        }
        return map;
    }

    */
/**
     * This is generic method to convert the JSON String to Object of defined class.
     * @param body
     * @param dtoType
     * @param <P>
     * @return
     *//*

    public static <P extends BaseDTO> P getDataDTO(String body, Class<P> dtoType) {
        try {
            JsonNode root = new ObjectMapper().readTree(body);
            JsonNode data = root.path("data");
            return new ObjectMapper().readValue(data.get(0).toString(), dtoType);
        } catch (Exception e) {
            MyLogger.logError(e);
        }
        return null;
    }


    

    public static void main(String[] args) {
        String json1 = "{\"id\":120,\"uniqueId\":\"20180108-WIREXM-UIYLX\",\"version\":null,\"type\":\"WIREXM\",\"status\":\"DRAFT\",\"applicationName\":\"SN FN\",\"feePayment\":null,\"surname\":\"SN\",\"firstName\":\"FN\",\"middleName\":\"MN\",\"birthDate\":\"2017-12-01T00:00:00\",\"age\":20,\"gender\":\"Male\",\"parmanentAddress\":{\"id\":150,\"addressType\":\"PERMANENT\",\"houseNo\":\"55\",\"tenamentNo\":null,\"buildingName\":\"Arise\",\"state\":\"GUJARAT\",\"district\":\"Vadodara\",\"talukaName\":\"vadodara\",\"pincode\":\"390019\",\"addrLine1\":\"line1\",\"addrLine2\":\"Line2\",\"addressLine3\":null,\"village\":\"sankheda\"},\"temporaryAddress\":{\"id\":151,\"addressType\":\"TEMPORARY\",\"houseNo\":\"55\",\"tenamentNo\":null,\"buildingName\":\"Arise\",\"state\":\"GUJARAT\",\"district\":\"Vadodara\",\"talukaName\":\"vadodara\",\"pincode\":\"390019\",\"addrLine1\":\"line1\",\"addrLine2\":\"Line2\",\"addressLine3\":null,\"village\":\"sankheda\"},\"mobile\":\"7878282806\",\"altMobileNumber\":\"7878282806\",\"email\":\"vijay.parmar@email.com\",\"wmanEligibility\":\"MCA\",\"experiences\":[{\"id\":140,\"exam\":null,\"fromDate\":\"2011-09-02T02:50:12\",\"toDate\":\"2012-09-02T02:50:12\",\"wmanContractorLicenceNo\":\"WmanContractorLicenceNo\",\"wmanOrgSupFirmName\":\"setWmanOrgSupFirmName\",\"wmanSupSupervisorPermitNo\":\"setWmanSupSupervisorPermitNo\"},{\"id\":141,\"exam\":null,\"fromDate\":\"2011-09-02T02:50:12\",\"toDate\":\"2012-09-02T02:50:12\",\"wmanContractorLicenceNo\":\"WmanContractorLicenceNo\",\"wmanOrgSupFirmName\":\"setWmanOrgSupFirmName\",\"wmanSupSupervisorPermitNo\":\"setWmanSupSupervisorPermitNo\"},{\"id\":142,\"exam\":null,\"fromDate\":\"2013-09-02T02:50:12\",\"toDate\":\"2014-09-02T02:50:12\",\"wmanContractorLicenceNo\":\"WmanContractorLicenceNo\",\"wmanOrgSupFirmName\":\"setWmanOrgSupFirmName\",\"wmanSupSupervisorPermitNo\":\"setWmanSupSupervisorPermitNo\"}],\"preferredExamCentre\":\"Ahmedabad\",\"preferredLangMode\":\"English\",\"detail\":null,\"attachments\":[{\"id\":130,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"YIPMU\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"YIPMU.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"School leaving certificate or matriculation certificate\",\"fieldIdentifier\":\"4.1\",\"portalVariableName\":\"school_leaving\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"YIPMU\",\"attachments\":[]},{\"id\":131,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"FGJI7\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"FGJI7.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Attach electricty bill for address proof or any Govt. valid ID proof\",\"fieldIdentifier\":\"6.7\",\"portalVariableName\":\"electricty_bill\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"FGJI7\",\"attachments\":[]},{\"id\":132,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"SWI5E\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"SWI5E.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Attach electricty bill for address proof or any Govt. valid ID proof\",\"fieldIdentifier\":\"7.7\",\"portalVariableName\":\"electricty_bill\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"SWI5E\",\"attachments\":[]},{\"id\":133,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"RHZSR\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"RHZSR.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"form K\",\"fieldIdentifier\":\"12.1\",\"portalVariableName\":\"form_k\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"RHZSR\",\"attachments\":[]},{\"id\":134,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"HUIAO\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"HUIAO.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Copy of Form “I” verified by authority or his representative\",\"fieldIdentifier\":\"12.2\",\"portalVariableName\":\"form_i\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"HUIAO\",\"attachments\":[]},{\"id\":135,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"MPSM1\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"MPSM1.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Attach a pasport size photograph\",\"fieldIdentifier\":\"15.1\",\"portalVariableName\":\"passport_photograph\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"MPSM1\",\"attachments\":[]},{\"id\":136,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"ZRVW9\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"ZRVW9.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Attach a scan copy of signature\",\"fieldIdentifier\":\"16.1\",\"portalVariableName\":\"scan_signature\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"ZRVW9\",\"attachments\":[]}]}";
        String json2 = "{\"id\":120,\"uniqueId\":\"20180108-WIREXM-UIYLX\",\"version\":null,\"type\":\"WIREXM\",\"status\":\"DRAFT\",\"applicationName\":\"SN FN\",\"feePayment\":null,\"surname\":\"SN\",\"firstName\":\"FN\",\"middleName\":\"MN\",\"birthDate\":\"2017-12-01T00:00:00\",\"age\":20,\"gender\":\"Male\",\"parmanentAddress\":{\"id\":150,\"addressType\":\"PERMANENT\",\"houseNo\":\"55\",\"tenamentNo\":null,\"buildingName\":\"Arise\",\"state\":\"GUJARAT\",\"district\":\"Vadodara\",\"talukaName\":\"vadodara\",\"pincode\":\"390019\",\"addrLine1\":\"line1\",\"addrLine2\":\"Line2\",\"addressLine3\":null,\"village\":\"sankheda\"},\"temporaryAddress\":{\"id\":151,\"addressType\":\"TEMPORARY\",\"houseNo\":\"55\",\"tenamentNo\":null,\"buildingName\":\"Arise\",\"state\":\"GUJARAT\",\"district\":\"Vadodara\",\"talukaName\":\"vadodara\",\"pincode\":\"390019\",\"addrLine1\":\"line1\",\"addrLine2\":\"Line2\",\"addressLine3\":null,\"village\":\"sankheda\"},\"mobile\":\"7878282806\",\"altMobileNumber\":\"7878282806\",\"email\":\"vijay.parmar@email.com\",\"wmanEligibility\":\"MCA\",\"experiences\":[{\"id\":140,\"exam\":null,\"fromDate\":\"2011-09-02T02:50:12\",\"toDate\":\"2012-09-02T02:50:12\",\"wmanContractorLicenceNo\":\"WmanContractorLicenceNo\",\"wmanOrgSupFirmName\":\"setWmanOrgSupFirmName\",\"wmanSupSupervisorPermitNo\":\"setWmanSupSupervisorPermitNo\"},{\"id\":141,\"exam\":null,\"fromDate\":\"2011-09-02T02:50:12\",\"toDate\":\"2012-09-02T02:50:12\",\"wmanContractorLicenceNo\":\"WmanContractorLicenceNo\",\"wmanOrgSupFirmName\":\"setWmanOrgSupFirmName\",\"wmanSupSupervisorPermitNo\":\"setWmanSupSupervisorPermitNo\"},{\"id\":142,\"exam\":null,\"fromDate\":\"2013-09-02T02:50:12\",\"toDate\":\"2014-09-02T02:50:12\",\"wmanContractorLicenceNo\":\"WmanContractorLicenceNo\",\"wmanOrgSupFirmName\":\"setWmanOrgSupFirmName\",\"wmanSupSupervisorPermitNo\":\"setWmanSupSupervisorPermitNo\"}],\"preferredExamCentre\":\"Ahmedabad\",\"preferredLangMode\":\"English\",\"detail\":null,\"attachments\":[{\"id\":130,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"YIPMU\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"YIPMU.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"School leaving certificate or matriculation certificate\",\"fieldIdentifier\":\"4.1\",\"portalVariableName\":\"school_leaving\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"YIPMU\",\"attachments\":[]},{\"id\":131,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"FGJI7\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"FGJI7.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Attach electricty bill for address proof or any Govt. valid ID proof\",\"fieldIdentifier\":\"6.7\",\"portalVariableName\":\"electricty_bill\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"FGJI7\",\"attachments\":[]},{\"id\":132,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"SWI5E\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"SWI5E.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Attach electricty bill for address proof or any Govt. valid ID proof\",\"fieldIdentifier\":\"7.7\",\"portalVariableName\":\"electricty_bill\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"SWI5E\",\"attachments\":[]},{\"id\":133,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"RHZSR\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"RHZSR.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"form K\",\"fieldIdentifier\":\"12.1\",\"portalVariableName\":\"form_k\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"RHZSR\",\"attachments\":[]},{\"id\":134,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"HUIAO\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"HUIAO.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Copy of Form “I” verified by authority or his representative\",\"fieldIdentifier\":\"12.2\",\"portalVariableName\":\"form_i\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"HUIAO\",\"attachments\":[]},{\"id\":135,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"MPSM1\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"MPSM1.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Attach a pasport size photograph\",\"fieldIdentifier\":\"15.1\",\"portalVariableName\":\"passport_photograph\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"MPSM1\",\"attachments\":[]},{\"id\":136,\"uniqueId\":null,\"version\":null,\"type\":null,\"status\":null,\"applicationName\":null,\"feePayment\":null,\"applicationId\":120,\"fileId\":\"ZRVW9\",\"relatedFieldName\":null,\"docTypeMapping\":\"json\",\"docName\":\"ZRVW9.json\",\"absolutePath\":null,\"realFileName\":\"ceiced.json\",\"formPart\":\"1\",\"labelName\":\"Attach a scan copy of signature\",\"fieldIdentifier\":\"16.1\",\"portalVariableName\":\"scan_signature\",\"mimeType\":\"image/png\",\"dmsUrl\":null,\"uuid\":\"ZRVW9\",\"attachments\":[]}]}";

        HashMap<String, Object> map1 = fromJSON(json1, HashMap.class);
        HashMap<String, Object> map2 = fromJSON(json2, HashMap.class);

        findJsonDiff(map1, map2);
    }


}*/
