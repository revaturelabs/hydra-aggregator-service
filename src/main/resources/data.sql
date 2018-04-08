-- ADDRESS
Insert into ADDRESS (ADDRESS_ID,STREET,CITY,STATE,ZIPCODE,COMPANY,ACTIVE) values (1,'65-30 Kissena Blvd, CEP Hall 2','Queens','NY','11367','Tech Incubator at Queens College',true);

insert into location (id, active, city, name, state) values (1, true, 'Reston', 'Reston HQ', 'Virginia');

insert into building (id, active, location, name) values (1, true, 1, 'Reston main');

insert into room (id, active, building_id, room_name) values (1, true, 1, 'Room 304');

-- SKILLS

insert into skill(id, name, active) values (1, 'Java', true);

-- CURRICULUM

insert into curriculum(name, active, core) values ('Core Java', true, true);
insert into curriculum(name, active, core) values ('SQL', true, true);
insert into curriculum_skill(curriculum_id, skill_id) values (1, 1);
insert into curriculum_skill(curriculum_id, skill_id) values (2, 1);


-- TRAINER

INSERT INTO TRAINER(FIRST_NAME, LAST_NAME, TIER) VALUES('Patrick', 'Walsh', 'ROLE_VP');
INSERT INTO TRAINER(FIRST_NAME, LAST_NAME, TIER) VALUES('Dan', 'Pickles', 'ROLE_VP');

-- TRAINER/SKILL

insert into skill_trainer(skill_id, trainer_id) values (1, 1);
insert into skill_trainer(skill_id, trainer_id) values (1, 2);

-- BATCH STATUS

insert into batch_status(name) values ('In Progress');

-- BATCH LOCATION
insert into batch_location(location_id, location_name, building_id, building_name, room_id, room_name) values (1, 'Reston', 1, 'Reston main', 1, 'Room 304');

-- BATCHES
insert into batch(start_date, end_date, curriculum_id, focus_id, trainer_id, co_trainer_id, batch_status_id, batch_location_id) values (now(), now(), 1, 2, 1, 2, 1, 1);

-- UNAVAILABLES
insert into unavailable(trainer_id, start_date, end_date) values (1, now(), now());
insert into unavailable(trainer_id, start_date, end_date) values (2, now(), now());
insert into unavailable(room_id, start_date, end_date) values (1, now(), now());

COMMIT;