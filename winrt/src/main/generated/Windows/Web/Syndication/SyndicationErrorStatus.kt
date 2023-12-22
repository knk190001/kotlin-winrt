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

@ABIMarker(SyndicationErrorStatus.ABI::class)
@Signature("enum(Windows.Web.Syndication.SyndicationErrorStatus;i4)")
@WinRTByReference(brClass = SyndicationErrorStatus.ByReference::class)
public enum class SyndicationErrorStatus(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  MissingRequiredElement(1),
  MissingRequiredAttribute(2),
  InvalidXml(3),
  UnexpectedContent(4),
  UnsupportedFormat(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SyndicationErrorStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> MissingRequiredElement
      2 -> MissingRequiredAttribute
      3 -> InvalidXml
      4 -> UnexpectedContent
      5 -> UnsupportedFormat
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SyndicationErrorStatus> {
    public fun setValue(newValue: SyndicationErrorStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SyndicationErrorStatus =
        SyndicationErrorStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SyndicationErrorStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SyndicationErrorStatus =
        SyndicationErrorStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SyndicationErrorStatus): Int = obj.value
  }
}
