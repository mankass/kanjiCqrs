ALTER TABLE events
    ADD dtype VARCHAR(31);

UPDATE events
SET DTYPE = 'AbstractEvent'
WHERE DTYPE is null;

ALTER TABLE events
    ADD CONSTRAINT pk_events PRIMARY KEY (id);

DROP SEQUENCE word_sequence CASCADE;

ALTER TABLE events
ALTER
COLUMN aggregate_id TYPE VARCHAR(255) USING (aggregate_id::VARCHAR(255));

ALTER TABLE "word-and-stat"
    ALTER COLUMN correct_attempts SET NOT NULL;

ALTER TABLE events
    ALTER COLUMN creation_timestamp SET NOT NULL;

ALTER TABLE events
ALTER
COLUMN event_type TYPE VARCHAR(255) USING (event_type::VARCHAR(255));

ALTER TABLE events
    ALTER COLUMN event_type SET NOT NULL;

ALTER TABLE events
    ALTER COLUMN id SET NOT NULL;

CREATE SEQUENCE IF NOT EXISTS events_id_seq;
ALTER TABLE events
    ALTER COLUMN id SET NOT NULL;
ALTER TABLE events
    ALTER COLUMN id SET DEFAULT nextval('events_id_seq');

ALTER SEQUENCE events_id_seq OWNED BY events.id;

ALTER TABLE events
DROP
COLUMN payload;

ALTER TABLE events
    ADD payload JSONB;

ALTER TABLE "word-and-stat"
ALTER
COLUMN word_id TYPE VARCHAR(255) USING (word_id::VARCHAR(255));

ALTER TABLE "word-and-stat"
    ALTER COLUMN wrong_attempts SET NOT NULL;