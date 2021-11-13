# Feature 1
Map which shows the location of selected classes

### Functionality

For each class that gets selected, the map will be updated with the room number of the class, which then puts the locations on the map. As classes are selected, the map will create paths between the classes, which can be helpful for when school actually starts. These paths will change as the ammount OR order of the classes change. Also, a piece of text which has been modified to show a chronological list of the halls of the classes will be made. For example, suppose the locations of the classes shown are as follows: F123, G213, G321, A543. Then, a piece of text along the lines of "1st: F hall, 2nd: G hall, 3rd: G hall, 4th: A hall" will be made.

### Design
Tab titled "Map", which has a location of all the room numbers + classes taught in those rooms. After selecting classes, it will show the room number of said class, and the location of the room relative to the building. Classes which are chosen are highlighted. Also draws a path between the classes based on the order of the schedule. There will be a key near the map, which shows a correlation between class periods and a color. For example, "1st - 2nd period: Red", and a line showing those the path between those 2 classes will be made in that color. This will be in a sperate tab than the area where classes are actually selected, so that the screen doesnt look cluttered. There will also be an option to expand or shrink the map.

### QA
In order to "QA" this, we can push this functionality by changing the order of our classes, adding and removing classes, verifying that the loction displayed on the map with the location in real life, and making sure that the order of halls displayed is correct. We can also get users to pre-test this feature buy inputting their possible classes and verifying that the path is correct. Other possible problems of this can be having it misplaced, inability to expand or decrease the size of the map, and unclearness of the ORDER of paths fromm 1st to 8th period. Also, classes at steam center might have to be a special case on this map, and privilage periods cannot have a definite "Location" to them.


# Feature 2

### Functionality
Survey system that recommends classes to students based on their interests/career path. ,,,

### Design

### QA


# Feature 3

The number of available seats is displayed for a class.
### Functionality

For one, it could sort by the avilable seats of a class for a specific teacher and room. It could also be further narrowed by the period and seats avilable in that class. Because these two paramaters are mutually non-exlusive, they should be able to be selected together or neither.  This helps students pick out what class they would prefer putting in higher priority. 

### Design

When you hover over the class or select a wanted class, a visual representation of how avilable the class is is presented. The representation of the number of seats in a class may change, or perhaps it can be changed. I am unsure if it is better to put this as a menu item on its own, or if it is better to put it with the classes as mentioned before.  If you are selecting a class in general, whith no room number/teacher selected, the program will show the total seats avilable (all classes and period summed together).

### QA

Many issues may arise with this for the simple fact that it is generally difficult to sort stuff out like that out. Cumalitivly summing together every class and period may lead to some classes being lost in the processes for the bigger subjects. Another issue that, is almost inert, is that class sizes change before school starts and sometimes as school is going, a disclaimer should be added to alert people of that. I think that from a design perspective, trying to implement this without being overly obtrusive is a challenge. 

# Feature 4

 The program will tell you what classes you need for graduation, and complete your selected endrosment

### Functionality

First off, when you open the app for the first time there will appear a questionaire asking you about your previously completed class requirements. These questions include: what grade you're in (9, 10, 11, 12), how many math classes have you taken (0,1,2,3,4+),how many english classes have you taken (0,1,2,3,4+), how many science classes have you taken (0,1,2,3,4+), how many history classes have you taken (0,1,2,3,4+), how many language classes have you taken (0, 1, or 2+), how many PE classes have you taken (0, 1+), how many fine arts have you taken (0, 1+), how many electives have you taken (0,1,2,3,4,5,6+). After filling out the questionaire, there will be another pop-up screen telling them the requirements they have left. This is of course can be otional, and there will be a skip button atb the bottom of the pop, incase they would rather not know their requirements or only need the arena scheduling to see how their schedules will fit. This questionaire will help students realize if they need to choose different classes. For exampel they could be a senior realizing they need another language class in order to graduate. 

	
### Design

