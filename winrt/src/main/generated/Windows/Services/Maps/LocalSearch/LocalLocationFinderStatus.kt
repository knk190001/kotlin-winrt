package Windows.Services.Maps.LocalSearch

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

@ABIMarker(LocalLocationFinderStatus.ABI::class)
@Signature("enum(Windows.Services.Maps.LocalSearch.LocalLocationFinderStatus;i4)")
@WinRTByReference(brClass = LocalLocationFinderStatus.ByReference::class)
public enum class LocalLocationFinderStatus(
  public val value: Int
) : NativeMapped {
  Success(0),
  UnknownError(1),
  InvalidCredentials(2),
  InvalidCategory(3),
  InvalidSearchTerm(4),
  InvalidSearchArea(5),
  NetworkFailure(6),
  NotSupported(7),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      LocalLocationFinderStatus {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Success
      1 -> UnknownError
      2 -> InvalidCredentials
      3 -> InvalidCategory
      4 -> InvalidSearchTerm
      5 -> InvalidSearchArea
      6 -> NetworkFailure
      7 -> NotSupported
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<LocalLocationFinderStatus>
      {
    public fun setValue(newValue: LocalLocationFinderStatus): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): LocalLocationFinderStatus =
        LocalLocationFinderStatus.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<LocalLocationFinderStatus, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): LocalLocationFinderStatus =
        LocalLocationFinderStatus.values()[0].fromNative(value, null)

    public override fun toNative(obj: LocalLocationFinderStatus): Int = obj.value
  }
}
