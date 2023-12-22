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

@ABIMarker(IPerceptionInfraredFrameArrivedEventArgs.ABI::class)
@Signature("{9f77fac7-b4bd-4857-9d50-be8ef075daef}")
@Guid("9f77fac7b4bd48579d50be8ef075daef")
@WinRTInterface("9f77fac7b4bd48579d50be8ef075daef")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionInfraredFrameArrivedEventArgs.ByReference::class)
public interface IPerceptionInfraredFrameArrivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RelativeTime(): TimeSpan?

  @InterfaceMethod(1)
  public fun TryOpenFrame(): PerceptionInfraredFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionInfraredFrameArrivedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionInfraredFrameArrivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionInfraredFrameArrivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionInfraredFrameArrivedEventArgs {
    public val __38695479_Ptr: Pointer?

    public val _38695479_VtblPtr: Pointer?
      get() = __38695479_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RelativeTime(): TimeSpan? {
      val fnPtr = _38695479_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__38695479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryOpenFrame(): PerceptionInfraredFrame? {
      val fnPtr = _38695479_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionInfraredFrame>()
      val hr = fn.invokeHR(arrayOf(__38695479_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionInfraredFrame>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionInfraredFrameArrivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __38695479_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionInfraredFrameArrivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f77fac7b4bd48579d50be8ef075daef")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionInfraredFrameArrivedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionInfraredFrameArrivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionInfraredFrameArrivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionInfraredFrameArrivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionInfraredFrameArrivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__38695479_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionInfraredFrameArrivedEventArgs):
        Array<IPerceptionInfraredFrameArrivedEventArgs?> = (elements as
        Array<IPerceptionInfraredFrameArrivedEventArgs?>).castToImpl<IPerceptionInfraredFrameArrivedEventArgs,IPerceptionInfraredFrameArrivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionInfraredFrameArrivedEventArgs?> =
        arrayOfNulls<IPerceptionInfraredFrameArrivedEventArgs_Impl>(size) as
        Array<IPerceptionInfraredFrameArrivedEventArgs?>
  }
}
