package com.sergei.kotlincourse.lesson15.homework

fun main() {

//1. Событие: Вечеринка Создайте класс Party, который описывает вечеринку. У него должны быть свойства location
//(String) и attendees (Int). Добавьте метод details(), который выводит информацию о месте проведения и количестве гостей.

    val party = Party("Gran Canaria", 15)
    party.details()

//2. Аспект реальности: Эмоция Создайте класс Emotion, который представляет эмоцию. У него должно быть свойство type
//(String) и intensity (Int). Добавьте метод express(), который выводит описание эмоции в зависимости от её типа и интенсивности.

    val emotions = Emotion("веселье", 28)
    emotions.express()

//3. Природное явление: Луна Создайте объект Moon, который будет представлять Луну. Добавьте свойства isVisible (Boolean),
//чтобы отображать, видна ли Луна в данный момент, и phase (String), чтобы отображать текущую фазу Луны
//(например, "Full Moon", "New Moon"). Добавьте метод showPhase(), который выводит текущую фазу Луны.

    Moon.showPhase()

//4. Покупка: Продукт Создайте дата класс для продукта, который будет представлять продукт в магазине.
//У него должны быть свойства “название”, “цена”, “количество”.

    val fish = Produkt("карась", 150.00, 1)
    val dook = Produkt("колобок", 70.5, 5)

//5. Мероприятие: Концерт Создайте класс, который будет представлять концерт. У него должны быть свойства “группа”,
//“место проведения”, “стоимость”, “вместимость зала”. Также приватное поле “проданные билеты”. Добавьте метод,
//который выводит информацию о концерте и метод “купить билет”, который увеличивает количество проданных билетов на один.

val concert = Concert("Ногу свело", "театр", 1000.00, 100, 50)
    concert.infoConcert()
    concert.buyTicket()








}