// heart of wrapper, contains all possible api calls
package pokemonGame.untitled.src.pokeapi.bittle.utils;

import pokemonGame.untitled.src.pokeapi.bittle.models.berries.Berry;
import pokemonGame.untitled.src.pokeapi.bittle.models.berries.BerryFirmness;
import pokemonGame.untitled.src.pokeapi.bittle.models.berries.BerryFlavor;
import pokemonGame.untitled.src.pokeapi.bittle.models.contests.ContestEffect;
import pokemonGame.untitled.src.pokeapi.bittle.models.contests.ContestType;
import pokemonGame.untitled.src.pokeapi.bittle.models.contests.SuperContestEffect;
import pokemonGame.untitled.src.pokeapi.bittle.models.encounters.EncounterCondition;
import pokemonGame.untitled.src.pokeapi.bittle.models.encounters.EncounterConditionValue;
import pokemonGame.untitled.src.pokeapi.bittle.models.encounters.EncounterMethod;
import pokemonGame.untitled.src.pokeapi.bittle.models.evolution.EvolutionChain;
import pokemonGame.untitled.src.pokeapi.bittle.models.evolution.EvolutionTrigger;
import pokemonGame.untitled.src.pokeapi.bittle.models.games.Generation;
import pokemonGame.untitled.src.pokeapi.bittle.models.games.Pokedex;
import pokemonGame.untitled.src.pokeapi.bittle.models.games.Version;
import pokemonGame.untitled.src.pokeapi.bittle.models.games.VersionGroup;
import pokemonGame.untitled.src.pokeapi.bittle.models.items.*;
import pokemonGame.untitled.src.pokeapi.bittle.models.locations.Location;
import pokemonGame.untitled.src.pokeapi.bittle.models.locations.LocationArea;
import pokemonGame.untitled.src.pokeapi.bittle.models.locations.PalParkArea;
import pokemonGame.untitled.src.pokeapi.bittle.models.locations.Region;
import pokemonGame.untitled.src.pokeapi.bittle.models.machines.Machine;
import pokemonGame.untitled.src.pokeapi.bittle.models.moves.*;
import pokemonGame.untitled.src.pokeapi.bittle.models.pokemon.*;
import pokemonGame.untitled.src.pokeapi.bittle.models.resources.APIResourceList;
import pokemonGame.untitled.src.pokeapi.bittle.models.resources.NamedAPIResourceList;
import pokemonGame.untitled.src.pokeapi.bittle.models.utility.Language;

public class Client {
	// if true, save api response to local database for speed and api call limit help
	public static boolean CACHE = true;

	public static APIResourceList getAPIResourceListByEndpoint(String endpoint) {
		return pokeapi.bittle.models.resources.APIResourceList.getByEndpoint(endpoint);
	}

	public static NamedAPIResourceList getNamedAPIResourceListByEndpoint(String endpoint) {
		return pokeapi.bittle.models.resources.NamedAPIResourceList.getByEndpoint(endpoint);
	}

	public static Berry getBerryById(int id) {
		return pokeapi.bittle.models.berries.Berry.getById(id);
	}

	public static Berry getBerryByName(String name) {
		return pokeapi.bittle.models.berries.Berry.getByName(name);
	}

