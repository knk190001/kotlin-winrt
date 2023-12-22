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

@ABIMarker(PackageInstallState.ABI::class)
@Signature("enum(Windows.Management.Deployment.PackageInstallState;i4)")
@WinRTByReference(brClass = PackageInstallState.ByReference::class)
public enum class PackageInstallState(
  public val value: Int
) : NativeMapped {
  NotInstalled(0),
  Staged(1),
  Installed(2),
  Paused(6),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PackageInstallState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotInstalled
      1 -> Staged
      2 -> Installed
      6 -> Paused
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PackageInstallState> {
    public fun setValue(newValue: PackageInstallState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PackageInstallState =
        PackageInstallState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PackageInstallState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PackageInstallState =
        PackageInstallState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PackageInstallState): Int = obj.value
  }
}
