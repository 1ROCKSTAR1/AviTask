БАГ РЕПОРТЫ 2 ЗАДАНИЕ

**#ID: Items01**

#Название: Отсутствие изображения у иконки товара на главной странице

#Описание: У товара "Носок" отсутствует изображение на главной и собственной странице

#Шаги: 

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Найти объявление "Носок"

3.Перейти в объявление, кликнув по нему ЛКМ

#Ожидаемый результат: 

1.У товара "Носок" присутствует изображение на основной странице

2.У товара "Носок" присутствует изображение на собственной странице

#Фактический результат: 
У товара "Носок" отсутствуют изображения на соновной
и собственной страницах

#Серьезность: Minor

#Приоритет: Low

#Окружение: Win 10, Chrome 132.0.6834.160

///////////////////////////////////////////////////////////////////

**#ID: Sorting01**

#Название: Неправильная работа сортировки по цене на странице с товарами

#Описание: При включении сортировки по возрастанию и убыванию товары устанавливаются 
в неправильном порядке

#Шаги:

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Произвести сортировку по возрастанию/убыванию нажав на клавишу сортировки

#Ожидаемый результат:

Товары установились в правильном порядке возрастания/убывания

#Фактический результат:

Товары установились в неправильном порядке возрастания/убывания

#Серьезность: Major

#Приоритет: Medium

#Окружение: Win 10, Chrome 132.0.6834.160

///////////////////////////////////////////////////////////////////


**#ID: CreatingAdv01**

#Название: Поле "Цена" в модальном окне создания объявления принимает число 0.00

#Описание: При создании нового объявления поле "Цена" принимает значение 0.00

#Шаги:

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Перейти к созданию нового объявления нажав на кнопку "Создать" ЛКМ

3.Заполнить все поля валидными значениями кроме поля "Цена", введя 0.00

4.Нажать на кнопку "Сохранить"

#Ожидаемый результат:

Поле не принимает значение 0.00. Вывод предупреждения о неправильном заполнении поля

#Фактический результат:

Поле принимает значение 0.00. Процесс создания объявления завершается

#Серьезность: Major

#Приоритет: Medium

#Окружение: Win 10, Chrome 132.0.6834.160

///////////////////////////////////////////////////////////////////

**#ID: CreatingAdv02**

#Название: Поле "Цена" в модальном окне создания объявления принимает число -5.00

#Описание: При создании нового объявления поле "Цена" принимает значение -5.00

#Шаги:

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Перейти к созданию нового объявления нажав на кнопку "Создать" ЛКМ

3.Заполнить все поля валидными значениями кроме поля "Цена", введя -5.00

4.Нажать на кнопку "Сохранить"

#Ожидаемый результат:

Поле не принимает значение -5.00. Вывод предупреждения о неправильном заполнении поля

#Фактический результат:

Поле принимает значение -5.00. Процесс создания объявления завершается

#Серьезность: Major

#Приоритет: Medium

#Окружение: Win 10, Chrome 132.0.6834.160

///////////////////////////////////////////////////////////////////

**#ID: CreatingAdv03**

#Название: Поле "Ссылка на изображение" принимает значение ftp для протокола

#Описание: При создании нового объявления поле "Ссылка на изображение" принимает значение ftp для протокола

#Шаги:

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Перейти к созданию нового объявления нажав на кнопку "Создать" ЛКМ

3.Заполнить все поля валидными значениями кроме поля "Ссылка на изображение" введя 
туда ссылку с протоколом ftp

4.Нажать на кнопку "Сохранить"

#Ожидаемый результат:

Поле не принимает введенное значение. Вывод предупреждения о неправильном заполнении поля

#Фактический результат:

Поле принимает значение -5.00. Процесс создания объявления завершается

#Серьезность: Major

#Приоритет: Medium

#Окружение: Win 10, Chrome 132.0.6834.160

///////////////////////////////////////////////////////////////////

**#ID: CreatingAdv04**

#Название: Поле "Ссылка на изображение" принимает значение с пустым форматом

#Описание: При создании нового объявления поле "Ссылка на изображение" принимает значение с пустым форматом

#Шаги:

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Перейти к созданию нового объявления нажав на кнопку "Создать" ЛКМ

3.Заполнить все поля валидными значениями кроме поля "Ссылка на изображение" введя
туда ссылку https://example.com/image.

4.Нажать на кнопку "Сохранить"

#Ожидаемый результат:

Поле не принимает введенное значение. Вывод предупреждения о неправильном заполнении поля

#Фактический результат:

Поле принимает значение https://example.com/image. Процесс создания объявления завершается

#Серьезность: Major

#Приоритет: Medium

#Окружение: Win 10, Chrome 132.0.6834.160

///////////////////////////////////////////////////////////////////


**#ID: CreatingAdv05**

#Название: Поле "Ссылка на изображение" принимает значение без формата

#Описание: При создании нового объявления поле "Ссылка на изображение" принимает значение без формата

#Шаги:

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Перейти к созданию нового объявления нажав на кнопку "Создать" ЛКМ

3.Заполнить все поля валидными значениями кроме поля "Ссылка на изображение" введя
туда ссылку https://example.com/image

4.Нажать на кнопку "Сохранить"

#Ожидаемый результат:

Поле не принимает введенное значение. Вывод предупреждения о неправильном заполнении поля

#Фактический результат:

Поле принимает значение https://example.com/image Процесс создания объявления завершается

#Серьезность: Major

#Приоритет: Medium

#Окружение: Win 10, Chrome 132.0.6834.160

///////////////////////////////////////////////////////////////////


**#ID: CreatingAdv06**

#Название: Поле "Ссылка на изображение" принимает значение без протокола

#Описание: При создании нового объявления поле "Ссылка на изображение" принимает значение без протокола

#Шаги:

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Перейти к созданию нового объявления нажав на кнопку "Создать" ЛКМ

3.Заполнить все поля валидными значениями кроме поля "Ссылка на изображение" введя
туда ссылку example.com/image.jpg

4.Нажать на кнопку "Сохранить"

#Ожидаемый результат:

Поле цена не принимает введенное значение. Вывод предупреждения о неправильном заполнении поля

#Фактический результат:

Поле принимает значение example.com/image.jpg. Процесс создания объявления завершается

#Серьезность: Major

#Приоритет: Medium

#Окружение: Win 10, Chrome 132.0.6834.160

///////////////////////////////////////////////////////////////////


**#ID: CreatingAdv07**

#Название: Поле "Ссылка на изображение" принимает значение с форматом pdf

#Описание: При создании нового объявления поле "Ссылка на изображение" принимает значение с форматом pdf

#Шаги:

1.Перейти по адресу http://tech-avito-intern.jumpingcrab.com/

2.Перейти к созданию нового объявления нажав на кнопку "Создать" ЛКМ

3.Заполнить все поля валидными значениями кроме поля "Ссылка на изображение" введя
туда ссылку https://example.com/image.pdf

4.Нажать на кнопку "Сохранить"

#Ожидаемый результат:

Поле не принимает введенное значение. Вывод предупреждения о неправильном заполнении поля

#Фактический результат:

Поле цена принимает значение https://example.com/image.pdf. Процесс создания объявления завершается

#Серьезность: Major

#Приоритет: Medium

#Окружение: Win 10, Chrome 132.0.6834.160
