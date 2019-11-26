package com.top.suiyueran;

public class ApiDocTest {

	public static void main(String[] args) {
		/*ApiConfig config = new ApiConfig();
        config.setServerUrl("http://localhost:8080");
        
        //If the strict mode is set to true, Smart-doc forces that the public method in each interface in the code has a comment.
        config.setStrict(true);
        
        //When AllInOne is set to true, the document generation of all interfaces is merged into a Markdown or AsciiDoc document,
        // and the error code list is output to the bottom of the document.
        config.setAllInOne(true);
        
        //Set the api document output path.
        config.setOutPath("d:\\md");
        
        // If you do not configure PackageFilters, it matches all controllers by default.
        // Configure multiple controller paths to be separated by commas
        config.setPackageFilters("com.power.doc.controller");
        
        //Set the request header, if there is no request header, you don't need to set it.
        config.setRequestHeaders(
                ApiReqHeader.header().setName("access_token").setType("string")
                        .setDesc("Basic auth credentials").setRequired(true).setSince("v1.1.0"),
                ApiReqHeader.header().setName("user_uuid").setType("string").setDesc("User Uuid key")
        );
    
        //Output a list of error codes in the project, using for example:
        List<ApiErrorCode> errorCodeList = new ArrayList<>();
        for (ErrorCodeEnum codeEnum : ErrorCodeEnum.values()) {
            ApiErrorCode errorCode = new ApiErrorCode();
            errorCode.setValue(codeEnum.getCode()).setDesc(codeEnum.getDesc());
            errorCodeList.add(errorCode);
        }
        //not necessary
        config.setErrorCodes(errorCodeList);
    
        //Set the document change record,
        //it is not necessary to have the document change record take effect only when setAllInOne is set to true.
        config.setRevisionLogs(
                RevisionLog.getLog().setRevisionTime("2018/12/15").setAuthor("chen").setRemarks("test").setStatus("create").setVersion("V1.0"),
                RevisionLog.getLog().setRevisionTime("2018/12/16").setAuthor("chen2").setRemarks("test2").setStatus("update").setVersion("V2.0")
        );
    
        long start = System.currentTimeMillis();
        //Generating Markdown documentation
        ApiDocBuilder.builderControllersApi(config);
        
        long end = System.currentTimeMillis();
        DateTimeUtil.printRunTime(end, start);*/
	}

}