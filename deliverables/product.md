# YOUR PRODUCT/TEAM NAME

 > _Note:_ This document is meant to evolve throughout the planning phase of your project.    
 > That is, it makes sense for you commit regularly to this file while working on the project (especially edits/additions/deletions to the _Highlights_ section).

#### Q1: What are you planning to build?

YOUR ANSWER GOES HERE ...

 * Short (1 - 2 min' read)
 * Start with a single sentence, high-level description of the product.
 * Be clear - Describe the problem you are solving in simple terms.
 * Be concrete. For example:
    * What are you planning to build? Is it a website, mobile app,
   browser extension, command-line app, etc.?      
    * When describing the problem/need, give concrete examples of common use cases.
 * Focus on *what* your product does, and avoid discussing *how* you're going to implement it.      
   For example: This is not the time or the place to talk about which programming language and/or framework you are planning to use.
 * **Feel free (and very much encouraged) to include useful diagrams, mock-ups and/or links**.


#### Q2: Who are your target users?

YOUR ANSWER GOES HERE ...

 * Short (1 - 2 min' read max)
 * Be specific (e.g. )
 * Feel free (but not obligated) to use personas.        
   You can create your personas as part of this Markdown file, or add a link to an external site (for example, [Xtensio](https://xtensio.com/user-persona/)).

#### Q3: Why would your users choose your product? What are they using today to solve their problem/need?

YOUR ANSWER GOES HERE ...

 * Short (1 - 2 min' read max)
 * We want you to "connect the dots" for us - Why does your product (as described in your answer to Q1) fits the needs of your users (as described in your answer to Q2)?
 * Explain the benefits of your product explicitly & clearly. For example:
    * Save users time (how much?)
    * Allow users to discover new information (which information? And, why couldn't they discover it before?)
    * Provide users with more accurate and/or informative data (what kind of data? Why is it useful to them?)


----

### Highlights

YOUR ANSWER GOES HERE ...

Specify 3 - 5 key decisions and/or insights that came up during your meetings
and/or collaborative process.

We decided to change platforms from browser based to Android, then from Android to a Java application. The change from Browser to Android was due to technical limitations as we discovered that we may be lacking in backend server side development skills during the meetings; we then decided to change the platform from Android to a Java application after taking into account of user need and the limited amount of screen real estate that an Android device can provide, which would be detrimental to a tutoring app that uses visual aid.

During our meetings, we realized that the focus of the tutor is also a resource that needs to be shared amongst the students. Therefore, we came up with the idea to separate all users into two distinct user groups. One of the groups will be limited in size by requiring a unique passcode which we will have a fixed number of, the other group will be spectators that can leave and join at any given time. The privileges of the two groups will differ as the limited size group will have access to voice comms to communicate with the tutor directly should they have any concerns.

Initially we were concerned about resource sharing during the initial conceptualization of having a group with limited size. We thought to implement some kind of semaphore to prevent scenarios that would cause the same spot to be accessed by multiple users. However, in reviewing sockets and server code from previous labs and upon further discussion, we realized that the implementation of server and sockets already takes care of conditions in which multiple users are trying to access the same resource.

The topic of target users was discussed in depth during our meetings. The two main focus groups that we were deciding between were the tutors and the students. After evaluating the amount of features that would satisfy a tutor as compared to the amount of features that would satisfy a student, we came to the realization that there exists an overlap in which many features which benefits the students also benefits the tutor and vice versa. In the end, we decided to focus on the student group for the purposes of this project, but we will take into account any modification that could prove to be beneficial to both groups.

