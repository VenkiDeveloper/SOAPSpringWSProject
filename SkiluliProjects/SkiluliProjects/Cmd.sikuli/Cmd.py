App.open('C:\Windows\System32\cmd.exe')
popup("command prompt is opened")
if exists("1422443854987.png"):type("1422446154338.png", "cd\\"+Key.ENTER)
wait(3)
type("cls"+Key.ENTER)
wait(2)
if exists("1422446641604.png"):type("1422446515378.png","cd Venky"+Key.ENTER)
#wait(2)
#assert exists("1422958495310.png")

#wait(2)
if exists("1422957740441.png"):
    type("hello1"+Key.ENTER)
    wait(3)
    assert exists("1422956633799.png")
elif exists("1422959530543.png"):
    type("hello"+Key.ENTER)
    assert exists("1422957025452.png")

       






    
            




            




    
