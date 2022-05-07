

create table appusers(
    username varchar_ignorecase(50) not null primary key,
    password varchar_ignorecase(50) not null,
    enabled boolean not null
);

create table appauthorities (
    username varchar_ignorecase(50) not null,
    authority varchar_ignorecase(50) not null,
    constraint appfk_authorities_users foreign key(username) references users(username)
);
create unique index appix_auth_username on authorities (username,authority);

