package org.openehr.base.resource_model.resource;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import org.openehr.base.base_types.identification.Uuid;
import org.openehr.base.foundation_types.terminology.TerminologyCode;

/**
 * Abstract idea of an online resource created by a human author.
 */
public interface AuthoredResource {
  /**
   * Unique identifier of the family of archetypes having the same interface identifier (same major version).
   */
  Uuid getUid();

  /**
   * Language in which this resource was initially authored. Although there is no language primacy of resources overall, the language of original authoring is required to ensure natural language translations can preserve quality. Language is relevant in both the description and ontology sections.
   */
  TerminologyCode getOriginalLanguage();

  /**
   * Description and lifecycle information of the resource.
   */
  ResourceDescription getDescription();

  /**
   * True if this resource is under any kind of change control (even file copying), in which case revision history is created.
   */
  Boolean getIsControlled();

  /**
   * Annotations on individual items within the resource, keyed by path. The inner table takes the form of a Hash table of String values keyed by String tags.
   */
  Object getAnnotations();

  /**
   * List of details for each natural translation made of this resource, keyed by language code. For each translation listed here, there must be corresponding sections in all language-dependent parts of the resource. The `_original_language_` does not appear in this list.
   */
  Map getTranslations();

  /**
   * Most recent revision in revision_history if is_controlled else  (uncontrolled) .
   */
  String currentRevision();

  /**
   * Total list of languages available in this resource, derived from original_language and translations.
   */
  List languagesAvailable();
}
