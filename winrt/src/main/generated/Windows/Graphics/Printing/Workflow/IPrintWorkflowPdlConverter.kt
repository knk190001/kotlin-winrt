package Windows.Graphics.Printing.Workflow

import Windows.Foundation.IAsyncAction
import Windows.Graphics.Printing.PrintTicket.WorkflowPrintTicket
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
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

@ABIMarker(IPrintWorkflowPdlConverter.ABI::class)
@Signature("{40604b62-0ae4-51f1-818f-731dc0b005ab}")
@Guid("40604b620ae451f1818f731dc0b005ab")
@WinRTInterface("40604b620ae451f1818f731dc0b005ab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowPdlConverter.ByReference::class)
public interface IPrintWorkflowPdlConverter : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ConvertPdlAsync(
    printTicket: WorkflowPrintTicket?,
    inputStream: IInputStream?,
    outputStream: IOutputStream?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowPdlConverter> {
    public override fun getValue() = ABI.makeIPrintWorkflowPdlConverter(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowPdlConverter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowPdlConverter {
    public val __137590709_Ptr: Pointer?

    public val _137590709_VtblPtr: Pointer?
      get() = __137590709_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ConvertPdlAsync(
      printTicket: WorkflowPrintTicket?,
      inputStream: IInputStream?,
      outputStream: IOutputStream?
    ): IAsyncAction? {
      val fnPtr = _137590709_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__137590709_Ptr, marshalToNative(printTicket),
          marshalToNative(inputStream), marshalToNative(outputStream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowPdlConverter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __137590709_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowPdlConverter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("40604b620ae451f1818f731dc0b005ab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowPdlConverter(ptr: Pointer?): WithDefault =
        IPrintWorkflowPdlConverter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowPdlConverter {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowPdlConverter(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowPdlConverter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__137590709_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowPdlConverter):
        Array<IPrintWorkflowPdlConverter?> = (elements as
        Array<IPrintWorkflowPdlConverter?>).castToImpl<IPrintWorkflowPdlConverter,IPrintWorkflowPdlConverter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowPdlConverter?> =
        arrayOfNulls<IPrintWorkflowPdlConverter_Impl>(size) as Array<IPrintWorkflowPdlConverter?>
  }
}
