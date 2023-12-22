package Windows.Networking.NetworkOperators

import Windows.Devices.Sms.CellularClass
import Windows.Foundation.Collections.IVectorView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMobileBroadbandDeviceInformation.ABI::class)
@Signature("{e6d08168-e381-4c6e-9be8-fe156969a446}")
@Guid("e6d08168e3814c6e9be8fe156969a446")
@WinRTInterface("e6d08168e3814c6e9be8fe156969a446")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandDeviceInformation.ByReference::class)
public interface IMobileBroadbandDeviceInformation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NetworkDeviceStatus(): NetworkDeviceStatus?

  @InterfaceMethod(1)
  public fun get_Manufacturer(): String?

  @InterfaceMethod(2)
  public fun get_Model(): String?

  @InterfaceMethod(3)
  public fun get_FirmwareInformation(): String?

  @InterfaceMethod(4)
  public fun get_CellularClass(): CellularClass?

  @InterfaceMethod(5)
  public fun get_DataClasses(): DataClasses?

  @InterfaceMethod(6)
  public fun get_CustomDataClass(): String?

  @InterfaceMethod(7)
  public fun get_MobileEquipmentId(): String?

  @InterfaceMethod(8)
  public fun get_TelephoneNumbers(): IVectorView<String?>?

  @InterfaceMethod(9)
  public fun get_SubscriberId(): String?

  @InterfaceMethod(10)
  public fun get_SimIccId(): String?

  @InterfaceMethod(11)
  public fun get_DeviceType(): MobileBroadbandDeviceType?

  @InterfaceMethod(12)
  public fun get_DeviceId(): String?

  @InterfaceMethod(13)
  public fun get_CurrentRadioState(): MobileBroadbandRadioState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandDeviceInformation> {
    public override fun getValue() =
        ABI.makeIMobileBroadbandDeviceInformation(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandDeviceInformation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandDeviceInformation {
    public val __286274106_Ptr: Pointer?

    public val _286274106_VtblPtr: Pointer?
      get() = __286274106_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NetworkDeviceStatus(): NetworkDeviceStatus? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkDeviceStatus>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NetworkDeviceStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Manufacturer(): String? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Model(): String? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_FirmwareInformation(): String? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_CellularClass(): CellularClass? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CellularClass>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CellularClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DataClasses(): DataClasses? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataClasses>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataClasses>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_CustomDataClass(): String? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_MobileEquipmentId(): String? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TelephoneNumbers(): IVectorView<String?>? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_SubscriberId(): String? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SimIccId(): String? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_DeviceType(): MobileBroadbandDeviceType? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandDeviceType>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandDeviceType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_DeviceId(): String? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_CurrentRadioState(): MobileBroadbandRadioState? {
      val fnPtr = _286274106_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandRadioState>()
      val hr = fn.invokeHR(arrayOf(__286274106_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandRadioState>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandDeviceInformation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __286274106_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandDeviceInformation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6d08168e3814c6e9be8fe156969a446")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandDeviceInformation(ptr: Pointer?): WithDefault =
        IMobileBroadbandDeviceInformation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandDeviceInformation {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandDeviceInformation(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandDeviceInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__286274106_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandDeviceInformation):
        Array<IMobileBroadbandDeviceInformation?> = (elements as
        Array<IMobileBroadbandDeviceInformation?>).castToImpl<IMobileBroadbandDeviceInformation,IMobileBroadbandDeviceInformation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandDeviceInformation?> =
        arrayOfNulls<IMobileBroadbandDeviceInformation_Impl>(size) as
        Array<IMobileBroadbandDeviceInformation?>
  }
}
