package Windows.Graphics.Printing.Workflow

import Windows.Foundation.Deferral
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

@ABIMarker(IPrintWorkflowXpsDataAvailableEventArgs.ABI::class)
@Signature("{4d11c331-54d1-434e-be0e-82c5fa58e5b2}")
@Guid("4d11c33154d1434ebe0e82c5fa58e5b2")
@WinRTInterface("4d11c33154d1434ebe0e82c5fa58e5b2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowXpsDataAvailableEventArgs.ByReference::class)
public interface IPrintWorkflowXpsDataAvailableEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Operation(): PrintWorkflowSubmittedOperation?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowXpsDataAvailableEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowXpsDataAvailableEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowXpsDataAvailableEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowXpsDataAvailableEventArgs {
    public val __1772360080_Ptr: Pointer?

    public val _1772360080_VtblPtr: Pointer?
      get() = __1772360080_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Operation(): PrintWorkflowSubmittedOperation? {
      val fnPtr = _1772360080_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowSubmittedOperation>()
      val hr = fn.invokeHR(arrayOf(__1772360080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowSubmittedOperation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1772360080_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1772360080_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowXpsDataAvailableEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1772360080_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowXpsDataAvailableEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d11c33154d1434ebe0e82c5fa58e5b2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowXpsDataAvailableEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowXpsDataAvailableEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPrintWorkflowXpsDataAvailableEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowXpsDataAvailableEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowXpsDataAvailableEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1772360080_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowXpsDataAvailableEventArgs):
        Array<IPrintWorkflowXpsDataAvailableEventArgs?> = (elements as
        Array<IPrintWorkflowXpsDataAvailableEventArgs?>).castToImpl<IPrintWorkflowXpsDataAvailableEventArgs,IPrintWorkflowXpsDataAvailableEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowXpsDataAvailableEventArgs?> =
        arrayOfNulls<IPrintWorkflowXpsDataAvailableEventArgs_Impl>(size) as
        Array<IPrintWorkflowXpsDataAvailableEventArgs?>
  }
}
