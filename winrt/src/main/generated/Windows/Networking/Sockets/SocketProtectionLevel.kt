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

@ABIMarker(SocketProtectionLevel.ABI::class)
@Signature("enum(Windows.Networking.Sockets.SocketProtectionLevel;i4)")
@WinRTByReference(brClass = SocketProtectionLevel.ByReference::class)
public enum class SocketProtectionLevel(
  public val value: Int
) : NativeMapped {
  PlainSocket(0),
  Ssl(1),
  SslAllowNullEncryption(2),
  BluetoothEncryptionAllowNullAuthentication(3),
  BluetoothEncryptionWithAuthentication(4),
  Ssl3AllowWeakEncryption(5),
  Tls10(6),
  Tls11(7),
  Tls12(8),
  Unspecified(9),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SocketProtectionLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PlainSocket
      1 -> Ssl
      2 -> SslAllowNullEncryption
      3 -> BluetoothEncryptionAllowNullAuthentication
      4 -> BluetoothEncryptionWithAuthentication
      5 -> Ssl3AllowWeakEncryption
      6 -> Tls10
      7 -> Tls11
      8 -> Tls12
      9 -> Unspecified
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SocketProtectionLevel> {
    public fun setValue(newValue: SocketProtectionLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SocketProtectionLevel =
        SocketProtectionLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SocketProtectionLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SocketProtectionLevel =
        SocketProtectionLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: SocketProtectionLevel): Int = obj.value
  }
}
