#
Longest Valid Parentheses

##
Language Java

##Approach-
Used a
stack to
store indices.-
Initialized the
stack with-1
as a boundary.-
Pushed indices of'('.-On')',
popped the stack.-
If the
stack became empty,
pushed the
current index
as the new boundary.-Otherwise,
updated the
maximum valid
substring length.

##
Time Complexity

O(n)

## Space Complexity
O(n)
