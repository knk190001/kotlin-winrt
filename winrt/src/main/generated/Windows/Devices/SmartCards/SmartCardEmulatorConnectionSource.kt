package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardEmulatorConnectionSource.ABI::class)
@Signature("enum(Windows.Devices.SmartCards.SmartCardEmulatorConnectionSource;i4)")
@WinRTByReference(brClass = SmartCardEmulatorConnectionSource.ByReference::class)
public enum class SmartCardEmulatorConnectionSource(
  public val value: Int
) : NativeMapped {
  Unknown(0),
  NfcReader(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SmartCardEmulatorConnectionSource {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Unknown
      1 -> NfcReader
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SmartCardEmulatorConnectionSource> {
    public fun setValue(newValue: SmartCardEmulatorConnectionSource): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SmartCardEmulatorConnectionSource =
        SmartCardEmulatorConnectionSource.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SmartCardEmulatorConnectionSource, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SmartCardEmulatorConnectionSource =
        SmartCardEmulatorConnectionSource.values()[0].fromNative(value, null)

    public override fun toNative(obj: SmartCardEmulatorConnectionSource): Int = obj.value
  }
}
