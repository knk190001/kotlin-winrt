package Windows.System.Diagnostics

import Windows.Data.Json.JsonObject
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDiagnosticInvoker.ABI::class)
@Signature("{187b270a-02e3-4f86-84fc-fdd892b5940f}")
@Guid("187b270a02e34f8684fcfdd892b5940f")
@WinRTInterface("187b270a02e34f8684fcfdd892b5940f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiagnosticInvoker.ByReference::class)
public interface IDiagnosticInvoker : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RunDiagnosticActionAsync(context: JsonObject?):
      IAsyncOperationWithProgress<DiagnosticActionResult?, DiagnosticActionState?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiagnosticInvoker> {
    public override fun getValue() = ABI.makeIDiagnosticInvoker(pointer.getPointer(0))

    public fun setValue(value: IDiagnosticInvoker_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiagnosticInvoker {
    public val __953366498_Ptr: Pointer?

    public val _953366498_VtblPtr: Pointer?
      get() = __953366498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RunDiagnosticActionAsync(context: JsonObject?):
        IAsyncOperationWithProgress<DiagnosticActionResult?, DiagnosticActionState?>? {
      val fnPtr = _953366498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<DiagnosticActionResult?,
          DiagnosticActionState?>>()
      val hr = fn.invokeHR(arrayOf(__953366498_Ptr, marshalToNative(context), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<DiagnosticActionResult?,
          DiagnosticActionState?>>(result.getValue())
      return resultValue
    }
  }

  public class IDiagnosticInvoker_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __953366498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiagnosticInvoker, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("187b270a02e34f8684fcfdd892b5940f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiagnosticInvoker(ptr: Pointer?): WithDefault = IDiagnosticInvoker_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiagnosticInvoker {
      val address = segment.toRawLongValue()
      return makeIDiagnosticInvoker(Pointer(address))
    }

    public override fun toNative(obj: IDiagnosticInvoker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__953366498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiagnosticInvoker): Array<IDiagnosticInvoker?> =
        (elements as
        Array<IDiagnosticInvoker?>).castToImpl<IDiagnosticInvoker,IDiagnosticInvoker_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiagnosticInvoker?> =
        arrayOfNulls<IDiagnosticInvoker_Impl>(size) as Array<IDiagnosticInvoker?>
  }
}
