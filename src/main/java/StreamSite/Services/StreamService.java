package StreamSite.Services;

import StreamSite.DTO.Channel;
import StreamSite.DTO.Stream;

import java.util.List;

public interface StreamService {
    List<Stream> getStreamsByGameId(int id);
    String voteDown(int game,int stream);
    String voteUp(int game,int stream);
    Stream getStreamById(int id);
    List<Channel> getStreamChannel(int id);
}