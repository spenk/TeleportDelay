import java.util.logging.Logger;


public class TeleportDelay extends Plugin{
	  String name = "TeleportDelay";
	  String version = "1.0";
	  String author = " spenk";
	  static Logger log = Logger.getLogger("Minecraft");
	  
	  
public void initialize(){
	TeleportDelayListener listener = new TeleportDelayListener();
log.info(this.name +" version "+ this.version + " by " +this.author+(" is initialized!"));
etc.getLoader().addListener(PluginLoader.Hook.COMMAND, listener, this, PluginListener.Priority.CRITICAL);
etc.getLoader().addListener(PluginLoader.Hook.PLAYER_MOVE, listener, this, PluginListener.Priority.CRITICAL);
}
public void enable(){
	log.info(this.name + " version " + this.version + " by " + this.author + " is enabled!");
}

public void disable(){
	log.info(this.name + " version " + this.version + " is disabled!");
}
}
