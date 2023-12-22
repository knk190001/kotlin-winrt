package Windows.Graphics.Printing.Workflow

import Windows.Foundation.Deferral
import Windows.Foundation.IAsyncOperation
import Windows.Graphics.Printing.PrintTicket.WorkflowPrintTicket
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

@ABIMarker(IPrintWorkflowBackgroundSetupRequestedEventArgs.ABI::class)
@Signature("{43e97342-1750-59c9-61fb-383748a20362}")
@Guid("43e97342175059c961fb383748a20362")
@WinRTInterface("43e97342175059c961fb383748a20362")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowBackgroundSetupRequestedEventArgs.ByReference::class)
public interface IPrintWorkflowBackgroundSetupRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetUserPrintTicketAsync(): IAsyncOperation<WorkflowPrintTicket?>?

  @InterfaceMethod(1)
  public fun get_Configuration(): PrintWorkflowConfiguration?

  @InterfaceMethod(2)
  public fun SetRequiresUI(): Unit

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowBackgroundSetupRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowBackgroundSetupRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowBackgroundSetupRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowBackgroundSetupRequestedEventArgs {
    public val __71315915_Ptr: Pointer?

    public val _71315915_VtblPtr: Pointer?
      get() = __71315915_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetUserPrintTicketAsync(): IAsyncOperation<WorkflowPrintTicket?>? {
      val fnPtr = _71315915_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WorkflowPrintTicket?>>()
      val hr = fn.invokeHR(arrayOf(__71315915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WorkflowPrintTicket?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Configuration(): PrintWorkflowConfiguration? {
      val fnPtr = _71315915_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowConfiguration>()
      val hr = fn.invokeHR(arrayOf(__71315915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetRequiresUI(): Unit {
      val fnPtr = _71315915_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__71315915_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _71315915_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__71315915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowBackgroundSetupRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __71315915_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowBackgroundSetupRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43e97342175059c961fb383748a20362")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowBackgroundSetupRequestedEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowBackgroundSetupRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintWorkflowBackgroundSetupRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowBackgroundSetupRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowBackgroundSetupRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__71315915_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowBackgroundSetupRequestedEventArgs):
        Array<IPrintWorkflowBackgroundSetupRequestedEventArgs?> = (elements as
        Array<IPrintWorkflowBackgroundSetupRequestedEventArgs?>).castToImpl<IPrintWorkflowBackgroundSetupRequestedEventArgs,IPrintWorkflowBackgroundSetupRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowBackgroundSetupRequestedEventArgs?>
        = arrayOfNulls<IPrintWorkflowBackgroundSetupRequestedEventArgs_Impl>(size) as
        Array<IPrintWorkflowBackgroundSetupRequestedEventArgs?>
  }
}
