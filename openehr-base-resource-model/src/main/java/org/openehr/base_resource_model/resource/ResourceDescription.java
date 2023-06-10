package org.openehr.base_resource_model.resource;

import java.lang.String;
import java.util.List;
import java.util.Map;
import org.openehr.base_foundation_types.terminology.TerminologyCode;

/**
 * Defines the descriptive meta-data of a resource.
 */
public interface ResourceDescription {
  /**
   * Original author of this resource, with all relevant details, including organisation.
   */
  Map getOriginalAuthor();

  /**
   * Namespace of original author's organisation, in reverse internet form, if applicable.
   */
  String getOriginalNamespace();

  /**
   * Plain text name of organisation that originally published this artefact, if any.
   */
  String getOriginalPublisher();

  /**
   * Other contributors to the resource, each listed in "name <email>"  form.
   */
  List getOtherContributors();

  /**
   * Lifecycle state of the resource, typically including states such as: initial, in_development, in_review, published, superseded, obsolete.
   */
  TerminologyCode getLifecycleState();

  /**
   * Namespace in reverse internet id form, of current custodian organisation.
   */
  String getCustodianNamespace();

  /**
   * Plain text name of current custodian organisation.
   */
  String getCustodianOrganisation();

  /**
   * Optional copyright statement for the resource as a knowledge resource.
   */
  String getCopyright();

  /**
   * Licence of current artefact, in format "short licence name <URL of licence>", e.g. "Apache 2.0 License <http://www.apache.org/licenses/LICENSE-2.0.html>"
   */
  String getLicence();

  /**
   * List of acknowledgements of other IP directly referenced in this archetype, typically terminology codes, ontology ids etc. Recommended keys are the widely known name or namespace for the IP source, as shown in the following example:
   */
  Map getIpAcknowledgements();

  /**
   * List of references of material on which this artefact is based, as a keyed list of strings. The keys should be in a standard citation format.
   */
  Map getReferences();

  /**
   * URI of package to which this resource belongs.
   */
  String getResourcePackageUri();

  /**
   * Details related to conversion process that generated this model from an original, if relevant, as a list of name/value pairs. Typical example with recommended tags:
   */
  Map getConversionDetails();

  /**
   * Additional non-language-sensitive resource meta-data, as a list of name/value pairs.
   */
  Map getOtherDetails();

  /**
   * Details of all parts of resource description that are natural language-dependent, keyed by language code.
   */
  Map getDetails();
}
