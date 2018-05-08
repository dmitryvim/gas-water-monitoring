package com.mikhaylovich.gwmonitoring.application;

import com.mikhaylovich.gwmonitoring.domain.model.*;

import java.util.List;

/**
 * @author dmitry.mikhailovich@gmail.com
 */
public class RecordApplicationService {

    private final RecordRepository recordRepository;

    public RecordApplicationService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    // TODO add test
    public void createRecord(CreateRecordCommand command) {
        Record record = new Record(
                new Gas(command.getGas()),
                new Water(command.getColdWater()),
                new Water(command.getHotWater()),
                new User(command.getUserId())
        );
        Record prevRecord = this.recordRepository.findLastRecordByUserId(command.getUserId());
        if (record.allCountersNotLessThan(prevRecord)) {
            this.recordRepository.save(record);
        } else {
            //TODO add message
            // TODO add test
            throw new IllegalStateException();
        }
    }

    public List<Record> records(int userId) {
        // TODO
        return this.recordRepository.findByUserId(userId);
    }

}
