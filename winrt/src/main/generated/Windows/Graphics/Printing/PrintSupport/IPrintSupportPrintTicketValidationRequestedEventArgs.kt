package Windows.Graphics.Printing.PrintSupport

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

@ABIMarker(IPrintSupportPrintTicketValidationRequestedEventArgs.ABI::class)
@Signature("{338e4e69-db55-55c7-8338-ef64680a8f90}")
@Guid("338e4e69db5555c78338ef64680a8f90")
@WinRTInterface("338e4e69db5555c78338ef64680a8f90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintSupportPrintTicketValidationRequestedEventArgs.ByReference::class)
public interface IPrintSupportPrintTicketValidationRequestedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrintTicket(): WorkflowPrintTicket?

  @InterfaceMethod(1)
  public fun SetPrintTicketValidationStatus(status: WorkflowPrintTicketValidationStatus?): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintSupportPrintTicketValidationRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintSupportPrintTicketValidationRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintSupportPrintTicketValidationRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintSupportPrintTicketValidationRequestedEventArgs {
    public val __865208301_Ptr: Pointer?

    public val _865208301_VtblPtr: Pointer?
      get() = __865208301_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrintTicket(): WorkflowPrintTicket? {
      val fnPtr = _865208301_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WorkflowPrintTicket>()
      val hr = fn.invokeHR(arrayOf(__865208301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WorkflowPrintTicket>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun SetPrintTicketValidationStatus(status: WorkflowPrintTicketValidationStatus?): Unit {
      val fnPtr = _865208301_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__865208301_Ptr, marshalToNative(status),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _865208301_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__865208301_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintSupportPrintTicketValidationRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __865208301_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintSupportPrintTicketValidationRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("338e4e69db5555c78338ef64680a8f90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintSupportPrintTicketValidationRequestedEventArgs(ptr: Pointer?): WithDefault
        = IPrintSupportPrintTicketValidationRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintSupportPrintTicketValidationRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintSupportPrintTicketValidationRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintSupportPrintTicketValidationRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__865208301_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintSupportPrintTicketValidationRequestedEventArgs):
        Array<IPrintSupportPrintTicketValidationRequestedEventArgs?> = (elements as
        Array<IPrintSupportPrintTicketValidationRequestedEventArgs?>).castToImpl<IPrintSupportPrintTicketValidationRequestedEventArgs,IPrintSupportPrintTicketValidationRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IPrintSupportPrintTicketValidationRequestedEventArgs?> =
        arrayOfNulls<IPrintSupportPrintTicketValidationRequestedEventArgs_Impl>(size) as
        Array<IPrintSupportPrintTicketValidationRequestedEventArgs?>
  }
}
