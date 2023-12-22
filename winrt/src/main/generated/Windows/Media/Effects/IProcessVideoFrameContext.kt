package Windows.Media.Effects

import Windows.Media.VideoFrame
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

@ABIMarker(IProcessVideoFrameContext.ABI::class)
@Signature("{276f0e2b-6461-401e-ba78-0fdad6114eec}")
@Guid("276f0e2b6461401eba780fdad6114eec")
@WinRTInterface("276f0e2b6461401eba780fdad6114eec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProcessVideoFrameContext.ByReference::class)
public interface IProcessVideoFrameContext : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InputFrame(): VideoFrame?

  @InterfaceMethod(1)
  public fun get_OutputFrame(): VideoFrame?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProcessVideoFrameContext> {
    public override fun getValue() = ABI.makeIProcessVideoFrameContext(pointer.getPointer(0))

    public fun setValue(value: IProcessVideoFrameContext_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProcessVideoFrameContext {
    public val __937388682_Ptr: Pointer?

    public val _937388682_VtblPtr: Pointer?
      get() = __937388682_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InputFrame(): VideoFrame? {
      val fnPtr = _937388682_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__937388682_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OutputFrame(): VideoFrame? {
      val fnPtr = _937388682_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoFrame>()
      val hr = fn.invokeHR(arrayOf(__937388682_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoFrame>(result.getValue())
      return resultValue
    }
  }

  public class IProcessVideoFrameContext_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __937388682_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProcessVideoFrameContext, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("276f0e2b6461401eba780fdad6114eec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProcessVideoFrameContext(ptr: Pointer?): WithDefault =
        IProcessVideoFrameContext_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProcessVideoFrameContext {
      val address = segment.toRawLongValue()
      return makeIProcessVideoFrameContext(Pointer(address))
    }

    public override fun toNative(obj: IProcessVideoFrameContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__937388682_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProcessVideoFrameContext):
        Array<IProcessVideoFrameContext?> = (elements as
        Array<IProcessVideoFrameContext?>).castToImpl<IProcessVideoFrameContext,IProcessVideoFrameContext_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProcessVideoFrameContext?> =
        arrayOfNulls<IProcessVideoFrameContext_Impl>(size) as Array<IProcessVideoFrameContext?>
  }
}
