package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGattDeviceServiceStatics.ABI::class)
@Signature("{196d0022-faad-45dc-ae5b-2ac3184e84db}")
@Guid("196d0022faad45dcae5b2ac3184e84db")
@WinRTInterface("196d0022faad45dcae5b2ac3184e84db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattDeviceServiceStatics.ByReference::class)
public interface IGattDeviceServiceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<GattDeviceService?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelectorFromUuid(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?): String?

  @InterfaceMethod(2)
  public fun GetDeviceSelectorFromShortId(serviceShortId: WinDef.USHORT): String?

  @InterfaceMethod(3)
  public fun ConvertShortIdToUuid(shortId: WinDef.USHORT): com.sun.jna.platform.win32.Guid.GUID?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattDeviceServiceStatics> {
    public override fun getValue() = ABI.makeIGattDeviceServiceStatics(pointer.getPointer(0))

    public fun setValue(value: IGattDeviceServiceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattDeviceServiceStatics {
    public val __436147329_Ptr: Pointer?

    public val _436147329_VtblPtr: Pointer?
      get() = __436147329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<GattDeviceService?>? {
      val fnPtr = _436147329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<GattDeviceService?>>()
      val hr = fn.invokeHR(arrayOf(__436147329_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<GattDeviceService?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun GetDeviceSelectorFromUuid(serviceUuid: com.sun.jna.platform.win32.Guid.GUID?): String? {
      val fnPtr = _436147329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__436147329_Ptr, marshalToNative(serviceUuid), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelectorFromShortId(serviceShortId: WinDef.USHORT): String? {
      val fnPtr = _436147329_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__436147329_Ptr, serviceShortId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun ConvertShortIdToUuid(shortId: WinDef.USHORT):
        com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _436147329_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__436147329_Ptr, shortId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }
  }

  public class IGattDeviceServiceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __436147329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattDeviceServiceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("196d0022faad45dcae5b2ac3184e84db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattDeviceServiceStatics(ptr: Pointer?): WithDefault =
        IGattDeviceServiceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattDeviceServiceStatics {
      val address = segment.toRawLongValue()
      return makeIGattDeviceServiceStatics(Pointer(address))
    }

    public override fun toNative(obj: IGattDeviceServiceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__436147329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattDeviceServiceStatics):
        Array<IGattDeviceServiceStatics?> = (elements as
        Array<IGattDeviceServiceStatics?>).castToImpl<IGattDeviceServiceStatics,IGattDeviceServiceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattDeviceServiceStatics?> =
        arrayOfNulls<IGattDeviceServiceStatics_Impl>(size) as Array<IGattDeviceServiceStatics?>
  }
}
