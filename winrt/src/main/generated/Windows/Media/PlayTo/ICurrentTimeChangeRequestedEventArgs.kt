package Windows.Media.PlayTo

import Windows.Foundation.TimeSpan
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICurrentTimeChangeRequestedEventArgs.ABI::class)
@Signature("{99711324-edc7-4bf5-91f6-3c8627db59e5}")
@Guid("99711324edc74bf591f63c8627db59e5")
@WinRTInterface("99711324edc74bf591f63c8627db59e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentTimeChangeRequestedEventArgs.ByReference::class)
public interface ICurrentTimeChangeRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Time(): TimeSpan?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentTimeChangeRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICurrentTimeChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICurrentTimeChangeRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentTimeChangeRequestedEventArgs {
    public val __1284263322_Ptr: Pointer?

    public val _1284263322_VtblPtr: Pointer?
      get() = __1284263322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Time(): TimeSpan? {
      val fnPtr = _1284263322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1284263322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentTimeChangeRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1284263322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentTimeChangeRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99711324edc74bf591f63c8627db59e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentTimeChangeRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICurrentTimeChangeRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentTimeChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICurrentTimeChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICurrentTimeChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1284263322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentTimeChangeRequestedEventArgs):
        Array<ICurrentTimeChangeRequestedEventArgs?> = (elements as
        Array<ICurrentTimeChangeRequestedEventArgs?>).castToImpl<ICurrentTimeChangeRequestedEventArgs,ICurrentTimeChangeRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentTimeChangeRequestedEventArgs?> =
        arrayOfNulls<ICurrentTimeChangeRequestedEventArgs_Impl>(size) as
        Array<ICurrentTimeChangeRequestedEventArgs?>
  }
}
