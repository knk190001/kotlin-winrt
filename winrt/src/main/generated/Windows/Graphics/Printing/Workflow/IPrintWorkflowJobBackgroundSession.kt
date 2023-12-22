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

@ABIMarker(IPrintWorkflowJobBackgroundSession.ABI::class)
@Signature("{c5ec6ad8-20c9-5d51-8507-2734b46f96c5}")
@Guid("c5ec6ad820c95d5185072734b46f96c5")
@WinRTInterface("c5ec6ad820c95d5185072734b46f96c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowJobBackgroundSession.ByReference::class)
public interface IPrintWorkflowJobBackgroundSession : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): PrintWorkflowSessionStatus?

  @InterfaceMethod(1)
  public fun add_JobStarting(handler: TypedEventHandler<PrintWorkflowJobBackgroundSession?,
      PrintWorkflowJobStartingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_JobStarting(token: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public
      fun add_PdlModificationRequested(handler: TypedEventHandler<PrintWorkflowJobBackgroundSession?,
      PrintWorkflowPdlModificationRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_PdlModificationRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun Start(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowJobBackgroundSession> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowJobBackgroundSession(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowJobBackgroundSession_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowJobBackgroundSession {
    public val __262058254_Ptr: Pointer?

    public val _262058254_VtblPtr: Pointer?
      get() = __262058254_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): PrintWorkflowSessionStatus? {
      val fnPtr = _262058254_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowSessionStatus>()
      val hr = fn.invokeHR(arrayOf(__262058254_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowSessionStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun add_JobStarting(handler: TypedEventHandler<PrintWorkflowJobBackgroundSession?,
        PrintWorkflowJobStartingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _262058254_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__262058254_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_JobStarting(token: EventRegistrationToken?): Unit {
      val fnPtr = _262058254_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__262058254_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun add_PdlModificationRequested(handler: TypedEventHandler<PrintWorkflowJobBackgroundSession?,
        PrintWorkflowPdlModificationRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _262058254_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__262058254_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_PdlModificationRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _262058254_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__262058254_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun Start(): Unit {
      val fnPtr = _262058254_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__262058254_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintWorkflowJobBackgroundSession_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __262058254_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowJobBackgroundSession, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c5ec6ad820c95d5185072734b46f96c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowJobBackgroundSession(ptr: Pointer?): WithDefault =
        IPrintWorkflowJobBackgroundSession_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowJobBackgroundSession {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowJobBackgroundSession(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowJobBackgroundSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__262058254_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowJobBackgroundSession):
        Array<IPrintWorkflowJobBackgroundSession?> = (elements as
        Array<IPrintWorkflowJobBackgroundSession?>).castToImpl<IPrintWorkflowJobBackgroundSession,IPrintWorkflowJobBackgroundSession_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowJobBackgroundSession?> =
        arrayOfNulls<IPrintWorkflowJobBackgroundSession_Impl>(size) as
        Array<IPrintWorkflowJobBackgroundSession?>
  }
}
