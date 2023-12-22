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

@ABIMarker(IUsbEndpointDescriptor.ABI::class)
@Signature("{6b4862d9-8df7-4b40-ac83-578f139f0575}")
@Guid("6b4862d98df74b40ac83578f139f0575")
@WinRTInterface("6b4862d98df74b40ac83578f139f0575")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbEndpointDescriptor.ByReference::class)
public interface IUsbEndpointDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EndpointNumber(): Byte

  @InterfaceMethod(1)
  public fun get_Direction(): UsbTransferDirection?

  @InterfaceMethod(2)
  public fun get_EndpointType(): UsbEndpointType?

  @InterfaceMethod(3)
  public fun get_AsBulkInEndpointDescriptor(): UsbBulkInEndpointDescriptor?

  @InterfaceMethod(4)
  public fun get_AsInterruptInEndpointDescriptor(): UsbInterruptInEndpointDescriptor?

  @InterfaceMethod(5)
  public fun get_AsBulkOutEndpointDescriptor(): UsbBulkOutEndpointDescriptor?

  @InterfaceMethod(6)
  public fun get_AsInterruptOutEndpointDescriptor(): UsbInterruptOutEndpointDescriptor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbEndpointDescriptor> {
    public override fun getValue() = ABI.makeIUsbEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbEndpointDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbEndpointDescriptor {
    public val __2116361625_Ptr: Pointer?

    public val _2116361625_VtblPtr: Pointer?
      get() = __2116361625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EndpointNumber(): Byte {
      val fnPtr = _2116361625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__2116361625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Direction(): UsbTransferDirection? {
      val fnPtr = _2116361625_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbTransferDirection>()
      val hr = fn.invokeHR(arrayOf(__2116361625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbTransferDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_EndpointType(): UsbEndpointType? {
      val fnPtr = _2116361625_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbEndpointType>()
      val hr = fn.invokeHR(arrayOf(__2116361625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbEndpointType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_AsBulkInEndpointDescriptor(): UsbBulkInEndpointDescriptor? {
      val fnPtr = _2116361625_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbBulkInEndpointDescriptor>()
      val hr = fn.invokeHR(arrayOf(__2116361625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbBulkInEndpointDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AsInterruptInEndpointDescriptor(): UsbInterruptInEndpointDescriptor? {
      val fnPtr = _2116361625_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterruptInEndpointDescriptor>()
      val hr = fn.invokeHR(arrayOf(__2116361625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterruptInEndpointDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_AsBulkOutEndpointDescriptor(): UsbBulkOutEndpointDescriptor? {
      val fnPtr = _2116361625_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbBulkOutEndpointDescriptor>()
      val hr = fn.invokeHR(arrayOf(__2116361625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbBulkOutEndpointDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_AsInterruptOutEndpointDescriptor(): UsbInterruptOutEndpointDescriptor? {
      val fnPtr = _2116361625_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterruptOutEndpointDescriptor>()
      val hr = fn.invokeHR(arrayOf(__2116361625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterruptOutEndpointDescriptor>(result.getValue())
      return resultValue
    }
  }

  public class IUsbEndpointDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2116361625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbEndpointDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b4862d98df74b40ac83578f139f0575")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbEndpointDescriptor(ptr: Pointer?): WithDefault =
        IUsbEndpointDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbEndpointDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2116361625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbEndpointDescriptor): Array<IUsbEndpointDescriptor?> =
        (elements as
        Array<IUsbEndpointDescriptor?>).castToImpl<IUsbEndpointDescriptor,IUsbEndpointDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbEndpointDescriptor?> =
        arrayOfNulls<IUsbEndpointDescriptor_Impl>(size) as Array<IUsbEndpointDescriptor?>
  }
}
