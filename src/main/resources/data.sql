-- ADDRESS
insert into address(name, city, state) values ('65-30 Kissena Blvd.', 'Queens', 'NY');

-- LOCATION
insert into location (id, active, city, name, state) values (1, true, 'Reston', 'Reston HQ', 'Virginia');

insert into building (id, active, address_id, name) values (1, true, 1, 'Tech Incubator at Queens College');

insert into room (id, active, building_id, room_name) values (1, true, 1, 'Room 304');

-- SKILLS

insert into skill(id, name, active) values (1, 'Java', true);

-- FOCUS

insert into focus(name) values ('PCF');
insert into focus_skill(focus_id, skill_id) values (1, 1);

-- CURRICULUM

insert into curriculum(name, active, core) values ('Core Java', true, true);
insert into curriculum(name, active, core) values ('SQL', true, true);

insert into curriculum_focus(cid, fid) values (1, 1);
insert into curriculum_focus(cid, fid) values (2, 1);

insert into curriculum_skill(curriculum_id, skill_id) values (1, 1);
insert into curriculum_skill(curriculum_id, skill_id) values (2, 1);

-- TRAINER

INSERT INTO TRAINER(FIRST_NAME, LAST_NAME, TIER, address_id) VALUES('Patrick', 'Walsh', 'ROLE_VP', 1);
INSERT INTO TRAINER(FIRST_NAME, LAST_NAME, TIER, address_id) VALUES('Dan', 'Pickles', 'ROLE_VP', 1);

-- TRAINER/SKILL

insert into skill_trainer(skill_id, trainer_id) values (1, 1);
insert into skill_trainer(skill_id, trainer_id) values (1, 2);

-- BATCH STATUS

insert into batch_status(name) values ('In Progress');

-- BATCH LOCATION
insert into batch_location(location_id, location_name, building_id, building_name, room_id, room_name) values (1, 'Reston', 1, 'Reston main', 1, 'Room 304');

-- BATCHES
insert into batch(name, start_date, end_date, curriculum_id, focus_id, trainer_id, co_trainer_id, address_id, building_id) values ('1805_Feb_Java', now(), now(), 1, 1, 1, 2, 1, 1);

-- UNAVAILABLES
insert into unavailable(trainer_id, start_date, end_date) values (1, now(), now());
insert into unavailable(trainer_id, start_date, end_date) values (2, now(), now());
insert into unavailable(room_id, start_date, end_date) values (1, now(), now());

-- ASSIGNFORCE SETTINGS
insert into assignforce_settings(alias, trainers_per_page, report_grads, batch_length, report_incoming_grads, min_batch_size, max_batch_size, trainer_break_days, room_id, building_id, default_name_pattern) values (null, 0, 0, 0, 0, 0, 0, 0, 1, 1, null);

COMMIT;