The design will consist of a rectangular pop-up when one first opens up the app. The option to skip will be on the bottom right corner in a different colored button. It will be an off-white background, unless it is in dark mode in which it will be midnight grey, and the text will be a contrast color for readability purposes. Utilizing cookies, the pop-up will not appear in the user's second or future visits. There will be a progress bar at the top or bottom to mark how far one is in completing the quiz. The progress bar color will be grey when uncomplete while the bar filling up will be eagle blue. The questions will come one after another, instead of a long scrolling view, and will be strictly multiple choice questions. The questions will fade in on each other instead of just being replaces for aethetic purposes, or will be slid on screen depending on the choice given to the Ui/Ux designers.

### QA

To assure the quality of this function, we must make sure that the questionaire and the pop-up it is on will be easy to use and free of bugs. Possible problems that could occur include... Not saving answers, locking them out, not letting them take the quiz, buttons not clicking, not being able to exit the quiz. These are all examples of potential bugs when making this feature. The best way to resolve each of these issues is by making an issue report section where kids can report issues. There will also be a lot of testing before adding this function to the main design. The most devestating issue with this function will probably be the unability to exit the quiz b/c that means there is no way to be able to progress and use the app for what it was ORIGINALLY intended for. 

# Feature 5

Course Popularity Scale

### Functionality
The popularity or percentage of students scheduled in a class should be displayed so that students can quickly choose the more popular courses. Fetches data from other student's reservation of courses, and displays that on a bar scale that identifies the popularity of that course. Takes into consideration if the student selecting the course has taken the required prerequisites for that class.

### Design
Displays the bar scale onto a sub-menu that appears when the user hovers the cursor over the course. It will contain a set number of grey bars that will be colored in to correspond to how popular it is among other students (ex. Popular classes will have all the boxes filled in with red, whereas less popular classes will only have a few green boxes); color will indicate how much room is left to join the course. The color of the sub-menu will correspond to which light/dark theme the user has selected.

### QA
If the feature is working properly, a bar scale will be displayed onto the sub-menu of the course, identifying the correct popularity percentage of that class. If a problem occurs, an error message will be displayed, identifying the corresponding error (ex. Wrong percentage, no bar scale, etc.),  which will let our team know which aspect to work on.

# Feature 6

Shows GPA scale of the class

### Functionality
Whan classes are picked, there will be an option to view details of individual classes, and all the classes picked. it will recieve data of the GPA scaling of said class or classes. For example: If the chosen class is Computer Science II, it will recieve data to show that the class has a gpa on a 4.5 scale. After picking multiple classes, It will show the maximum GPA which is possible with those classes. There will also be options to change the class level, so it is more convinient for the user. If all classes required are not picked, there will be a warning saying that that this number may change as classes change or get added.

### Design
When classes are picked, there will be an option which is titled "More Information" which has general information. In this tab, there will be a long bar which ranged from 0.0 to 5.0, which is the range from 0 to the maximum GPA's for the classes. If it is on the option which shows gpa for a specific class, it will highlight from 0 - the maximum GPA for that class. For example: Suppose you are viewing the GPA scale of a class worth 4.5. Everything below the 4.5 mark would be one color, and everything above the 4.5 mark would be grey. If the option to show the maximum gpa possible is selected, it will average the maximum GPA's of all of the chosen classes, and everything below that point would be hightlighted a certain color and everything above that point would be grey.

### QA
To make sure the quality of the GPA scale of the class is good, we can get user inputs of the clarity of our design in terms of getting the important informationa cross. Also, when it comes the the displaying of level change options, we need to make sure that the classes shown actually correspond for the class which was originally shown. For example: If a user were to pick AP Psyschology, the level change options should show "IB Psychology, Advanced Psychology, and On-Level Psychology, and not show other classes such as Advanced Bio, or Computer Science II. This clarity is important so that users dont get confused and end up changing their classes completely. Regular user testing would be helpful for this feature.


# Feature 7

Warns about incapability to schedule classes together

### Functionality
When classes are picked, there will be a process to check if some classes interfere with others due to issues such as transportation or timing of the classes. For example, if the chosen class is Computer Science II, the process will check whether or not the previous and class after would interfere with the time of the chosen class. 

### Design
When classes are picked, there will be a notification which will be titled "Error" which is highlighted in red. This notification will contain the conflicting classes and possible alterations to the schedule which would allow for the same classes to be chosen, but with a different time period so that all the classes are able to fit in the schedule.

