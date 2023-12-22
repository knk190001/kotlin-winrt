package Windows.Web.Syndication

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

@ABIMarker(SyndicationFormat.ABI::class)
@Signature("enum(Windows.Web.Syndication.SyndicationFormat;i4)")
@WinRTByReference(brClass = SyndicationFormat.ByReference::class)
public enum class SyndicationFormat(
  public val value: Int
) : NativeMapped {
  Atom10(0),
  Rss20(1),
  Rss10(2),
  Rss092(3),
  Rss091(4),
  Atom03(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SyndicationFormat {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Atom10
      1 -> Rss20
      2 -> Rss10
      3 -> Rss092
      4 -> Rss091
      5 -> Atom03
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SyndicationFormat> {
    public fun setValue(newValue: SyndicationFormat): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SyndicationFormat =
        SyndicationFormat.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SyndicationFormat, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SyndicationFormat =
        SyndicationFormat.values()[0].fromNative(value, null)

    public override fun toNative(obj: SyndicationFormat): Int = obj.value
  }
}
