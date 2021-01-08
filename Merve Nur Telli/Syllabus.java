
public class Syllabus {
    
    private int CourseCode;
    private String CourseName;
    private String CourseLanguage;
    private String Semester;
    private int Theory;
    private int Application;
    private int LocalCredit;
    private int Ects;
    private String onkosul;
    private String CourseType; //zorunlu veya seçmeli
    private String CourseLevel;
    private String Coordinator;
    private String Lecturers;
    private String Assistants;
    private String CourseObjective; //dersin amacı
    private String LOs;
    private String CourseDescription;
    private String CourseCategory;
    private String Subjects;
    private String CourseBook;
    private String SuggestedReadings;
    //Değerlendirme Ölçütü
    private int Participation; //katılım
    private int Labaratory; 
    private int FieldWork; //Arazi Çalışası
    private int Quizzes;
    private int Homework;
    private int Presentation;
    private int Project;
    private int Seminar;
    private int OralExam;
    private int Midterm;
    private int Final;
    //AKTS/İŞ YÜKÜ TABLOSU
    private int TheoreticalCourseHours;
    private int StudyOutOfClass;

    public Syllabus(int CourseCode, String CourseName, String CourseLanguage, String Semester, int Theory, int Application, int LocalCredit, int Ects, String onkosul, String CourseType, String CourseLevel, String Coordinator, String Lecturers, String Assistants, String CourseObjective, String LOs, String CourseDescription, String CourseCategory, String Subjects, String CourseBook, String SuggestedReadings, int Participation, int Labaratory, int FieldWork, int Quizzes, int Homework, int Presentation, int Project, int Seminar, int OralExam, int Midterm, int Final, int TheoreticalCourseHours, int StudyOutOfClass) {
        this.CourseCode = CourseCode;
        this.CourseName = CourseName;
        this.CourseLanguage = CourseLanguage;
        this.Semester = Semester;
        this.Theory = Theory;
        this.Application = Application;
        this.LocalCredit = LocalCredit;
        this.Ects = Ects;
        this.onkosul = onkosul;
        this.CourseType = CourseType;
        this.CourseLevel = CourseLevel;
        this.Coordinator = Coordinator;
        this.Lecturers = Lecturers;
        this.Assistants = Assistants;
        this.CourseObjective = CourseObjective;
        this.LOs = LOs;
        this.CourseDescription = CourseDescription;
        this.CourseCategory = CourseCategory;
        this.Subjects = Subjects;
        this.CourseBook = CourseBook;
        this.SuggestedReadings = SuggestedReadings;
        this.Participation = Participation;
        this.Labaratory = Labaratory;
        this.FieldWork = FieldWork;
        this.Quizzes = Quizzes;
        this.Homework = Homework;
        this.Presentation = Presentation;
        this.Project = Project;
        this.Seminar = Seminar;
        this.OralExam = OralExam;
        this.Midterm = Midterm;
        this.Final = Final;
        this.TheoreticalCourseHours = TheoreticalCourseHours;
        this.StudyOutOfClass = StudyOutOfClass;
    }