### QA
To make sure the quality of the incapability to schedule classes is good, we can get user inputs about the clarity of our design in getting the information that they are unable to schedule classes together. Also, when it comes to displaying incapability of scheduling classes, we need to make sure that the classes shown actually correspond for the classes which conflict with each other. For example: If a user were to have AP Chemistry and AP physics conflict with each other, the notification should show "AP Chemistry and AP Physics conflict with each other", other classes such as AP Biology, or Computer Science II aren't in that notification. This clarity is important so that users dont get confused and end up changing their classes completely. Regular user testing would be helpful for this feature.


# Feature 8

Lunch's need to be shown (with the location)

### Functionality
When classes are picked, there will be a letter on the class chosen which is a letter of either "A", "B", "C", or "D". These letters will symbolize the lunch period for that class, and will be done for A-Days and B-Days due to different classes being scheduled on those days. The map of the school will also be shown with the location of the cafeteria being highlighted in red along with the classroom during that period being highlighted with the most efficient path being drawn by a dotted line in between the two locations.

### Design
When classes are picked, there will be an option which is titled "More Information" which has general information. In this tab, there would be text which would say the lunch you would have ("A", "B", "C", "D") and on which day that lunch period would be (A-Day, B-Day). For example, if I have IB History of the Americas during third period, then in the "More Information" tab I could find the lunch which that day has which is an A-Day.
 
### QA
To make sure the quality of displaying what lunch each class has is good, we can get user inputs about the clarity of our design in getting the information of the lunch cooresponding with the class. Also, when it comes to displaying which lunch a class has, we need to make sure that the lunches shown actually correspond with the actual lunches. For example: If a user were to have AP Chemistry and "B" lunch, the notification should show "A-Day Lunch is "B" lunch", other classes or lunches such as AP Biology, or "D" lucnh aren't in that notification. This clarity is important so that users dont get confused and end up going to lunch at the wrong time. Regular user testing would be helpful for this feature.

# Feature 9

Course summary

### Functionality
This can be access when a student click's on the class and would be given a course description about the learning the students will be engaged in. In this summary in can include types of learning students will participate in such as labs, projects, group collaborations etc. It would also have specified topics in the course itself like it the class were to be United States History main information about the subject could be American Independence and the Civil War. It should list the difficulty of the class so that students can be assured that the teaching in the subject matches the student's comprehension and work ethic. Lastly the summary will contain the bar scale of popularity, tells the percent of students that are interested in taking the class, so that learners can find themselves with their friends to better improve overall learning and cooperation efforts among them. Comprising of elements above, course summary will provide generalized information that would be sufficient enough to give students a basic understanding of the course to help them in deciding on the classes they would take.

### Design
	The course summary would appear once the student clicks on any particular class as they would be taken to the course description housing all sorts of information. When clicking on the button a new page will open up that consists of either black-or-white background with a contrasting color of text for the information in the summary. The new page will be in the middle of the screen easy for the user to see. Information should be that of the teacher's input on the page that each teacher will be forced to create.

### QA
In order to check whether this feature meets the requirements we would make sure we debug the potential problems that may occur. This could be inaccess to the summary when clicking on the course, failing to exit the course description where the summary is, information of the summary is invalid. These challenges may cause the user to struggle but can be reported through the customer service system in our app. Also students can probably refresh the page and try another attempt in viewing the course summary. 

# Feature 10

Rate my teacher system and could comment about the teacher

### Functionality
 This can be from data from students from the previous year who would like to provide data or express their opinions on the teacher they had. This could be very important as it allows for students who feel strongly about the teachers, whether good or bad, but more importantly gives insight to future learners who are interested in this type of class in understanding the professor. A more in-depth rating from the seniors would be the ability for students to leave comments on the teacher's describing experiences in their class. This furthermore could give significant data for faculty to be able to distinguish teachers that need guidance or those who deserve praise. Many students in our high school always want to know whether their future teachers are good or bad and based off this fact it could directly influence a students work ethic in the class being a more demanding teacher wants more work while a laid-back one would make the students less studious. On top of this these kids could view the comments to picture in their head how the class will flow and this could match their wants or needs.

