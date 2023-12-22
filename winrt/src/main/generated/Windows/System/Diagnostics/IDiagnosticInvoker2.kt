package Windows.System.Diagnostics

import Windows.Foundation.IAsyncOperationWithProgress
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDiagnosticInvoker2.ABI::class)
@Signature("{e3bf945c-155a-4b52-a8ec-070c44f95000}")
@Guid("e3bf945c155a4b52a8ec070c44f95000")
@WinRTInterface("e3bf945c155a4b52a8ec070c44f95000")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiagnosticInvoker2.ByReference::class)
public interface IDiagnosticInvoker2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RunDiagnosticActionFromStringAsync(context: String?):
      IAsyncOperationWithProgress<DiagnosticActionResult?, DiagnosticActionState?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiagnosticInvoker2> {
    public override fun getValue() = ABI.makeIDiagnosticInvoker2(pointer.getPointer(0))

    public fun setValue(value: IDiagnosticInvoker2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiagnosticInvoker2 {
    public val __510409584_Ptr: Pointer?

    public val _510409584_VtblPtr: Pointer?
      get() = __510409584_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RunDiagnosticActionFromStringAsync(context: String?):
        IAsyncOperationWithProgress<DiagnosticActionResult?, DiagnosticActionState?>? {
      val fnPtr = _510409584_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DiagnosticActionResult?,
          DiagnosticActionState?>>()
      val hr = fn.invokeHR(arrayOf(__510409584_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DiagnosticActionResult?,
          DiagnosticActionState?>>(result.getValue())
      return resultValue
    }
  }

  public class IDiagnosticInvoker2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __510409584_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiagnosticInvoker2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3bf945c155a4b52a8ec070c44f95000")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiagnosticInvoker2(ptr: Pointer?): WithDefault = IDiagnosticInvoker2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiagnosticInvoker2 {
      val address = segment.toRawLongValue()
      return makeIDiagnosticInvoker2(Pointer(address))
    }

    public override fun toNative(obj: IDiagnosticInvoker2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__510409584_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiagnosticInvoker2): Array<IDiagnosticInvoker2?> =
        (elements as
        Array<IDiagnosticInvoker2?>).castToImpl<IDiagnosticInvoker2,IDiagnosticInvoker2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiagnosticInvoker2?> =
        arrayOfNulls<IDiagnosticInvoker2_Impl>(size) as Array<IDiagnosticInvoker2?>
  }
}
