package com.example.objectapi

import com.google.gson.annotations.SerializedName

data class SourceItem(

	@field:SerializedName("measures")
	val measures: List<String?>? = null,

	@field:SerializedName("substitutions")
	val substitutions: List<Any?>? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("annotations")
	val annotations: Annotations? = null
)

data class Annotations(

	@field:SerializedName("topic")
	val topic: String? = null,

	@field:SerializedName("dataset_name")
	val datasetName: String? = null,

	@field:SerializedName("dataset_link")
	val datasetLink: String? = null,

	@field:SerializedName("table_id")
	val tableId: String? = null,

	@field:SerializedName("source_name")
	val sourceName: String? = null,

	@field:SerializedName("subtopic")
	val subtopic: String? = null,

	@field:SerializedName("source_description")
	val sourceDescription: String? = null
)

data class Datamodel(

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("source")
	val source: List<SourceItem?>? = null
)

data class DataItem(

	@field:SerializedName("Nation")
	val nation: String? = null,

	@field:SerializedName("Year")
	val year: String? = null,

	@field:SerializedName("Population")
	val population: Int? = null,

	@field:SerializedName("Slug Nation")
	val slugNation: String? = null,

	@field:SerializedName("ID Nation")
	val iDNation: String? = null,

	@field:SerializedName("ID Year")
	val iDYear: Int? = null
)
