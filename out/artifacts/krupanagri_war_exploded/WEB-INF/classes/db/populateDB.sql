DELETE FROM user_roles;
DELETE FROM bisi;
DELETE FROM users;


INSERT INTO users (name, email, password) VALUES
  ('User', 'user@yandex.ru', '{noop}password'),
  ('Admin', 'admin@gmail.com', '{noop}admin');

/*INSERT INTO user_roles (role, user_id) VALUES
  ('ROLE_USER', 10),
  ('ROLE_ADMIN', 11),*/


/*INSERT INTO bisi (date_time, description, calories, user_id)
VALUES ('2015-05-30 10:00:00', 'Завтрак', 500, 100000),
       ('2015-05-30 13:00:00', 'Обед', 1000, 100000),
       ('2015-05-30 20:00:00', 'Ужин', 500, 100000),
       ('2015-05-31 10:00:00', 'Завтрак', 500, 100000),
       ('2015-05-31 13:00:00', 'Обед', 1000, 100000),
       ('2015-05-31 20:00:00', 'Ужин', 510, 100000),
       ('2015-06-01 14:00:00', 'Админ ланч', 510, 100001),
       ('2015-06-01 21:00:00', 'Админ ужин', 1500, 100001);
*/

