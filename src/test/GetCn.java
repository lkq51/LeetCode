package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by lkq on 2017/3/29.
 */
public class GetCn {
    public static void main(String[] args) {
        //System.out.println(getSelSql());
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.HOUR, -24);
        Date startTime = calendar.getTime();
        SimpleDateFormat dd = new SimpleDateFormat("yyyy-MM-dd");
        String start = dd.format(startTime);
        System.out.println(start);
    }

    private static String getSelSql(){
        StringBuilder sqlBuilder=new StringBuilder();
        sqlBuilder.append("SELECT A.PERSON_ID AS id,A.EMPLOYEE_NUMBER AS userId,A.FULL_NAME  AS userCn,A.PERSON_TYPE_DESC AS userType,");
        sqlBuilder.append("CASE WHEN A.ASSIGNMENT_STATUS_TYPE_ID='1' THEN '0' WHEN A.ASSIGNMENT_STATUS_TYPE_ID='96' THEN '0' WHEN A.ASSIGNMENT_STATUS_TYPE_ID='3' THEN '3' ELSE '2' END AS status,");
        sqlBuilder.append("A.USER_ID AS misId,");
        sqlBuilder.append("A.JOB_ID AS dutyId,");
        sqlBuilder.append("SUBSTR(A.JOB_NAME,INSTR(A.JOB_NAME,'.',1)+1,LENGTH(A.JOB_NAME)-1) AS dutyName,");
        sqlBuilder.append("A.HR_ORG_CODE AS orgId,");
        sqlBuilder.append("SUBSTR(A.HR_ORG_NAME,INSTR(A.HR_ORG_NAME,'.',1)+1,LENGTH(A.HR_ORG_NAME)-1) AS displayName,");
        sqlBuilder.append("A.PER_GRADE_DESC AS levels,");
        sqlBuilder.append("A.NATIONAL_IDENTIFIER AS idCardNumber,");
        sqlBuilder.append("A.EMAIL_ADDRESS AS email,");
        sqlBuilder.append("CASE WHEN A.SEX='M' THEN '1' ELSE '2' END AS gender,");
        sqlBuilder.append("A.RACE_TYPE_NAME AS nation,");
        sqlBuilder.append("A.DATE_OF_BIRTH AS birthday,");
        sqlBuilder.append("A.POLITICAL_STATUS_NAME AS religion,");
        sqlBuilder.append("A.EMP_EFFECTIVE_START_DATE AS startTime,");
        sqlBuilder.append("A.EMP_EFFECTIVE_END_DATE AS endTime,");
        sqlBuilder.append("A.EMP_EFFECTIVE_START_DATE AS createTime,");
        sqlBuilder.append("A.EMP_EFFECTIVE_START_DATE AS modifyTime");
        return sqlBuilder.toString();
    }
}
