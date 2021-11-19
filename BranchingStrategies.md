# GitFlow

## Description: 
Long lived branches and large commits. A developer will only merge the feature branch into the main branch once the feature has been finished. Main splits off into a development branch, which is further branched into specific features. Those features are eventually merged into the dev branch. The Dev branch is forked to create a release branch, where only housekeeping (bug fixes, documentation etc.) is done. Once that stage of developmentis finished, the release is merged into main and tagged with the version (the release branch should be merged into the develop branch and killed at this point).

## Pros:
* It is easier to develop the particular features you want. 
* although not mentioned, hotfixes are generally very convinient with this system
  * this point is moot as we probably do not actually have a reason to worry too much about hotfixes
* it makes parallel development on several features at a time convinient
* is "safe"
  * due to how the branches are split apart, the worse that can happen is a merge of a feature branch into a dev branch causing issues in the dev branch

## Cons:
* hardish to manage
* slightly overkill
  * I've heard this opinion and am not 100% sure of it's validity, but the main/dev split is redundent and the features could be branched from the main
* easy to make mistakes
  * somewhat confusing which branch should be pushed to
  * dependent on proper tagging
  * building wrong branch


# Trunk Based Dev
Single large long lived branch, named the trunk where all the developerscommit into it. Release branches are not commited to or merged.

## Pros:
* avoids merge hell
* practical and simple
* works really well for smaller teams
 * _supposedly_ you can alter it to work for bigger teams by altering the repo to work off of a pull-request system

## Cons:
* the simplistic nature of the strategy makes the usuage of more advanced git functionalities necessary
  * feature flags, branch by abstraction, employment of a build server
* commit history can get messy and impractical
* merge hell can still occur 
* Unlike gitflow, there is no way to actually test builds and do housekeeping on the repo itself, hence the need for a build server. 


# Task Branching(Feature Branching Strategy)
Using this strategy makes the branching for specific features or tasks easier. This allows developers to create branches for each task, which can be refered to as "user stories". Also, this allows developers to more easily fix bugs, because of the high level of organization this method allows.

## Pros:
* Allows developers to work independently, giving freedom to experiment and access specific material.
  * Although it allows for more independent work, it is still requested that you collaborate and communicate as progress is made to avoid conflicts later on.
* Offers high levels of organization. This can help with segmentation, meaning that different parts of the team can update various parts of the project at the same time.
  * Another factor which helps with independent work and organization. Can be helpful when finding the root cause of bugs or progress which may have caused unintended changes.
* Can help prevent conflicts by integrating changes (commiting and pushing) and recieving changes (pulling and merging) frequently

## Cons:
* Can be difficult to merge after some time of not being updated
  * Can use a plan to periodically merge to avoid this
  * This issue becomes prevalent because of un-involved progress
* Adds responsability to some members of group to manage and organize the branching method.



# Finalized Branching Strategy

(slightly altered) Trunk Based

## Reason for the selection

This system is pretty optimal for smaller teams who work on features seperatly. Due to how multifaseted this project is I imagine a lot of time will be spent merging if we go with the alternate systems. Shorter lived branches work fine and inertly we will have to use a build server. 

# Rules

## Adding Features (Includes requesting features for API)
* Communicate with other group members.
  * Communication with Development Manager is important for this rule because they are in charge of communicating with CS3 Groups. Without this communication, we will have un-organization and confusion within group members.
* Request for features which were finalized ONLY.
  * If a feature that we decided not to implement gets added, it will cause problems with UI design and deadlines which we set. Accuracy of requests we make to our CS3 API group is important.
* When creating a new feature, write it into your own local branches, if you expect to work on it with several people, create a fork of the main branch (expect it to be deleted soon). 
* When the feature is complete and ready to be put into release. Create a pull request or merge request, this step is done just to keep organized and minimize possible points where mistakes can be made.

## Resolving Bugs
* Communicate with group members.
  * Communication with the front end, back end, and QA engineer is important, along with communication with the QA Manager. This is important to make sure you are fixing something that is actually meant to be fixed, and make sure that there wont be future complications due to additions.
* File GitHub Issues if you find a bug.
  * This will help the QA Engineer and QA Manager stay organized throughout their progress on the bugs. It will also be accessible for the CS3 group to see our progress on bugs.
* similarly, write it into your local branch and create a pull request or merge request. 
* If this project grows in scale beyond what I think, create a temporary bug fix branch before merging into the main branch
  * this is borrowed from the GitFlow work flow

## Managing Releases
* Communicate with other group members.
  * Communicate with all group members, especially the Release manager. This is important because in order to change parts of the realease, the release manager mush be consulted to make sure everything is working correctly, and that there is enough time to make changes. If we have faulty releases, it can mess up functionality with the API and future progression.
* Before making releases, we should make sure the functionalities which we have implemented are working correctly.
  * User experience is an important part of the creation of the app, and in order to ensure that it is a good experience, we need to make sure that there arent any bugs which would drasitically decrease that aspect of our project.
* utilize flags and tags based on a set and standard convention
 * when we begin to write the code, we'll have a better idea of what that convention is
