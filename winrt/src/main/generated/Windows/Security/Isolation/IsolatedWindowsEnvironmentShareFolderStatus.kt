package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironmentShareFolderStatus.ABI::class)
@Signature("enum(Windows.Security.Isolation.IsolatedWindowsEnvironmentShareFolderStatus;i4)")
@WinRTByReference(brClass = IsolatedWindowsEnvironmentShareFolderStatus.ByReference::class)
public enum class IsolatedWindowsEnvironmentShareFolderStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownFailure(1),
  EnvironmentUnavailable(2),
  FolderNotFound(3),
  AccessDenied(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IsolatedWindowsEnvironmentShareFolderStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownFailure
      2 -> EnvironmentUnavailable
      3 -> FolderNotFound
      4 -> AccessDenied
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<IsolatedWindowsEnvironmentShareFolderStatus> {
    public fun setValue(newValue: IsolatedWindowsEnvironmentShareFolderStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IsolatedWindowsEnvironmentShareFolderStatus =
        IsolatedWindowsEnvironmentShareFolderStatus.values()[0].fromNative(this.pointer.getInt(0),
        null)
  }

  public object ABI : IABI<IsolatedWindowsEnvironmentShareFolderStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IsolatedWindowsEnvironmentShareFolderStatus =
        IsolatedWindowsEnvironmentShareFolderStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: IsolatedWindowsEnvironmentShareFolderStatus): Int = obj.value
  }
}
