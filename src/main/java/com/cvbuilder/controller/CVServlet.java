/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvbuilder.controller;

import com.cvbuilder.model.CVBean;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CVServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getParameter("action");

        if ("sample".equalsIgnoreCase(action)) {
            CVBean sampleBean = createSampleCV();
            request.setAttribute("cvData", sampleBean);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/cvView.jsp");
            dispatcher.forward(request, response);
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("/cvForm.jsp");
            dispatcher.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        CVBean cvBean = new CVBean();
        cvBean.setFullName(safeTrim(request.getParameter("fullName")));
        cvBean.setProfessionalTitle(safeTrim(request.getParameter("professionalTitle")));
        cvBean.setEmail(safeTrim(request.getParameter("email")));
        cvBean.setPhoneNumber(safeTrim(request.getParameter("phoneNumber")));
        cvBean.setSocialUrl(safeTrim(request.getParameter("socialUrl")));
        cvBean.setProfileSummary(safeTrim(request.getParameter("profileSummary")));

        cvBean.setHighestDegree(safeTrim(request.getParameter("highestDegree")));
        cvBean.setInstitutionName(safeTrim(request.getParameter("institutionName")));
        cvBean.setGraduationYear(safeTrim(request.getParameter("graduationYear")));
        cvBean.setMajorField(safeTrim(request.getParameter("majorField")));

        cvBean.setJobTitle(safeTrim(request.getParameter("jobTitle")));
        cvBean.setCompanyName(safeTrim(request.getParameter("companyName")));
        cvBean.setDuration(safeTrim(request.getParameter("duration")));
        cvBean.setResponsibilities(safeTrim(request.getParameter("responsibilities")));

        cvBean.setTechnicalSkills(safeTrim(request.getParameter("technicalSkills")));
        cvBean.setSoftSkills(safeTrim(request.getParameter("softSkills")));

        if (cvBean.validate()) {
            request.setAttribute("cvData", cvBean);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/cvView.jsp");
            dispatcher.forward(request, response);
        } else {
            String errorMessage = "Please fill in all required fields properly: Full Name, "
                    + "a valid Email address (containing '@' and '.'), Highest Degree, "
                    + "and at least one Skill (Technical or Soft Skills).";
            request.setAttribute("errorMessage", errorMessage);
            RequestDispatcher dispatcher = request.getRequestDispatcher("/cvError.jsp");
            dispatcher.forward(request, response);
        }
    }

    private String safeTrim(String value) {
        return value == null ? "" : value.trim();
    }

    private CVBean createSampleCV() {
        CVBean sample = new CVBean();
        sample.setFullName("ALI BIN ABU");
        sample.setProfessionalTitle("Junior Java Web Developer");
        sample.setEmail("ali.abu@example.com");
        sample.setPhoneNumber("+60 12-345 6789");
        sample.setSocialUrl("https://github.com/ali-dev");
        sample.setProfileSummary("Creative Information Technology graduate focused on designing clean, user-friendly, and "
                + "responsive web interfaces using modern HTML, CSS, and JavaScript.");

        sample.setHighestDegree("Bachelor of Information Technology (Hons.)");
        sample.setInstitutionName("Universiti Kebangsaan Malaysia");
        sample.setGraduationYear("2026");
        sample.setMajorField("Interactive Media");

        sample.setJobTitle("Web Design Intern");
        sample.setCompanyName("Kuantan Digital Studio");
        sample.setDuration("Feb 2026 - Jul 2026");
        sample.setResponsibilities("Designed website wireframes, built responsive landing pages, fixed layout bugs, and "
                + "collaborated with backend developers to integrate APIs.");

        sample.setTechnicalSkills("HTML5, CSS3, JavaScript, Figma, Bootstrap, Git");
        sample.setSoftSkills("Attention to Detail, Creativity, Adaptability, Teamwork");

        return sample;
    }
}