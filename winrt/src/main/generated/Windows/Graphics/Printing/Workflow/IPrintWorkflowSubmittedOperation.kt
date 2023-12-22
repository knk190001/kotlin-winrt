package Windows.Graphics.Printing.Workflow

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

@ABIMarker(IPrintWorkflowSubmittedOperation.ABI::class)
@Signature("{2e4e6216-3be1-5f0f-5c81-a5a2bd4eab0e}")
@Guid("2e4e62163be15f0f5c81a5a2bd4eab0e")
@WinRTInterface("2e4e62163be15f0f5c81a5a2bd4eab0e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowSubmittedOperation.ByReference::class)
public interface IPrintWorkflowSubmittedOperation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(status: PrintWorkflowSubmittedStatus?): Unit

  @InterfaceMethod(1)
  public fun get_Configuration(): PrintWorkflowConfiguration?

  @InterfaceMethod(2)
  public fun get_XpsContent(): PrintWorkflowSourceContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowSubmittedOperation> {
    public override fun getValue() = ABI.makeIPrintWorkflowSubmittedOperation(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowSubmittedOperation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowSubmittedOperation {
    public val __1453953327_Ptr: Pointer?

    public val _1453953327_VtblPtr: Pointer?
      get() = __1453953327_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(status: PrintWorkflowSubmittedStatus?): Unit {
      val fnPtr = _1453953327_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1453953327_Ptr, marshalToNative(status),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Configuration(): PrintWorkflowConfiguration? {
      val fnPtr = _1453953327_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1453953327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowConfiguration>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_XpsContent(): PrintWorkflowSourceContent? {
      val fnPtr = _1453953327_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowSourceContent>()
      val hr = fn.invokeHR(arrayOf(__1453953327_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowSourceContent>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowSubmittedOperation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1453953327_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowSubmittedOperation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e4e62163be15f0f5c81a5a2bd4eab0e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowSubmittedOperation(ptr: Pointer?): WithDefault =
        IPrintWorkflowSubmittedOperation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowSubmittedOperation {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowSubmittedOperation(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowSubmittedOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1453953327_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowSubmittedOperation):
        Array<IPrintWorkflowSubmittedOperation?> = (elements as
        Array<IPrintWorkflowSubmittedOperation?>).castToImpl<IPrintWorkflowSubmittedOperation,IPrintWorkflowSubmittedOperation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowSubmittedOperation?> =
        arrayOfNulls<IPrintWorkflowSubmittedOperation_Impl>(size) as
        Array<IPrintWorkflowSubmittedOperation?>
  }
}
