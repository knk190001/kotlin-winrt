package Windows.Devices.Perception

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

@ABIMarker(IPerceptionColorFrameSourceRemovedEventArgs.ABI::class)
@Signature("{d277fa69-eb4c-42ef-ba4f-288f615c93c1}")
@Guid("d277fa69eb4c42efba4f288f615c93c1")
@WinRTInterface("d277fa69eb4c42efba4f288f615c93c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionColorFrameSourceRemovedEventArgs.ByReference::class)
public interface IPerceptionColorFrameSourceRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameSource(): PerceptionColorFrameSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionColorFrameSourceRemovedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionColorFrameSourceRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionColorFrameSourceRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionColorFrameSourceRemovedEventArgs {
    public val __2080254985_Ptr: Pointer?

    public val _2080254985_VtblPtr: Pointer?
      get() = __2080254985_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameSource(): PerceptionColorFrameSource? {
      val fnPtr = _2080254985_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionColorFrameSource>()
      val hr = fn.invokeHR(arrayOf(__2080254985_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionColorFrameSource>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionColorFrameSourceRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2080254985_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionColorFrameSourceRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d277fa69eb4c42efba4f288f615c93c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionColorFrameSourceRemovedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionColorFrameSourceRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionColorFrameSourceRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionColorFrameSourceRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionColorFrameSourceRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2080254985_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionColorFrameSourceRemovedEventArgs):
        Array<IPerceptionColorFrameSourceRemovedEventArgs?> = (elements as
        Array<IPerceptionColorFrameSourceRemovedEventArgs?>).castToImpl<IPerceptionColorFrameSourceRemovedEventArgs,IPerceptionColorFrameSourceRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionColorFrameSourceRemovedEventArgs?> =
        arrayOfNulls<IPerceptionColorFrameSourceRemovedEventArgs_Impl>(size) as
        Array<IPerceptionColorFrameSourceRemovedEventArgs?>
  }
}
