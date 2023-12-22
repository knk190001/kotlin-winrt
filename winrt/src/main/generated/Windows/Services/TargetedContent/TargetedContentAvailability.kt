package Windows.Services.TargetedContent

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

@ABIMarker(TargetedContentAvailability.ABI::class)
@Signature("enum(Windows.Services.TargetedContent.TargetedContentAvailability;i4)")
@WinRTByReference(brClass = TargetedContentAvailability.ByReference::class)
public enum class TargetedContentAvailability(
  public val value: Int
) : NativeMapped {
  None(0),
  Partial(1),
  All(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      TargetedContentAvailability {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Partial
      2 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<TargetedContentAvailability> {
    public fun setValue(newValue: TargetedContentAvailability): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): TargetedContentAvailability =
        TargetedContentAvailability.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<TargetedContentAvailability, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): TargetedContentAvailability =
        TargetedContentAvailability.values()[0].fromNative(value, null)

    public override fun toNative(obj: TargetedContentAvailability): Int = obj.value
  }
}
