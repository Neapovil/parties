package com.github.nearata.parties.util;

import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Team;

import com.github.nearata.parties.Parties;

public final class Util
{
    private static final Parties plugin = Parties.getInstance();

    public static Set<String> getMembers(Player player, boolean excludeSelf)
    {
        if (getParty(player).isEmpty())
        {
            return Collections.emptySet();
        }

        return getParty(player).get()
                .getEntries()
                .stream()
                .filter(s -> !s.startsWith("leader-"))
                .filter(s -> !s.startsWith("mod-"))
                .filter(s -> {
                    if (!excludeSelf)
                    {
                        return true;
                    }

                    return !s.startsWith(player.getName());
                })
                .collect(Collectors.toSet());
    }

    public static Set<Player> getOnlineMembers(Player player, boolean excludeSelf)
    {
        if (getParty(player).isEmpty())
        {
            return Collections.emptySet();
        }

        return getParty(player).get()
                .getEntries()
                .stream()
                .map(username -> plugin.getServer().getPlayer(username))
                .filter(p -> p != null)
                .filter(p -> !p.getName().startsWith("leader-"))
                .filter(p -> !p.getName().startsWith("mod-"))
                .filter(p -> {
                    if (!excludeSelf)
                    {
                        return true;
                    }

                    return !p.getUniqueId().equals(player.getUniqueId());
                })
                .collect(Collectors.toSet());
    }

    public static Optional<Team> getParty(Player player)
    {
        final String partyid = player.getPersistentDataContainer().get(plugin.getKey(), plugin.getKeyType());

        if (partyid == null)
        {
            return Optional.empty();
        }

        final Team team = plugin.getServer().getScoreboardManager().getMainScoreboard().getTeam(partyid);

        if (team == null)
        {
            return Optional.empty();
        }

        if (!team.getEntries().contains(player.getName()))
        {
            return Optional.empty();
        }

        return Optional.ofNullable(team);
    }
}
