package com.upc.monitoringwalkers.ui.doctor.addComment.presenter

import com.upc.monitoringwalkers.ui.base.BasePresenter
import com.upc.monitoringwalkers.ui.doctor.addComment.view.AddCommentView

interface AddCommentPresenter : BasePresenter<AddCommentView> {

    fun onTextChanged(text: String)

    fun onDateChanged(date: String)

    fun onPatientChanged(patientId: String)

    fun onTherapistIdChanged(therapistId: String)

    fun onRegisterClicked(patientId: String)
}