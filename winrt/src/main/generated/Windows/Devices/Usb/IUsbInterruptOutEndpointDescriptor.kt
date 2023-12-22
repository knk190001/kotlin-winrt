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

@ABIMarker(IUsbInterruptOutEndpointDescriptor.ABI::class)
@Signature("{cc9fed81-10ca-4533-952d-9e278341e80f}")
@Guid("cc9fed8110ca4533952d9e278341e80f")
@WinRTInterface("cc9fed8110ca4533952d9e278341e80f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterruptOutEndpointDescriptor.ByReference::class)
public interface IUsbInterruptOutEndpointDescriptor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxPacketSize(): WinDef.UINT

  @InterfaceMethod(1)
  public fun get_EndpointNumber(): Byte

  @InterfaceMethod(2)
  public fun get_Interval(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_Pipe(): UsbInterruptOutPipe?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbInterruptOutEndpointDescriptor> {
    public override fun getValue() =
        ABI.makeIUsbInterruptOutEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: IUsbInterruptOutEndpointDescriptor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterruptOutEndpointDescriptor {
    public val __2120861902_Ptr: Pointer?

    public val _2120861902_VtblPtr: Pointer?
      get() = __2120861902_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxPacketSize(): WinDef.UINT {
      val fnPtr = _2120861902_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2120861902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_EndpointNumber(): Byte {
      val fnPtr = _2120861902_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__2120861902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Interval(): TimeSpan? {
      val fnPtr = _2120861902_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__2120861902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Pipe(): UsbInterruptOutPipe? {
      val fnPtr = _2120861902_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterruptOutPipe>()
      val hr = fn.invokeHR(arrayOf(__2120861902_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterruptOutPipe>(result.getValue())
      return resultValue
    }
  }

  public class IUsbInterruptOutEndpointDescriptor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2120861902_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterruptOutEndpointDescriptor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc9fed8110ca4533952d9e278341e80f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterruptOutEndpointDescriptor(ptr: Pointer?): WithDefault =
        IUsbInterruptOutEndpointDescriptor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterruptOutEndpointDescriptor {
      val address = segment.toRawLongValue()
      return makeIUsbInterruptOutEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterruptOutEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2120861902_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterruptOutEndpointDescriptor):
        Array<IUsbInterruptOutEndpointDescriptor?> = (elements as
        Array<IUsbInterruptOutEndpointDescriptor?>).castToImpl<IUsbInterruptOutEndpointDescriptor,IUsbInterruptOutEndpointDescriptor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterruptOutEndpointDescriptor?> =
        arrayOfNulls<IUsbInterruptOutEndpointDescriptor_Impl>(size) as
        Array<IUsbInterruptOutEndpointDescriptor?>
  }
}
