package Windows.Devices.Enumeration

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDeviceInformation.ABI::class)
@Signature("{aba0fb95-4398-489d-8e44-e6130927011f}")
@Guid("aba0fb954398489d8e44e6130927011f")
@WinRTInterface("aba0fb954398489d8e44e6130927011f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceInformation.ByReference::class)
public interface IDeviceInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Id(): String?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun get_IsEnabled(): Boolean

  @InterfaceMethod(3)
  public fun get_IsDefault(): Boolean

  @InterfaceMethod(4)
  public fun get_EnclosureLocation(): EnclosureLocation?

  @InterfaceMethod(5)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  @InterfaceMethod(6)
  public fun Update(updateInfo: DeviceInformationUpdate?): Unit

  @InterfaceMethod(7)
  public fun GetThumbnailAsync(): IAsyncOperation<DeviceThumbnail?>?

  @InterfaceMethod(8)
  public fun GetGlyphThumbnailAsync(): IAsyncOperation<DeviceThumbnail?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceInformation> {
    public override fun getValue() = ABI.makeIDeviceInformation(pointer.getPointer(0))

    public fun setValue(value: IDeviceInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceInformation {
    public val __1199312216_Ptr: Pointer?

    public val _1199312216_VtblPtr: Pointer?
      get() = __1199312216_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Id(): String? {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsEnabled(): Boolean {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsDefault(): Boolean {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_EnclosureLocation(): EnclosureLocation? {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EnclosureLocation>()
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EnclosureLocation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun Update(updateInfo: DeviceInformationUpdate?): Unit {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr, marshalToNative(updateInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun GetThumbnailAsync(): IAsyncOperation<DeviceThumbnail?>? {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceThumbnail?>>()
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceThumbnail?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetGlyphThumbnailAsync(): IAsyncOperation<DeviceThumbnail?>? {
      val fnPtr = _1199312216_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<DeviceThumbnail?>>()
      val hr = fn.invokeHR(arrayOf(__1199312216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<DeviceThumbnail?>>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1199312216_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aba0fb954398489d8e44e6130927011f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceInformation(ptr: Pointer?): WithDefault = IDeviceInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceInformation {
      val address = segment.toRawLongValue()
      return makeIDeviceInformation(Pointer(address))
    }

    public override fun toNative(obj: IDeviceInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1199312216_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceInformation): Array<IDeviceInformation?> =
        (elements as
        Array<IDeviceInformation?>).castToImpl<IDeviceInformation,IDeviceInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceInformation?> =
        arrayOfNulls<IDeviceInformation_Impl>(size) as Array<IDeviceInformation?>
  }
}
