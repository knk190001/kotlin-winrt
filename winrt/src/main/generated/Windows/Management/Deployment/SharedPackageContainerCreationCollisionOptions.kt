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

@ABIMarker(SharedPackageContainerCreationCollisionOptions.ABI::class)
@Signature("enum(Windows.Management.Deployment.SharedPackageContainerCreationCollisionOptions;i4)")
@WinRTByReference(brClass = SharedPackageContainerCreationCollisionOptions.ByReference::class)
public enum class SharedPackageContainerCreationCollisionOptions(
  public val value: Int
) : NativeMapped {
  FailIfExists(0),
  MergeWithExisting(1),
  ReplaceExisting(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SharedPackageContainerCreationCollisionOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> FailIfExists
      1 -> MergeWithExisting
      2 -> ReplaceExisting
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SharedPackageContainerCreationCollisionOptions> {
    public fun setValue(newValue: SharedPackageContainerCreationCollisionOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SharedPackageContainerCreationCollisionOptions =
        SharedPackageContainerCreationCollisionOptions.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<SharedPackageContainerCreationCollisionOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SharedPackageContainerCreationCollisionOptions =
        SharedPackageContainerCreationCollisionOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: SharedPackageContainerCreationCollisionOptions): Int =
        obj.value
  }
}
