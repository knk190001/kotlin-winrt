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

@ABIMarker(IPrintWorkflowForegroundSetupRequestedEventArgs.ABI::class)
@Signature("{bbe38247-9c1b-4dd3-9b2b-c80468d941b3}")
@Guid("bbe382479c1b4dd39b2bc80468d941b3")
@WinRTInterface("bbe382479c1b4dd39b2bc80468d941b3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowForegroundSetupRequestedEventArgs.ByReference::class)
public interface IPrintWorkflowForegroundSetupRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetUserPrintTicketAsync(): IAsyncOperation<WorkflowPrintTicket?>?

  @InterfaceMethod(1)
  public fun get_Configuration(): PrintWorkflowConfiguration?

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowForegroundSetupRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowForegroundSetupRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowForegroundSetupRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowForegroundSetupRequestedEventArgs {
    public val __1688604032_Ptr: Pointer?

    public val _1688604032_VtblPtr: Pointer?
      get() = __1688604032_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetUserPrintTicketAsync(): IAsyncOperation<WorkflowPrintTicket?>? {
      val fnPtr = _1688604032_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WorkflowPrintTicket?>>()
      val hr = fn.invokeHR(arrayOf(__1688604032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WorkflowPrintTicket?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Configuration(): PrintWorkflowConfiguration? {
      val fnPtr = _1688604032_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1688604032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1688604032_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1688604032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowForegroundSetupRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1688604032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowForegroundSetupRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bbe382479c1b4dd39b2bc80468d941b3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowForegroundSetupRequestedEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowForegroundSetupRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintWorkflowForegroundSetupRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowForegroundSetupRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowForegroundSetupRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1688604032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowForegroundSetupRequestedEventArgs):
        Array<IPrintWorkflowForegroundSetupRequestedEventArgs?> = (elements as
        Array<IPrintWorkflowForegroundSetupRequestedEventArgs?>).castToImpl<IPrintWorkflowForegroundSetupRequestedEventArgs,IPrintWorkflowForegroundSetupRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowForegroundSetupRequestedEventArgs?>
        = arrayOfNulls<IPrintWorkflowForegroundSetupRequestedEventArgs_Impl>(size) as
        Array<IPrintWorkflowForegroundSetupRequestedEventArgs?>
  }
}
