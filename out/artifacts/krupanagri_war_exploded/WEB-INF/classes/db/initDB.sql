DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS bisi;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS global_seq;



CREATE TABLE users
(
  id               INTEGER               AUTO_INCREMENT,
  name             VARCHAR(50)                 NOT NULL,
  email            VARCHAR(50)                 NOT NULL,
  password         VARCHAR(100)                 NOT NULL,
  registered       TIMESTAMP DEFAULT now() NOT NULL,
  enabled          BOOL DEFAULT TRUE       NOT NULL,
  PRIMARY KEY (id)

);
CREATE UNIQUE INDEX users_unique_email_idx ON users (email);

CREATE TABLE user_roles
(
  user_id INTEGER NOT NULL,
  role    VARCHAR(50),
  CONSTRAINT user_roles_idx UNIQUE (user_id, role),
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE bisi (
  id          INTEGER   AUTO_INCREMENT,
  user_id     INTEGER   NOT NULL,
  date_time   TIMESTAMP NOT NULL,
  description TEXT      NOT NULL,
  price       INTEGER   NOT NULL ,
  FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
  PRIMARY KEY (id)
);
CREATE UNIQUE INDEX meals_unique_user_datetime_idx
  ON bisi (user_id, date_time);



