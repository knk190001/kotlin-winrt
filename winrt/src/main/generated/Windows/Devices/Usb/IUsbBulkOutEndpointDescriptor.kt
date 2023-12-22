package Windows.Devices.Usb

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbBulkOutEndpointDescriptor.ABI::class)
@Signature("{2820847a-ffee-4f60-9be1-956cac3ecb65}")
@Guid("2820847affee4f609be1956cac3ecb65")
@WinRTInterface("2820847affee4f609be1956cac3ecb65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbBulkOutEndpointDescriptor.ByReference::class)
public interface IUsbBulkOutEndpointDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxPacketSize(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_EndpointNumber(): Byte

  @InterfaceMethod(2)
  public fun get_Pipe(): UsbBulkOutPipe?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbBulkOutEndpointDescriptor> {
    public override fun getValue() = ABI.makeIUsbBulkOutEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbBulkOutEndpointDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbBulkOutEndpointDescriptor {
    public val __1035998205_Ptr: Pointer?

    public val _1035998205_VtblPtr: Pointer?
      get() = __1035998205_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPacketSize(): WinDef.UINT {
      val fnPtr = _1035998205_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1035998205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EndpointNumber(): Byte {
      val fnPtr = _1035998205_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1035998205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Pipe(): UsbBulkOutPipe? {
      val fnPtr = _1035998205_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbBulkOutPipe>()
      val hr = fn.invokeHR(arrayOf(__1035998205_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbBulkOutPipe>(result.getValue())
      return resultValue
    }
  }

  public class IUsbBulkOutEndpointDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1035998205_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbBulkOutEndpointDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2820847affee4f609be1956cac3ecb65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbBulkOutEndpointDescriptor(ptr: Pointer?): WithDefault =
        IUsbBulkOutEndpointDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbBulkOutEndpointDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbBulkOutEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbBulkOutEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1035998205_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbBulkOutEndpointDescriptor):
        Array<IUsbBulkOutEndpointDescriptor?> = (elements as
        Array<IUsbBulkOutEndpointDescriptor?>).castToImpl<IUsbBulkOutEndpointDescriptor,IUsbBulkOutEndpointDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbBulkOutEndpointDescriptor?> =
        arrayOfNulls<IUsbBulkOutEndpointDescriptor_Impl>(size) as
        Array<IUsbBulkOutEndpointDescriptor?>
  }
}
