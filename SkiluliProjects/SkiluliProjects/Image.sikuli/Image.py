img1 = 'C:\\Venky\\JDP\\actual.png'
#img2 = 'C:\\Venky\\JDP\\expected.png'
#img3="1422878852920.png"
img2='C:\Users\Venkatesh.Aarelly\Downloads\Sikuli\1422953958931.png'
#img2 = 'C:\\Venky\\JDP\\expected-test-screens\\2.png'
f = Finder(img1)
f.find(img2) # searches and stores the matches in the Finder object f
if f.hasNext(): # is None if nothing found
    print("Both Images are Similar...!")
else:
    print("Both Images are not Similar....!")
f.destroy()