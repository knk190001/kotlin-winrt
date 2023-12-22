package Windows.ApplicationModel

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

@ABIMarker(PackageContentGroupState.ABI::class)
@Signature("enum(Windows.ApplicationModel.PackageContentGroupState;i4)")
@WinRTByReference(brClass = PackageContentGroupState.ByReference::class)
public enum class PackageContentGroupState(
  public val value: Int
) : NativeMapped {
  NotStaged(0),
  Queued(1),
  Staging(2),
  Staged(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PackageContentGroupState {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> NotStaged
      1 -> Queued
      2 -> Staging
      3 -> Staged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PackageContentGroupState>
      {
    public fun setValue(newValue: PackageContentGroupState): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PackageContentGroupState =
        PackageContentGroupState.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PackageContentGroupState, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PackageContentGroupState =
        PackageContentGroupState.values()[0].fromNative(value, null)

    public override fun toNative(obj: PackageContentGroupState): Int = obj.value
  }
}
