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

@ABIMarker(MiracastReceiverAuthorizationMethod.ABI::class)
@Signature("enum(Windows.Media.Miracast.MiracastReceiverAuthorizationMethod;i4)")
@WinRTByReference(brClass = MiracastReceiverAuthorizationMethod.ByReference::class)
public enum class MiracastReceiverAuthorizationMethod(
  public val value: Int
) : NativeMapped {
  None(0),
  ConfirmConnection(1),
  PinDisplayIfRequested(2),
  PinDisplayRequired(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      MiracastReceiverAuthorizationMethod {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ConfirmConnection
      2 -> PinDisplayIfRequested
      3 -> PinDisplayRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<MiracastReceiverAuthorizationMethod> {
    public fun setValue(newValue: MiracastReceiverAuthorizationMethod): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): MiracastReceiverAuthorizationMethod =
        MiracastReceiverAuthorizationMethod.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<MiracastReceiverAuthorizationMethod, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): MiracastReceiverAuthorizationMethod =
        MiracastReceiverAuthorizationMethod.values()[0].fromNative(value, null)

    public override fun toNative(obj: MiracastReceiverAuthorizationMethod): Int = obj.value
  }
}
