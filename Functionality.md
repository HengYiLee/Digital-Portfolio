# Feature 1
Map which shows the location of selected classes

### Functionality

For each class that gets selected, the map will be updated with the room number of the class, which then puts the locations on the map. As classes are selected, the map will create paths between the classes, which can be helpful for when school actually starts. These paths will change as the ammount OR order of the classes change. Also, a piece of text which has been modified to show a chronological list of the halls of the classes will be made. For example, suppose the locations of the classes shown are as follows: F123, G213, G321, A543. Then, a piece of text along the lines of "1st: F hall, 2nd: G hall, 3rd: G hall, 4th: A hall" will be made.

### Design
Tab titled "Map", which has a location of all the room numbers + classes taught in those rooms. After selecting classes, it will show the room number of said class, and the location of the room relative to the building. Classes which are chosen are highlighted. Also draws a path between the classes based on the order of the schedule. There will be a key near the map, which shows a correlation between class periods and a color. For example, "1st - 2nd period: Red", and a line showing those the path between those 2 classes will be made in that color. This will be in a sperate tabe than the area where classes are actually selected, so that the screen doesnt look cluttered. There will also be an option to expand or shrink the map.

### QA


# Feature 2

### Functionality
Survey system that recommends classes to students based on their interests/career path. ,,,

### Design

### QA


# Feature 3

### Functionality

The number of available seats is displayed for a class (not teacher specific).

### Design

### QA


# Feature 4

 The program will tell you what classes you need for graduation, and complete your selected endrosment

### Functionality

First off, when you open the app for the first time there will appear a questionaire asking you about your previously completed class requirements. These questions include: what grade you're in (9, 10, 11, 12), how many math classes have you taken (0,1,2,3,4+),how many english classes have you taken (0,1,2,3,4+), how many science classes have you taken (0,1,2,3,4+), how many history classes have you taken (0,1,2,3,4+), how many language classes have you taken (0, 1, or 2+), how many PE classes have you taken (0, 1+), how many fine arts have you taken (0, 1+), how many electives have you taken (0,1,2,3,4,5,6+). After filling out the questionaire, there will be another pop-up screen telling them the requirements they have left. This is of course can be otional, and there will be a skip button atb the bottom of the pop, incase they would rather not know their requirements or only need the arena scheduling to see how their schedules will fit. This questionaire will help students realize if they need to choose different classes. For exampel they could be a senior realizing they need another language class in order to graduate. 

	
### Design

The design will consist of a rectangular pop-up when one first opens up the app. The option to skip will be on the bottom right corner in a different colored button. It will be an off-white background, unless it is in dark mode in which it will be midnight grey, and the text will be a contrast color for readability purposes. Utilizing cookies, the pop-up will not appear in the user's second or future visits. There will be a progress bar at the top or bottom to mark how far one is in completing the quiz. The progress bar color will be grey when uncomplete while the bar filling up will be eagle blue. The questions will come one after another, instead of a long scrolling view, and will be strictly multiple choice questions. The questions will fade in on each other instead of just being replaces for aethetic purposes, or will be slid on screen depending on the choice given to the Ui/Ux designers.

### QA

To assure the quality of this function, we must make sure that the questionaire and the pop-up it is on will be easy to use and free of bugs. Possible problems that could occur include... Not saving answers, locking them out, not letting them take the quiz, buttons not clicking, not being able to exit the quiz. These are all examples of potential bugs when making this feature. The best way to resolve each of these issues is by making an issue report section where kids can report issues. There will also be a lot of testing before adding this function to the main design. The most devestating issue with this function will probably be the unability to exit the quiz b/c that means there is no way to be able to progress and use the app for what it was ORIGINALLY intended for. 

# Feature 5

### Functionality

The popularity or percentage of students scheduled in a class should be displayed so that students can quickly choose the more popular courses.

### Design


### QA


# Feature 6

Shows GPA scale of the class

