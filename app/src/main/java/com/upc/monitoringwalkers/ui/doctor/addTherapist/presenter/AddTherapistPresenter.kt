package com.upc.monitoringwalkers.ui.doctor.addTherapist.presenter

import com.upc.monitoringwalkers.ui.base.BasePresenter
import com.upc.monitoringwalkers.ui.doctor.addTherapist.view.AddTherapistView

interface AddTherapistPresenter : BasePresenter<AddTherapistView> {

    fun onNameChanged(name: String)

    fun onLastNameChanged(lastName: String)

    fun onEmailChanged(email: String)

    fun onPasswordChanged(password: String)

    fun onRepeatPasswordChanged(repeatPassword: String)

    fun onSpecialityChanged(speciality: String)

    fun onRegisterClicked(doctorId: String)




}