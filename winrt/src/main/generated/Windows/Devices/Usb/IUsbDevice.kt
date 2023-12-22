package Windows.Devices.Usb

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.Streams.IBuffer
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbDevice.ABI::class)
@Signature("{5249b992-c456-44d5-ad5e-24f5a089f63b}")
@Guid("5249b992c45644d5ad5e24f5a089f63b")
@WinRTInterface("5249b992c45644d5ad5e24f5a089f63b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbDevice.ByReference::class)
public interface IUsbDevice : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun SendControlOutTransferAsync(setupPacket: UsbSetupPacket?, buffer: IBuffer?):
      IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(1)
  public fun SendControlOutTransferAsync(setupPacket: UsbSetupPacket?):
      IAsyncOperation<WinDef.UINT>?

  @InterfaceMethod(2)
  public fun SendControlInTransferAsync(setupPacket: UsbSetupPacket?, buffer: IBuffer?):
      IAsyncOperation<IBuffer?>?

  @InterfaceMethod(3)
  public fun SendControlInTransferAsync(setupPacket: UsbSetupPacket?): IAsyncOperation<IBuffer?>?

  @InterfaceMethod(4)
  public fun get_DefaultInterface(): UsbInterface?

  @InterfaceMethod(5)
  public fun get_DeviceDescriptor(): UsbDeviceDescriptor?

  @InterfaceMethod(6)
  public fun get_Configuration(): UsbConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUsbDevice> {
    public override fun getValue() = ABI.makeIUsbDevice(pointer.getPointer(0))

    public fun setValue(value: IUsbDevice_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbDevice, IClosable.WithDefault {
    public val __1488410201_Ptr: Pointer?

    public val _1488410201_VtblPtr: Pointer?
      get() = __1488410201_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendControlOutTransferAsync(setupPacket: UsbSetupPacket?, buffer: IBuffer?):
        IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1488410201_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1488410201_Ptr, marshalToNative(setupPacket),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SendControlOutTransferAsync(setupPacket: UsbSetupPacket?):
        IAsyncOperation<WinDef.UINT>? {
      val fnPtr = _1488410201_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WinDef.UINT>>()
      val hr = fn.invokeHR(arrayOf(__1488410201_Ptr, marshalToNative(setupPacket), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WinDef.UINT>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SendControlInTransferAsync(setupPacket: UsbSetupPacket?, buffer: IBuffer?):
        IAsyncOperation<IBuffer?>? {
      val fnPtr = _1488410201_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1488410201_Ptr, marshalToNative(setupPacket),
          marshalToNative(buffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SendControlInTransferAsync(setupPacket: UsbSetupPacket?):
        IAsyncOperation<IBuffer?>? {
      val fnPtr = _1488410201_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1488410201_Ptr, marshalToNative(setupPacket), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_DefaultInterface(): UsbInterface? {
      val fnPtr = _1488410201_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterface>()
      val hr = fn.invokeHR(arrayOf(__1488410201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DeviceDescriptor(): UsbDeviceDescriptor? {
      val fnPtr = _1488410201_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbDeviceDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1488410201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbDeviceDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Configuration(): UsbConfiguration? {
      val fnPtr = _1488410201_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1488410201_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IUsbDevice_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1488410201_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1488410201_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbDevice, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5249b992c45644d5ad5e24f5a089f63b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbDevice(ptr: Pointer?): WithDefault = IUsbDevice_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbDevice {
      val address = segment.toRawLongValue()
      return makeIUsbDevice(Pointer(address))
    }

    public override fun toNative(obj: IUsbDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1488410201_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbDevice): Array<IUsbDevice?> = (elements as
        Array<IUsbDevice?>).castToImpl<IUsbDevice,IUsbDevice_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbDevice?> = arrayOfNulls<IUsbDevice_Impl>(size)
        as Array<IUsbDevice?>
  }
}
