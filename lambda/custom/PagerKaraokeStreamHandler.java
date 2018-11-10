import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import handlers.CancelAndStopIntentHandler;
import handlers.DeviceIntentHandler;
import handlers.GenericExceptionHandler;
import handlers.HelpIntentHandler;
import handlers.KaraokeIntentHandler;
import handlers.LaunchRequestHandler;
import handlers.PagerIntentHandler;
import handlers.SessionEndedRequestHandler;

public class PagerKaraokeStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new DeviceIntentHandler(),
                        new KaraokeIntentHandler(),
                        new PagerIntentHandler(),
                        new CancelAndStopIntentHandler(),
                        new LaunchRequestHandler(),
                        new HelpIntentHandler(),
                        new SessionEndedRequestHandler()
                        )
                .addExceptionHandler(new GenericExceptionHandler())
                .build();
    }

    public PagerKaraokeStreamHandler() {
        super(getSkill());
    }
}