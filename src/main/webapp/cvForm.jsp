<%-- 
    Document   : cvForm
    Created on : 25 Nov 2026, 10:28:01 am
    Author     : miraj
--%>

<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Dynamic Online CV Builder</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <div class="container">
            <div class="header-bar">
                <div>
                    <h1>Dynamic Online CV Builder</h1>
                    <p class="subtitle">Complete your details below to generate a classic black-and-white CV.</p>
                </div>
                <a class="btn-sample" href="CVServlet?action=sample">Preview Sample CV</a>
            </div>

            <form action="CVServlet" method="post">
                <!-- Section 1: Personal Information -->
                <div class="form-section">
                    <div class="section-title">1. Personal Information</div>
                    <div class="form-grid">
                        <div class="form-group">
                            <label for="fullName">Full Name <span class="req">*</span></label>
                            <input type="text" id="fullName" name="fullName" placeholder="e.g., Fatimah binti Rahim">
                        </div>
                        <div class="form-group">
                            <label for="professionalTitle">Professional Title</label>
                            <input type="text" id="professionalTitle" name="professionalTitle" placeholder="e.g., Web Developer">
                        </div>
                        <div class="form-group">
                            <label for="email">Email Address <span class="req">*</span></label>
                            <input type="email" id="email" name="email" placeholder="e.g., fatimah@example.com">
                        </div>
                        <div class="form-group">
                            <label for="phoneNumber">Phone Number</label>
                            <input type="text" id="phoneNumber" name="phoneNumber" placeholder="e.g., +60 11-2345 6789">
                        </div>
                        <div class="form-group full-width">
                            <label for="socialUrl">LinkedIn / GitHub URL</label>
                            <input type="text" id="socialUrl" name="socialUrl" placeholder="e.g., https://github.com/username">
                        </div>
                        <div class="form-group full-width">
                            <label for="profileSummary">Profile Summary</label>
                            <textarea id="profileSummary" name="profileSummary" rows="3" placeholder="Brief summary of your background, technical strengths, and career goals"></textarea>
                        </div>
                    </div>
                </div>

                <!-- Section 2: Education -->
                <div class="form-section">
                    <div class="section-title">2. Education</div>
                    <div class="form-grid">
                        <div class="form-group">
                            <label for="highestDegree">Highest Degree <span class="req">*</span></label>
                            <input type="text" id="highestDegree" name="highestDegree" placeholder="e.g., Bachelor of Computer Science (Hons.)">
                        </div>
                        <div class="form-group">
                            <label for="majorField">Major / Field of Study</label>
                            <input type="text" id="majorField" name="majorField" placeholder="e.g., Computer Science">
                        </div>
                        <div class="form-group">
                            <label for="institutionName">Institution Name</label>
                            <input type="text" id="institutionName" name="institutionName" placeholder="e.g., Universiti Teknologi MARA">
                        </div>
                        <div class="form-group">
                            <label for="graduationYear">Year of Graduation</label>
                            <input type="text" id="graduationYear" name="graduationYear" placeholder="e.g., 2026">
                        </div>
                    </div>
                </div>

                <!-- Section 3: Experience -->
                <div class="form-section">
                    <div class="section-title">3. Work / Internship Experience</div>
                    <div class="form-grid">
                        <div class="form-group">
                            <label for="jobTitle">Most Recent Job Title</label>
                            <input type="text" id="jobTitle" name="jobTitle" placeholder="e.g., Software Developer Intern">
                        </div>
                        <div class="form-group">
                            <label for="companyName">Company Name</label>
                            <input type="text" id="companyName" name="companyName" placeholder="e.g., ABC Tech Sdn. Bhd.">
                        </div>
                        <div class="form-group full-width">
                            <label for="duration">Duration</label>
                            <input type="text" id="duration" name="duration" placeholder="e.g., Mar 2026 - Aug 2026">
                        </div>
                        <div class="form-group full-width">
                            <label for="responsibilities">Key Responsibilities / Achievements</label>
                            <textarea id="responsibilities" name="responsibilities" rows="3" placeholder="Describe your main tasks, projects, or achievements"></textarea>
                        </div>
                    </div>
                </div>

                <!-- Section 4: Skills -->
                <div class="form-section">
                    <div class="section-title">4. Skills (At least one required <span class="req">*</span>)</div>
                    <div class="form-grid">
                        <div class="form-group">
                            <label for="technicalSkills">Technical Skills</label>
                            <input type="text" id="technicalSkills" name="technicalSkills" placeholder="e.g., Java, Servlets, JSP">
                        </div>
                        <div class="form-group">
                            <label for="softSkills">Soft Skills</label>
                            <input type="text" id="softSkills" name="softSkills" placeholder="e.g., Teamwork, Problem Solving">
                        </div>
                    </div>
                </div>

                <div class="actions">
                    <button type="submit" class="btn-submit">Generate CV</button>
                    <button type="reset" class="btn-reset">Clear Form</button>
                </div>
            </form>
        </div>
    </body>
</html>