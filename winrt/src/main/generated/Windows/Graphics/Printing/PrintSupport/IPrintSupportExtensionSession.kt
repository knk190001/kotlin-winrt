package Windows.Graphics.Printing.PrintSupport

import Windows.Devices.Printers.IppPrintDevice
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IPrintSupportExtensionSession.ABI::class)
@Signature("{eea45f1a-f4c6-54b3-a0b8-a559839aa4c3}")
@Guid("eea45f1af4c654b3a0b8a559839aa4c3")
@WinRTInterface("eea45f1af4c654b3a0b8a559839aa4c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintSupportExtensionSession.ByReference::class)
public interface IPrintSupportExtensionSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Printer(): IppPrintDevice?

  @InterfaceMethod(1)
  public
      fun add_PrintTicketValidationRequested(handler: TypedEventHandler<PrintSupportExtensionSession?,
      PrintSupportPrintTicketValidationRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_PrintTicketValidationRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public
      fun add_PrintDeviceCapabilitiesChanged(handler: TypedEventHandler<PrintSupportExtensionSession?,
      PrintSupportPrintDeviceCapabilitiesChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PrintDeviceCapabilitiesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintSupportExtensionSession> {
    public override fun getValue() = ABI.makeIPrintSupportExtensionSession(pointer.getPointer(0))

    public fun setValue(value: IPrintSupportExtensionSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintSupportExtensionSession {
    public val __867532831_Ptr: Pointer?

    public val _867532831_VtblPtr: Pointer?
      get() = __867532831_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Printer(): IppPrintDevice? {
      val fnPtr = _867532831_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IppPrintDevice>()
      val hr = fn.invokeHR(arrayOf(__867532831_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IppPrintDevice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_PrintTicketValidationRequested(handler: TypedEventHandler<PrintSupportExtensionSession?,
        PrintSupportPrintTicketValidationRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _867532831_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__867532831_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_PrintTicketValidationRequested(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _867532831_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__867532831_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun add_PrintDeviceCapabilitiesChanged(handler: TypedEventHandler<PrintSupportExtensionSession?,
        PrintSupportPrintDeviceCapabilitiesChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _867532831_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__867532831_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PrintDeviceCapabilitiesChanged(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _867532831_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__867532831_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Start(): Unit {
      val fnPtr = _867532831_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__867532831_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintSupportExtensionSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __867532831_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintSupportExtensionSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eea45f1af4c654b3a0b8a559839aa4c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintSupportExtensionSession(ptr: Pointer?): WithDefault =
        IPrintSupportExtensionSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintSupportExtensionSession {
      val address = segment.toRawLongValue()
      return makeIPrintSupportExtensionSession(Pointer(address))
    }

    public override fun toNative(obj: IPrintSupportExtensionSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__867532831_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintSupportExtensionSession):
        Array<IPrintSupportExtensionSession?> = (elements as
        Array<IPrintSupportExtensionSession?>).castToImpl<IPrintSupportExtensionSession,IPrintSupportExtensionSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintSupportExtensionSession?> =
        arrayOfNulls<IPrintSupportExtensionSession_Impl>(size) as
        Array<IPrintSupportExtensionSession?>
  }
}
