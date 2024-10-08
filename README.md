# Проект по автоматизации тестирования для компании [Альфабанк](https://alfabank.ru/) <img alt="Jenkins" height="25" src="images/icons/alfabank.png" width="20"/>

> Альфа-Банк — крупнейший частный банк в России, занимающий четвёртое место по размеру активов. Этот проект посвящен автоматизации тестирования веб-приложения Альфа-Банка с использованием современных инструментов и технологий. Основные цели включают проверку функциональности сайта, генерацию подробных отчетов и интеграцию с CI/CD.


## **Содержание:**

* <a href="#tools">Технологии и инструменты</a>

* <a href="#cases">Тестовые сценарии</a>

* <a href="#jenkins">Сборка в Jenkins</a>

* <a href="#console">Запуск из терминала</a>

* <a href="#allure">Allure отчет</a>

* <a href="#telegram">Уведомление ботом в Telegram о сборке</a>

* <a href="#video">Видео выполнения теста в Selenoid</a>

* <a href="#testops">Интеграция с Allure TestOps</a>

* <a href="#jira">Интеграция с Jira</a>


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
<a href="https://github.com/allure-framework/allure2"><img src="images/icons/Allure.svg" width="50" height="50"  alt="Allure"/></a> 
<a href="https://qameta.io/"><img src="images/icons/AllureTestOps.svg" width="40" height="40"  alt="Allure TestOps"/></a> 
<a href="https://www.jenkins.io/"><img src="images/icons/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a> 
<a href="https://web.telegram.org/"><img src="images/icons/Telegram.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.atlassian.com/ru/software/jira/"><img src="images/icons/jira.svg" width="50" height="50"  alt="Jira"/></a>  

</p>

- **IntelliJ IDEA**: Среда разработки для написания кода.
- **Java**: Основной язык программирования проекта.
- **GitHub**: Платформа для хостинга и совместной разработки кода.
- **JUnit 5**: Фреймворк для написания и выполнения тестов.
- **Gradle**: Система сборки проектов.
- **Selenide**: Библиотека для написания UI тестов.
- **Selenoid**: Инструмент для управления браузерами в контейнерах.
- **Allure**: Фреймворк для генерации отчетов о тестировании.
- **Jenkins**: Инструмент для автоматизации сборки и CI/CD.
- **Telegram**: Мессенджер для уведомлений о сборке проекта.
- **Jira**: Платформа для управления проектами и отслеживания задач.
- **Allure TestOps**: Платформа для управления тестированием и анализа результатов тестов.


<a id="cases"></a>
## <a name="Тестовые сценарии">**Тестовые сценарии:**</a>

-  Проверка поисковика на сайте
-  Проверка открытия формы заполнения заявки на кредитную карту
-  Проверка редиректа на страницу АльфаОнлайн
-  Проверка загрузки страницы Андроид приложения
-  Проверка входа в АльфаОнлайн с некорректными данными



<a id="jenkins"></a>
## <img alt="Jenkins" height="25" src="images/icons/Jenkins.svg" width="25"/></a><a name="Сборка"></a>Сборка в [Jenkins](https://jenkins.autotests.cloud/job/Kod3ik_qa_guru_x5/)</a>
Jenkins используется для автоматизации сборки и тестирования проекта. Он позволяет любому члену команды запускать тесты в любое время.
<p align="center">  
<a href="https://jenkins.autotests.cloud/job/C28-twentyny-alfabank-ui/"><img src="images/screenshots/jenkins-build.png" alt="Jenkins" width="950"/></a>  
</p>


### **Параметры сборки в Jenkins:**

- browser – браузер, по умолчанию chrome
- browserVersion – версия браузера, по умолчанию 122
- browserSize – размер окна браузера, по умолчанию 1920x1080
- remoteUrl – логин, пароль и адрес удаленного сервера Selenoid

<a id="console"></a>
## Команды для запуска из терминала

***Локальный запуск:***
```bash  
gradle clean regression -DbrowserSize="1920х1080" -Dbrowser="chrome" -DbrowserVersion="122"

```

***Удаленный запуск в Jenkins:***
```bash  
clean
"${TESTS}"
"-DremoteUrl=${REMOTE_URL}"
"-Dbrowser=${BROWSER}"
"-DbrowserVersion=${BROWSER_VERSION}"
"-DwindowSize=${WINDOW_SIZE}"
```

<a id="allure"></a>
## <img alt="Allure" height="25" src="images/icons/Allure.svg" width="25"/></a> <a name="Allure"></a>Allure [отчет](https://jenkins.autotests.cloud/job/C28-twentyny-alfabank-ui/allure/)</a>

Allure используется для генерации подробных отчетов о тестировании. Он предоставляет информацию о результатах тестов, включая графики и диаграммы, что помогает анализировать качество продукта и выявлять проблемные области.
### Главная страница

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/allure-base.png" width="850">  
</p>

### Пример теста

  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/allure-case.png" width="850">
</p>

### Графики

  <p align="center">  
<img title="Allure Graphics" src="images/screenshots/allure-graphs.png" width="850">
</p>


<a id="telegram"></a>
## <img alt="Allure" height="25" src="images/icons/Telegram.svg" width="25"/></a> Уведомление ботом в Telegram о сборке
Настроены уведомления в Telegram для получения информации о статусе сборки и тестирования.

<p align="center">  
<img title="Allure Overview Dashboard" src="images/screenshots/telegram.png" width="550">  
</p>


<a id="video"></a>
## <img alt="Selenoid" height="25" src="images/icons/Selenoid.svg" width="25"/></a> Видеозаписи выполнения тестов в Selenoid 
Помогают визуально проверять, как проходят тесты и выявлять проблемы.

<p align="center">
<img title="Selenoid Video" src="images/video/selenoid.gif" width="550" height="350"  alt="video">   
</p>

<a id="testops"></a>
## <img alt="Allure TestOps" height="25" src="images/icons/AllureTestOps.svg" width="25"/></a> Интеграция с [Allure TestOps](https://allure.autotests.cloud/project/4356/test-cases?treeId=0)
Allure TestOps — это платформа для централизованного управления тестами, автоматизации тестирования и анализа результатов. Она поддерживает различные CI/CD инструменты и тестовые фреймворки, предоставляя подробные отчеты и аналитику.

### Allure TestOps Dashboard

<p align="center">  
<img title="Manual cases" src="images/screenshots/dashboard.png" width="850">  
</p>

### Ручные кейсы

<p align="center">  
<img title="Manual cases" src="images/screenshots/testops-manual.png" width="850">  
</p>

<a id="jira"></a>
## <img alt="Jira" height="25" src="images/icons/jira.svg" width="25"/></a> Интеграция с [Jira](https://jira.autotests.cloud/browse/HOMEWORK-1311)
Jira — это инструмент для управления проектами и задачами, который помогает командам планировать, отслеживать и выпускать ПО. Интеграция с Jira позволяет централизованно управлять задачами, автоматизировать процессы и улучшать командное взаимодействие, поддерживая методологии Agile и Scrum и предоставляя мощные функции отчетности и анализа.

<p align="center">  
<img title="Manual cases" src="images/screenshots/jira-task.png" width="850">  
</p>