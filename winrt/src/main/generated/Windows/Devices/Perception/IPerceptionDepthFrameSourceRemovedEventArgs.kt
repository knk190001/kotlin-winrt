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

@ABIMarker(IPerceptionDepthFrameSourceRemovedEventArgs.ABI::class)
@Signature("{a0c0cc4d-e96c-4d81-86dd-38b95e49c6df}")
@Guid("a0c0cc4de96c4d8186dd38b95e49c6df")
@WinRTInterface("a0c0cc4de96c4d8186dd38b95e49c6df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPerceptionDepthFrameSourceRemovedEventArgs.ByReference::class)
public interface IPerceptionDepthFrameSourceRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FrameSource(): PerceptionDepthFrameSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPerceptionDepthFrameSourceRemovedEventArgs> {
    public override fun getValue() =
        ABI.makeIPerceptionDepthFrameSourceRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPerceptionDepthFrameSourceRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPerceptionDepthFrameSourceRemovedEventArgs {
    public val __1674677079_Ptr: Pointer?

    public val _1674677079_VtblPtr: Pointer?
      get() = __1674677079_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameSource(): PerceptionDepthFrameSource? {
      val fnPtr = _1674677079_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PerceptionDepthFrameSource>()
      val hr = fn.invokeHR(arrayOf(__1674677079_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PerceptionDepthFrameSource>(result.getValue())
      return resultValue
    }
  }

  public class IPerceptionDepthFrameSourceRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1674677079_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPerceptionDepthFrameSourceRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0c0cc4de96c4d8186dd38b95e49c6df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPerceptionDepthFrameSourceRemovedEventArgs(ptr: Pointer?): WithDefault =
        IPerceptionDepthFrameSourceRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPerceptionDepthFrameSourceRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPerceptionDepthFrameSourceRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPerceptionDepthFrameSourceRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1674677079_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPerceptionDepthFrameSourceRemovedEventArgs):
        Array<IPerceptionDepthFrameSourceRemovedEventArgs?> = (elements as
        Array<IPerceptionDepthFrameSourceRemovedEventArgs?>).castToImpl<IPerceptionDepthFrameSourceRemovedEventArgs,IPerceptionDepthFrameSourceRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPerceptionDepthFrameSourceRemovedEventArgs?> =
        arrayOfNulls<IPerceptionDepthFrameSourceRemovedEventArgs_Impl>(size) as
        Array<IPerceptionDepthFrameSourceRemovedEventArgs?>
  }
}
