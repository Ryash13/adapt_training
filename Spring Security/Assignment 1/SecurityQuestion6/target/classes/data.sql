INSERT INTO users (username , password , enabled)
values ('user123' , 'user123' , 'true');

INSERT INTO users (username , password , enabled)
values ('admin123' , 'admin123' , 'true');

INSERT INTO authorities (username , authority)
values ('user123' , 'ROLE_USER');

INSERT INTO authorities (username , authority)
values ('admin123' , 'ROLE_ADMIN');