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
# Category 3

## Pros:

## Cons:


Strategy we'll use (placeholder)

Reasoning:
