Todd and Gina’s Dog Door, version 2.0
What the Door Does

1. Fido barks to be let out.										N/A
2. Todd or Gina hears Fido barking.									N/A
3. Todd or Gina presses the button on the remote control.			2
4. The dog door opens.												2
5. Fido goes outside.												1
6. Fido does his business.											N/A
	6.1 The door shuts automatically.								3
	6.2 Fido barks to be let back inside.							N/A
	6.3 Todd or Gina hears Fido barking (again).					N/A
	6.4 Todd or Gina presses the button on the remote control.		2
	6.5 The dog door opens (again).									2
7. Fido goes back inside.											1
8. The door shuts automatically.									3


-- This above is a "Use case". Some information about a use-case:

The best way to get good requirements is to understand what a system is supposed to do, and a use case helps us exactly in that. It helps us plan for things going wrong.

E.g.;
From the step-1 of the use case: Does Fido always bark when he needs to go outside? What if he just scratches at the door?
From the step-2 of the use case: What if Todd and Gina aren't home? What if they don't hear Fido barking?
From the step-3 of the use case: What if Fido barks because he's excited, or hungry? Will it be a problem if Todd and Gina open the door and Fido doesn't need to go outside?
From the step-4 of the use case: Do we need to think about what happens if the door jams? Or maybe that's more of a hardware problem?
From the step-5 of the use case: What if Fido stays inside?
From the step-6 of the use case: What happens if the door has automatically closed by the time Fido is finished?


A use case is what people call the steps that a system takes to make something happen.

A use case describes WHAT your system DOES to accomplish a PARTICULAR CUSTOMER GOAL.

1. Every use case must have a clear value to the system. If the use case doesn't help the customer achieve their goal, then the use case isn't of much use.
2. Every use case must have a definite starting and stopping point. Something must begin the process, and then there must be a condition that indicates that the process is complete.
3. Every use case is started off by an external initiator, outside of the system. Sometimes that initiator is a person, but it could be anything outside of the system.


You need to look over the use case and see if everything the system needs to do is covered by the requirements.


Your job is to identify the requirement that handles each step of the use case and write that requirement’s number down in the blank next to that step of the use case. If a step in the use case doesn’t require you to do anything, just write N/A down, for "not applicable". I have already written the requirement number in the use case.

Our requirements cover everything the system needs to do. We’re ready to actually write code to handle these requirements now.

-- NOW READ THE CODE DIFF --