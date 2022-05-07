INSERT into appusers(username,password,enabled) values ('user','pass',true);

INSERT into appusers(username,password,enabled) values ('admin','pass',true);

INSERT into appauthorities (username,authority) values ('user','ROLE_USER');

INSERT into appauthorities (username,authority) values ('user','ROLE_ADMIN');