    public int getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(int CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getCourseLanguage() {
        return CourseLanguage;
    }

    public void setCourseLanguage(String CourseLanguage) {
        this.CourseLanguage = CourseLanguage;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public int getTheory() {
        return Theory;
    }

    public void setTheory(int Theory) {
        this.Theory = Theory;
    }

    public int getApplication() {
        return Application;
    }

    public void setApplication(int Application) {
        this.Application = Application;
    }

    public int getLocalCredit() {
        return LocalCredit;
    }

    public void setLocalCredit(int LocalCredit) {
        this.LocalCredit = LocalCredit;
    }

    public int getEcts() {
        return Ects;
    }

    public void setEcts(int Ects) {
        this.Ects = Ects;
    }

    public String getOnkosul() {
        return onkosul;
    }

    public void setOnkosul(String onkosul) {
        this.onkosul = onkosul;
    }

    public String getCourseType() {
        return CourseType;
    }

    public void setCourseType(String CourseType) {
        this.CourseType = CourseType;
    }

    public String getCourseLevel() {
        return CourseLevel;
    }

    public void setCourseLevel(String CourseLevel) {
        this.CourseLevel = CourseLevel;
    }

    public String getCoordinator() {
        return Coordinator;
    }

    public void setCoordinator(String Coordinator) {
        this.Coordinator = Coordinator;
    }

    public String getLecturers() {
        return Lecturers;
    }

    public void setLecturers(String Lecturers) {
        this.Lecturers = Lecturers;
    }

    public String getAssistants() {
        return Assistants;
    }

    public void setAssistants(String Assistants) {
        this.Assistants = Assistants;
    }

    public String getCourseObjective() {
        return CourseObjective;
    }

    public void setCourseObjective(String CourseObjective) {
        this.CourseObjective = CourseObjective;
    }

    public String getLOs() {
        return LOs;
    }

    public void setLOs(String LOs) {
        this.LOs = LOs;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String CourseDescription) {
        this.CourseDescription = CourseDescription;
    }

    public String getCourseCategory() {
        return CourseCategory;
    }

    public void setCourseCategory(String CourseCategory) {
        this.CourseCategory = CourseCategory;
    }

    public String getSubjects() {
        return Subjects;
    }

    public void setSubjects(String Subjects) {
        this.Subjects = Subjects;
    }

    public String getCourseBook() {
        return CourseBook;
    }

    public void setCourseBook(String CourseBook) {
        this.CourseBook = CourseBook;
    }

    public String getSuggestedReadings() {
        return SuggestedReadings;
    }

    public void setSuggestedReadings(String SuggestedReadings) {
        this.SuggestedReadings = SuggestedReadings;
    }

    public int getParticipation() {
        return Participation;
    }

    public void setParticipation(int Participation) {
        this.Participation = Participation;
    }

    public int getLabaratory() {
        return Labaratory;
    }

    public void setLabaratory(int Labaratory) {
        this.Labaratory = Labaratory;
    }

    public int getFieldWork() {
        return FieldWork;
    }

    public void setFieldWork(int FieldWork) {
        this.FieldWork = FieldWork;
    }

    public int getQuizzes() {
        return Quizzes;
    }

    public void setQuizzes(int Quizzes) {
        this.Quizzes = Quizzes;
    }

    public int getHomework() {
        return Homework;
    }

    public void setHomework(int Homework) {
        this.Homework = Homework;
    }

    public int getPresentation() {
        return Presentation;
    }

    public void setPresentation(int Presentation) {
        this.Presentation = Presentation;
    }

    public int getProject() {
        return Project;
    }

    public void setProject(int Project) {
        this.Project = Project;
    }

    public int getSeminar() {
        return Seminar;
    }

    public void setSeminar(int Seminar) {
        this.Seminar = Seminar;
    }

    public int getOralExam() {
        return OralExam;
    }

    public void setOralExam(int OralExam) {
        this.OralExam = OralExam;
    }

    public int getMidterm() {
        return Midterm;
    }

    public void setMidterm(int Midterm) {
        this.Midterm = Midterm;
    }

    public int getFinal() {
        return Final;
    }

    public void setFinal(int Final) {
        this.Final = Final;
    }

    public int getTheoreticalCourseHours() {
        return TheoreticalCourseHours;
    }

    public void setTheoreticalCourseHours(int TheoreticalCourseHours) {
        this.TheoreticalCourseHours = TheoreticalCourseHours;
    }

    public int getStudyOutOfClass() {
        return StudyOutOfClass;
    }

    public void setStudyOutOfClass(int StudyOutOfClass) {
        this.StudyOutOfClass = StudyOutOfClass;
    }
    
    
    
    
    
    
}
