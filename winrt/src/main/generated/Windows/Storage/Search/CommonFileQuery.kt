package Windows.Storage.Search

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

@ABIMarker(CommonFileQuery.ABI::class)
@Signature("enum(Windows.Storage.Search.CommonFileQuery;i4)")
@WinRTByReference(brClass = CommonFileQuery.ByReference::class)
public enum class CommonFileQuery(
  public val value: Int
) : NativeMapped {
  DefaultQuery(0),
  OrderByName(1),
  OrderByTitle(2),
  OrderByMusicProperties(3),
  OrderBySearchRank(4),
  OrderByDate(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CommonFileQuery {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DefaultQuery
      1 -> OrderByName
      2 -> OrderByTitle
      3 -> OrderByMusicProperties
      4 -> OrderBySearchRank
      5 -> OrderByDate
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CommonFileQuery> {
    public fun setValue(newValue: CommonFileQuery): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CommonFileQuery =
        CommonFileQuery.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CommonFileQuery, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CommonFileQuery =
        CommonFileQuery.values()[0].fromNative(value, null)

    public override fun toNative(obj: CommonFileQuery): Int = obj.value
  }
}
