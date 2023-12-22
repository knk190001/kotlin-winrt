package Windows.ApplicationModel.Search.Core

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(SearchSuggestionKind.ABI::class)
@Signature("enum(Windows.ApplicationModel.Search.Core.SearchSuggestionKind;i4)")
@WinRTByReference(brClass = SearchSuggestionKind.ByReference::class)
public enum class SearchSuggestionKind(
  public val value: Int
) : NativeMapped {
  Query(0),
  Result(1),
  Separator(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SearchSuggestionKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Query
      1 -> Result
      2 -> Separator
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SearchSuggestionKind> {
    public fun setValue(newValue: SearchSuggestionKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SearchSuggestionKind =
        SearchSuggestionKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SearchSuggestionKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SearchSuggestionKind =
        SearchSuggestionKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: SearchSuggestionKind): Int = obj.value
  }
}
