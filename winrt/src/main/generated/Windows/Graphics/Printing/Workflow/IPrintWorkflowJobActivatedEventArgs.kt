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

@ABIMarker(IPrintWorkflowJobActivatedEventArgs.ABI::class)
@Signature("{d4bd5e6d-034e-5e00-a616-f961a033dcc8}")
@Guid("d4bd5e6d034e5e00a616f961a033dcc8")
@WinRTInterface("d4bd5e6d034e5e00a616f961a033dcc8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowJobActivatedEventArgs.ByReference::class)
public interface IPrintWorkflowJobActivatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Session(): PrintWorkflowJobUISession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowJobActivatedEventArgs> {
    public override fun getValue() =
        ABI.makeIPrintWorkflowJobActivatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowJobActivatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowJobActivatedEventArgs {
    public val __243293952_Ptr: Pointer?

    public val _243293952_VtblPtr: Pointer?
      get() = __243293952_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Session(): PrintWorkflowJobUISession? {
      val fnPtr = _243293952_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PrintWorkflowJobUISession>()
      val hr = fn.invokeHR(arrayOf(__243293952_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PrintWorkflowJobUISession>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowJobActivatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __243293952_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowJobActivatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4bd5e6d034e5e00a616f961a033dcc8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowJobActivatedEventArgs(ptr: Pointer?): WithDefault =
        IPrintWorkflowJobActivatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowJobActivatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowJobActivatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowJobActivatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__243293952_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowJobActivatedEventArgs):
        Array<IPrintWorkflowJobActivatedEventArgs?> = (elements as
        Array<IPrintWorkflowJobActivatedEventArgs?>).castToImpl<IPrintWorkflowJobActivatedEventArgs,IPrintWorkflowJobActivatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowJobActivatedEventArgs?> =
        arrayOfNulls<IPrintWorkflowJobActivatedEventArgs_Impl>(size) as
        Array<IPrintWorkflowJobActivatedEventArgs?>
  }
}
