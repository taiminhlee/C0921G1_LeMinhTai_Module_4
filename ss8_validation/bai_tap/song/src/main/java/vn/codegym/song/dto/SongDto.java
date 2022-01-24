package vn.codegym.song.dto;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class SongDto  {
    private Integer id;
    @NotBlank(message = "empty!!!")
    @Size(max = 800, message = "must not exceed 800 characters")
    @Pattern(regexp = "^[\\p{Lu}\\p{Ll}\\s0-9]+$",message = "wrong format")
    private String name;

    @NotBlank(message = "empty!!!")
    @Size(max = 300, message = "must not exceed 300 characters")
    @Pattern(regexp = "^[\\p{Lu}\\p{Ll}\\s0-9]+$",message = "wrong format")
    private String singer;

    @Size(max = 1000, message = "must not exceed 1000 characters")
    @Pattern(regexp = "^[\\p{Lu}\\p{Ll}\\s0-9\\,]+$",message = "wrong format")
    private String type;
    private String url;

    public SongDto() {
    }

    public SongDto(@NotBlank(message = "empty!!!") @Size(min = 1, max = 800, message = "must not exceed 800 characters") @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "wrong format") String name, @NotBlank(message = "empty!!!") @Size(min = 1, max = 300, message = "must not exceed 300 characters") @Pattern(regexp = "^[a-zA-Z0-9]*$", message = "wrong format") String singer, @NotBlank(message = "empty!!!") @Size(min = 1, max = 1000, message = "must not exceed 1000 characters") @Pattern(regexp = "^[a-zA-Z0-9,]+$", message = "wrong format") String type, String url) {
        this.name = name;
        this.singer = singer;
        this.type = type;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