### Design
To find the teacher rate/comment system it will be located in one of the menu's where it will have a database of all the teacher's name and class they would have. If you want to learn about the rating then click on the teacher and it would perform as a drop-down menu and show in bolded characters, with the text contrasting the background(black-or-white), illustrate the average rating a person receives. Here it would also below this give the feedback on both extremes of loving or hating the teachers, that is if the information is present, so that students can get fellow peer feedback. Probably we would make this look better by adding the image of the teacher. To be able to leave a comment and rate, there will be a button on this drop-down allocating access to give a rating out of a five  point scale with the optional feature of commenting. 

### QA
 In order to ensure this feature works properly we would thoroughly check the correct information for each page. Some type of problems that may occur would be false information of the teacher, failed to implement individual comments or rating, drop-down menu fails to operate, rating values placed in inversely (if I rate my teacher a five it puts it as a one). Again we would implement customer service in order to immediately solve these problems here and we would also check our database to properly match up the teacher information between one another. I big problem would be being locked on the page where the student provides their ideals since they may not be able to leave nor their data would be sent to the server.
 
# Feature 11

Differentiate between STEAM, AHS and CTC courses

### Functionality

Each class should be assigned a value which allows the app to recognise whether the class is attended at the STEAM center, CTC or at AHS. Based on these values, classes preceding and following lunch should be scanned for these values and based on this, it should be determined what location lunch is at. This value should also be used in the “map” tab to allow for toggling views from each location and sort by building. This value should also be used to toggle backgrounds of pop-ups based on location, and should use the light/dark mode toggle to modify the color of this background.

### Design

Next to each listing of classes, either a CTC, STEAM or AHS logo should be visible, as well as for lunches. In any pop-ups, a logo should be present. When hovered over, a hint should be shown detailing the building the class is at. In pop-ups such as a course summary, the background color may be changed to show location, for example red for AHS, blue for CTC and green for the STEAM center. This saturation, hue and brightness of this color should be adjusted based on whether light or dark mode is enabled.

### QA

One potential bug is missing a class or assigning the wrong value to the class, which could reuslt in an error with a call for the value resulting in a nil value or the wrong color being displayed respectively. This could be fixed by checking the value agianst the room number provided from the map feature. However, while this may work for some classes, this likely wouldn't work for many, so testing preceding implementation is important as well as double-checking.  

# Feature 12

Ability to save schedules

### Functionality

Button that allows schedules to be saved to your name so that when you log back into the application the schedule that you saved will not disappear.

### Design

A button that is placed on the application that is blue and displays the word “SAVE” which shows that you haven’t saved your schedule yet. Once you press the button, the button should turn grey and should then display the word “SAVED” to prove that you have saved your schedule. 

### QA

The schedule does not corrupt which allows the schedule to not be saved. This allows the functionality of this feature to be disabled and for problems to arise in the feature.

# Feature 13

Share option with yourself or friends

### Functionality

After finishing out a schedule, a user should be able to export it into another program, namely social media programs. The function should do so automatically with only asking the user to login into their account of the respective social media platform. If a public username/account system is put into place, the users should be able to send their schedules to one another through the app itself, this option should be with the other options.

### Design

The design should be minor and non obtrusive. Perhaps next to the aformentioned SAVE button in Feature 12, there should be a smaller grey upload button, after clicking it it opens a small dioluge box where it asks for how (format, sizing, appearance ect.) and where you want to share it to. 

### QA

A very large issue with this is getting the app to communicate with other apps consistently. A bug could occur where the user will end up uploading nothing because the payload will never actually be communicated. It's proximity to the SAVE button might also cause issues when designing the UI/UX. A similar issue to the SAVE fucntionallity is that the payload would be curropt. 

# Feature 14

Show Transportation Schedule

### Functionality

There is a transportation schedule that will be shown when the students schedule their courses. This transportation schedule will include when the shuttle bus comes after each period for the STEAM center, Collin Campus Technical Center, and Allen High School. This will allow for the students to understand when the shuttles leave each location and what arrangements they have to make in order to get to these shuttles on time.

### Design

A basic transportation schedule will be displayed on the side of the display which allows students to see it clearly. The schedule will show each period and the times of each period and when the shuttle will leave from the Allen High School to the STEAM center and Collin Campus Technical center. It will also show the opposite when buses will leave from the STEAM center and the Collin Technical Campus to the Allen High School.

### QA

