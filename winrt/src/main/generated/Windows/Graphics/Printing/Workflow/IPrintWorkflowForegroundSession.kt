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

@ABIMarker(IPrintWorkflowForegroundSession.ABI::class)
@Signature("{c79b63d0-f8ec-4ceb-953a-c8876157dd33}")
@Guid("c79b63d0f8ec4ceb953ac8876157dd33")
@WinRTInterface("c79b63d0f8ec4ceb953ac8876157dd33")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowForegroundSession.ByReference::class)
public interface IPrintWorkflowForegroundSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_SetupRequested(setupEventHandler: TypedEventHandler<PrintWorkflowForegroundSession?,
      PrintWorkflowForegroundSetupRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SetupRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public
      fun add_XpsDataAvailable(xpsDataAvailableEventHandler: TypedEventHandler<PrintWorkflowForegroundSession?,
      PrintWorkflowXpsDataAvailableEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_XpsDataAvailable(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_Status(): PrintWorkflowSessionStatus?

  @InterfaceMethod(5)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowForegroundSession> {
    public override fun getValue() = ABI.makeIPrintWorkflowForegroundSession(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowForegroundSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowForegroundSession {
    public val __2046142224_Ptr: Pointer?

    public val _2046142224_VtblPtr: Pointer?
      get() = __2046142224_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_SetupRequested(setupEventHandler: TypedEventHandler<PrintWorkflowForegroundSession?,
        PrintWorkflowForegroundSetupRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2046142224_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2046142224_Ptr, marshalToNative(setupEventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SetupRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _2046142224_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2046142224_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_XpsDataAvailable(xpsDataAvailableEventHandler: TypedEventHandler<PrintWorkflowForegroundSession?,
        PrintWorkflowXpsDataAvailableEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2046142224_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2046142224_Ptr, marshalToNative(xpsDataAvailableEventHandler),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_XpsDataAvailable(token: EventRegistrationToken?): Unit {
      val fnPtr = _2046142224_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2046142224_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Status(): PrintWorkflowSessionStatus? {
      val fnPtr = _2046142224_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowSessionStatus>()
      val hr = fn.invokeHR(arrayOf(__2046142224_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowSessionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Start(): Unit {
      val fnPtr = _2046142224_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2046142224_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintWorkflowForegroundSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2046142224_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowForegroundSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c79b63d0f8ec4ceb953ac8876157dd33")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowForegroundSession(ptr: Pointer?): WithDefault =
        IPrintWorkflowForegroundSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowForegroundSession {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowForegroundSession(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowForegroundSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2046142224_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowForegroundSession):
        Array<IPrintWorkflowForegroundSession?> = (elements as
        Array<IPrintWorkflowForegroundSession?>).castToImpl<IPrintWorkflowForegroundSession,IPrintWorkflowForegroundSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowForegroundSession?> =
        arrayOfNulls<IPrintWorkflowForegroundSession_Impl>(size) as
        Array<IPrintWorkflowForegroundSession?>
  }
}
