package Windows.Graphics.Printing.PrintTicket

import Windows.Foundation.HResult
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWorkflowPrintTicketValidationResult.ABI::class)
@Signature("{0ad1f392-da7b-4a36-bf36-6a99a62e2059}")
@Guid("0ad1f392da7b4a36bf366a99a62e2059")
@WinRTInterface("0ad1f392da7b4a36bf366a99a62e2059")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWorkflowPrintTicketValidationResult.ByReference::class)
public interface IWorkflowPrintTicketValidationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Validated(): Boolean

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWorkflowPrintTicketValidationResult> {
    public override fun getValue() =
        ABI.makeIWorkflowPrintTicketValidationResult(pointer.getPointer(0))

    public fun setValue(value: IWorkflowPrintTicketValidationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWorkflowPrintTicketValidationResult {
    public val __16271681_Ptr: Pointer?

    public val _16271681_VtblPtr: Pointer?
      get() = __16271681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Validated(): Boolean {
      val fnPtr = _16271681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__16271681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _16271681_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__16271681_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IWorkflowPrintTicketValidationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __16271681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWorkflowPrintTicketValidationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ad1f392da7b4a36bf366a99a62e2059")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWorkflowPrintTicketValidationResult(ptr: Pointer?): WithDefault =
        IWorkflowPrintTicketValidationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWorkflowPrintTicketValidationResult {
      val address = segment.toRawLongValue()
      return makeIWorkflowPrintTicketValidationResult(Pointer(address))
    }

    public override fun toNative(obj: IWorkflowPrintTicketValidationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__16271681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWorkflowPrintTicketValidationResult):
        Array<IWorkflowPrintTicketValidationResult?> = (elements as
        Array<IWorkflowPrintTicketValidationResult?>).castToImpl<IWorkflowPrintTicketValidationResult,IWorkflowPrintTicketValidationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWorkflowPrintTicketValidationResult?> =
        arrayOfNulls<IWorkflowPrintTicketValidationResult_Impl>(size) as
        Array<IWorkflowPrintTicketValidationResult?>
  }
}
