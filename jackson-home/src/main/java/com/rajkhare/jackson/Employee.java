package com.rajkhare.jackson;

public class Employee {      
    // declare variables  
    private String empId;  
    private String jobTitleName;  
    private String firstName;  
    private String lastName;  
    private String preferredFullName;  
    private String employeeCode;  
    private String region;  
    private String phoneNumber;  
    private String emailAddress;  
     
    public Employee(){  
         
    }  
     
    // getter/setters for all variables  
    public String getEmpId() {  
            return empId;  
    }  
    public void setEmpId(String empId) {  
            this.empId = empId;  
    }  
     
    public String getJobTitleName() {  
            return jobTitleName;  
    }  
    public void setJobTitleName(String jobTitleName) {  
            this.jobTitleName = jobTitleName;  
    }  
    public String getFirstName() {  
            return firstName;  
    }  
    public void setFirstName(String firstName) {  
            this.firstName = firstName;  
    }  
    public String getLastName() {  
            return lastName;  
    }  
    public void setLastName(String lastName) {  
            this.lastName = lastName;  
    }  
    public String getPreferredFullName() {  
            return preferredFullName;  
    }  
    public void setPreferredFullName(String preferredFullName) {  
            this.preferredFullName = preferredFullName;  
    }  
    public String getEmployeeCode() {  
            return employeeCode;  
    }  
    public void setEmployeeCode(String employeeCode) {  
            this.employeeCode = employeeCode;  
    }  
    public String getRegion() {  
            return region;  
    }  
    public void setRegion(String region) {  
            this.region = region;  
    }  
    public String getPhoneNumber() {  
            return phoneNumber;  
    }  
    public void setPhoneNumber(String phoneNumber) {  
            this.phoneNumber = phoneNumber;  
    }  
     
    public String getEmailAddress() {  
            return emailAddress;  
    }  
    public void setEmailAddress(String emailAddress) {  
            this.emailAddress = emailAddress;  
    }  
    
    @Override
    public String toString(){  
            return "Employee [ Employee Id: "+empId+", Job Title: "+jobTitleName+ ""  
                + ", First Name: \"+firstName+ \", Last Name: \"+lastName+ \""  
                + ", Name: \"+preferredFullName+ \", Employee Code: \"+employeeCode+ \""  
                + ", Region: \"+region+ \", Phone Number: \"+phoneNumber+ \""  
                + ", Email Address: \"+emailAddress+ \" ]";  
    }  
}  