package Windows.System.Profile.SystemManufacturers

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

@ABIMarker(ISystemSupportDeviceInfo.ABI::class)
@Signature("{05880b99-8247-441b-a996-a1784bab79a8}")
@Guid("05880b998247441ba996a1784bab79a8")
@WinRTInterface("05880b998247441ba996a1784bab79a8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemSupportDeviceInfo.ByReference::class)
public interface ISystemSupportDeviceInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OperatingSystem(): String?

  @InterfaceMethod(1)
  public fun get_FriendlyName(): String?

  @InterfaceMethod(2)
  public fun get_SystemManufacturer(): String?

  @InterfaceMethod(3)
  public fun get_SystemProductName(): String?

  @InterfaceMethod(4)
  public fun get_SystemSku(): String?

  @InterfaceMethod(5)
  public fun get_SystemHardwareVersion(): String?

  @InterfaceMethod(6)
  public fun get_SystemFirmwareVersion(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemSupportDeviceInfo> {
    public override fun getValue() = ABI.makeISystemSupportDeviceInfo(pointer.getPointer(0))

    public fun setValue(value: ISystemSupportDeviceInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemSupportDeviceInfo {
    public val __573546357_Ptr: Pointer?

    public val _573546357_VtblPtr: Pointer?
      get() = __573546357_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OperatingSystem(): String? {
      val fnPtr = _573546357_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573546357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FriendlyName(): String? {
      val fnPtr = _573546357_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573546357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SystemManufacturer(): String? {
      val fnPtr = _573546357_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573546357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SystemProductName(): String? {
      val fnPtr = _573546357_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573546357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SystemSku(): String? {
      val fnPtr = _573546357_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573546357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SystemHardwareVersion(): String? {
      val fnPtr = _573546357_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573546357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SystemFirmwareVersion(): String? {
      val fnPtr = _573546357_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__573546357_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISystemSupportDeviceInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __573546357_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemSupportDeviceInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05880b998247441ba996a1784bab79a8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemSupportDeviceInfo(ptr: Pointer?): WithDefault =
        ISystemSupportDeviceInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemSupportDeviceInfo {
      val address = segment.toRawLongValue()
      return makeISystemSupportDeviceInfo(Pointer(address))
    }

    public override fun toNative(obj: ISystemSupportDeviceInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__573546357_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemSupportDeviceInfo):
        Array<ISystemSupportDeviceInfo?> = (elements as
        Array<ISystemSupportDeviceInfo?>).castToImpl<ISystemSupportDeviceInfo,ISystemSupportDeviceInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemSupportDeviceInfo?> =
        arrayOfNulls<ISystemSupportDeviceInfo_Impl>(size) as Array<ISystemSupportDeviceInfo?>
  }
}
