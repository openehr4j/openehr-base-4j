package org.openehr.base.foundation_types.terminology;

import java.lang.String;

/**
 * Leaf type representing a standalone term from a terminology, which consists of the term text and the code, i.e. a concept reference.
 */
public interface TerminologyTerm {
  /**
   * Reference to the terminology concept formally representing this term.
   */
  TerminologyCode getConcept();

  /**
   * Text of term.
   */
  String getText();
}
