package Windows.Media.Capture.Frames

import Windows.Foundation.IAsyncOperation
import Windows.Media.Devices.VideoDeviceController
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaFrameSourceController.ABI::class)
@Signature("{6d076635-316d-4b8f-b7b6-eeb04a8c6525}")
@Guid("6d076635316d4b8fb7b6eeb04a8c6525")
@WinRTInterface("6d076635316d4b8fb7b6eeb04a8c6525")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaFrameSourceController.ByReference::class)
public interface IMediaFrameSourceController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPropertyAsync(propertyId: String?):
      IAsyncOperation<MediaFrameSourceGetPropertyResult?>?

  @InterfaceMethod(1)
  public fun SetPropertyAsync(propertyId: String?, propertyValue: IUnknown?):
      IAsyncOperation<MediaFrameSourceSetPropertyStatus?>?

  @InterfaceMethod(2)
  public fun get_VideoDeviceController(): VideoDeviceController?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaFrameSourceController> {
    public override fun getValue() = ABI.makeIMediaFrameSourceController(pointer.getPointer(0))

    public fun setValue(value: IMediaFrameSourceController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaFrameSourceController {
    public val __398239034_Ptr: Pointer?

    public val _398239034_VtblPtr: Pointer?
      get() = __398239034_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPropertyAsync(propertyId: String?):
        IAsyncOperation<MediaFrameSourceGetPropertyResult?>? {
      val fnPtr = _398239034_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaFrameSourceGetPropertyResult?>>()
      val hr = fn.invokeHR(arrayOf(__398239034_Ptr, marshalToNative(propertyId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaFrameSourceGetPropertyResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetPropertyAsync(propertyId: String?, propertyValue: IUnknown?):
        IAsyncOperation<MediaFrameSourceSetPropertyStatus?>? {
      val fnPtr = _398239034_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MediaFrameSourceSetPropertyStatus?>>()
      val hr = fn.invokeHR(arrayOf(__398239034_Ptr, marshalToNative(propertyId),
          marshalToNative(propertyValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MediaFrameSourceSetPropertyStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_VideoDeviceController(): VideoDeviceController? {
      val fnPtr = _398239034_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDeviceController>()
      val hr = fn.invokeHR(arrayOf(__398239034_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoDeviceController>(result.getValue())
      return resultValue
    }
  }

  public class IMediaFrameSourceController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __398239034_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaFrameSourceController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d076635316d4b8fb7b6eeb04a8c6525")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaFrameSourceController(ptr: Pointer?): WithDefault =
        IMediaFrameSourceController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaFrameSourceController {
      val address = segment.toRawLongValue()
      return makeIMediaFrameSourceController(Pointer(address))
    }

    public override fun toNative(obj: IMediaFrameSourceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__398239034_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaFrameSourceController):
        Array<IMediaFrameSourceController?> = (elements as
        Array<IMediaFrameSourceController?>).castToImpl<IMediaFrameSourceController,IMediaFrameSourceController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaFrameSourceController?> =
        arrayOfNulls<IMediaFrameSourceController_Impl>(size) as Array<IMediaFrameSourceController?>
  }
}
