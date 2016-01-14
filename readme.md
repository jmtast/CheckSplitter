##Check Splitter

This repository shows the code I've used for my app **Check Splitter**. The idea of this work is to show what I know about Android development so far, and to help me learn as much as I can. I'll keep this a solo effort, so everything (good or bad) is all me.

The app itself is something as simple as I could think about. It does not interact with external API's (or with the Internet at all, I'll keep that for another more advanced app in the (hopefully near) future). It just works with simple custom activities and Android elements, while trying to be kept as pretty as a developer can (I'm certainly no UX/UI expert, and I'm no trying to be one).

###What's this app about?

*Check Splitter* is an app that lets you avoid all the hassle that comes with going out to eat with a group of people (friends, family, you name it).

Everybody orders a lot of things and everyone is too lazy to remember and pay for what they order, so you order what you want and then you split the check evenly. This includes adding the corresponding tip when the check arrives, so this app wants to help you with all the hassle.

The *first version* lets you add a total (the sum of every individual order), a desired tip amount (in amount of money or percentage of the total), quantity of diners and **that's it**. You press the calculate button and you are presented with the amount each one of the group has to pay.

On a future version I intend to add a detailed view of the order, so that you can add while you order and don't have to wait for the check to come to calculate how much each of you have to pay. This is not very useful within the app, but will let me learn a bit more about some other Android specifics.

###Current desired features
[ ] Check creation
[ ] Add quantity of diners
[ ] Add tip specifics (percentage or amount)
[ ] Show amount to pay per diner with and without tip
[ ] Just one check at a time
[ ] The check is persisted until a new one is created


###Future features
[ ] Ability to persist different checks (to compare prices of the same place in different moments, maybe?)
[ ] Add individual order to check
