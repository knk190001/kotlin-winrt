package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IGattDeviceService.ABI::class)
@Signature("{ac7b7c05-b33c-47cf-990f-6b8f5577df71}")
@Guid("ac7b7c05b33c47cf990f6b8f5577df71")
@WinRTInterface("ac7b7c05b33c47cf990f6b8f5577df71")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDeviceService.ByReference::class)
public interface IGattDeviceService : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun GetCharacteristics(characteristicUuid: com.sun.jna.platform.win32.Guid.GUID?):
      IVectorView<GattCharacteristic?>?

  @InterfaceMethod(1)
  public fun GetIncludedServices(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
      IVectorView<GattDeviceService?>?

  @InterfaceMethod(2)
  public fun get_DeviceId(): String?

  @InterfaceMethod(3)
  public fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(4)
  public fun get_AttributeHandle(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDeviceService> {
    public override fun getValue() = ABI.makeIGattDeviceService(pointer.getPointer(0))

    public fun setValue(value: IGattDeviceService_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDeviceService, IClosable.WithDefault {
    public val __247464612_Ptr: Pointer?

    public val _247464612_VtblPtr: Pointer?
      get() = __247464612_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun GetCharacteristics(characteristicUuid: com.sun.jna.platform.win32.Guid.GUID?):
        IVectorView<GattCharacteristic?>? {
      val fnPtr = _247464612_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattCharacteristic?>>()
      val hr = fn.invokeHR(arrayOf(__247464612_Ptr, marshalToNative(characteristicUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattCharacteristic?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetIncludedServices(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?):
        IVectorView<GattDeviceService?>? {
      val fnPtr = _247464612_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GattDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__247464612_Ptr, marshalToNative(serviceUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GattDeviceService?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DeviceId(): String? {
      val fnPtr = _247464612_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__247464612_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Uuid(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _247464612_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__247464612_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AttributeHandle(): WinDef.USHORT {
      val fnPtr = _247464612_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__247464612_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IGattDeviceService_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_247464612_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __247464612_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDeviceService, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac7b7c05b33c47cf990f6b8f5577df71")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDeviceService(ptr: Pointer?): WithDefault = IGattDeviceService_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDeviceService {
      val address = segment.toRawLongValue()
      return makeIGattDeviceService(Pointer(address))
    }

    public override fun toNative(obj: IGattDeviceService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__247464612_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDeviceService): Array<IGattDeviceService?> =
        (elements as
        Array<IGattDeviceService?>).castToImpl<IGattDeviceService,IGattDeviceService_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDeviceService?> =
        arrayOfNulls<IGattDeviceService_Impl>(size) as Array<IGattDeviceService?>
  }
}
