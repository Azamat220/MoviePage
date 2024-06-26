# Проект "Movie"

Проект "Movie" позволяет пользователям выбирать фильмы на выбор и давать им оценку, подобно функционалу сайта kinogo.com.

## Установка

1. Убедитесь, что у вас установлены Java 17 и Maven.
2. Скачайте проект из репозитория Git.
3. Откройте терминал или командную строку и перейдите в директорию проекта.
4. Запустите сборку проекта с помощью команды:
5. Запустите приложение с помощью команды:

mvn spring-boot:run

## Использование

1. После запуска приложения откройте браузер и перейдите по адресу: http://localhost:8080.
2. Выбирайте фильмы на ваш выбор и оценивайте их.

## Зависимости

- Spring Boot 3.1.0
- Spring Boot Starter Data JPA
- H2 Database
- MapStruct 1.4.2.Final
- Lombok 1.18.30
- Lombok MapStruct Binding 0.2.0
- Springdoc OpenAPI UI 1.7.0
- Hibernate Validator
- Spring Boot Starter Web
- Spring Boot Starter Test
- Spring Boot Starter Actuator

## Сущности

### Film

`Film` - это сущность, представляющая информацию о фильме.

Поля:

- `id`: Уникальный идентификатор фильма.
- `name`: Название фильма.
- `description`: Описание фильма.
- `releaseDate`: Дата выпуска фильма.
- `duration`: Продолжительность фильма (в минутах).
- `user`: Пользователь, который добавил фильм.
- `genres`: Список жанров фильма.

### Genre

`Genre` - это сущность, представляющая информацию о жанре фильма.

Поля:

- `id`: Уникальный идентификатор жанра.
- `name`: Название жанра.

### User

`User` - это сущность, представляющая информацию о пользователе приложения.

Поля:

- `id`: Уникальный идентификатор пользователя.
- `name`: Имя пользователя.
- `email`: Адрес электронной почты пользователя.
- `login`: Логин пользователя.
- `birthday`: Дата рождения пользователя.

## Сервисы

### FilmService

`FilmService` - это интерфейс, который определяет основные операции для работы с фильмами.

Методы:

- `FilmResponse create(FilmRequest filmRequest)`: Создает новый фильм на основе переданных данных.
- `FilmResponse update(Long id, FilmRequest filmRequest)`: Обновляет данные существующего фильма по его идентификатору.
- `FilmResponse get(Long id)`: Получает информацию о фильме по его идентификатору.
- `List<FilmResponse> getAll(Long id)`: Получает список всех фильмов.
- `void delete(Long id)`: Удаляет фильм по его идентификатору.

### GenreService

`GenreService` - это интерфейс, который определяет основные операции для работы с жанрами фильмов.

Методы:

- `Genre get(Long id)`: Получает информацию о жанре по его идентификатору.
- `List<Genre> getAll()`: Получает список всех доступных жанров.

### UserService

`UserService` - это интерфейс, который определяет основные операции для работы с пользователями.

Методы:

- `UserResponseDTO create(UserRequestDTO userRequestDTO)`: Создает нового пользователя на основе переданных данных.
- `UserResponseDTO update(Long id, UserRequestDTO userRequestDTO)`: Обновляет данные существующего пользователя по его идентификатору.
- `UserResponseDTO get(Long id)`: Получает информацию о пользователе по его идентификатору.
- `List<UserResponseDTO> getAll()`: Получает список всех пользователей.

## Контроллеры

### FilmController

`FilmController` - это контроллер, который обрабатывает запросы, связанные с фильмами.

Методы:

- `createFilm`: POST-запрос для создания нового фильма.
- `updateFilm`: PUT-запрос для обновления информации о фильме по его идентификатору.
- `getFilms`: GET-запрос для получения списка всех фильмов пользователя.
- `getFilm`: GET-запрос для получения информации о конкретном фильме по его идентификатору.
- `delete`: DELETE-запрос для удаления фильма по его идентификатору.

### GenreController

`GenreController` - это контроллер, который обрабатывает запросы, связанные с жанрами фильмов.

Методы:

- `getGenre`: GET-запрос
User
допиши
ChatGPT
для получения информации о жанре по его идентификатору.

getGenres: GET-запрос для получения списка всех доступных жанров.
UserController
UserController - это контроллер, который обрабатывает запросы, связанные с пользователями.

Методы:

createUser: POST-запрос для создания нового пользователя.
updateUser: PUT-запрос для обновления информации о пользователе по его идентификатору.
getUserById: GET-запрос для получения информации о конкретном пользователе по его идентификатору.
getAllUsers: GET-запрос для получения списка всех пользователей.


### UserController

`UserController` - это контроллер, который обрабатывает запросы, связанные с пользователями.

Методы:

- `createUser`: POST-запрос для создания нового пользователя.
- `updateUser`: PUT-запрос для обновления информации о пользователе по его идентификатору.
- `getUserById`: GET-запрос для получения информации о конкретном пользователе по его идентификатору.
- `getAllUsers`: GET-запрос для получения списка всех пользователей.
