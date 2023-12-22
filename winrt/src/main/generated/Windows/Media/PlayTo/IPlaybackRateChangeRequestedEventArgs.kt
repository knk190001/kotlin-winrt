package Windows.Media.PlayTo

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlaybackRateChangeRequestedEventArgs.ABI::class)
@Signature("{0f5661ae-2c88-4cca-8540-d586095d13a5}")
@Guid("0f5661ae2c884cca8540d586095d13a5")
@WinRTInterface("0f5661ae2c884cca8540d586095d13a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlaybackRateChangeRequestedEventArgs.ByReference::class)
public interface IPlaybackRateChangeRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Rate(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlaybackRateChangeRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIPlaybackRateChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPlaybackRateChangeRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlaybackRateChangeRequestedEventArgs {
    public val __706960825_Ptr: Pointer?

    public val _706960825_VtblPtr: Pointer?
      get() = __706960825_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Rate(): Double {
      val fnPtr = _706960825_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__706960825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IPlaybackRateChangeRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __706960825_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlaybackRateChangeRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f5661ae2c884cca8540d586095d13a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlaybackRateChangeRequestedEventArgs(ptr: Pointer?): WithDefault =
        IPlaybackRateChangeRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlaybackRateChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPlaybackRateChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPlaybackRateChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__706960825_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlaybackRateChangeRequestedEventArgs):
        Array<IPlaybackRateChangeRequestedEventArgs?> = (elements as
        Array<IPlaybackRateChangeRequestedEventArgs?>).castToImpl<IPlaybackRateChangeRequestedEventArgs,IPlaybackRateChangeRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlaybackRateChangeRequestedEventArgs?> =
        arrayOfNulls<IPlaybackRateChangeRequestedEventArgs_Impl>(size) as
        Array<IPlaybackRateChangeRequestedEventArgs?>
  }
}
