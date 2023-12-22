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

@ABIMarker(IPrintWorkflowBackgroundSession.ABI::class)
@Signature("{5b7913ba-0c5e-528a-7458-86a46cbddc45}")
@Guid("5b7913ba0c5e528a745886a46cbddc45")
@WinRTInterface("5b7913ba0c5e528a745886a46cbddc45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowBackgroundSession.ByReference::class)
public interface IPrintWorkflowBackgroundSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_SetupRequested(setupEventHandler: TypedEventHandler<PrintWorkflowBackgroundSession?,
      PrintWorkflowBackgroundSetupRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_SetupRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_Submitted(submittedEventHandler: TypedEventHandler<PrintWorkflowBackgroundSession?,
      PrintWorkflowSubmittedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_Submitted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_Status(): PrintWorkflowSessionStatus?

  @InterfaceMethod(5)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowBackgroundSession> {
    public override fun getValue() = ABI.makeIPrintWorkflowBackgroundSession(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowBackgroundSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowBackgroundSession {
    public val __188727643_Ptr: Pointer?

    public val _188727643_VtblPtr: Pointer?
      get() = __188727643_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_SetupRequested(setupEventHandler: TypedEventHandler<PrintWorkflowBackgroundSession?,
        PrintWorkflowBackgroundSetupRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _188727643_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__188727643_Ptr, marshalToNative(setupEventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_SetupRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _188727643_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__188727643_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override
        fun add_Submitted(submittedEventHandler: TypedEventHandler<PrintWorkflowBackgroundSession?,
        PrintWorkflowSubmittedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _188727643_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__188727643_Ptr, marshalToNative(submittedEventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_Submitted(token: EventRegistrationToken?): Unit {
      val fnPtr = _188727643_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__188727643_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Status(): PrintWorkflowSessionStatus? {
      val fnPtr = _188727643_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowSessionStatus>()
      val hr = fn.invokeHR(arrayOf(__188727643_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowSessionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Start(): Unit {
      val fnPtr = _188727643_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__188727643_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintWorkflowBackgroundSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __188727643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowBackgroundSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b7913ba0c5e528a745886a46cbddc45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowBackgroundSession(ptr: Pointer?): WithDefault =
        IPrintWorkflowBackgroundSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowBackgroundSession {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowBackgroundSession(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowBackgroundSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__188727643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowBackgroundSession):
        Array<IPrintWorkflowBackgroundSession?> = (elements as
        Array<IPrintWorkflowBackgroundSession?>).castToImpl<IPrintWorkflowBackgroundSession,IPrintWorkflowBackgroundSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowBackgroundSession?> =
        arrayOfNulls<IPrintWorkflowBackgroundSession_Impl>(size) as
        Array<IPrintWorkflowBackgroundSession?>
  }
}
