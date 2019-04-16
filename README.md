# Автоматизированное тестирование
Учебное задание по тестированию Web-приложения (калькулятор НДС)
----
Создавалось с помощью инструмента Katalon Recorder, установленного на Firefox
Для тестирования приложения использовался сайт по расчету НДС https://ndscalc.ru/

1 Default values.java

>ПРОВЕРКА: Значения по умолчанию (установлен чек-бокс "выделить НДС" и  "20"). 
>Выделяем НДС от 100, контролируем вывод данных таблицу

Сумма|	Операция	| Ставка НДС, %	| НДС	| Сумма без НДС
-----|------------|---------------|-----|--------------
100  |	выделить 	|20 	          |16.67| 	83.33


2 Imput not correct values.java

>ПРОВЕРКА: Ввод некорректных значений приводит к нулевым результатам.

3 Input correct values for add NDS.java

>ПРОВЕРКА: Начислить НДС к 100, контролируем вывод данных в таблицу

Сумма|	Операция	| Ставка НДС, %	| НДС	| Сумма без НДС
-----|------------|---------------|-----|--------------
100  |	начислить	|20 	          |20   | 	120


Katalon Recorder 3.7.0.htm - это тест-сьют для импорта в  Katalon Recorder