### Functionality
Whan classes are picked, there will be an option to view details of individual classes, and all the classes picked. it will recieve data of the GPA scaling of said class or classes. For example: If the chosen class is Computer Science II, it will recieve data to show that the class has a gpa on a 4.5 scale. After picking multiple classes, It will show the maximum GPA which is possible with those classes. There will also be options to change the class level, so it is more convinient for the user. If all classes required are not picked, there will be a warning saying that that this number may change as classes change or get added.

### Design
When classes are picked, there will be an option which is titled "More Information" which has general information. In this tab, there will be a long bar which ranged from 0.0 to 5.0, which is the range from 0 to the maximum GPA's for the classes. If it is on the option which shows gpa for a specific class, it will highlight from 0 - the maximum GPA for that class. For example: Suppose you are viewing the GPA scale of a class worth 4.5. Everything below the 4.5 mark would be one color, and everything above the 4.5 mark would be grey. If the option to show the maximum gpa possible is selected, it will average the maximum GPA's of all of the chosen classes, and everything below that point would be hightlighted a certain color and everything above that point would be grey.

### QA


# Feature 7

Warns about incapability to schedule classes together

### Functionality
When classes are picked, there will be a process to check if some classes interfere with others due to issues such as transportation or timing of the classes. For example, if the chosen class is Computer Science II, the process will check whether or not the previous and class after would interfere with the time of the chosen class. 

### Design
When classes are picked, there will be a notification which will be titled "Error" which is highlighted in red. This notification will contain the conflicting classes and possible alterations to the schedule which would allow for the same classes to be chosen, but with a different time period so that all the classes are able to fit in the schedule.

### QA


# Feature 8

Lunch's need to be shown (with the location)

### Functionality
When classes are picked, there will be a letter on the class chosen which is a letter of either "A", "B", "C", or "D". These letters will symbolize the lunch period for that class, and will be done for A-Days and B-Days due to different classes being scheduled on those days. The map of the school will also be shown with the location of the cafeteria being highlighted in red along with the classroom during that period being highlighted with the most efficient path being drawn by a dotted line in between the two locations.

### Design
When classes are picked, there will be an option which is titled "More Information" which has general information. In this tab, there would be text which would say the lunch you would have ("A", "B", "C", "D") and on which day that lunch period would be (A-Day, B-Day). For example, if I have IB History of the Americas during third period, then in the "More Information" tab I could find the lunch which that day has which is an A-Day.
 
### QA


# Feature 9

Course summary

### Functionality

### Design

### QA


# Feature 10

Rate my teacher system

### Functionality

### Design

### QA


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

The schedule does not corrupt which allows the schedule to not be saved.

# Feature 13

Share option with yourself or friends

### Functionality

### Design

### QA


# Feature 14

Show Transportation Schedule

### Functionality

### Design

### QA


# Feature 15

Change background colors (light/DARK VADER mode) 

### Functionality

Baiscally within your setting options you should be able to choose the background colors of the app to what is most aesthetically pleasing to you. You have your two baisc options Light mode and Dark mode, as well as a advadvanced option of a color wheel to make a background color of your preference. If you want to include a color code, there will be an option for that as well in whihc you can enter a color code into the search box option and have that as your background color. Once you've chosen your select color, there will be a save button which will save your background color for future revisits of the app. 
	For the secondary colors like the text, and other buttons on the app, it will automatically set as a contrast color in order to maxamize the ease of use. There also might be restrictions on which colors you are able to choose. For example, neon colors like a extremley bright yellow might be harmful for the vision of these viewers and therefore be banned. This will be used to personalize each users app, and make it more user interactive.  
	
### Design

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

Auto make scehdule (WITH OPTMOIZATION) or randomizer

### Functionality

### Design

### QA

# Feature 18

Bug filing system

### Functionality

### Design

### QA

# Feature 19

Feedback form

### Functionality

### Design

### QA

# Feature 20

Gives you 50 eagle engagement points

### Functionality

### Design

### QA
