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

@ABIMarker(IPerceptionDepthFrameArrivedEventArgs.ABI::class)
@Signature("{443d25b2-b282-4637-9173-ac978435c985}")
@Guid("443d25b2b28246379173ac978435c985")
@WinRTInterface("443d25b2b28246379173ac978435c985")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionDepthFrameArrivedEventArgs.ByReference::class)
public interface IPerceptionDepthFrameArrivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RelativeTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun TryOpenFrame(): PerceptionDepthFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionDepthFrameArrivedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionDepthFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionDepthFrameArrivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionDepthFrameArrivedEventArgs {
    public val __1690067391_Ptr: Pointer?

    public val _1690067391_VtblPtr: Pointer?
      get() = __1690067391_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RelativeTime(): TimeSpan? {
      val fnPtr = _1690067391_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1690067391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryOpenFrame(): PerceptionDepthFrame? {
      val fnPtr = _1690067391_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionDepthFrame>()
      val hr = fn.invokeHR(arrayOf(__1690067391_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionDepthFrame>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionDepthFrameArrivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1690067391_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionDepthFrameArrivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("443d25b2b28246379173ac978435c985")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionDepthFrameArrivedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionDepthFrameArrivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPerceptionDepthFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionDepthFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionDepthFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1690067391_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionDepthFrameArrivedEventArgs):
        Array<IPerceptionDepthFrameArrivedEventArgs?> = (elements as
        Array<IPerceptionDepthFrameArrivedEventArgs?>).castToImpl<IPerceptionDepthFrameArrivedEventArgs,IPerceptionDepthFrameArrivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionDepthFrameArrivedEventArgs?> =
        arrayOfNulls<IPerceptionDepthFrameArrivedEventArgs_Impl>(size) as
        Array<IPerceptionDepthFrameArrivedEventArgs?>
  }
}
