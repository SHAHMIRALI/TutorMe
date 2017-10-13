# YOUR PRODUCT/TEAM NAME

 > _Note:_ This document is meant to evolve throughout the planning phase of your project.    
 > That is, it makes sense for you commit regularly to this file while working on the project (especially edits/additions/deletions to the _Highlights_ section).

#### Q1: What are you planning to build?

We will build a desktop application for tutoring. The main purpose of the application is to learn the materials through online video tutoring. Users can record anything within their expertise and upload on the application platform (e.g., explaining an entire UofT course material, like problem sets, tutorials, past midterms.) Also, users can create a live stream room that others can join. This tool allows instructors and TAs to explain the materials outside the course. Students with fair knowledge can also create the rooms and explain hard materials or make reviews to help other students. This application aims to provide students a more customized aid (materials specific to the course students are taking), an instant help (online rooms available), and a more powerful resources that students can rely on outside the school.


#### Q2: Who are your target users?

Our target users are students who wish to get extra help outside the class. After a little research, we found out that there are a lot of students who are searching for help outside the class, because of hard materials. Our main target users will be those who don’t understand materials, students who were unable to attend a course because they were sick, students who want to review for midterms, students who want to find TAs and instructors to explain tutorial problems, those who have questions for assignments, those who want to study with other classmates. Currently, at UofT alone, there are about 6-7 outside help educational organizations that each recruits about 100 students for each midterm review session. We’d like to offer those students a free platform that can help them to succeed in their courses with extra help. 

#### Q3: Why would your users choose your product? What are they using today to solve their problem/need?

Major education problems:

**Bad quality lectures:** A lot of university professors have high degrees but they don’t know how to teach and give lectures. This results in bad understanding of the materials. (Having other students (or education organizations) giving out lectures for the same course can allow students to understand materials better)

**School help assistance resources is limited** (very limited office hours, 1 professor and 1 TA for 100 students) As a result, even if students are motivated to get good grades, they don’t get enough resources to help them out when they need, especially before midterm and assignment due date. (Through streaming, instructors and TAs can open a live stream room to answer any questions, or add extra office hours through online streaming, and anyone who wishes to asks questions only needs to log in to the app and doesn’t need to go to the office, which is more time flexible and easier)

**Sometimes, students are shy to ask a question in the classroom** even if they don’t understand the materials, which is one of the major problems for poor academic standing. (Through video tutoring and behind the screen, people will be more comfortable asking questions or chat in the room)

**A lot of students go on YouTube to get help. However, YouTube videos are not specific to the courses.** A lot of notations and ways to solve the problems are different from the course. Also, students have to search one subject at a time, which is not efficient. (Through the video tutoring platform, students can enroll in the specific course and get all lectures for all materials for the course they need. Since the video uploader are likely to be students previously taken the courses, the notations and ways to solve the problems are consistent with the course)

**Study group & Projects and assignments meetings: Study group resources are not efficient, since students have to set up a meeting time and travel long distance** which sometimes take lot of time. (through online streaming, they can economize the meeting time and chat in the room) Each user is able to share the screen.

**Piazza problems:** A lot of questions can be answered in few seconds with clearer explanations. (better than writing it in words)

**Tutor websites problems:** It’s very hard to find a tutor that can help the specific course we are taking. For example, for csc263, someone who knows the concepts will have read all the lecture slides to get an idea how the concepts are taught (most of the times, they can’t teach those courses. Another problem in CS is that a lot of programming tutors are programmers, who quit school long time ago. The materials they teach aren’t fit for school, and thus many students think that the money and time is wasted.  It’s also difficult to set up the meeting time. Finally, programmers ask for high tutoring fees because they set the fees similar to their job salary, which isn’t a reasonable price for a lot of students. Some students who wish to get help might be scared away by the price and thus can’t get help. (Through online tutoring, tutors who took the class can explain via a stream whenever you have a question without reading ahead all the slides and they can help give you strategies to solve the problems for the specific course. This allows to increase the quality of tutoring session.)

**Outside educational organizations such as PREP101 with high cost.** Students who have fair knowledge can help other students without charging. 

----

### Highlights

We decided to change platforms from browser based to Android, then from Android to a Java application. The change from Browser to Android was due to technical limitations as we discovered that we may be lacking in backend server side development skills during the meetings; we then decided to change the platform from Android to a Java application after taking into account of user need and the limited amount of screen real estate that an Android device can provide, which would be detrimental to a tutoring app that uses visual aid.

During our meetings, we realized that the focus of the tutor is also a resource that needs to be shared amongst the students. Therefore, we came up with the idea to separate all users into two distinct user groups. One of the groups will be limited in size by requiring a unique passcode which we will have a fixed number of, the other group will be spectators that can leave and join at any given time. The privileges of the two groups will differ as the limited size group will have access to voice comms to communicate with the tutor directly should they have any concerns.

Initially we were concerned about resource sharing during the initial conceptualization of having a group with limited size. We thought to implement some kind of semaphore to prevent scenarios that would cause the same spot to be accessed by multiple users. However, in reviewing sockets and server code from previous labs and upon further discussion, we realized that the implementation of server and sockets already takes care of conditions in which multiple users are trying to access the same resource.

The topic of target users was discussed in depth during our meetings. The two main focus groups that we were deciding between were the tutors and the students. After evaluating the amount of features that would satisfy a tutor as compared to the amount of features that would satisfy a student, we came to the realization that there exists an overlap in which many features which benefits the students also benefits the tutor and vice versa. In the end, we decided to focus on the student group for the purposes of this project, but we will take into account any modification that could prove to be beneficial to both groups.