	public static NamedAPIResourceList getBerryList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("berry", limit, offset);
	}

	public static BerryFirmness getBerryFirmnessById(int id) {
		return pokeapi.bittle.models.berries.BerryFirmness.getById(id);
	}

	public static BerryFirmness getBerryFirmnessByName(String name) {
		return pokeapi.bittle.models.berries.BerryFirmness.getByName(name);
	}

	public static NamedAPIResourceList getBerryFirmnessList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("berry-firmness", limit, offset);
	}

	public static BerryFlavor getBerryFlavorById(int id) {
		return pokeapi.bittle.models.berries.BerryFlavor.getById(id);
	}

	public static BerryFlavor getBerryFlavorByName(String name) {
		return pokeapi.bittle.models.berries.BerryFlavor.getByName(name);
	}

	public static NamedAPIResourceList getBerryFlavorList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("berry-flavor", limit, offset);
	}

	public static ContestType getContestTypeById(int id) {
		return pokeapi.bittle.models.contests.ContestType.getById(id);
	}

	public static ContestType getContestTypeByName(String name) {
		return pokeapi.bittle.models.contests.ContestType.getByName(name);
	}

	public static NamedAPIResourceList getContestTypeList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("contest-type", limit, offset);
	}

	public static ContestEffect getContestEffectById(int id) {
		return pokeapi.bittle.models.contests.ContestEffect.getById(id);
	}

	public static APIResourceList getContestEffectList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.APIResourceList.getList("contest-effect", limit, offset);
	}

	public static SuperContestEffect getSuperContestEffectById(int id) {
		return pokeapi.bittle.models.contests.SuperContestEffect.getById(id);
	}

	public static APIResourceList getSuperContestEffectList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.APIResourceList.getList("super-contest-effect", limit, offset);
	}

	public static EncounterMethod getEncounterMethodById(int id) {
		return pokeapi.bittle.models.encounters.EncounterMethod.getById(id);
	}

	public static EncounterMethod getEncounterMethodByName(String name) {
		return pokeapi.bittle.models.encounters.EncounterMethod.getByName(name);
	}

	public static NamedAPIResourceList getEncounterMethodList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("encounter-method", limit, offset);
	}

	public static EncounterCondition getEncounterConditionById(int id) {
		return pokeapi.bittle.models.encounters.EncounterCondition.getById(id);
	}

	public static EncounterCondition getEncounterConditionByName(String name) {
		return pokeapi.bittle.models.encounters.EncounterCondition.getByName(name);
	}

	public static NamedAPIResourceList getEncounterConditionList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("encounter-condition", limit, offset);
	}

	public static EncounterConditionValue getEncounterConditionValueById(int id) {
		return pokeapi.bittle.models.encounters.EncounterConditionValue.getById(id);
	}

	public static EncounterConditionValue getEncounterConditionValueByName(String name) {
		return pokeapi.bittle.models.encounters.EncounterConditionValue.getByName(name);
	}

	public static NamedAPIResourceList getEncounterConditionValueList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("encounter-condition-value", limit, offset);
	}

	public static EvolutionChain getEvolutionChainById(int id) {
		return pokeapi.bittle.models.evolution.EvolutionChain.getById(id);
	}

	public static APIResourceList getEvolutionChainList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.APIResourceList.getList("evolution-chain", limit, offset);
	}

	public static EvolutionTrigger getEvolutionTriggerById(int id) {
		return pokeapi.bittle.models.evolution.EvolutionTrigger.getById(id);
	}

	public static EvolutionTrigger getEvolutionTriggerByName(String name) {
		return pokeapi.bittle.models.evolution.EvolutionTrigger.getByName(name);
	}

	public static NamedAPIResourceList getEvolutionTriggerList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("evolution-trigger", limit, offset);
	}

	public static Generation getGenerationById(int id) {
		return pokeapi.bittle.models.games.Generation.getById(id);
	}

	public static Generation getGenerationByName(String name) {
		return pokeapi.bittle.models.games.Generation.getByName(name);
	}

	public static NamedAPIResourceList getGenerationList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("generation", limit, offset);
	}

	public static Pokedex getPokedexById(int id) {
		return pokeapi.bittle.models.games.Pokedex.getById(id);
	}

	public static Pokedex getPokedexByName(String name) {
		return pokeapi.bittle.models.games.Pokedex.getByName(name);
	}

	public static NamedAPIResourceList getPokedexList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokedex", limit, offset);
	}

	public static Version getVersionById(int id) {
		return pokeapi.bittle.models.games.Version.getById(id);
	}

	public static Version getVersionByName(String name) {
		return pokeapi.bittle.models.games.Version.getByName(name);
	}

	public static NamedAPIResourceList getVersionList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("version", limit, offset);
	}

	public static VersionGroup getVersionGroupById(int id) {
		return pokeapi.bittle.models.games.VersionGroup.getById(id);
	}

	public static VersionGroup getVersionGroupByName(String name) {
		return pokeapi.bittle.models.games.VersionGroup.getByName(name);
	}

	public static NamedAPIResourceList getVersionGroupList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("version-group", limit, offset);
	}

	public static Item getItemById(int id) {
		return pokeapi.bittle.models.items.Item.getById(id);
	}

	public static Item getItemByName(String name) {
		return pokeapi.bittle.models.items.Item.getByName(name);
	}

	public static NamedAPIResourceList getItemList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item", limit, offset);
	}

	public static ItemAttribute getItemAttributeById(int id) {
		return pokeapi.bittle.models.items.ItemAttribute.getById(id);
	}

	public static ItemAttribute getItemAttributeByName(String name) {
		return pokeapi.bittle.models.items.ItemAttribute.getByName(name);
	}

	public static NamedAPIResourceList getItemAttributeList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item-attribute", limit, offset);
	}

	public static ItemCategory getItemCategoryById(int id) {
		return pokeapi.bittle.models.items.ItemCategory.getById(id);
	}

	public static ItemCategory getItemCategoryByName(String name) {
		return pokeapi.bittle.models.items.ItemCategory.getByName(name);
	}

	public static NamedAPIResourceList getItemCategoryList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item-category", limit, offset);
	}

	public static ItemFlingEffect getItemFlingEffectById(int id) {
		return pokeapi.bittle.models.items.ItemFlingEffect.getById(id);
	}

	public static ItemFlingEffect getItemFlingEffectByName(String name) {
		return pokeapi.bittle.models.items.ItemFlingEffect.getByName(name);
	}

	public static NamedAPIResourceList getItemFlingEffectList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item-fling-effect", limit, offset);
	}

	public static ItemPocket getItemPocketById(int id) {
		return pokeapi.bittle.models.items.ItemPocket.getById(id);
	}

	public static ItemPocket getItemPocketByName(String name) {
		return pokeapi.bittle.models.items.ItemPocket.getByName(name);
	}

	public static NamedAPIResourceList getItemPocketList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("item-pocket", limit, offset);
	}

	public static Location getLocationById(int id) {
		return pokeapi.bittle.models.locations.Location.getById(id);
	}

	public static Location getLocationByName(String name) {
		return pokeapi.bittle.models.locations.Location.getByName(name);
	}

	public static NamedAPIResourceList getLocationList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("location", limit, offset);
	}

	public static LocationArea getLocationAreaById(int id) {
		return pokeapi.bittle.models.locations.LocationArea.getById(id);
	}

	public static LocationArea getLocationAreaByName(String name) {
		return pokeapi.bittle.models.locations.LocationArea.getByName(name);
	}

	public static NamedAPIResourceList getLocationAreaList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("location-area", limit, offset);
	}

	public static PalParkArea getPalParkAreaById(int id) {
		return pokeapi.bittle.models.locations.PalParkArea.getById(id);
	}

	public static PalParkArea getPalParkAreaByName(String name) {
		return pokeapi.bittle.models.locations.PalParkArea.getByName(name);
	}

	public static NamedAPIResourceList getPalParkAreaList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pal-park-area", limit, offset);
	}

	public static Region getRegionById(int id) {
		return pokeapi.bittle.models.locations.Region.getById(id);
	}

	public static Region getRegionByName(String name) {
		return pokeapi.bittle.models.locations.Region.getByName(name);
	}

	public static NamedAPIResourceList getRegionList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("region", limit, offset);
	}

	public static Machine getMachineById(int id) {
		return pokeapi.bittle.models.machines.Machine.getById(id);
	}

	public static APIResourceList getMachineList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.APIResourceList.getList("machine", limit, offset);
	}

	public static pokeapi.bittle.models.moves.Move getMoveById(int id) {
		return pokeapi.bittle.models.moves.Move.getById(id);
	}

	public static pokeapi.bittle.models.moves.Move getMoveByName(String name) {
		return pokeapi.bittle.models.moves.Move.getByName(name);
	}

	public static NamedAPIResourceList getMoveList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move", limit, offset);
	}

	public static MoveAilment getMoveAilmentById(int id) {
		return pokeapi.bittle.models.moves.MoveAilment.getById(id);
	}

	public static MoveAilment getMoveAilmentByName(String name) {
		return pokeapi.bittle.models.moves.MoveAilment.getByName(name);
	}

	public static NamedAPIResourceList getMoveAilmentList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-ailment", limit, offset);
	}

	public static MoveBattleStyle getMoveBattleStyleById(int id) {
		return pokeapi.bittle.models.moves.MoveBattleStyle.getById(id);
	}

	public static MoveBattleStyle getMoveBattleStyleByName(String name) {
		return pokeapi.bittle.models.moves.MoveBattleStyle.getByName(name);
	}

	public static NamedAPIResourceList getMoveBattleStyleList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-battle-style", limit, offset);
	}

	public static MoveDamageClass getMoveDamageClassById(int id) {
		return pokeapi.bittle.models.moves.MoveDamageClass.getById(id);
	}

	public static MoveDamageClass getMoveDamageClassByName(String name) {
		return pokeapi.bittle.models.moves.MoveDamageClass.getByName(name);
	}

	public static NamedAPIResourceList getMoveDamageClassList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-damage-class", limit, offset);
	}

	public static MoveLearnMethod getMoveLearnMethodById(int id) {
		return pokeapi.bittle.models.moves.MoveLearnMethod.getById(id);
	}

	public static MoveLearnMethod getMoveLearnMethodByName(String name) {
		return pokeapi.bittle.models.moves.MoveLearnMethod.getByName(name);
	}

	public static NamedAPIResourceList getMoveLearnMethodList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-learn-method", limit, offset);
	}

	public static MoveTarget getMoveTargetById(int id) {
		return pokeapi.bittle.models.moves.MoveTarget.getById(id);
	}

	public static MoveTarget getMoveTargetByName(String name) {
		return pokeapi.bittle.models.moves.MoveTarget.getByName(name);
	}

	public static NamedAPIResourceList getMoveTargetList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-target", limit, offset);
	}

	public static pokeapi.bittle.models.pokemon.Ability getAbilityById(int id) {
		return pokeapi.bittle.models.pokemon.Ability.getById(id);
	}

	public static pokeapi.bittle.models.pokemon.Ability getAbilityByName(String name) {
		return pokeapi.bittle.models.pokemon.Ability.getByName(name);
	}

	public static NamedAPIResourceList getAbilityList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("ability", limit, offset);
	}

	public static Characteristic getCharacteristicById(int id) {
		return pokeapi.bittle.models.pokemon.Characteristic.getById(id);
	}

	public static APIResourceList getCharacteristicList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.APIResourceList.getList("characteristic", limit, offset);
	}

	public static pokeapi.bittle.models.pokemon.EggGroup getEggGroupById(int id) {
		return pokeapi.bittle.models.pokemon.EggGroup.getById(id);
	}

	public static pokeapi.bittle.models.pokemon.EggGroup getEggGroupByName(String name) {
		return pokeapi.bittle.models.pokemon.EggGroup.getByName(name);
	}

	public static NamedAPIResourceList getEggGroupList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("egg-group", limit, offset);
	}

	public static pokeapi.bittle.models.pokemon.Gender getGenderById(int id) {
		return pokeapi.bittle.models.pokemon.Gender.getById(id);
	}

	public static pokeapi.bittle.models.pokemon.Gender getGenderByName(String name) {
		return pokeapi.bittle.models.pokemon.Gender.getByName(name);
	}

	public static NamedAPIResourceList getGenderList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("gender", limit, offset);
	}

	public static GrowthRate getGrowthRateById(int id) {
		return pokeapi.bittle.models.pokemon.GrowthRate.getById(id);
	}

	public static GrowthRate getGrowthRateByName(String name) {
		return pokeapi.bittle.models.pokemon.GrowthRate.getByName(name);
	}

	public static NamedAPIResourceList getGrowthRateList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("growth-rate", limit, offset);
	}

	public static Nature getNatureById(int id) {
		return pokeapi.bittle.models.pokemon.Nature.getById(id);
	}

	public static Nature getNatureByName(String name) {
		return pokeapi.bittle.models.pokemon.Nature.getByName(name);
	}

	public static NamedAPIResourceList getNatureList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("nature", limit, offset);
	}

	public static PokeathlonStat getPokeathlonStatById(int id) {
		return pokeapi.bittle.models.pokemon.PokeathlonStat.getById(id);
	}

	public static PokeathlonStat getPokeathlonStatByName(String name) {
		return pokeapi.bittle.models.pokemon.PokeathlonStat.getByName(name);
	}

	public static NamedAPIResourceList getPokeathlonStatList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokeathlon-stat", limit, offset);
	}

	public static Pokemon getPokemonById(int id) {
		return pokeapi.bittle.models.pokemon.Pokemon.getById(id);
	}

	public static Pokemon getPokemonByName(String name) {
		return pokeapi.bittle.models.pokemon.Pokemon.getByName(name);
	}

	public static NamedAPIResourceList getPokemonList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon", limit, offset);
	}

	public static PokemonColor getPokemonColorById(int id) {
		return pokeapi.bittle.models.pokemon.PokemonColor.getById(id);
	}

	public static PokemonColor getPokemonColorByName(String name) {
		return pokeapi.bittle.models.pokemon.PokemonColor.getByName(name);
	}

	public static NamedAPIResourceList getPokemonColorList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon-color", limit, offset);
	}

	public static pokeapi.bittle.models.pokemon.PokemonForm getPokemonFormById(int id) {
		return pokeapi.bittle.models.pokemon.PokemonForm.getById(id);
	}

	public static pokeapi.bittle.models.pokemon.PokemonForm getPokemonFormByName(String name) {
		return pokeapi.bittle.models.pokemon.PokemonForm.getByName(name);
	}

	public static NamedAPIResourceList getPokemonFormList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon-form", limit, offset);
	}

	public static pokeapi.bittle.models.pokemon.PokemonHabitat getPokemonHabitatById(int id) {
		return pokeapi.bittle.models.pokemon.PokemonHabitat.getById(id);
	}

	public static pokeapi.bittle.models.pokemon.PokemonHabitat getPokemonHabitatByName(String name) {
		return pokeapi.bittle.models.pokemon.PokemonHabitat.getByName(name);
	}

	public static NamedAPIResourceList getPokemonHabitatList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon-habitat", limit, offset);
	}

	public static PokemonShape getPokemonShapeById(int id) {
		return pokeapi.bittle.models.pokemon.PokemonShape.getById(id);
	}

	public static PokemonShape getPokemonShapeByName(String name) {
		return pokeapi.bittle.models.pokemon.PokemonShape.getByName(name);
	}

	public static NamedAPIResourceList getPokemonShapeList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon-shape", limit, offset);
	}

	public static PokemonSpecies getPokemonSpeciesById(int id) {
		return pokeapi.bittle.models.pokemon.PokemonSpecies.getById(id);
	}

	public static PokemonSpecies getPokemonSpeciesByName(String name) {
		return pokeapi.bittle.models.pokemon.PokemonSpecies.getByName(name);
	}

	public static NamedAPIResourceList getPokemonSpeciesList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("pokemon-species", limit, offset);
	}

	public static Stat getStatById(int id) {
		return pokeapi.bittle.models.pokemon.Stat.getById(id);
	}

	public static Stat getStatByName(String name) {
		return pokeapi.bittle.models.pokemon.Stat.getByName(name);
	}

	public static NamedAPIResourceList getStatList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("stat", limit, offset);
	}

	public static pokeapi.bittle.models.pokemon.Type getTypeById(int id) {
		return pokeapi.bittle.models.pokemon.Type.getById(id);
	}

	public static pokeapi.bittle.models.pokemon.Type getTypeByName(String name) {
		return pokeapi.bittle.models.pokemon.Type.getByName(name);
	}

	public static NamedAPIResourceList getTypeList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("type", limit, offset);
	}

	public static Language getLanguageById(int id) {
		return pokeapi.bittle.models.utility.Language.getById(id);
	}

	public static Language getLanguageByName(String name) {
		return pokeapi.bittle.models.utility.Language.getByName(name);
	}

	public static NamedAPIResourceList getLanguageList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("language", limit, offset);
	}

	public static MoveCategory getMoveCategoryById(int id) {
		return pokeapi.bittle.models.moves.MoveCategory.getById(id);
	}

	public static MoveCategory getMoveCategoryByName(String name) {
		return pokeapi.bittle.models.moves.MoveCategory.getByName(name);
	}

	public static NamedAPIResourceList getMoveCategoryList(int limit, int offset) {
		 return pokeapi.bittle.models.resources.NamedAPIResourceList.getList("move-category", limit, offset);
	}
}