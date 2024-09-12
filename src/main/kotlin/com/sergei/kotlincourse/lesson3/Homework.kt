package com.sergei.kotlincourse.lesson3

val name: String = "Alice"

var age: Int = 30
  
const val PI = 3.14

lateinit var userInfo: String

val lazyValue: String by lazy {
    "Hello"
}

var speed: Double? = null

var count: Int = 0
    get() = field
    set(value) {
        if (value >= 0) field = value
        else field = 100
    }

fun countUp() {
    count = -1
}

//Название мероприятия:

val eventName: String = "Exhibition"

//Дата проведения:

const val exebitionDate: String = "29.09.2024"

//Место проведения:

lateinit var place: String

//Подробный бюджет мероприятия, включая расходы на оборудование,
// кейтеринг и другие операционные расходы:

var totalCost: Int = 900

var equipmentCost: Int = 400

var cateringCost: Int = 300

var otherCost: Int = 200

//Количество участников:

var quantityHuman: Int = 30

//Длительность хакатона:

var hackathonTime: Int = 2

//Контактная информация и условия соглашений с поставщиками пищи,
// оборудования и других услуг:

val suppliersContact: String = "555-555-555 bla@bla.com"

//Текущее состояние хакатона (статус):

var status: String = "On process"

//Список спонсоров:

val sponsors: String = "333-333-333 dud@dud.com"

//Бюджет мероприятия?

var budget: Int = 900

//Текущий уровень доступа к интернету:

var internetOn: Boolean = true

//Информация о транспортировке оборудования, распределении ресурсов и
// координации между различными командами поддержки:

val instruction: String = "Оборудование доставить" +
        "ресурсы использовать" +
        "команды координировать" +
        "грустного обнять"

//Количество команд:

var quantityTeam: Int = 5

//Перечень задач:

var tasksList: String = "1. Спланировать" +
        "2. Согласовать" +
        "3. Провести" +
        "4. Предоставить отчет"

//План эвакуации:

const val evacuationPlan: String = "см. план эвакуации на стене. Свободу Дурову!"

//Список доступного оборудования:

var equipmentList: String = "Компьютер, микрофон, колонка"

//Список свободного оборудования:

var equipmentFree: String = "Компьютер"

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

var mealSchedule: String = ""
    get() = field
    set(value) {
        if (value == "Horns") field = "10:00"
        if (value == "Hooves") field = "11:00"
    }

//План мероприятий на случай сбоев:

var emergency: String = "Увеличить бюджет"

//Список экспертов и жюри:

var juryList: String = "Первый, Второй"

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

var feedbackCheck: String = "анонимные опросы, интервью"

//Политика конфиденциальности:

var privacyPolicy: Boolean = true

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем:

lateinit var feedback: String

//Текущая температура в помещении:

var temperatureIndoor: Int = 25

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения:

var monitoringNetwork: String = ""
    get() = field
    set(value) {
        if (value == "Все работает") field = "Норм"
        else field = "ой"
    }

//Уровень освещения:

var lumensLevl: Int = 1100

//Лог событий мероприятия

var log: String = "bla, bla, bka"

//Доступность медицинской помощи:

var ambulance: Double? = null

//Планы и процедуры для обеспечения безопасности мероприятия,
// включая планы эвакуации и протоколы чрезвычайных ситуаций:
// ?МОЖНО ЛИ ПЛЮСОВАТЬ ПЕРЕМЕННЫЕ?

var safety: String = "Бежать при пожаре" + evacuationPlan

//Регистрационный номер мероприятия:

val nomber: Int = 777

//Максимально допустимый уровень шума в помещении хакатона:

val dicebellMax: Int = 55

//Индикатор превышения уровня шума в помещениях:
//?хочется указать else строкой?

var dicebell: Int = 0
    get() = field
    set(value) {
        if (value <= dicebellMax) field = value
        else field = 10000
    }

//Формат мероприятия (зависит от геополитической обстановки):

var exhibitionFormat: String = ""
    get() = field
    set(value) {
        if (value == "Дрон в небе") field = "Выставка отменяется"
        else field = "Дорогие участники, ждем вас в воскресенье 09:00"
    }

//Количество свободных мест для отдыха (например, кресел или диванов),
// сеттер валидирует, чтобы количество не было меньше нуля.
//?ну допустим их меньше, а делать то что?

var availableSeats: Int = 0
    get() = field
    set(value) {
        if (value < 0) field = 0
        else field = 0
    }

//План взаимодействия с прессой:

val interactionsPress: String = "Без комментариев"

//Детальная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода
// и сбор статистики прогона автоматизированных проверок:

var projectOne: String = "ок"

var projectTwo: String = "ок"

var projectThree: String = "ок"

var informationAboutProjects: String = projectOne + projectTwo + projectThree

