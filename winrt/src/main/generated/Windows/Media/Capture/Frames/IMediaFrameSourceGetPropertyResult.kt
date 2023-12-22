package Windows.Media.Capture.Frames

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IMediaFrameSourceGetPropertyResult.ABI::class)
@Signature("{088616c2-3a64-4bd5-bd2b-e7c898d2f37a}")
@Guid("088616c23a644bd5bd2be7c898d2f37a")
@WinRTInterface("088616c23a644bd5bd2be7c898d2f37a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceGetPropertyResult.ByReference::class)
public interface IMediaFrameSourceGetPropertyResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): MediaFrameSourceGetPropertyStatus?

  @InterfaceMethod(1)
  public fun get_Value(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceGetPropertyResult> {
    public override fun getValue() =
        ABI.makeIMediaFrameSourceGetPropertyResult(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceGetPropertyResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceGetPropertyResult {
    public val __1299812130_Ptr: Pointer?

    public val _1299812130_VtblPtr: Pointer?
      get() = __1299812130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): MediaFrameSourceGetPropertyStatus? {
      val fnPtr = _1299812130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaFrameSourceGetPropertyStatus>()
      val hr = fn.invokeHR(arrayOf(__1299812130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaFrameSourceGetPropertyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _1299812130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1299812130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceGetPropertyResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1299812130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceGetPropertyResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("088616c23a644bd5bd2be7c898d2f37a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceGetPropertyResult(ptr: Pointer?): WithDefault =
        IMediaFrameSourceGetPropertyResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceGetPropertyResult {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceGetPropertyResult(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceGetPropertyResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1299812130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceGetPropertyResult):
        Array<IMediaFrameSourceGetPropertyResult?> = (elements as
        Array<IMediaFrameSourceGetPropertyResult?>).castToImpl<IMediaFrameSourceGetPropertyResult,IMediaFrameSourceGetPropertyResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceGetPropertyResult?> =
        arrayOfNulls<IMediaFrameSourceGetPropertyResult_Impl>(size) as
        Array<IMediaFrameSourceGetPropertyResult?>
  }
}
