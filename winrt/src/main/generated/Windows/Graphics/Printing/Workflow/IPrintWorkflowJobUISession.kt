package Windows.Graphics.Printing.Workflow

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

@ABIMarker(IPrintWorkflowJobUISession.ABI::class)
@Signature("{00c8736b-7637-5687-a302-0f664d2aac65}")
@Guid("00c8736b76375687a3020f664d2aac65")
@WinRTInterface("00c8736b76375687a3020f664d2aac65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowJobUISession.ByReference::class)
public interface IPrintWorkflowJobUISession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PrintWorkflowSessionStatus?

  @InterfaceMethod(1)
  public fun add_PdlDataAvailable(handler: TypedEventHandler<PrintWorkflowJobUISession?,
      PrintWorkflowPdlDataAvailableEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_PdlDataAvailable(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_JobNotification(handler: TypedEventHandler<PrintWorkflowJobUISession?,
      PrintWorkflowJobNotificationEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_JobNotification(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowJobUISession> {
    public override fun getValue() = ABI.makeIPrintWorkflowJobUISession(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowJobUISession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowJobUISession {
    public val __176815352_Ptr: Pointer?

    public val _176815352_VtblPtr: Pointer?
      get() = __176815352_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PrintWorkflowSessionStatus? {
      val fnPtr = _176815352_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowSessionStatus>()
      val hr = fn.invokeHR(arrayOf(__176815352_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowSessionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun add_PdlDataAvailable(handler: TypedEventHandler<PrintWorkflowJobUISession?,
        PrintWorkflowPdlDataAvailableEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _176815352_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__176815352_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_PdlDataAvailable(token: EventRegistrationToken?): Unit {
      val fnPtr = _176815352_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__176815352_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_JobNotification(handler: TypedEventHandler<PrintWorkflowJobUISession?,
        PrintWorkflowJobNotificationEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _176815352_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__176815352_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_JobNotification(token: EventRegistrationToken?): Unit {
      val fnPtr = _176815352_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__176815352_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Start(): Unit {
      val fnPtr = _176815352_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__176815352_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintWorkflowJobUISession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __176815352_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowJobUISession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00c8736b76375687a3020f664d2aac65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowJobUISession(ptr: Pointer?): WithDefault =
        IPrintWorkflowJobUISession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowJobUISession {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowJobUISession(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowJobUISession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__176815352_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowJobUISession):
        Array<IPrintWorkflowJobUISession?> = (elements as
        Array<IPrintWorkflowJobUISession?>).castToImpl<IPrintWorkflowJobUISession,IPrintWorkflowJobUISession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowJobUISession?> =
        arrayOfNulls<IPrintWorkflowJobUISession_Impl>(size) as Array<IPrintWorkflowJobUISession?>
  }
}
