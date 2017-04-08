#!/bin/bash
for (( i = 1; i <= 9; i++ )) ### Outer for loop ###
do
   for (( j = 1 ; j <= 9; j++ )) ### Inner for loop ###
   do
        tot=`expr $i + $j` ###adding both variables i and j
        tmp=`expr $tot % 2` ###Even number condition 
        if [ $tmp -eq 0 ]; then
            echo -e -n "\033[47m "
#-e -n are escapse \33 is format spacing and [46m represents colour coding
  
      else
            echo -e -n "\033[40m "
        fi
  done
 echo -e -n "\033[40m" #### set back background colour to black
 echo "" #### print the new line ###
done
