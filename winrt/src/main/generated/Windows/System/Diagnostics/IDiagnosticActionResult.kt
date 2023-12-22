package Windows.System.Diagnostics

import Windows.Foundation.Collections.ValueSet
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDiagnosticActionResult.ABI::class)
@Signature("{c265a296-e73b-4097-b28f-3442f03dd831}")
@Guid("c265a296e73b4097b28f3442f03dd831")
@WinRTInterface("c265a296e73b4097b28f3442f03dd831")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDiagnosticActionResult.ByReference::class)
public interface IDiagnosticActionResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  @InterfaceMethod(1)
  public fun get_Results(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDiagnosticActionResult> {
    public override fun getValue() = ABI.makeIDiagnosticActionResult(pointer.getPointer(0))

    public fun setValue(value: IDiagnosticActionResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDiagnosticActionResult {
    public val __193522165_Ptr: Pointer?

    public val _193522165_VtblPtr: Pointer?
      get() = __193522165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _193522165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__193522165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Results(): ValueSet? {
      val fnPtr = _193522165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__193522165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IDiagnosticActionResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __193522165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDiagnosticActionResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c265a296e73b4097b28f3442f03dd831")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDiagnosticActionResult(ptr: Pointer?): WithDefault =
        IDiagnosticActionResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDiagnosticActionResult {
      val address = segment.toRawLongValue()
      return makeIDiagnosticActionResult(Pointer(address))
    }

    public override fun toNative(obj: IDiagnosticActionResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__193522165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDiagnosticActionResult): Array<IDiagnosticActionResult?>
        = (elements as
        Array<IDiagnosticActionResult?>).castToImpl<IDiagnosticActionResult,IDiagnosticActionResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDiagnosticActionResult?> =
        arrayOfNulls<IDiagnosticActionResult_Impl>(size) as Array<IDiagnosticActionResult?>
  }
}
