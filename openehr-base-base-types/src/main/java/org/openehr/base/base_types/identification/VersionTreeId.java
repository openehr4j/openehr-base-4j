package org.openehr.base.base_types.identification;

import java.lang.Boolean;
import java.lang.String;

/**
 * Version tree identifier for one version. Lexical form:
 */
public interface VersionTreeId {
  /**
   * String form of this identifier.
   */
  String getValue();

  /**
   * Trunk version number; numbering starts at 1.
   */
  String trunkVersion();

  /**
   * True if this version identifier represents a branch, i.e. has branch_number and branch_version parts.
   */
  Boolean isBranch();

  /**
   * Number of branch from the trunk point; numbering starts at 1.
   */
  String branchNumber();

  /**
   * Version of the branch; numbering starts at 1.
   */
  String branchVersion();
}
