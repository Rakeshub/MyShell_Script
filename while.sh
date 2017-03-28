
#!/bin/bash
inter="hey"
while [ "$inter"!="bye" ] 
do 
echo "Type bye to exit"
read inter
echo "you typed:$inter"
done

: 'Multi Line comments
INPUT_STRING=hello
while [ "$INPUT_STRING" != "bye" ]
do
  echo "Please type something in (bye to quit)"
  read INPUT_STRING
  echo "You typed: $INPUT_STRING"
*/
':
