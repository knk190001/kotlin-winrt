package Windows.Devices.PointOfService

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

@ABIMarker(MagneticStripeReaderAuthenticationLevel.ABI::class)
@Signature("enum(Windows.Devices.PointOfService.MagneticStripeReaderAuthenticationLevel;i4)")
@WinRTByReference(brClass = MagneticStripeReaderAuthenticationLevel.ByReference::class)
public enum class MagneticStripeReaderAuthenticationLevel(
  public val value: Int
) : NativeMapped {
  NotSupported(0),
  Optional(1),
  Required(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MagneticStripeReaderAuthenticationLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotSupported
      1 -> Optional
      2 -> Required
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MagneticStripeReaderAuthenticationLevel> {
    public fun setValue(newValue: MagneticStripeReaderAuthenticationLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MagneticStripeReaderAuthenticationLevel =
        MagneticStripeReaderAuthenticationLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MagneticStripeReaderAuthenticationLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MagneticStripeReaderAuthenticationLevel =
        MagneticStripeReaderAuthenticationLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: MagneticStripeReaderAuthenticationLevel): Int = obj.value
  }
}
