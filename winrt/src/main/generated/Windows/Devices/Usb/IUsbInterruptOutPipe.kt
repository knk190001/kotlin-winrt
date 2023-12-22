package Windows.Devices.Usb

import Windows.Foundation.IAsyncAction
import Windows.Storage.Streams.IOutputStream
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUsbInterruptOutPipe.ABI::class)
@Signature("{e984c8a9-aaf9-49d0-b96c-f661ab4a7f95}")
@Guid("e984c8a9aaf949d0b96cf661ab4a7f95")
@WinRTInterface("e984c8a9aaf949d0b96cf661ab4a7f95")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterruptOutPipe.ByReference::class)
public interface IUsbInterruptOutPipe : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EndpointDescriptor(): UsbInterruptOutEndpointDescriptor?

  @InterfaceMethod(1)
  public fun ClearStallAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun put_WriteOptions(value: UsbWriteOptions?): Unit

  @InterfaceMethod(3)
  public fun get_WriteOptions(): UsbWriteOptions?

  @InterfaceMethod(4)
  public fun get_OutputStream(): IOutputStream?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbInterruptOutPipe> {
    public override fun getValue() = ABI.makeIUsbInterruptOutPipe(pointer.getPointer(0))

    public fun setValue(value: IUsbInterruptOutPipe_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterruptOutPipe {
    public val __2078694788_Ptr: Pointer?

    public val _2078694788_VtblPtr: Pointer?
      get() = __2078694788_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EndpointDescriptor(): UsbInterruptOutEndpointDescriptor? {
      val fnPtr = _2078694788_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterruptOutEndpointDescriptor>()
      val hr = fn.invokeHR(arrayOf(__2078694788_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterruptOutEndpointDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ClearStallAsync(): IAsyncAction? {
      val fnPtr = _2078694788_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2078694788_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_WriteOptions(value: UsbWriteOptions?): Unit {
      val fnPtr = _2078694788_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2078694788_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_WriteOptions(): UsbWriteOptions? {
      val fnPtr = _2078694788_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbWriteOptions>()
      val hr = fn.invokeHR(arrayOf(__2078694788_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbWriteOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_OutputStream(): IOutputStream? {
      val fnPtr = _2078694788_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IOutputStream>()
      val hr = fn.invokeHR(arrayOf(__2078694788_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IOutputStream>(result.getValue())
      return resultValue
    }
  }

  public class IUsbInterruptOutPipe_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2078694788_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterruptOutPipe, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e984c8a9aaf949d0b96cf661ab4a7f95")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterruptOutPipe(ptr: Pointer?): WithDefault = IUsbInterruptOutPipe_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterruptOutPipe {
      val address = segment.toRawLongValue()
      return makeIUsbInterruptOutPipe(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterruptOutPipe): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2078694788_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterruptOutPipe): Array<IUsbInterruptOutPipe?> =
        (elements as
        Array<IUsbInterruptOutPipe?>).castToImpl<IUsbInterruptOutPipe,IUsbInterruptOutPipe_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterruptOutPipe?> =
        arrayOfNulls<IUsbInterruptOutPipe_Impl>(size) as Array<IUsbInterruptOutPipe?>
  }
}
