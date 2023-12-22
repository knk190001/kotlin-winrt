package Windows.Media.Devices

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

@ABIMarker(IVideoDeviceControllerGetDevicePropertyResult.ABI::class)
@Signature("{c5d88395-6ed5-4790-8b5d-0ef13935d0f8}")
@Guid("c5d883956ed547908b5d0ef13935d0f8")
@WinRTInterface("c5d883956ed547908b5d0ef13935d0f8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoDeviceControllerGetDevicePropertyResult.ByReference::class)
public interface IVideoDeviceControllerGetDevicePropertyResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): VideoDeviceControllerGetDevicePropertyStatus?

  @InterfaceMethod(1)
  public fun get_Value(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVideoDeviceControllerGetDevicePropertyResult> {
    public override fun getValue() =
        ABI.makeIVideoDeviceControllerGetDevicePropertyResult(pointer.getPointer(0))

    public fun setValue(value: IVideoDeviceControllerGetDevicePropertyResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoDeviceControllerGetDevicePropertyResult {
    public val __1439703666_Ptr: Pointer?

    public val _1439703666_VtblPtr: Pointer?
      get() = __1439703666_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): VideoDeviceControllerGetDevicePropertyStatus? {
      val fnPtr = _1439703666_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDeviceControllerGetDevicePropertyStatus>()
      val hr = fn.invokeHR(arrayOf(__1439703666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<VideoDeviceControllerGetDevicePropertyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): IUnknown? {
      val fnPtr = _1439703666_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1439703666_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IVideoDeviceControllerGetDevicePropertyResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1439703666_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoDeviceControllerGetDevicePropertyResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5d883956ed547908b5d0ef13935d0f8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoDeviceControllerGetDevicePropertyResult(ptr: Pointer?): WithDefault =
        IVideoDeviceControllerGetDevicePropertyResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IVideoDeviceControllerGetDevicePropertyResult {
      val address = segment.toRawLongValue()
      return makeIVideoDeviceControllerGetDevicePropertyResult(Pointer(address))
    }

    public override fun toNative(obj: IVideoDeviceControllerGetDevicePropertyResult): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1439703666_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoDeviceControllerGetDevicePropertyResult):
        Array<IVideoDeviceControllerGetDevicePropertyResult?> = (elements as
        Array<IVideoDeviceControllerGetDevicePropertyResult?>).castToImpl<IVideoDeviceControllerGetDevicePropertyResult,IVideoDeviceControllerGetDevicePropertyResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoDeviceControllerGetDevicePropertyResult?> =
        arrayOfNulls<IVideoDeviceControllerGetDevicePropertyResult_Impl>(size) as
        Array<IVideoDeviceControllerGetDevicePropertyResult?>
  }
}
