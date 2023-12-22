package Windows.System

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

@ABIMarker(LaunchFileStatus.ABI::class)
@Signature("enum(Windows.System.LaunchFileStatus;i4)")
@WinRTByReference(brClass = LaunchFileStatus.ByReference::class)
public enum class LaunchFileStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  AppUnavailable(1),
  DeniedByPolicy(2),
  FileTypeNotSupported(3),
  Unknown(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LaunchFileStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> AppUnavailable
      2 -> DeniedByPolicy
      3 -> FileTypeNotSupported
      4 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LaunchFileStatus> {
    public fun setValue(newValue: LaunchFileStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LaunchFileStatus =
        LaunchFileStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LaunchFileStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LaunchFileStatus =
        LaunchFileStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: LaunchFileStatus): Int = obj.value
  }
}
