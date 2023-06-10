package org.openehr.base_base_types.identification;

import java.lang.String;

/**
 * Identifier for archetypes. Ideally these would identify globally unique archetypes.
 */
public interface ArchetypeId extends ObjectId {
  /**
   * Globally qualified reference model entity, e.g.  `openehr-EHR-OBSERVATION`.
   */
  String qualifiedRmEntity();

  /**
   * Name of the concept represented by this archetype, including specialisation, e.g. `Biochemistry_result-cholesterol`.
   */
  String domainConcept();

  /**
   * Organisation originating the reference model on which this archetype is based, e.g. openehr,  cen,  hl7 .
   */
  String rmOriginator();

  /**
   * Name of the reference model, e.g. rim,  ehr_rm,  en13606 .
   */
  String rmName();

  /**
   * Name of the ontological level within the reference model to which this archetype is targeted, e.g. for openEHR,  folder ,  composition ,  section ,  entry .
   */
  String rmEntity();

  /**
   * Name of specialisation of concept, if this archetype is a specialisation of another archetype, e.g.  cholesterol .
   */
  String specialisation();

  /**
   * Version of this archetype.
   */
  String versionId();
}
