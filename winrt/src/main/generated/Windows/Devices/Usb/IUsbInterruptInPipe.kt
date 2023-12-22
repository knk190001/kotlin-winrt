package Windows.Devices.Usb

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IUsbInterruptInPipe.ABI::class)
@Signature("{fa007116-84d7-48c7-8a3f-4c0b235f2ea6}")
@Guid("fa00711684d748c78a3f4c0b235f2ea6")
@WinRTInterface("fa00711684d748c78a3f4c0b235f2ea6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUsbInterruptInPipe.ByReference::class)
public interface IUsbInterruptInPipe : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EndpointDescriptor(): UsbInterruptInEndpointDescriptor?

  @InterfaceMethod(1)
  public fun ClearStallAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun add_DataReceived(handler: TypedEventHandler<UsbInterruptInPipe?,
      UsbInterruptInEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DataReceived(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUsbInterruptInPipe> {
    public override fun getValue() = ABI.makeIUsbInterruptInPipe(pointer.getPointer(0))

    public fun setValue(value: IUsbInterruptInPipe_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUsbInterruptInPipe {
    public val __1493268461_Ptr: Pointer?

    public val _1493268461_VtblPtr: Pointer?
      get() = __1493268461_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EndpointDescriptor(): UsbInterruptInEndpointDescriptor? {
      val fnPtr = _1493268461_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UsbInterruptInEndpointDescriptor>()
      val hr = fn.invokeHR(arrayOf(__1493268461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UsbInterruptInEndpointDescriptor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ClearStallAsync(): IAsyncAction? {
      val fnPtr = _1493268461_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1493268461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_DataReceived(handler: TypedEventHandler<UsbInterruptInPipe?,
        UsbInterruptInEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1493268461_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1493268461_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DataReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1493268461_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1493268461_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUsbInterruptInPipe_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1493268461_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUsbInterruptInPipe, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa00711684d748c78a3f4c0b235f2ea6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUsbInterruptInPipe(ptr: Pointer?): WithDefault = IUsbInterruptInPipe_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUsbInterruptInPipe {
      val address = segment.toRawLongValue()
      return makeIUsbInterruptInPipe(Pointer(address))
    }

    public override fun toNative(obj: IUsbInterruptInPipe): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1493268461_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUsbInterruptInPipe): Array<IUsbInterruptInPipe?> =
        (elements as
        Array<IUsbInterruptInPipe?>).castToImpl<IUsbInterruptInPipe,IUsbInterruptInPipe_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUsbInterruptInPipe?> =
        arrayOfNulls<IUsbInterruptInPipe_Impl>(size) as Array<IUsbInterruptInPipe?>
  }
}
