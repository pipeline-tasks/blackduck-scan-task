package in.devstream.cicd.task;

import in.devstream.cicd.task.core.PipelineTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BlackduckScanTask extends PipelineTask {

    private ApplicationArguments input;

    public BlackduckScanTask(ApplicationArguments args) {
        this.input = args;
    }

    @Override
    public void execute() {
        log.info("Executing Blackduck scan task");
    }

    @Override
    public void onInit() {
        log.info("Initializing Blackduck Scan Task");
    }

    @Override
    public void onFinalize() {
        log.info("cleaning up resources...");
    }
}
