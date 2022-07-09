package ru.otus.otuskotlin.marketplace.app.v2

import io.ktor.server.application.*
import ru.otus.otuskotlin.marketplace.api.v2.models.AdOffersRequest
import ru.otus.otuskotlin.marketplace.api.v2.models.AdOffersResponse
import ru.otus.otuskotlin.marketplace.backend.services.AdService
import ru.otus.otuskotlin.marketplace.common.models.MkplCommand

suspend fun ApplicationCall.offersAd(service: AdService) =
    controllerHelperV2<AdOffersRequest, AdOffersResponse>(MkplCommand.OFFERS) {
    service.searchOffers(this)
}
