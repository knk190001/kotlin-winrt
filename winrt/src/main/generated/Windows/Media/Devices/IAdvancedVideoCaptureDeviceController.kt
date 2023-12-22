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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdvancedVideoCaptureDeviceController.ABI::class)
@Signature("{de6ff4d3-2b96-4583-80ab-b5b01dc6a8d7}")
@Guid("de6ff4d32b96458380abb5b01dc6a8d7")
@WinRTInterface("de6ff4d32b96458380abb5b01dc6a8d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetDeviceProperty(propertyId: String?, propertyValue: IUnknown?): Unit

  @InterfaceMethod(1)
  public fun GetDeviceProperty(propertyId: String?): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController {
    public val __1798808352_Ptr: Pointer?

    public val _1798808352_VtblPtr: Pointer?
      get() = __1798808352_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetDeviceProperty(propertyId: String?, propertyValue: IUnknown?): Unit {
      val fnPtr = _1798808352_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1798808352_Ptr, marshalToNative(propertyId),
          marshalToNative(propertyValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetDeviceProperty(propertyId: String?): IUnknown? {
      val fnPtr = _1798808352_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1798808352_Ptr, marshalToNative(propertyId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1798808352_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de6ff4d32b96458380abb5b01dc6a8d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1798808352_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController):
        Array<IAdvancedVideoCaptureDeviceController?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController?>).castToImpl<IAdvancedVideoCaptureDeviceController,IAdvancedVideoCaptureDeviceController_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController?>
  }
}
