package Windows.Graphics.Printing.Workflow

import Windows.Foundation.Deferral
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

@ABIMarker(IPrintWorkflowSubmittedEventArgs.ABI::class)
@Signature("{3add0a41-3794-5569-5c87-40e8ff720f83}")
@Guid("3add0a41379455695c8740e8ff720f83")
@WinRTInterface("3add0a41379455695c8740e8ff720f83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowSubmittedEventArgs.ByReference::class)
public interface IPrintWorkflowSubmittedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Operation(): PrintWorkflowSubmittedOperation?

  @InterfaceMethod(1)
  public fun GetTarget(jobPrintTicket: WorkflowPrintTicket?): PrintWorkflowTarget?

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowSubmittedEventArgs> {
    public override fun getValue() = ABI.makeIPrintWorkflowSubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowSubmittedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowSubmittedEventArgs {
    public val __177891745_Ptr: Pointer?

    public val _177891745_VtblPtr: Pointer?
      get() = __177891745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Operation(): PrintWorkflowSubmittedOperation? {
      val fnPtr = _177891745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowSubmittedOperation>()
      val hr = fn.invokeHR(arrayOf(__177891745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowSubmittedOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTarget(jobPrintTicket: WorkflowPrintTicket?): PrintWorkflowTarget? {
      val fnPtr = _177891745_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowTarget>()
      val hr = fn.invokeHR(arrayOf(__177891745_Ptr, marshalToNative(jobPrintTicket), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowTarget>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _177891745_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__177891745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowSubmittedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __177891745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowSubmittedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3add0a41379455695c8740e8ff720f83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowSubmittedEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowSubmittedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowSubmittedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowSubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowSubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__177891745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowSubmittedEventArgs):
        Array<IPrintWorkflowSubmittedEventArgs?> = (elements as
        Array<IPrintWorkflowSubmittedEventArgs?>).castToImpl<IPrintWorkflowSubmittedEventArgs,IPrintWorkflowSubmittedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowSubmittedEventArgs?> =
        arrayOfNulls<IPrintWorkflowSubmittedEventArgs_Impl>(size) as
        Array<IPrintWorkflowSubmittedEventArgs?>
  }
}
