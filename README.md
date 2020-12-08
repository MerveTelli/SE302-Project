# **Project of SE 302**
 
## **Authors:**
### Yunus Cihan BOZKURT
### Hazal Öykü ŞEN
### Merve Nur TELLİ
### Özge TUNA
---------------------------

**OUTLINE**

1. Introduction
    1. Purpose
    2. Scope
    3. References
    4. Document Overview
2. Overall Description
    1. Product Perspective
    2. Product Function
    3. Assumption Dependencies
3. External Interface Requirement
    1. User Interfaces
    2. Software Interfaces
    3. Hardware Interfaces
4. Functional Requirements
    1. Functional User Requirements
    2. Functional System Requirements 
        1. Create Syllabus 
        2. Edit Existing Syllabus
        3. Import Syllabus 
        4. Export Syllabus Data 
5. Nonfuntional Requirements


## **1.Introduction**
#### **1.1 Purpose**
The purpose of this program provide convenience to lecturers at Izmir University of Economics to prepare the syllabus of the lessons they gave.
#### **1.2 Scope**
Our program is a computer application which helps lecturers to create, export, import and edit syllabus with both English and Turkish language support. The program based on a relational database with school web site and application. The data which given by user held in a database for every use of that data.
#### **1.3 References**
(https://www.ieu.edu.tr/tr/)
(https://ieeexplore.ieee.org/Xplore)
#### **1.4 Document Overview**
The remainder of this document is three chapters. The second chapter give full description of the project, list all the functions providing by the system. Third chapter will be about interfaces. Final chapter concerns details of system functions and various requirements.

## **2.Overall Description**
#### **2.1 Product Perspective**
Our project database system stores the following parts:  
 Part-1. General information about lecture: name, code, semester.   
 Part-2: Operational information about lecture: theory, application/lab, local credits, ECTS.   
 Part-3: Specification of lecture: prerequisites, course language, course type, course level, course coordinator, course lecturer(s).   
 Part-4: Course objectives. 
 Part-5: Learning outcomes. 
 Part-6: Course description.    
 Part-7: Course category    
 Part-8: Weekly subjects and related preparation studies.   
 Part-9: Evaluation system. 
 Part-10: Workload table.   
 Part-11: Program qualification relationship.
#### **2.2 Product Functions**
Project have basically 4 function which are import, export, create and edit. Importing part is for web pages get existing syllabus on the university web site. Create part mean creating from scratch there will be empty syllabus for fill out with lecture information. Export part is about exporting documents to docx or html for use. The last one edit is for stored all the information about syllabus until there.
#### **2.3 Assumption Dependencies**
One assumption about the e-syllabus is that users must have knowledge about Turkish or English. If they do not know both of them there will be no any other language support. Also, our application needs some performance requirements for optimal experience which will be mentioned last section, if user computer cannot lay down the conditions user may have difficulties.

## **3.External Interface Requirements**
#### **3.1 User Interfaces**
The application GUI provides more easier use.
#### **3.2 Software Interfaces**
E-syllabus allows import a structured web sites links via HTML data format. Export the document a format that DOCX or HTML.
#### **3.3 Hardware Interfaces**
The program will use the hard disk. Also, because we will use GUI, use of keyboard and a mouse must be easier for use.

## **4.Functional Requirements**
#### **4.1 Functional User Requirements**   
REQ-1: The user should be able to reach lesson’s schedule.  
REQ-2: The users should be able to find lessons’ total hours.   
REQ-3: The user should be able to learn lessons’ content.   
REQ-4: The user should be able to learn prerequisite.   
REQ-5: The user should be able to access course coordinator, course lecturer and assistant. 
REQ-6: The user should be able to access the program from multiple devices simultaneously.  
REQ-7: The user should be able to reach course objectives and learning outcomes.   
REQ-8: The user should be able to reach course category.    
REQ-9: The user should be able to reach weekly subjects and related preparations studies.   
REQ-10: The user should be able to find course notes, textbooks and materials.  
REQ-11: The user should be able to reach evaluation system. 
REQ-12: The user should be able to reach ECTS-Workload table (number and hours).    
REQ-13: The user should be able to learn outcomes and program qualifications relationship.
#### **4.2 Functional System Requirements**
#### **_4.2.1 Create Syllabus_**
Description and Priority
User will be able to create a new syllabus data for any courses with the necessary fields.
Functional Requirements
REQ-1: User should be able to create a syllabus with at least the required fields.
#### **_4.2.2 Edit Existing Syllabus_**
**Description and Priority**
User will be able to change existing syllabus data.
**Functional Requirements**
REQ-1: Syllabus should be editable.
REQ-2: Before editing existing syllabus data, whichever syllabus data the user wishes to manage should be identified by the selection tool, mouse pointer.
#### **_4.2.3 Import Syllabus_**
**Description and Priority**
Importing will allow users to import their selected syllabus data.
**Functional Requirements**
REQ-1: Users should click on the "import" tab and select what to import.
REQ-2: For importing, file format must in docx or html.
#### **_4.2.4 Export Syllabus Data_**
**Description and Priority**
Exporting will allow users to export their selected syllabus data.
**Functional Requirements**
REQ-1: Users should be able to select what to export.
REQ-2: Users should be able to export the data to docx or html.

## **5.Nonfunctional Requirements**
REQ-1: The program shall be use to work on Windows.
REQ-2: Users should easily understand the interface of the product
REQ-3: Program should be available 7/24.
REQ-4: The page should be viewable five seconds after it loads.
REQ-5: The program shall be available in two languages.
REQ-6: The program shall allow several import and export of page to be made at the same time without downgrading performance.
REQ-7: When learning outcomes are written, the number of columns should be created automatically in section assessment.
REQ-8: The maximum number of weeks should be 16, in the weekly subject section.
REQ-9: The user should access the book title automatically according to the course code.
REQ-10: The learning outcomes written should be a minimum of 4 and a maximum of 8.
REQ-11: Information in the database should be updated when course information changes.
REQ-12: This application requires a system with at least 1.2 GHz CPU and 1 GB of ram. The performance will be optimized under these conditions so the customer can use any command without any input or processing delays.
REQ-13: This application is responsive in its usage and scalability, and responsively scales in most common aspect resolutions.
