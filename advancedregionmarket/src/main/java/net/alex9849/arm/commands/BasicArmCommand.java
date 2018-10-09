package net.alex9849.arm.commands;

import net.alex9849.arm.exceptions.InputException;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public abstract class BasicArmCommand {

    public abstract boolean matchesRegex(String command);

    public abstract String getRootCommand();

    public abstract String getUsage();

    public abstract boolean runCommand(CommandSender sender, Command cmd, String commandsLabel, String[] args) throws InputException;

    public abstract List<String> onTabComplete(Player player, String args[]);
}