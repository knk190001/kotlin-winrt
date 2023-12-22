package Windows.Devices.Enumeration

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

@ABIMarker(IDeviceAccessInformationStatics.ABI::class)
@Signature("{574bd3d3-5f30-45cd-8a94-724fe5973084}")
@Guid("574bd3d35f3045cd8a94724fe5973084")
@WinRTInterface("574bd3d35f3045cd8a94724fe5973084")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDeviceAccessInformationStatics.ByReference::class)
public interface IDeviceAccessInformationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromId(deviceId: String?): DeviceAccessInformation?

  @InterfaceMethod(1)
  public fun CreateFromDeviceClassId(deviceClassId: com.sun.jna.platform.win32.Guid.GUID?):
      DeviceAccessInformation?

  @InterfaceMethod(2)
  public fun CreateFromDeviceClass(deviceClass: DeviceClass?): DeviceAccessInformation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDeviceAccessInformationStatics> {
    public override fun getValue() = ABI.makeIDeviceAccessInformationStatics(pointer.getPointer(0))

    public fun setValue(value: IDeviceAccessInformationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDeviceAccessInformationStatics {
    public val __756373295_Ptr: Pointer?

    public val _756373295_VtblPtr: Pointer?
      get() = __756373295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromId(deviceId: String?): DeviceAccessInformation? {
      val fnPtr = _756373295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessInformation>()
      val hr = fn.invokeHR(arrayOf(__756373295_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun CreateFromDeviceClassId(deviceClassId: com.sun.jna.platform.win32.Guid.GUID?):
        DeviceAccessInformation? {
      val fnPtr = _756373295_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessInformation>()
      val hr = fn.invokeHR(arrayOf(__756373295_Ptr, marshalToNative(deviceClassId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromDeviceClass(deviceClass: DeviceClass?): DeviceAccessInformation? {
      val fnPtr = _756373295_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DeviceAccessInformation>()
      val hr = fn.invokeHR(arrayOf(__756373295_Ptr, marshalToNative(deviceClass), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DeviceAccessInformation>(result.getValue())
      return resultValue
    }
  }

  public class IDeviceAccessInformationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __756373295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDeviceAccessInformationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("574bd3d35f3045cd8a94724fe5973084")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDeviceAccessInformationStatics(ptr: Pointer?): WithDefault =
        IDeviceAccessInformationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDeviceAccessInformationStatics {
      val address = segment.toRawLongValue()
      return makeIDeviceAccessInformationStatics(Pointer(address))
    }

    public override fun toNative(obj: IDeviceAccessInformationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__756373295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDeviceAccessInformationStatics):
        Array<IDeviceAccessInformationStatics?> = (elements as
        Array<IDeviceAccessInformationStatics?>).castToImpl<IDeviceAccessInformationStatics,IDeviceAccessInformationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDeviceAccessInformationStatics?> =
        arrayOfNulls<IDeviceAccessInformationStatics_Impl>(size) as
        Array<IDeviceAccessInformationStatics?>
  }
}
