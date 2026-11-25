<%-- 
    Document   : cvView
    Created on : 25 Nov 2026, 10:28:34 am
    Author     : miraj
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>${cvData.fullName} - Curriculum Vitae</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="cv-toolbar">
            <a class="btn-back" href="cvForm.jsp">&larr; Back to Form</a>
            <button type="button" class="btn-print" onclick="window.print()">Print / Save as PDF</button>
        </div>

        <div class="cv-sheet">
            <div class="cv-top">
                <h1>${cvData.fullName}</h1>
                <div class="cv-title">${cvData.professionalTitle}</div>
                <div class="cv-contact">
                    <span><strong>Email:</strong> ${cvData.email}</span>
                    <c:if test="${not empty cvData.phoneNumber}">
                        &nbsp;|&nbsp;<span><strong>Phone:</strong> ${cvData.phoneNumber}</span>
                    </c:if>
                    <c:if test="${not empty cvData.socialUrl}">
                        &nbsp;|&nbsp;<span><strong>Link:</strong> ${cvData.socialUrl}</span>
                    </c:if>
                </div>
            </div>

            <div class="cv-section">
                <h2>Profile Summary</h2>
                <p>${cvData.profileSummary}</p>
            </div>

            <div class="cv-section">
                <h2>Education</h2>
                <p><strong>${cvData.highestDegree}</strong> &mdash; ${cvData.majorField}</p>
                <p>${cvData.institutionName} (${cvData.graduationYear})</p>
            </div>

            <div class="cv-section">
                <h2>Experience</h2>
                <p><strong>${cvData.jobTitle}</strong> &mdash; ${cvData.companyName} <em>(${cvData.duration})</em></p>
                <p>${cvData.responsibilities}</p>
            </div>

            <div class="cv-section">
                <h2>Skills</h2>
                <p><strong>Technical Skills:</strong> ${cvData.technicalSkills}</p>
                <p><strong>Soft Skills:</strong> ${cvData.softSkills}</p>
            </div>
        </div>
    </body>
</html>