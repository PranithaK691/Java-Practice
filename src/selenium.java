//public class selenium {
//    public static void main(String args[]){
//        System.setProperty("webdriver. chrome.driver","link of the driver exicuitable file");
//        Webdriver driver = new ChromeDriver();
//        driver.get("url");
//        driver.manage().widow().maximize()/minimize();
//        driver.navigate().to("url");
//        driver.navigate().back();   driver.navigate().forward();  driver.navigate().refresh();
//
//        Dimentional d = new Dimentional(200,300);
//        driver.manage(). window().setSize(d);
//
//        Point p = new Point();
//        driver.manage().window().setPosition(p);
//
//        driver.findElemnt(By.id(i2)).sendKeys("hai");
//        driver.findElement(By.name("n2")).click();
//        driver.findElement(By.classNmame("C2"));
//        driver.findElement(By.linkText("Google")).click();
//        7. cssSelector - Here we can identify any element by giving both
//        tag and attribute
//        • Syntax: tagName[AtributeName='AttributeValue']
//        • Example: a[href='https://www.google.com']
//
//         Xpath by unique attribute:
//        div[@id='siv']
//
//        Case 2: xpath by text() function
//        div[text() = 'images']
//
//        Case 3: xpath by multiple attributes
//        div[@id='ghshdg' or/and @type = 'hgvhd']
//
//        Case 4: xpath by contains() function
//        tagName[contains(@attrName,'AttrValue')]
//        tagname[contains(@id,'hn')]


            //Getting address of Multiple elements
//          List<WebElement> allLinks = driver.findElements(By.tagName("a"));
            //Count Number of elements
//          //System.out.println("Total Links: "+allLinks.size());
//
//            Syntax: driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
//
//            driver.manage().timeOuts().implicitlyWait(20, TimeUnit.SECONDS);
//
//
//                    WebElement ddAddr = driver.findElement(By.id("novotel"));
//                    Select sel=new Select(ddAddr);//Address of Dropdown
//                    List<WebElement> allOptions = sel.getOptions();
//        System.out.println("Total Options in DD: "+allOptions.size());

            // for(int i=0;i<allOptions.size();i++)
            // {
            // System.out.println(allOptions.get(i).getText());
            // sel.selectByIndex(i);
            // }
 ;
       w javasciptExecutor j = (JavascriptExecutor)driver;
       j.executrscript("window.scrollBy"+loc)");
or
      j.executrscript("window.scrollBy(200,300));

        TakeScreenshot ts = (TakeScreenshot)driver;
       file src = ts.getScreeshotAs(OutputType.FILE);
       File dest = new File(p"path");
       File.copy(src, dest);
       )






//    }
//}
