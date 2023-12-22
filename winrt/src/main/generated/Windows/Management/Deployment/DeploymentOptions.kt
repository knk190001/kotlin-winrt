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

@ABIMarker(DeploymentOptions.ABI::class)
@Signature("enum(Windows.Management.Deployment.DeploymentOptions;u4)")
@WinRTByReference(brClass = DeploymentOptions.ByReference::class)
public enum class DeploymentOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  ForceApplicationShutdown(1),
  DevelopmentMode(2),
  InstallAllResources(32),
  ForceTargetApplicationShutdown(64),
  RequiredContentGroupOnly(256),
  ForceUpdateFromAnyVersion(262144),
  RetainFilesOnFailure(2097152),
  StageInPlace(4194304),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeploymentOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ForceApplicationShutdown
      2 -> DevelopmentMode
      32 -> InstallAllResources
      64 -> ForceTargetApplicationShutdown
      256 -> RequiredContentGroupOnly
      262144 -> ForceUpdateFromAnyVersion
      2097152 -> RetainFilesOnFailure
      4194304 -> StageInPlace
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DeploymentOptions> {
    public fun setValue(newValue: DeploymentOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeploymentOptions =
        DeploymentOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeploymentOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeploymentOptions =
        DeploymentOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeploymentOptions): Int = obj.value
  }
}
