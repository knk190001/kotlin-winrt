package com.github.knk190001.winrtbinding.foundation.collections

import Windows.Foundation.Collections.IKeyValuePair

operator fun <K, V> IKeyValuePair<K, V>.component1(): K = Key
operator fun <K, V> IKeyValuePair<K, V>.component2(): V = Value