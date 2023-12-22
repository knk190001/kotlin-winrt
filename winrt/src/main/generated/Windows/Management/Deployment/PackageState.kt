package Windows.Management.Deployment

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

@ABIMarker(PackageState.ABI::class)
@Signature("enum(Windows.Management.Deployment.PackageState;i4)")
@WinRTByReference(brClass = PackageState.ByReference::class)
public enum class PackageState(
  public val value: Int
) : NativeMapped {
  Normal(0),
  LicenseInvalid(1),
  Modified(2),
  Tampered(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PackageState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Normal
      1 -> LicenseInvalid
      2 -> Modified
      3 -> Tampered
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PackageState> {
    public fun setValue(newValue: PackageState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PackageState =
        PackageState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PackageState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PackageState =
        PackageState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PackageState): Int = obj.value
  }
}
