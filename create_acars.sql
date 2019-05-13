use planes ;
create table planes.acars
(
    date_time_stamp timestamp,
	date_dd_mm_yyyy varchar(100),
	time_est varchar(100),
	flight varchar(10),
	n_number varchar(10),
	blk_id varchar(10),
	msg_label varchar(10),
	text_label varchar(100),
	msg_text varchar(255),
	id int(20) not null auto_increment primary key
) ;
create index flight_index on planes.acars (flight) ;
create index n_number_index on planes.acars (n_number) ;
