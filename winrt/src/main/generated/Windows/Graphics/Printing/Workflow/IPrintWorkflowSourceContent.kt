package Windows.Graphics.Printing.Workflow

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

@ABIMarker(IPrintWorkflowSourceContent.ABI::class)
@Signature("{1a28c641-ceb1-4533-bb73-fbe63eefdb18}")
@Guid("1a28c641ceb14533bb73fbe63eefdb18")
@WinRTInterface("1a28c641ceb14533bb73fbe63eefdb18")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowSourceContent.ByReference::class)
public interface IPrintWorkflowSourceContent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetJobPrintTicketAsync(): IAsyncOperation<WorkflowPrintTicket?>?

  @InterfaceMethod(1)
  public fun GetSourceSpoolDataAsStreamContent(): PrintWorkflowSpoolStreamContent?

  @InterfaceMethod(2)
  public fun GetSourceSpoolDataAsXpsObjectModel(): PrintWorkflowObjectModelSourceFileContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowSourceContent> {
    public override fun getValue() = ABI.makeIPrintWorkflowSourceContent(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowSourceContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowSourceContent {
    public val __609238907_Ptr: Pointer?

    public val _609238907_VtblPtr: Pointer?
      get() = __609238907_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetJobPrintTicketAsync(): IAsyncOperation<WorkflowPrintTicket?>? {
      val fnPtr = _609238907_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<WorkflowPrintTicket?>>()
      val hr = fn.invokeHR(arrayOf(__609238907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<WorkflowPrintTicket?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetSourceSpoolDataAsStreamContent(): PrintWorkflowSpoolStreamContent? {
      val fnPtr = _609238907_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowSpoolStreamContent>()
      val hr = fn.invokeHR(arrayOf(__609238907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowSpoolStreamContent>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetSourceSpoolDataAsXpsObjectModel():
        PrintWorkflowObjectModelSourceFileContent? {
      val fnPtr = _609238907_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowObjectModelSourceFileContent>()
      val hr = fn.invokeHR(arrayOf(__609238907_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<PrintWorkflowObjectModelSourceFileContent>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowSourceContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __609238907_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowSourceContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a28c641ceb14533bb73fbe63eefdb18")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowSourceContent(ptr: Pointer?): WithDefault =
        IPrintWorkflowSourceContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowSourceContent {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowSourceContent(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowSourceContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__609238907_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowSourceContent):
        Array<IPrintWorkflowSourceContent?> = (elements as
        Array<IPrintWorkflowSourceContent?>).castToImpl<IPrintWorkflowSourceContent,IPrintWorkflowSourceContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowSourceContent?> =
        arrayOfNulls<IPrintWorkflowSourceContent_Impl>(size) as Array<IPrintWorkflowSourceContent?>
  }
}
