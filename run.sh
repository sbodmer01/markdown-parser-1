ELSE='more'
SOMETHING="something $ELSE"

echo $SOMETHING

colors=(red green blue)
colors[1]=yellow
echo ${colors[2]}

counter=1
while [ $counter -le 4 ] 
do
    echo $counter
    ((counter++))
done