The QA manager has to make sure that the actual transportation schedule is viewable on the application. He also has to make sure that the schedule is actually up to date because they sometimes change according to people who have classes at certain times.

# Feature 15

Change background colors (light/dark mode) 

### Functionality

Baiscally within your setting options you should be able to choose the background colors of the app to what is most aesthetically pleasing to you. You have your two baisc options Light mode and Dark mode, as well as a advadvanced option of a color wheel to make a background color of your preference. If you want to include a color code, there will be an option for that as well in whihc you can enter a color code into the search box option and have that as your background color. Once you've chosen your select color, there will be a save button which will save your background color for future revisits of the app. 
	For the secondary colors like the text, and other buttons on the app, it will automatically set as a contrast color in order to maxamize the ease of use. There also might be restrictions on which colors you are able to choose. For example, neon colors like a extremley bright yellow might be harmful for the vision of these viewers and therefore be banned. This will be used to personalize each users app, and make it more user interactive.  
	
### Design
For light mode: the background will be white while the text will be black to contrast for readability purposes. The opposite will happen for dark mode, the design inverted to work better in dark places and cause lesss eye strain. The colors of white and black will not be completely black as that causes undue strain on the eye, but varying shades of gray. There will be a moon in the top left corner while in light mode that will switch between the modes and transform in to a sun when in dark mode. The schedule to the side will not change significantly but the lists on the left will as there will be the most text on there. The pop-up quiz mentioned before will also change background and text colors as the modes shift. Readability will be our top priority.
	
The change in backgrounds offered by the color swatches will automatically change the text to a contrasting color that is visually pleasing. Colors that are not the background or the text will be changed to match in varying shades of the original color.

### QA
	
Some errors that might be included in this particular feature is colors not saving, certain colors give eyestrain and were not banned, colors will not change from default setting, contrast color not good for the current background color in use. Other issues might be not being able to get out of the settings window, and colors not matching with its description. Another issue might be colors do ot fill the entire page, or possibly colors used in a different background besides the main background available.
	Of course the best way to find these issues, will be through intenst testing, as well as some research on which colors might cause eyestrain, and problems for viewing. Another way to fix these issues is through the reporting through bug issues. Mostly these issues will probably be through HTML, and website coding. 

# Feature 16

Prerequisites of classes 

### Functionality

The user will be able to, upon clicking on the class, to see the required prerequisites or see it on the short description. There will also be an option after clicking the classes to be able to click on the prerequisite classes and see the description for the prerequisite. This process will continue until there are no prerequisites remaining. The class that comes after will also be mentioned and linked and if the class is part of a pathway, the pathway will be mentioned as well.
	Another option will include recommended or related classes. These classes are not required, for example principles of engineering with computere science, but are reccommended for specific career paths or further understanding. These classes will also be linkable and one can navigate to find these classes if they are interested to do so.

### Design

The prerequisites and other classes mentioned will all be underlined and in a cobalt blue, or yellow when in dark mode. Colors are still up for discussion for the designers of the app, however. Hovering over the prerequisites will show the link the class link will lead to in the alt text. The font will not change, however, for consistency reasons, as well will the size of the font. 
	The pages the link will lead to will just be the class descriptions on the side. When asking for a full list, the list will replace the "classes list" on the left. The background color will stay the same as well as the font and text colors in the rectangle.

### QA

The potential problems with implementing this feature is getting stuck on the tabs, and being unable to get out of said tab. Other issues can include lag, where it doesn't pull up the tabs that show prerequisite classes, this would be a major problem because it means that it is essentially show nothing, and the user cannot properly interact with the code. 
	Other issues is that class descriptions may not show up, or the tabs that do pop up may not be in the desired place they were originally intended for on the screen. The best way to prevent this is extensive testing, as well as large understanding and comprehension of HTML, because this would most likely be a feature for the website. 

# Feature 17

Auto make schedule (WITH OPTMOIZATION) or randomizer

### Functionality

After one selects classes that they will be taking next year, they will have the option to ramdomize a schedule to give them possible ideas for next year. These selections will be completely random except for the fact that the classes that have conflicts or must be for certain time slots will be locked. One will also have the option of "locking" classes so to keep them in that specific period while the randomizer randomizes the rest of the schedule. The auto schedule will shuffle with every click of a button and will give the student an idea of way their schedule for next year can be organized. There would also be an option of greying out zero period in case the student is not keen on an early start to their morning. 

