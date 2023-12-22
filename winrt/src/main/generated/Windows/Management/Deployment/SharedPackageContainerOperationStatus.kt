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

@ABIMarker(SharedPackageContainerOperationStatus.ABI::class)
@Signature("enum(Windows.Management.Deployment.SharedPackageContainerOperationStatus;i4)")
@WinRTByReference(brClass = SharedPackageContainerOperationStatus.ByReference::class)
public enum class SharedPackageContainerOperationStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  BlockedByPolicy(1),
  AlreadyExists(2),
  PackageFamilyExistsInAnotherContainer(3),
  NotFound(4),
  UnknownFailure(5),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SharedPackageContainerOperationStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> BlockedByPolicy
      2 -> AlreadyExists
      3 -> PackageFamilyExistsInAnotherContainer
      4 -> NotFound
      5 -> UnknownFailure
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<SharedPackageContainerOperationStatus> {
    public fun setValue(newValue: SharedPackageContainerOperationStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SharedPackageContainerOperationStatus =
        SharedPackageContainerOperationStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SharedPackageContainerOperationStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SharedPackageContainerOperationStatus =
        SharedPackageContainerOperationStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: SharedPackageContainerOperationStatus): Int = obj.value
  }
}
