package Windows.Media.Devices

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Media.Capture.MediaStreamType
import Windows.Media.MediaProperties.IMediaEncodingProperties
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

@ABIMarker(IMediaDeviceController.ABI::class)
@Signature("{f6f8f5ce-209a-48fb-86fc-d44578f317e6}")
@Guid("f6f8f5ce209a48fb86fcd44578f317e6")
@WinRTInterface("f6f8f5ce209a48fb86fcd44578f317e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaDeviceController.ByReference::class)
public interface IMediaDeviceController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAvailableMediaStreamProperties(mediaStreamType: MediaStreamType?):
      IVectorView<IMediaEncodingProperties?>?

  @InterfaceMethod(1)
  public fun GetMediaStreamProperties(mediaStreamType: MediaStreamType?): IMediaEncodingProperties?

  @InterfaceMethod(2)
  public fun SetMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType?,
      mediaEncodingProperties: IMediaEncodingProperties?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaDeviceController> {
    public override fun getValue() = ABI.makeIMediaDeviceController(pointer.getPointer(0))

    public fun setValue(value: IMediaDeviceController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaDeviceController {
    public val __1516491797_Ptr: Pointer?

    public val _1516491797_VtblPtr: Pointer?
      get() = __1516491797_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAvailableMediaStreamProperties(mediaStreamType: MediaStreamType?):
        IVectorView<IMediaEncodingProperties?>? {
      val fnPtr = _1516491797_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<IMediaEncodingProperties?>>()
      val hr = fn.invokeHR(arrayOf(__1516491797_Ptr, marshalToNative(mediaStreamType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<IMediaEncodingProperties?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetMediaStreamProperties(mediaStreamType: MediaStreamType?):
        IMediaEncodingProperties? {
      val fnPtr = _1516491797_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaEncodingProperties>()
      val hr = fn.invokeHR(arrayOf(__1516491797_Ptr, marshalToNative(mediaStreamType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaEncodingProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetMediaStreamPropertiesAsync(mediaStreamType: MediaStreamType?,
        mediaEncodingProperties: IMediaEncodingProperties?): IAsyncAction? {
      val fnPtr = _1516491797_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1516491797_Ptr, marshalToNative(mediaStreamType),
          marshalToNative(mediaEncodingProperties), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IMediaDeviceController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1516491797_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaDeviceController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6f8f5ce209a48fb86fcd44578f317e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaDeviceController(ptr: Pointer?): WithDefault =
        IMediaDeviceController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaDeviceController {
      val address = segment.toRawLongValue()
      return makeIMediaDeviceController(Pointer(address))
    }

    public override fun toNative(obj: IMediaDeviceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1516491797_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaDeviceController): Array<IMediaDeviceController?> =
        (elements as
        Array<IMediaDeviceController?>).castToImpl<IMediaDeviceController,IMediaDeviceController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaDeviceController?> =
        arrayOfNulls<IMediaDeviceController_Impl>(size) as Array<IMediaDeviceController?>
  }
}
