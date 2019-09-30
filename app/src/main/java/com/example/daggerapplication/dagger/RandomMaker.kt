package com.example.daggerapplication.dagger

import javax.inject.Inject

class RandomMaker @Inject constructor(@SpecialRandom val specialRandom: Double)