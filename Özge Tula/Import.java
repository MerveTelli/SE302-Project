package pkgimport;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.URL;
import java.net.URLConnection;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.util.Scanner;
import org.jsoup.parser.Parser;
public class Import {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        TrustManagerManipulator.allowAllSSL();
        System.out.println("Course code CE: ");
        int course = input.nextInt();
        String url = "https://se.ieu.edu.tr/tr/syllabus/type/read/id/CE+"+course;
        Document doc = Jsoup.connect(url).get();
        
        Element name = doc.getElementById("course_name");
        Element semester = doc.getElementById("semester");
        Element weekly = doc.getElementById("weekly_hours");
        Element application = doc.getElementById("app_hours");
        Element ieucredit = doc.getElementById("ieu_credit");
        Element ects = doc.getElementById("ects_credit");
        Element languge = doc.getElementById("course_lang");
        Element type = doc.getElementById("course_type");
        Element level = doc.getElementById("course_level");
        Element coordinator = doc.getElementById("coordinator_list");
        Element lecturers = doc.getElementById("lecturer_list");
        Element outcome = doc.getElementById("outcome"); //çoklu outcome veriyor hepsini ayrı ayrı lisetelemek istersek 
        Element outcome1 = doc.getElementById("li0");
        Element outcome2 = doc.getElementById("li1");
        Element outcome3  = doc.getElementById("li2");
        Element outcome4 = doc.getElementById("li3");
        Element outcome5 = doc.getElementById("li4");
        
        //x ile seçilmesi gereken tablolar
        Element corecourse = doc.getElementById("core_course");
        Element majorarea = doc.getElementById("major_area");
        Element supcourse = doc.getElementById("supportive_courses");
        Element mediaman = doc.getElementById("media_man_skills");
        Element  transSkills= doc.getElementById("trans_skills");
        
        
        Element weeks  = doc.getElementById("weeks");// tüm week çıktılarını basıyo
        
        Element hafta_1 = doc.getElementById("hafta_1");//ayrı ayrı
        Element hafta_2= doc.getElementById("hafta_2");
        Element hafta_3 = doc.getElementById("hafta_3");
        Element hafta_4 = doc.getElementById("hafta_4");
        Element hafta_5 = doc.getElementById("hafta_5");
        Element hafta_6 = doc.getElementById("hafta_6");
        Element hafta_7 = doc.getElementById("hafta_7");
        Element hafta_8 = doc.getElementById("hafta_8");
        Element hafta_9 = doc.getElementById("hafta_9");
        Element hafta_10 = doc.getElementById("hafta_10");
        Element hafta_11= doc.getElementById("hafta_11");
        Element hafta_12= doc.getElementById("hafta_12");
        Element hafta_13= doc.getElementById("hafta_13");
        Element hafta_14= doc.getElementById("hafta_14");
        Element hafta_15= doc.getElementById("hafta_15");
        Element hafta_16= doc.getElementById("hafta_16");
        
        
        Element evTable = doc.getElementById("evaluation_table1");// tüm tablo
        
        Element attendance = doc.getElementById("attendance_no");//ayrı ayrı
        Element attendancePer= doc.getElementById("attendance_per");
        Element labNo = doc.getElementById("lab_no");
        Element labPer = doc.getElementById("lab_per");
        Element fieldNo= doc.getElementById("fieldwork_no");
        Element filePer= doc.getElementById("fieldwork_per");
        Element quizNo = doc.getElementById("quiz_no");
        Element quizPer= doc.getElementById("quiz_per");
        Element workNo = doc.getElementById("homework_no");
        Element workPer = doc.getElementById("homework_per");
        Element presNo= doc.getElementById("presentation_no");
        Element presPer= doc.getElementById("presentation_per");
        Element projeNo = doc.getElementById("project_no");
        Element projePer = doc.getElementById("project_per");
        Element semNo= doc.getElementById("seminar_no");
        Element semPer = doc.getElementById("seminar_per");
        Element portNo= doc.getElementById("portfolios__no");
        Element portPer= doc.getElementById("portfolios_per");
        Element mtNo= doc.getElementById("midterm_no");
        Element mtPer= doc.getElementById("midterm_per");
        Element finalNo= doc.getElementById("final_no");
        Element finalPer= doc.getElementById("final_per");
        Element totalNo= doc.getElementById("ara_total_no");
        Element totalPer= doc.getElementById("ara_total_per");
        
        Element evTable2 = doc.getElementById("evaluation_table2"); //tüm tablo
        Element totalNo2= doc.getElementById("total_no");//ayrı ayrı
        Element totalPer2= doc.getElementById("total_per");
        
        Element workload= doc.getElementById("workload_table");// tüm tablo
        Element chn= doc.getElementById("course_hour_number");//ayrı ayrı
        Element chd= doc.getElementById("course_hour_duration");
        Element chtw= doc.getElementById("course_hour_total_workload");
        Element labNumber= doc.getElementById("lab_number");
        Element labDur = doc.getElementById("lab_duration");
        Element labWork= doc.getElementById("lab_total_workload");
        Element outNum = doc.getElementById("out_hour_number");
        Element outDur= doc.getElementById("out_hour_duration");
        Element outwork= doc.getElementById("out_hour_total_workload");
        Element fieldNum= doc.getElementById("fieldwork_number");
        Element fieldDur= doc.getElementById("fieldwork_duration");
        Element fieldTotal= doc.getElementById("fieldwork_total_number");
        Element quizNum= doc.getElementById("quizess_number");
        Element quizDur= doc.getElementById("quizess_duration");
        Element quizWork= doc.getElementById("quizess_total_workload");
        Element homewNum= doc.getElementById("homework_number");
        Element homewDur= doc.getElementById("homework_duration");
        Element homewWork= doc.getElementById("homework_total_workload");
        Element presNum= doc.getElementById("presentation_number");
        Element presDur= doc.getElementById("presentation_duration");
        Element presWork= doc.getElementById("presentation_total_workload");
        Element projectNum= doc.getElementById("project_number");
        Element projectDur= doc.getElementById("project_duration");
        Element projectWork= doc.getElementById("project_total_workload");
        Element semNum= doc.getElementById("seminar_number");
        Element semDur= doc.getElementById("seminar_duration");
        Element semWork= doc.getElementById("seminar_total_workload");
        Element portNum= doc.getElementById("portfolios_number");
        Element portDur= doc.getElementById("portfolios_duration");
        Element portwork= doc.getElementById("portfolios_total_workload");
        Element midNum = doc.getElementById("midterm_number");
        Element midDur= doc.getElementById("midterm_duration");
        Element midWork= doc.getElementById("midterm_total_workload");
        Element finalNum= doc.getElementById("final_number");
        Element finalDur= doc.getElementById("final_duration");
        Element finalWork= doc.getElementById("final_total_workload");
        
        Element outcomes = doc.getElementById("yeters"); //tüm tablo
        Element row1= doc.getElementById("1");
        Element row2= doc.getElementById("2");
        Element row3= doc.getElementById("3");
        Element row4= doc.getElementById("4");
        Element row5= doc.getElementById("5");
        Element row6= doc.getElementById("6");
        Element row7= doc.getElementById("7");
        Element row8= doc.getElementById("8");
        Element row9= doc.getElementById("9");
        Element row10= doc.getElementById("10");
        Element row11= doc.getElementById("11");
        Element row12= doc.getElementById("12");
        Element row13= doc.getElementById("13");
        Element row14= doc.getElementById("14");
        Element row15= doc.getElementById("15");
        Element row16= doc.getElementById("16");

        }
    }
 
    

