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

@ABIMarker(SocketActivityKind.ABI::class)
@Signature("enum(Windows.Networking.Sockets.SocketActivityKind;i4)")
@WinRTByReference(brClass = SocketActivityKind.ByReference::class)
public enum class SocketActivityKind(
  public val value: Int
) : NativeMapped {
  None(0),
  StreamSocketListener(1),
  DatagramSocket(2),
  StreamSocket(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocketActivityKind {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> StreamSocketListener
      2 -> DatagramSocket
      3 -> StreamSocket
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SocketActivityKind> {
    public fun setValue(newValue: SocketActivityKind): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocketActivityKind =
        SocketActivityKind.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocketActivityKind, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocketActivityKind =
        SocketActivityKind.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocketActivityKind): Int = obj.value
  }
}
