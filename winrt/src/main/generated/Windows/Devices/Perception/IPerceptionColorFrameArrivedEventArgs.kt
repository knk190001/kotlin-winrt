package Windows.Devices.Perception

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

@ABIMarker(IPerceptionColorFrameArrivedEventArgs.ABI::class)
@Signature("{8fad02d5-86f7-4d8d-b966-5a3761ba9f59}")
@Guid("8fad02d586f74d8db9665a3761ba9f59")
@WinRTInterface("8fad02d586f74d8db9665a3761ba9f59")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionColorFrameArrivedEventArgs.ByReference::class)
public interface IPerceptionColorFrameArrivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RelativeTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun TryOpenFrame(): PerceptionColorFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionColorFrameArrivedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionColorFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionColorFrameArrivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionColorFrameArrivedEventArgs {
    public val __1584898655_Ptr: Pointer?

    public val _1584898655_VtblPtr: Pointer?
      get() = __1584898655_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RelativeTime(): TimeSpan? {
      val fnPtr = _1584898655_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1584898655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryOpenFrame(): PerceptionColorFrame? {
      val fnPtr = _1584898655_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionColorFrame>()
      val hr = fn.invokeHR(arrayOf(__1584898655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionColorFrame>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionColorFrameArrivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1584898655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionColorFrameArrivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8fad02d586f74d8db9665a3761ba9f59")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionColorFrameArrivedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionColorFrameArrivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionColorFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionColorFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionColorFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1584898655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionColorFrameArrivedEventArgs):
        Array<IPerceptionColorFrameArrivedEventArgs?> = (elements as
        Array<IPerceptionColorFrameArrivedEventArgs?>).castToImpl<IPerceptionColorFrameArrivedEventArgs,IPerceptionColorFrameArrivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionColorFrameArrivedEventArgs?> =
        arrayOfNulls<IPerceptionColorFrameArrivedEventArgs_Impl>(size) as
        Array<IPerceptionColorFrameArrivedEventArgs?>
  }
}
