package org.asteriskjava.khomp.enums;

/**
 * Possible status in SMS sending actions.
 *
 * @author kennedy
 */
public enum KSMSCause {

    UNASSIGNED_NUMBER("1"),
    OPERATOR_DETERMINED_BARRING("8"),
    CALL_BARRED("10"),
    SMS_TRANSFER_REJECT("21"),
    DESTINATION_OUT_OF_SERVICE("27"),
    UNIDENTIFIED_SUBSCRIBER("28"),
    FACILITY_REJECTED("29"),
    UNKNOWN_SUBSCRIBER("30"),
    NETWORK_OUT_OF_ORDER("38"),
    TEMPORARY_FAILURE("41"),
    CONGESTION("42"),
    RESOURCES_UNAVAILABLE("47"),
    FACILITY_NOT_SUBSCRIBED("50"),
    FACILITY_NOT_IMPLEMENTED("69"),
    INVALID_SMS_TRANSFER_REFERENCE_VALUE("81"),
    INVALID_MESSAGE("95"),
    INVALID_MANDATORY_INFORMATION("96"),
    MESSAGE_TYPE_NON_EXISTENT("97"),
    MESSAGE_NOT_COMPATIBLE_WITH_SMS_PROTECTION_STATE("98"),
    INFORMATION_ELEMENT_NON_EXISTENT("99"),
    PROTOCOL_ERROR("111"),
    INTERWORKING("127"),
    TELEMATIC_INTERWORKING_NOT_SUPPORTED("128"),
    SMS_TYPE_ZERO_NOT_SUPPORTED("129"),
    CANNOT_REPLACE_SMS("130"),
    UNSPECIFIED_TPPID_ERROR("143"),
    ALPHABET_NOT_SUPPORTED("144"),
    MESSAGE_CLASS_NOT_SUPPORTED("145"),
    UNSPECIFIED_TPDCS_ERROR("159"),
    COMMAND_CANNOT_BE_ACTIONED("160"),
    COMMAND_UNSUPPORTED("161"),
    UNSPECIFIED_TP_COMMAND_ERROR("175"),
    TPDU_NOT_SUPPORTED("176"),
    SC_BUSY("192"),
    NO_SC_SUBSCRIPTION("193"),
    SC_SYSTEM_FAILURE("194"),
    INVALID_SME_ADDRESS("195"),
    DESTINATION_SME_BARRED("196"),
    SM_REJECTED_DUPLICATE_SM("197"),
    TPVPF_NOT_SUPPORTED("198"),
    TPVP_NOT_SUPPORTED("199"),
    SIM_SMS_STORAGE_FULL("208"),
    NO_SMS_STORAGE_CAPABILITY_IN_SIM("209"),
    ERROR_IN_SMS("210"),
    MEMORY_CAPATITY_EXCEEDED("211"),
    SIM_DATA_DOWNLOAD_ERROR("213"),
    UNSPECIFIED_ERROR("255"),
    PHONE_FAILURE("300"),
    SMS_SERVICE_RESERVED("301"),
    OPERATION_NOT_ALLOWED("302"),
    OPERATION_NOT_SUPPORTED("303"),
    INVALID_PDU_MODE_PARAMETER("304"),
    INVALID_TEXT_MODE_PARAMETER("305"),
    SIM_NOT_INSERTED("310"),
    SIM_PIN_NECESSARY("311"),
    PHONE_SIM_PIN_NECESSARY("312"),
    SIM_FAILURE("313"),
    SIM_BUSY("314"),
    SIM_WRONG("315"),
    MEMORY_FAILURE("320"),
    INVALID_MEMORY_INDEX("321"),
    MEMORY_FULL("322"),
    SMSC_ADDRESS_UNKNOWN("330"),
    NO_NETWORK_SERVICE("331"),
    NETWORK_TIMEOUT("332"),
    UNKNOWN_ERROR("500"),
    NETWORK_BUSY("512"),
    INVALID_DESTINATION_ADDRESS("513"),
    INVALID_MESSAGE_BODY_LENGTH("514"),
    PHONE_IS_NOT_IN_SERVICE("515"),
    INVALID_PREFERRED_MEMORY_STORAGE("516"),
    USER_TERMINATED("517");

    private final String cod;

    KSMSCause(String cod) {
        this.cod = cod;
    }
}
