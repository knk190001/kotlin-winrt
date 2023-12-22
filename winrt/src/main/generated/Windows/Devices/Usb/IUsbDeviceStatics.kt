package Windows.Devices.Usb

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

@ABIMarker(IUsbDeviceStatics.ABI::class)
@Signature("{066b85a2-09b7-4446-8502-6fe6dcaa7309}")
@Guid("066b85a209b7444685026fe6dcaa7309")
@WinRTInterface("066b85a209b7444685026fe6dcaa7309")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbDeviceStatics.ByReference::class)
public interface IUsbDeviceStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeviceSelector(
    vendorId: WinDef.UINT,
    productId: WinDef.UINT,
    winUsbInterfaceClass: com.sun.jna.platform.win32.Guid.GUID?
  ): String?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(winUsbInterfaceClass: com.sun.jna.platform.win32.Guid.GUID?): String?

  @InterfaceMethod(2)
  public fun GetDeviceSelector(vendorId: WinDef.UINT, productId: WinDef.UINT): String?

  @InterfaceMethod(3)
  public fun GetDeviceClassSelector(usbClass: UsbDeviceClass?): String?

  @InterfaceMethod(4)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<UsbDevice?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbDeviceStatics> {
    public override fun getValue() = ABI.makeIUsbDeviceStatics(pointer.getPointer(0))

    public fun setValue(value: IUsbDeviceStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbDeviceStatics {
    public val __1877547820_Ptr: Pointer?

    public val _1877547820_VtblPtr: Pointer?
      get() = __1877547820_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeviceSelector(
      vendorId: WinDef.UINT,
      productId: WinDef.UINT,
      winUsbInterfaceClass: com.sun.jna.platform.win32.Guid.GUID?
    ): String? {
      val fnPtr = _1877547820_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1877547820_Ptr, vendorId, productId,
          marshalToNative(winUsbInterfaceClass), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun GetDeviceSelector(winUsbInterfaceClass: com.sun.jna.platform.win32.Guid.GUID?):
        String? {
      val fnPtr = _1877547820_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1877547820_Ptr, marshalToNative(winUsbInterfaceClass), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeviceSelector(vendorId: WinDef.UINT, productId: WinDef.UINT): String? {
      val fnPtr = _1877547820_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1877547820_Ptr, vendorId, productId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDeviceClassSelector(usbClass: UsbDeviceClass?): String? {
      val fnPtr = _1877547820_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1877547820_Ptr, marshalToNative(usbClass), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<UsbDevice?>? {
      val fnPtr = _1877547820_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UsbDevice?>>()
      val hr = fn.invokeHR(arrayOf(__1877547820_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<UsbDevice?>>(result.getValue())
      return resultValue
    }
  }

  public class IUsbDeviceStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1877547820_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbDeviceStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("066b85a209b7444685026fe6dcaa7309")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbDeviceStatics(ptr: Pointer?): WithDefault = IUsbDeviceStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbDeviceStatics {
      val address = segment.toRawLongValue()
      return makeIUsbDeviceStatics(Pointer(address))
    }

    public override fun toNative(obj: IUsbDeviceStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1877547820_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbDeviceStatics): Array<IUsbDeviceStatics?> = (elements
        as Array<IUsbDeviceStatics?>).castToImpl<IUsbDeviceStatics,IUsbDeviceStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbDeviceStatics?> =
        arrayOfNulls<IUsbDeviceStatics_Impl>(size) as Array<IUsbDeviceStatics?>
  }
}
