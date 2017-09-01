
create table facebook_token(
	id Serial not null primary key,
	version INTEGER,
	date_created timestamp,
	date_updated TIMESTAMP,
	token varchar(100)
)