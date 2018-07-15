package com.emilany.domain.interactor.browse

import com.emilany.domain.executor.PostExecutionThread
import com.emilany.domain.interactor.ObservableUseCase
import com.emilany.domain.model.Project
import com.emilany.domain.repository.ProjectsRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetProjects @Inject constructor(
        private val projectsRepository: ProjectsRepository,
        postExecutionThread: PostExecutionThread)
    : ObservableUseCase<List<Project>, Nothing>(postExecutionThread) {

    override fun buildUseCaseObservable(params: Nothing?): Observable<List<Project>> {
        return projectsRepository.getProjects()
    }
}