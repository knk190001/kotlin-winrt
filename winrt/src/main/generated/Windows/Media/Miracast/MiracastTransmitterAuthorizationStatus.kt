package Windows.Media.Miracast

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

@ABIMarker(MiracastTransmitterAuthorizationStatus.ABI::class)
@Signature("enum(Windows.Media.Miracast.MiracastTransmitterAuthorizationStatus;i4)")
@WinRTByReference(brClass = MiracastTransmitterAuthorizationStatus.ByReference::class)
public enum class MiracastTransmitterAuthorizationStatus(
  public val value: Int
) : NativeMapped {
  Undecided(0),
  Allowed(1),
  AlwaysPrompt(2),
  Blocked(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MiracastTransmitterAuthorizationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Undecided
      1 -> Allowed
      2 -> AlwaysPrompt
      3 -> Blocked
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MiracastTransmitterAuthorizationStatus> {
    public fun setValue(newValue: MiracastTransmitterAuthorizationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MiracastTransmitterAuthorizationStatus =
        MiracastTransmitterAuthorizationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MiracastTransmitterAuthorizationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MiracastTransmitterAuthorizationStatus =
        MiracastTransmitterAuthorizationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: MiracastTransmitterAuthorizationStatus): Int = obj.value
  }
}
