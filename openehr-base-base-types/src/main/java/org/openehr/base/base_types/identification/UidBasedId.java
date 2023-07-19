package org.openehr.base.base_types.identification;

import java.lang.Boolean;
import java.lang.String;

/**
 * <div class="content"><div class="paragraph">
 * <p>Abstract model of UID-based identifiers consisting of a root part and an optional extension; lexical form: <code>root '::' extension</code>.</p>
 * </div></div>
 */
public interface UidBasedId extends ObjectId {
  /**
   * The identifier of the conceptual namespace in which the object exists, within the identification scheme. Returns the part to the left of the first '::' separator, if any, or else the whole string.
   */
  Uid root();

  /**
   * Optional local identifier of the object within the context of the root identifier. Returns the part to the right of the first '::' separator if any, or else any empty String.
   */
  String extension();

  /**
   * True if not `_extension_.is_empty()`.
   */
  Boolean hasExtension();
}
