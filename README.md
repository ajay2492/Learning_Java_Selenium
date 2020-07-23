# Learning_Java_Selenium

Questions - What do you mean by static wait and dynamic wait?
Answer - Dynamic Wait - Assume we provided the dynamic wait for a element is 30 sec.
But the element is got visible in 5 sec then rest of the 25 will be ignored.
e.g - driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

Static Wait - If we given the wait as 20 sec then over script will waith till 20 sec it will not care about the element is
visible in how many sec.
e.g. Thread.sleep(3000).