package Windows.Networking.Sockets

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

@ABIMarker(SocketActivityConnectedStandbyAction.ABI::class)
@Signature("enum(Windows.Networking.Sockets.SocketActivityConnectedStandbyAction;i4)")
@WinRTByReference(brClass = SocketActivityConnectedStandbyAction.ByReference::class)
public enum class SocketActivityConnectedStandbyAction(
  public val value: Int
) : NativeMapped {
  DoNotWake(0),
  Wake(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocketActivityConnectedStandbyAction {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> DoNotWake
      1 -> Wake
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SocketActivityConnectedStandbyAction> {
    public fun setValue(newValue: SocketActivityConnectedStandbyAction): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocketActivityConnectedStandbyAction =
        SocketActivityConnectedStandbyAction.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocketActivityConnectedStandbyAction, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocketActivityConnectedStandbyAction =
        SocketActivityConnectedStandbyAction.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocketActivityConnectedStandbyAction): Int = obj.value
  }
}
