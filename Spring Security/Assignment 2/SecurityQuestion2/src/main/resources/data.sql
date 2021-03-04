INSERT INTO users (username , password , enabled)
values ('user123' , '$2a$10$17C1JZoYzkxTFcb9ad0rZOeks7yxIzAMSnMRyBRtG2P4GmMumZ4Tm' , 'true');

INSERT INTO users (username , password , enabled)
values ('admin123' , '$2a$10$h3qumxsPRDxFh704s4GxOOfnuKQO5RTgTjanSVDXcHxJKMAoM6glS' , 'true');

INSERT INTO authorities (username , authority)
values ('user123' , 'ROLE_USER');

INSERT INTO authorities (username , authority)
values ('admin123' , 'ROLE_ADMIN');