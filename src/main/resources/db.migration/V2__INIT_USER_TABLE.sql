create sequence if not exists test.user_seq start 1 increment 1;
CREATE TABLE IF NOT EXISTS test.t_user (
    user_id int8 NOT NULL DEFAULT nextval('test.user_seq'::regclass),
    login_name varchar(255),
    last_login_time timestamptz NULL,
    status varchar(30) NOT NULL,
    last_modified_by varchar(255) NOT NULL,
    last_modified_date timestamptz NOT NULL,
    is_deleted bool NOT NULL DEFAULT false,
    CONSTRAINT user_pkey PRIMARY KEY (user_id)
);