The optimization feature will consider all the classes that have required periods or double blocked classes while shuffing the schedule. Every time the student locks a class into place, that period and class will not be considered again. The student will also have the option to consider alternate schedules that include their althernate classes. The alternate schedule options will operate on a filter-like system where the student must check the alternates they will be considering to be shuffled in and what it will replace. The option to save the current schedule when it is randomized will still be there as it is a filled out schedule.

### Design

The blank schedule on the right side will now be filled upon clicking the radomize button. The classes names will be a bit more faded compared to the period names and in regular text whilst the period name is bolded. Depending on the mode, light or dark, The text might change but it will only change if the background of the schedule will change. The classes inside the schedule will also link to the corresponding sides on the left and go to that page if the user clicks on it. When a class is locked in a time slot there will be a lock icon to the right of the period name, faded in color and only one color. 
	The greyed out zero period will be "faded" compared to the others. The button color will be in line with any color palette, dicussed in feature 15, to the descretion of the design team. The font will stay consistent, as always, as will the text size and type. The option to "filter" through the classes being randomized will operate through a checklist-like list where the classes not being used in the schedule will be greyed out or simple unchecked. The selected classes, however, will have a check through the box next to them. The check box will be white or stroke, and the check/x -- depending on how the checklist is formatted -- will either be green and red, or simply all black or all white.

### QA

Several issues that can come from using these feature, is that it gives faulty schedules, for example: classes overlap with each other, the class isn't avaliable in the selcted slot it was put in, duplicates of classes in the schedule, puts an alternate class instead of the first choice class. Other problems can be these classes not loading in the schedule area, as well as the classes being different from the classes previously selected. Because there is an alterante schedule option as well as first choice class, there is a potential chance that th program might confuse the alternate schdeule with the first choices schedule. We have also wanted to implement the "locking" option for classes. This could cause errors in locking and not being able to unlock it, or on the other end attempting to lock it and it won't lock it. 
	This can be noticed with bug filing, and extensive testing. Another way to fix these issues will probably be creating programs that check the schedules for a final time before we finally show the user their random schedule. This will probably be most interactive with the HTML, the apperance of the scheudle, and usage of the shell for coding the randomization of the code. THi means that the front and back end designers, as well as UX Designer would most likely be the most involved in this. 

# Feature 18

Bug filing system

### Functionality

If a user spots a bug while using the application, they can shake their device in order to file it and provide feedback. Shaking their device will take them to a Google form where they can file bugs. This method of bug-filing is already used by many other applications, so it is logical to implement it into ours.

### Design

When the user shakes their device, a message will pop-up on their device, asking them if they have found a bug and need to file it. If the user answers “Yes”, then they will be taken to the Google form having a section where they will have three pieces of information they can provide; the type of bug, specifics about the bug, and screenshots of the bug. 


### QA

We need to make sure that our app can detect motion in order to identify that the user has shook their device and that everyone can access the Google form. If the Google form somehow doesn not work, we could possibly use Github issues, the only problem being that people who want to file bugs will need a Github account and that many people may not know how to use the issues system.


# Feature 19

Feedback form

### Functionality
At the end of their session, the user will be given the option to answer a short feedback form, covering their experience with the application. It will consist of 3-5 questions asking them about how they felt about the app, how they felt using it, and what changes they would make to optimize their experience. If being compared to other scheduling applications, a 5-star rating system can be added as well.

### Design
At the end screen of the application, when the user has finished constructing their schedule, a feedback form button will be found near the bottom. This will open a pop-up or google forms tab that will allow the user to put in feedback for our team.Alternatively, we could have a mini-tab be inserted within the website so that it does not make it inconvenient for the user.

### QA
In order to assure the quality of this feature, it will have to consistently lead the user to the desired pop-up or tab to complete the short survey. If the pop-up/mini-tab option does not function properly, attaching a hyperlink to the “Feedback” button would be the easiest option to open the survey. Also, the feedback survey could ask the user for which functionality they prefer most, which can be taken into consideration for the next changes that would be made to the application.

# Feature 20

Notifications reminding the user of the arena scheduling date

### Functionality

### Design

### QA
