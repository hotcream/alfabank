
# Проект по автоматизации тестирования для компании [Альфабанк](https://alfabank.ru/)

> Альфа-банк — крупнейший частный банк в России, занимающий четвёртое место по размеру активов

## **Содержание:**
____
Тестовые сценарии
* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Тестовые сценарии</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#telegram">Уведомление в Telegram при помощи бота</a>

* <a href="#video">Примеры видео выполнения тестов на Selenoid</a>
____
<a id="tools"></a>
## <a name="Технологии и инструменты">**Технологии и инструменты:**</a>

<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/icons/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/icons/java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/icons/GitHub.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/icons/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/icons/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/icons/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/icons/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="ht[images](images)tps://github.com/allure-framework/allure2"><img src="images/icons/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://www.jenkins.io/"><img src="images/icons/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>  
</p>

____
<a id="cases"></a>
## <a name="Тестовые сценарии">**Тестовые сценарии:**</a>
____
-  Проверка поисковика на сайте
-  Проверка открытия формы заполнения заявки на кредитную карту
-  Проверка редиректа на страницу АльфаОнлайн
-  Проверка загрузки страницы Андроид приложения
-  Проверка входа в АльфаОнлайн с некорректными данными


____
<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/icons/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_x5/)</a>
____
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_x5/"><img src="images/screenshots/jenkins-build.png" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- browser – браузер, по умолчанию chrome
- browserVersion – версия браузера, по умолчанию 122
- browserSize – размер окна браузера, по умолчанию 1920x1080
- remoteUrl – логин, пароль и адрес удаленного сервера Selenoid
- type – тип тестов, по умолчанию regression

<a id="console"></a>
## Команды для запуска из терминала
___
***Локальный запуск:***
```bash  
gradle clean test -Dselenoid_url="selenoid.autotests.cloud/wd/hub" -Dbrowser_size="1920х1080" -Dbrowser="chrome" -Dbrowser_version="100.0" 
-Dtype="regression"
```

***Удаленный запуск в Jenkins:***
```bash  
clean
test
-Dtype=${TESTS}
"-DremoteUrl=https://user1:1234@${REMOTE_URL}/wd/hub"
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-DwindowSize=${WINDOW_SIZE}"
```
___
<a id="allure"></a>
## <img alt="Allure" height="25" src="images/icons/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/C28-twentyny-alfabank-ui/allure/)</a>
___

### *Главная страница Allure*

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/allure-base.png" width="850">  
</p>

### *Пример теста*

  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/allure-case.png" width="850">
</p>

### *Графики*

  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/allure-graphs.png" width="850">
</p>


____
<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/icons/Telegram.svg" width="25"/></a> Уведомление ботом в Telegram о сборке
____
<p align="center">  
<img title="Allure Overview Dashboard" src="images/screen/telegram.png" width="550">  
</p>

____
<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/icons/Selenoid.svg" width="25"/></a> Примеры видео выполнения тестов на Selenoid
____
<p align="center">
<img title="Selenoid Video" src="images/video/selenoid.gif" width="550" height="350"  alt="video">   
</p>

