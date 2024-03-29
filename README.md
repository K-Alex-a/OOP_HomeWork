## Описание домашних заданий:
Под каждый урок заведена своя папка, в которой будет размещаться итоговый проект.
<br><br>

Формат сдачи:<br> - Ссылка на github проект <br> - Подписать фамилию и номер группы

----

### Задания:
**1. Lesson_01:** ([решение](https://github.com/K-Alex-a/OOP_HomeWork/tree/4ec9276670b71bc5a45e485fe66d0bc2f9b24844/src/main/java/lesson_01))
 - Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад -> калории) и включить в список продуктов в вендинг машину.
 - Продемонстрировать работу класса по продаже товаров (как мы это делали на семинаре)
<br>

**2. Lesson_02:**  ([решение](https://github.com/K-Alex-a/OOP_HomeWork/tree/7e35e49470c79dcea1c902aaf981c30b29ae6e6c/src/main/java/lesson_02))
 - Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды, а кот пытается покушать 15-20).
 - Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать (хватило еды), сытость = true. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 - Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 - Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
<br>

**3. Lesson_03:**  ([решение](https://github.com/K-Alex-a/OOP_HomeWork/tree/e5ef50a7c3cb14e769d6c8ad9dc3840ff5b64b1a/src/main/java/lesson_03))

Доработать приложение, которое мы разрабатывали на уроке. Мы должны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.
- Доработать класс Freelancer, при желании можно разработать и свой собственный тип сотрудника. Формула расчета среднемесячной заработной платы может быть такова: «среднемесячная заработная плата = 20.8 * 8 * почасовая ставка»
- Переработать метод generateEmployees, метод должен создавать случайного сотрудника (Worker, Freelancer или любого другого). Метод должен быть один!
- Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту? Тогда добавьте соответствующее состояние на уровне ваших классов).
- Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
<br>

**4. Lesson_04:**  ([решение](https://github.com/K-Alex-a/OOP_HomeWork/tree/483ae524b35f0fafda656422caab4bc82f4ab551/src/main/java/lesson_04))

- Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
- Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
- Для хранения фруктов внутри коробки можно использовать ArrayList;
- Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
- Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
- Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
- Не забываем про метод добавления фрукта в коробку.
<br>

**5. Lesson_05:**   ([решение](https://github.com/K-Alex-a/OOP_HomeWork/tree/35500c43d631bba261f9b800655c9d143364c2a6/src/main/java/lesson_05))

- Доработайте систему бронирования столиков. Метод changeReservationTable должен ЗАРАБОТАТЬ!
<br>

**6. Lesson_06:**   ([решение](https://github.com/K-Alex-a/OOP_HomeWork/tree/f661c3a188afe59dc5102097a584435bee959a9d/src/main/java/lesson_06))

- Переработать приложение с учетом принципа SPR
<br>

**7. Lesson_07:**  ([решение]())

Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
- добавить новый тип соискателя.
- Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
- Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum), учитывать тип вакансии при отправке предложения соискателю.


