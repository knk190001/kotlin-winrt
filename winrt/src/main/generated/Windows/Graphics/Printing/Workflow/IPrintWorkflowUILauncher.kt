package Windows.Graphics.Printing.Workflow

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPrintWorkflowUILauncher.ABI::class)
@Signature("{64e9e22f-14cc-5828-96fb-39163fb6c378}")
@Guid("64e9e22f14cc582896fb39163fb6c378")
@WinRTInterface("64e9e22f14cc582896fb39163fb6c378")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintWorkflowUILauncher.ByReference::class)
public interface IPrintWorkflowUILauncher : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsUILaunchEnabled(): Boolean

  @InterfaceMethod(1)
  public fun LaunchAndCompleteUIAsync(): IAsyncOperation<PrintWorkflowUICompletionStatus?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintWorkflowUILauncher> {
    public override fun getValue() = ABI.makeIPrintWorkflowUILauncher(pointer.getPointer(0))

    public fun setValue(value: IPrintWorkflowUILauncher_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintWorkflowUILauncher {
    public val __1687428023_Ptr: Pointer?

    public val _1687428023_VtblPtr: Pointer?
      get() = __1687428023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsUILaunchEnabled(): Boolean {
      val fnPtr = _1687428023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1687428023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun LaunchAndCompleteUIAsync():
        IAsyncOperation<PrintWorkflowUICompletionStatus?>? {
      val fnPtr = _1687428023_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PrintWorkflowUICompletionStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1687428023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PrintWorkflowUICompletionStatus?>>(result.getValue())
      return resultValue
    }
  }

  public class IPrintWorkflowUILauncher_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1687428023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintWorkflowUILauncher, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64e9e22f14cc582896fb39163fb6c378")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintWorkflowUILauncher(ptr: Pointer?): WithDefault =
        IPrintWorkflowUILauncher_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintWorkflowUILauncher {
      val address = segment.toRawLongValue()
      return makeIPrintWorkflowUILauncher(Pointer(address))
    }

    public override fun toNative(obj: IPrintWorkflowUILauncher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1687428023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintWorkflowUILauncher):
        Array<IPrintWorkflowUILauncher?> = (elements as
        Array<IPrintWorkflowUILauncher?>).castToImpl<IPrintWorkflowUILauncher,IPrintWorkflowUILauncher_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintWorkflowUILauncher?> =
        arrayOfNulls<IPrintWorkflowUILauncher_Impl>(size) as Array<IPrintWorkflowUILauncher?>
  }
}
