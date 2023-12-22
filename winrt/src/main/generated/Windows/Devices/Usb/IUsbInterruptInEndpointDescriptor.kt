package Windows.Devices.Usb

import Windows.Foundation.TimeSpan
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

@ABIMarker(IUsbInterruptInEndpointDescriptor.ABI::class)
@Signature("{c0528967-c911-4c3a-86b2-419c2da89039}")
@Guid("c0528967c9114c3a86b2419c2da89039")
@WinRTInterface("c0528967c9114c3a86b2419c2da89039")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterruptInEndpointDescriptor.ByReference::class)
public interface IUsbInterruptInEndpointDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxPacketSize(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_EndpointNumber(): Byte

  @InterfaceMethod(2)
  public fun get_Interval(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_Pipe(): UsbInterruptInPipe?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbInterruptInEndpointDescriptor> {
    public override fun getValue() =
        ABI.makeIUsbInterruptInEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbInterruptInEndpointDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterruptInEndpointDescriptor {
    public val __200411273_Ptr: Pointer?

    public val _200411273_VtblPtr: Pointer?
      get() = __200411273_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPacketSize(): WinDef.UINT {
      val fnPtr = _200411273_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__200411273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EndpointNumber(): Byte {
      val fnPtr = _200411273_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__200411273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Interval(): TimeSpan? {
      val fnPtr = _200411273_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__200411273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Pipe(): UsbInterruptInPipe? {
      val fnPtr = _200411273_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterruptInPipe>()
      val hr = fn.invokeHR(arrayOf(__200411273_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterruptInPipe>(result.getValue())
      return resultValue
    }
  }

  public class IUsbInterruptInEndpointDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __200411273_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterruptInEndpointDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0528967c9114c3a86b2419c2da89039")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterruptInEndpointDescriptor(ptr: Pointer?): WithDefault =
        IUsbInterruptInEndpointDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterruptInEndpointDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbInterruptInEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterruptInEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__200411273_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterruptInEndpointDescriptor):
        Array<IUsbInterruptInEndpointDescriptor?> = (elements as
        Array<IUsbInterruptInEndpointDescriptor?>).castToImpl<IUsbInterruptInEndpointDescriptor,IUsbInterruptInEndpointDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterruptInEndpointDescriptor?> =
        arrayOfNulls<IUsbInterruptInEndpointDescriptor_Impl>(size) as
        Array<IUsbInterruptInEndpointDescriptor?>
  }
}
