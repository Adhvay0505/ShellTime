#!/bin/bash

Red=$'\e[1;91m'
Bold=$'\e[1m'

while true
do
	clear
	echo "${Bold}$Red$"
	java -cp /home/adhvay/IdeaProjects/java_practice/out/production/java_practice time #add the path to the directory containing the java file 	
	sleep 1 
done 
