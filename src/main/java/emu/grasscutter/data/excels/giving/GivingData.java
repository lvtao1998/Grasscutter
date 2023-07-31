package emu.grasscutter.data.excels.giving;

import com.google.gson.annotations.SerializedName;
import emu.grasscutter.data.*;
import emu.grasscutter.data.common.ItemParamData;
import emu.grasscutter.game.inventory.BagTab;
import lombok.*;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
@ResourceType(name = "GivingExcelConfigData.json")
public final class GivingData extends GameResource {
    @SerializedName(value = "id", alternate = "Id")
    private int id;
    private int talkId;
    private int mistakeTalkId;

    private BagTab tab;
    private GiveMethod givingMethod;

    private List<ItemParamData> exactItems;
    private int exactFinishTalkId;

    private List<Integer> givingGroupIds;
    private int givingGroupCount;

    private boolean isRemoveItem;
    private GiveType giveType;

    public enum GiveMethod {
        @SerializedName("GIVING_METHOD_EXACT") EXACT,
        @SerializedName("GIVING_METHOD_GROUP") GROUP,
        @SerializedName("GIVING_METHOD_VAGUE_GROUP") GROUP_VAGUE
    }

    public enum GiveType {
        @SerializedName("GIVING_TYPE_QUEST") QUEST,
        @SerializedName("GIVING_TYPE_GROUP") GROUP
    }
}
