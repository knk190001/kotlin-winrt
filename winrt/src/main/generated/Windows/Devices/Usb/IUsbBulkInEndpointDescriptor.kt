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

@ABIMarker(IUsbBulkInEndpointDescriptor.ABI::class)
@Signature("{3c6e4846-06cf-42a9-9dc2-971c1b14b6e3}")
@Guid("3c6e484606cf42a99dc2971c1b14b6e3")
@WinRTInterface("3c6e484606cf42a99dc2971c1b14b6e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbBulkInEndpointDescriptor.ByReference::class)
public interface IUsbBulkInEndpointDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxPacketSize(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_EndpointNumber(): Byte

  @InterfaceMethod(2)
  public fun get_Pipe(): UsbBulkInPipe?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbBulkInEndpointDescriptor> {
    public override fun getValue() = ABI.makeIUsbBulkInEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbBulkInEndpointDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbBulkInEndpointDescriptor {
    public val __302245470_Ptr: Pointer?

    public val _302245470_VtblPtr: Pointer?
      get() = __302245470_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPacketSize(): WinDef.UINT {
      val fnPtr = _302245470_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__302245470_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EndpointNumber(): Byte {
      val fnPtr = _302245470_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__302245470_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Pipe(): UsbBulkInPipe? {
      val fnPtr = _302245470_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbBulkInPipe>()
      val hr = fn.invokeHR(arrayOf(__302245470_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbBulkInPipe>(result.getValue())
      return resultValue
    }
  }

  public class IUsbBulkInEndpointDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __302245470_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbBulkInEndpointDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c6e484606cf42a99dc2971c1b14b6e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbBulkInEndpointDescriptor(ptr: Pointer?): WithDefault =
        IUsbBulkInEndpointDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbBulkInEndpointDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbBulkInEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbBulkInEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__302245470_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbBulkInEndpointDescriptor):
        Array<IUsbBulkInEndpointDescriptor?> = (elements as
        Array<IUsbBulkInEndpointDescriptor?>).castToImpl<IUsbBulkInEndpointDescriptor,IUsbBulkInEndpointDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbBulkInEndpointDescriptor?> =
        arrayOfNulls<IUsbBulkInEndpointDescriptor_Impl>(size) as
        Array<IUsbBulkInEndpointDescriptor?>
  }
}
