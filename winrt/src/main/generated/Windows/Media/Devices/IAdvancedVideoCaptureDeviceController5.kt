package Windows.Media.Devices

import Windows.Foundation.IReference
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Byte
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdvancedVideoCaptureDeviceController5.ABI::class)
@Signature("{33512b17-b9cb-4a23-b875-f9eaab535492}")
@Guid("33512b17b9cb4a23b875f9eaab535492")
@WinRTInterface("33512b17b9cb4a23b875f9eaab535492")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvancedVideoCaptureDeviceController5.ByReference::class)
public interface IAdvancedVideoCaptureDeviceController5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun GetDevicePropertyById(propertyId: String?,
      maxPropertyValueSize: IReference<WinDef.UINT>?): VideoDeviceControllerGetDevicePropertyResult?

  @InterfaceMethod(2)
  public fun SetDevicePropertyById(propertyId: String?, propertyValue: IUnknown?):
      VideoDeviceControllerSetDevicePropertyStatus?

  @InterfaceMethod(3)
  public fun GetDevicePropertyByExtendedId(extendedPropertyId: Array<Byte>,
      maxPropertyValueSize: IReference<WinDef.UINT>?): VideoDeviceControllerGetDevicePropertyResult?

  @InterfaceMethod(4)
  public fun SetDevicePropertyByExtendedId(extendedPropertyId: Array<Byte>,
      propertyValue: Array<Byte>): VideoDeviceControllerSetDevicePropertyStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvancedVideoCaptureDeviceController5> {
    public override fun getValue() =
        ABI.makeIAdvancedVideoCaptureDeviceController5(pointer.getPointer(0))

    public fun setValue(value: IAdvancedVideoCaptureDeviceController5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvancedVideoCaptureDeviceController5 {
    public val __71515989_Ptr: Pointer?

    public val _71515989_VtblPtr: Pointer?
      get() = __71515989_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _71515989_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__71515989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDevicePropertyById(propertyId: String?,
        maxPropertyValueSize: IReference<WinDef.UINT>?):
        VideoDeviceControllerGetDevicePropertyResult? {
      val fnPtr = _71515989_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDeviceControllerGetDevicePropertyResult>()
      val hr = fn.invokeHR(arrayOf(__71515989_Ptr, marshalToNative(propertyId),
          marshalToNative(maxPropertyValueSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<VideoDeviceControllerGetDevicePropertyResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetDevicePropertyById(propertyId: String?, propertyValue: IUnknown?):
        VideoDeviceControllerSetDevicePropertyStatus? {
      val fnPtr = _71515989_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDeviceControllerSetDevicePropertyStatus>()
      val hr = fn.invokeHR(arrayOf(__71515989_Ptr, marshalToNative(propertyId),
          marshalToNative(propertyValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<VideoDeviceControllerSetDevicePropertyStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDevicePropertyByExtendedId(extendedPropertyId: Array<Byte>,
        maxPropertyValueSize: IReference<WinDef.UINT>?):
        VideoDeviceControllerGetDevicePropertyResult? {
      val fnPtr = _71515989_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDeviceControllerGetDevicePropertyResult>()
      val hr = fn.invokeHR(arrayOf(__71515989_Ptr,
          extendedPropertyId.size,marshalToNative(extendedPropertyId),
          marshalToNative(maxPropertyValueSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<VideoDeviceControllerGetDevicePropertyResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun SetDevicePropertyByExtendedId(extendedPropertyId: Array<Byte>,
        propertyValue: Array<Byte>): VideoDeviceControllerSetDevicePropertyStatus? {
      val fnPtr = _71515989_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDeviceControllerSetDevicePropertyStatus>()
      val hr = fn.invokeHR(arrayOf(__71515989_Ptr,
          extendedPropertyId.size,marshalToNative(extendedPropertyId),
          propertyValue.size,marshalToNative(propertyValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<VideoDeviceControllerSetDevicePropertyStatus>(result.getValue())
      return resultValue
    }
  }

  public class IAdvancedVideoCaptureDeviceController5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71515989_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvancedVideoCaptureDeviceController5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33512b17b9cb4a23b875f9eaab535492")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvancedVideoCaptureDeviceController5(ptr: Pointer?): WithDefault =
        IAdvancedVideoCaptureDeviceController5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvancedVideoCaptureDeviceController5 {
      val address = segment.toRawLongValue()
      return makeIAdvancedVideoCaptureDeviceController5(Pointer(address))
    }

    public override fun toNative(obj: IAdvancedVideoCaptureDeviceController5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__71515989_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvancedVideoCaptureDeviceController5):
        Array<IAdvancedVideoCaptureDeviceController5?> = (elements as
        Array<IAdvancedVideoCaptureDeviceController5?>).castToImpl<IAdvancedVideoCaptureDeviceController5,IAdvancedVideoCaptureDeviceController5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvancedVideoCaptureDeviceController5?> =
        arrayOfNulls<IAdvancedVideoCaptureDeviceController5_Impl>(size) as
        Array<IAdvancedVideoCaptureDeviceController5?>
  }
}
