img1 = 'C:\\Users\\Venkatesh.Aarelly\\Downloads\\Mobile\\1.png'
img2 = 'C:\\Users\\Venkatesh.Aarelly\\Downloads\\Mobile\\0.png'
f = Finder(img1)
f.find(img2) # searches and stores the matches in the Finder object f
if f.hasNext(): # is None if nothing found
    print("Both Images are Similar...!")
else:
    print("Both Images are not Similar....!")
