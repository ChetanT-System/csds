--

BEGIN;

SET client_encoding = 'LATIN1';

-- public.users definition

-- Drop table

-- DROP TABLE public.users;

CREATE TABLE public.users (
	id int8 NOT NULL,
	access_token varchar(255) NULL,
	email varchar(255) NULL,
	full_name varchar(255) NULL,
	"password" varchar(255) NULL,
	user_name varchar(255) NULL,
	CONSTRAINT users_pkey PRIMARY KEY (id)
);

-- Auto-generated SQL script #202111151427
INSERT INTO public.users (id,email,full_name,"password",user_name)
	VALUES (1,'sachin.argade@t-systems.com','Sachin Argade','$2a$10$BNd8DYbKtTEtvuR.xlDo0.HjY2EMlqL5R10LpU9F9cPKOiH6yFpY6','admin');

