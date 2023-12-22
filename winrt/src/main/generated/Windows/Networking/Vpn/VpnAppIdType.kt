package Windows.Networking.Vpn

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

@ABIMarker(VpnAppIdType.ABI::class)
@Signature("enum(Windows.Networking.Vpn.VpnAppIdType;i4)")
@WinRTByReference(brClass = VpnAppIdType.ByReference::class)
public enum class VpnAppIdType(
  public val value: Int
) : NativeMapped {
  PackageFamilyName(0),
  FullyQualifiedBinaryName(1),
  FilePath(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      VpnAppIdType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> PackageFamilyName
      1 -> FullyQualifiedBinaryName
      2 -> FilePath
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<VpnAppIdType> {
    public fun setValue(newValue: VpnAppIdType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): VpnAppIdType =
        VpnAppIdType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<VpnAppIdType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): VpnAppIdType =
        VpnAppIdType.values()[0].fromNative(value, null)

    public override fun toNative(obj: VpnAppIdType): Int = obj.value
  }
}
