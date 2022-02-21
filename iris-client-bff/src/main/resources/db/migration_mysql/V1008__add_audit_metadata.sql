ALTER TABLE case_data_request ADD created_by binary(16) NULL;
ALTER TABLE case_data_request ADD last_modified_by binary(16) NULL;
ALTER TABLE case_data_request ADD FOREIGN KEY (created_by) REFERENCES user_accounts(user_id);
ALTER TABLE case_data_request ADD FOREIGN KEY (last_modified_by) REFERENCES user_accounts(user_id);

ALTER TABLE case_data_submission ADD created_by binary(16) NULL;
ALTER TABLE case_data_submission ADD last_modified_by binary(16) NULL;
ALTER TABLE case_data_submission ADD FOREIGN KEY (created_by) REFERENCES user_accounts(user_id);
ALTER TABLE case_data_submission ADD FOREIGN KEY (last_modified_by) REFERENCES user_accounts(user_id);

ALTER TABLE event_data_request ADD created_by binary(16) NULL;
ALTER TABLE event_data_request ADD last_modified_by binary(16) NULL;
ALTER TABLE event_data_request ADD FOREIGN KEY (created_by) REFERENCES user_accounts(user_id);
ALTER TABLE event_data_request ADD FOREIGN KEY (last_modified_by) REFERENCES user_accounts(user_id);

ALTER TABLE event_data_submission ADD created_by binary(16) NULL;
ALTER TABLE event_data_submission ADD last_modified_by binary(16) NULL;
ALTER TABLE event_data_submission ADD FOREIGN KEY (created_by) REFERENCES user_accounts(user_id);
ALTER TABLE event_data_submission ADD FOREIGN KEY (last_modified_by) REFERENCES user_accounts(user_id);

ALTER TABLE user_accounts ADD created DATETIME NULL;
ALTER TABLE user_accounts ADD created_by binary(16) NULL;
ALTER TABLE user_accounts ADD last_modified DATETIME NULL;
ALTER TABLE user_accounts ADD last_modified_by binary(16) NULL;
ALTER TABLE user_accounts ADD FOREIGN KEY (created_by) REFERENCES user_accounts(user_id);
ALTER TABLE user_accounts ADD FOREIGN KEY (last_modified_by) REFERENCES user_accounts(user_id);
