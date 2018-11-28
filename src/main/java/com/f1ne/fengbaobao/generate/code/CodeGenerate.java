package com.f1ne.fengbaobao.generate.code;

import java.io.File;

public class CodeGenerate {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://172.16.3.7:3308";
//       generateHx2();
        generate372();
//        generateMonkey();
//        generateMsg();

    }

    public static void gerneratePerformance() {
        String url = "jdbc:mysql://10.10.42.32:3306";
        String userName = "qianjin20160304";
        String pwd = "qianjin20160304";
        GenerateService generateService = new GenerateService(url, userName, pwd);
        generateService.generateCode("qianjin",
                new String[]{"hx_withdraw_apply_loan_mapping", "hx_withdraw_confirm"},
                "/Users/finup/Documents/code");
    }

    public static void generate372 () {
        String url = "jdbc:mysql://10.10.37.2:3306";
        String userName = "qianjin_hx";
        String pwd = "qianjin_hx@123";
        GenerateService generateService = new GenerateService(url, userName, pwd);
        generateService.generateCode("qianjin_hx",
                new String[]{
                "iqj_origin_processing_record"},
                "/Users/apple/Downloads/code-01");
    }


    /**
     * Msq
     */
    public static void generateMsg() {
        String url = "jdbc:mysql://47.94.102.206:3309";
        String userName = "dev";
        String pwd = "ksjKSISEK2";
        GenerateService generateService = new GenerateService(url, userName, pwd);
        generateService.generateCode("msq",
                new String[]{"teacher_work_experience", "teacher_title", "teacher_certification"
                },
                "/Users/finup/Documents/code");
    }


    /**
     * 华夏二期
     */
    public static void generate() {
        String url = "jdbc:mysql://172.16.3.7:3306";
        String userName = "root_6666666";
        String pwd = "123456789";
        GenerateService generateService = new GenerateService(url, userName, pwd);
        generateService.generateCode("hx2",
                new String[]{"recon_result", "recon_diff", "recon_balance", "hx_trading_record"},
                "/Users/finup/Documents/code");



    }

    /**
     * 华夏二期
     */
    public static void generateIqjUat() {
        String url = "jdbc:mysql://10.10.105.18:3306";
        String userName = "qianjinuat";
        String pwd = "123456789";
        GenerateService generateService = new GenerateService(url, userName, pwd);
        generateService.generateCode("qianjin",
                new String[]{"hx2_repay", "hx_repay_detail"},
                "/Users/finup/Documents/code");
    }


    /**
     * 数据可视化
     */
    public static void generateMonkey() {
        String url = "jdbc:mysql://172.16.3.6:3308";
        String userName = "cap_control";
        String pwd = "cap_control_123";
        GenerateService generateService = new GenerateService(url, userName, pwd);
        generateService.generateCode("test_monkey",
                new String[]{"code_review"},
                "/Users/finup/Documents/code");
    }

}
