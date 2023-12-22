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

@ABIMarker(AddPackageByAppInstallerOptions.ABI::class)
@Signature("enum(Windows.Management.Deployment.AddPackageByAppInstallerOptions;u4)")
@WinRTByReference(brClass = AddPackageByAppInstallerOptions.ByReference::class)
public enum class AddPackageByAppInstallerOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  InstallAllResources(32),
  ForceTargetAppShutdown(64),
  RequiredContentGroupOnly(256),
  LimitToExistingPackages(512),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      AddPackageByAppInstallerOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      32 -> InstallAllResources
      64 -> ForceTargetAppShutdown
      256 -> RequiredContentGroupOnly
      512 -> LimitToExistingPackages
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<AddPackageByAppInstallerOptions> {
    public fun setValue(newValue: AddPackageByAppInstallerOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): AddPackageByAppInstallerOptions =
        AddPackageByAppInstallerOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<AddPackageByAppInstallerOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): AddPackageByAppInstallerOptions =
        AddPackageByAppInstallerOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: AddPackageByAppInstallerOptions): Int = obj.value
  }
}
