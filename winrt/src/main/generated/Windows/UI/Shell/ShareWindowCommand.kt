package Windows.UI.Shell

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

@ABIMarker(ShareWindowCommand.ABI::class)
@Signature("enum(Windows.UI.Shell.ShareWindowCommand;i4)")
@WinRTByReference(brClass = ShareWindowCommand.ByReference::class)
public enum class ShareWindowCommand(
  public val value: Int
) : NativeMapped {
  None(0),
  StartSharing(1),
  StopSharing(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ShareWindowCommand {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> StartSharing
      2 -> StopSharing
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ShareWindowCommand> {
    public fun setValue(newValue: ShareWindowCommand): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ShareWindowCommand =
        ShareWindowCommand.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ShareWindowCommand, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ShareWindowCommand =
        ShareWindowCommand.values()[0].fromNative(value, null)

    public override fun toNative(obj: ShareWindowCommand): Int = obj.value
  }
}
