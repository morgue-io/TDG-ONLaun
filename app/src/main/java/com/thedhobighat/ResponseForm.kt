package com.thedhobighat

/* Dependencies begin */

data class GetProfileResponsePayload(
    var name: String,
    var email: String,
    var phone: String,
    var address: String
)

data class GetOrderResponsePayloadItemStatusGenericAssignee(
    var state: Boolean,
    var time: String,
    var assignee: String
)

data class GetOrderResponsePayloadItemStatusGenericNoAssignee(
    var state: Boolean,
    var time: String
)

data class GetOrderResponsePayloadItemStatus(
    var accepted: GetOrderResponsePayloadItemStatusGenericNoAssignee,
    var picked_up: GetOrderResponsePayloadItemStatusGenericAssignee,
    var processing: GetOrderResponsePayloadItemStatusGenericNoAssignee,
    var delivered: GetOrderResponsePayloadItemStatusGenericAssignee
)

data class GetOrderResponsePayloadItem(
    var _id: String,
    var customer: String,
    var address: String,
    var todo: CartInstance,
    var status: GetOrderResponsePayloadItemStatus,
    var createdAt: String,
    var updatedAt: String
)

/* Dependencies end */


data class LoginResponse(
    var success: Boolean,
    var message: String,
    var jwt: String,
    var jwt_refresh: String
)

data class PostCartResponse(
    var success: Boolean,
    var message: String
)

data class GenericResponse(
    var success: Boolean,
    var message: String
)

data class GetProfileResponse(
    var success: Boolean,
    var message: String,
    var payload: GetProfileResponsePayload
)

data class GetOrdersResponse(
    var success: Boolean,
    var message: String,
    var payload: List<GetOrderResponsePayloadItem>
)