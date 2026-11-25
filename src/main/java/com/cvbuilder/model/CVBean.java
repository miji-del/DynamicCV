/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvbuilder.model;

public class CVBean {

    // Personal Info
    private String fullName;
    private String professionalTitle;
    private String email;
    private String phoneNumber;
    private String socialUrl;
    private String profileSummary;

    // Education
    private String highestDegree;
    private String institutionName;
    private String graduationYear;
    private String majorField;

    // Experience
    private String jobTitle;
    private String companyName;
    private String duration;
    private String responsibilities;

    // Skills
    private String technicalSkills;
    private String softSkills;

    // Default (no-argument) constructor
    public CVBean() {
        this.fullName = "";
        this.professionalTitle = "";
        this.email = "";
        this.phoneNumber = "";
        this.socialUrl = "";
        this.profileSummary = "";
        this.highestDegree = "";
        this.institutionName = "";
        this.graduationYear = "";
        this.majorField = "";
        this.jobTitle = "";
        this.companyName = "";
        this.duration = "";
        this.responsibilities = "";
        this.technicalSkills = "";
        this.softSkills = "";
    }

    // Validation for mandatory fields: Name, Email, Degree, and at least one Skill
    public boolean validate() {
        boolean hasName = fullName != null && !fullName.trim().isEmpty();
        boolean hasEmail = email != null && !email.trim().isEmpty()
                && email.contains("@") && email.contains(".");
        boolean hasDegree = highestDegree != null && !highestDegree.trim().isEmpty();
        boolean hasTechSkill = technicalSkills != null && !technicalSkills.trim().isEmpty();
        boolean hasSoftSkill = softSkills != null && !softSkills.trim().isEmpty();
        boolean hasAtLeastOneSkill = hasTechSkill || hasSoftSkill;

        return hasName && hasEmail && hasDegree && hasAtLeastOneSkill;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getProfessionalTitle() {
        return professionalTitle;
    }

    public void setProfessionalTitle(String professionalTitle) {
        this.professionalTitle = professionalTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSocialUrl() {
        return socialUrl;
    }

    public void setSocialUrl(String socialUrl) {
        this.socialUrl = socialUrl;
    }

    public String getProfileSummary() {
        return profileSummary;
    }

    public void setProfileSummary(String profileSummary) {
        this.profileSummary = profileSummary;
    }

    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public String getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(String graduationYear) {
        this.graduationYear = graduationYear;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }

    public String getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(String technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public String getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(String softSkills) {
        this.softSkills = softSkills;
    }
}