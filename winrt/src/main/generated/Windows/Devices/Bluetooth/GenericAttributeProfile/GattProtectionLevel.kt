package Windows.Devices.Bluetooth.GenericAttributeProfile

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

@ABIMarker(GattProtectionLevel.ABI::class)
@Signature("enum(Windows.Devices.Bluetooth.GenericAttributeProfile.GattProtectionLevel;i4)")
@WinRTByReference(brClass = GattProtectionLevel.ByReference::class)
public enum class GattProtectionLevel(
  public val value: Int
) : NativeMapped {
  Plain(0),
  AuthenticationRequired(1),
  EncryptionRequired(2),
  EncryptionAndAuthenticationRequired(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GattProtectionLevel {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Plain
      1 -> AuthenticationRequired
      2 -> EncryptionRequired
      3 -> EncryptionAndAuthenticationRequired
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GattProtectionLevel> {
    public fun setValue(newValue: GattProtectionLevel): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GattProtectionLevel =
        GattProtectionLevel.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GattProtectionLevel, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GattProtectionLevel =
        GattProtectionLevel.values()[0].fromNative(value, null)

    public override fun toNative(obj: GattProtectionLevel): Int = obj.value
  }
}
