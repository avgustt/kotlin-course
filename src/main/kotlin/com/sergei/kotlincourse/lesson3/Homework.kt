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

private val suppliersContact: String = "555-555-555 bla@bla.com"

//Текущее состояние хакатона (статус):

var status: String = "не начат"

//Список спонсоров:

val sponsors: String = "333-333-333 dud@dud.com"

//Бюджет мероприятия?

var budget: Int = 900

//Текущий уровень доступа к интернету:

var internetOn: Int = 5

//Информация о транспортировке оборудования, распределении ресурсов и
// координации между различными командами поддержки:

val instruction: String = "Оборудование доставить" +
        "ресурсы использовать" +
        "команды координировать" +
        "грустного обнять"

//Количество команд:

var quantityTeam: Int = 3

//Перечень задач:

var tasksList: String = "1. Спланировать" +
        "2. Согласовать" +
        "3. Провести" +
        "4. Предоставить отчет"

//План эвакуации:

val evacuationPlan: String = "см. план эвакуации на стене. Свободу Дурову!"

//Список доступного оборудования:

val equipmentList: String = "Компьютер, микрофон, колонка"

//Список свободного оборудования:

var equipmentFree: String = "Компьютер, микрофон, колонка"

//График питания участников (зависит от поставщика питания, определяемого за неделю до начала)

val lazyMealSchedule: String by lazy {
    ""
}

//План мероприятий на случай сбоев:

var emergency: String = "Увеличить бюджет"

//Список экспертов и жюри:

var juryList: String = "Первый, Второй"

//Методы и процедуры для сбора отзывов от участников и гостей, включая анонимные опросы и интервью.

private val lazyFeedbackCheck: String by lazy {
    "анонимные вопросы + интервью"
}

//Политика конфиденциальности:

var privacyPolicy: String = "Здесь прописана политика конфиденциальности"

//Приватные отзывы (фидбэк) участников и зрителей для анализа проблем:

private val lazyFeedback: String by lazy {
    "Приватные отзывы"
}

//Текущая температура в помещении:

var temperatureIndoor: Int = 25

//Мониторинг и анализ производительности сетевого оборудования и интернет-соединения:
//творческий подход
var monitoringNetwork: String = ""
    get() = field
    set(value) {
        if (value == "Все работает") field = "Норм"
        else field = "ой"
    }

//Уровень освещения:

var lumensLevl: Int = 1100

//Лог событий мероприятия

private var log: String = "bla, bla, bka"

//Доступность медицинской помощи:

var ambulance: Double? = null

//Планы и процедуры для обеспечения безопасности мероприятия,
// включая планы эвакуации и протоколы чрезвычайных ситуаций:

private var safety: String = "Бежать при пожаре" + evacuationPlan

//Регистрационный номер мероприятия:

val nomber: Int = 777

//Максимально допустимый уровень шума в помещении хакатона:

val dicebellMax: Int = 55

//Индикатор превышения уровня шума в помещениях:
//?хочется указать else строкой?
//бул
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

var projectOne: String = "Работать"

var projectTwo: String = "Работать"

var projectThree: String = "Работать"

var informationAboutProjects: String = projectOne + projectTwo + projectThree

//Статус получения всех необходимых разрешений:

var permissions: Boolean = true

//Указывает, открыт ли доступ к эксклюзивным ресурсам (например, специальному оборудованию):

var freeAccess: Boolean = false

//Список партнеров мероприятия:

val partnerList: String = "Партнер-1: т. 444-44-44, Партнер-2: т. 333-33-33 , Партнер-3: т. 222-22-22"

//Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия:

lateinit var awardeesList: String

//План распределения призов:

val planPrize: String = "1 - активное участие, 2 - частичное участие, 3 - продержались не уснув"

//Контактная информация экстренных служб, медицинского персонала и других важных служб, недоступная участникам:

val emergencyСontacts: String = "пожарные - 01, полиция - 02, вытрезвитель - 03"

//Особые условия для участников с ограниченными возможностями:

val SpecialFeatures: String = "обеспечить пандус и работу лифтов"

//Общее настроение участников (определяется опросами):

lateinit var moodFroze: String
//val mood: String by lazy { "" }

//Подробный план хакатона, включающий время и содержание каждого сегмента,
// инициализируется непосредственно перед началом мероприятия.

lateinit var hackathonPlan: String

//Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия:

lateinit var secretGuest: String

//Максимальное количество людей, которое может вместить место проведения:

val guestsMaximum: Int = 50

//Стандартное количество часов, отведенное каждой команде для работы над проектом:

var timeProjectOne: Int = 10

var timeProjectTwo: Int = 11

var timeProjectThree: Int = 12