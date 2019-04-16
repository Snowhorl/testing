# Автоматизированное тестирование
Учебное задание по тестированию Web-приложения (калькулятор НДС)
***
Создавалось с помощью инструмента Katalon Recorder, установленного на Firefox
Для тестирования приложения использовался сайт по расчету НДС https://ndscalc.ru/

Проверка НДС калькулятора.html - это тест-сьют для импорта в  Katalon Recorder


Первый тест-кейс "1_Значения по умолчанию и расчет"

>ПРОВЕРКА: Значения по умолчанию (установлен чек-бокс "выделить НДС" и  "20"). 
>Выделяем НДС(20%) от 100, контролируем вывод данных таблицу

Сумма|	Операция	| Ставка НДС, %	| НДС	| Сумма без НДС
-----|------------|---------------|-----|--------------
100  |	выделить 	|20 	          |16.67| 	83.33


Второй тест-кейс "2_Ввод символов в поля ввода чисел"

>ПРОВЕРКА: Ввод некорректных значений приводит к нулевым результатам.

Третий тест-кейс "3_Начислить НДС"

>ПРОВЕРКА: Начислить НДС(20%) к 100, контролируем вывод данных в таблицу

Сумма|	Операция	| Ставка НДС, %	| НДС	| Сумма без НДС
-----|------------|---------------|-----|--------------
100  |	начислить	|20 	          |20   | 	120


Четвертый тест-кейс "4_18% выбирается и вычисляется"

>ПРОВЕРКА: Работает "Установить 18%". Начисляется НДС(18%) к 100, контролируем вывод данных в таблицу

Сумма|	Операция	| Ставка НДС, %	| НДС	| Сумма без НДС
-----|------------|---------------|-----|--------------
100  |	выделить	|18	            |15.25| 	84.75


