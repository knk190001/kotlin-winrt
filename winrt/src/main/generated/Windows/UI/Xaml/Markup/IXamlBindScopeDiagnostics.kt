package Windows.UI.Xaml.Markup

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

@ABIMarker(IXamlBindScopeDiagnostics.ABI::class)
@Signature("{f264a29d-bded-43aa-a5b0-26ac21a81eb8}")
@Guid("f264a29dbded43aaa5b026ac21a81eb8")
@WinRTInterface("f264a29dbded43aaa5b026ac21a81eb8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlBindScopeDiagnostics.ByReference::class)
public interface IXamlBindScopeDiagnostics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Disable(lineNumber: Int, columnNumber: Int): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlBindScopeDiagnostics> {
    public override fun getValue() = ABI.makeIXamlBindScopeDiagnostics(pointer.getPointer(0))

    public fun setValue(value: IXamlBindScopeDiagnostics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlBindScopeDiagnostics {
    public val __544305497_Ptr: Pointer?

    public val _544305497_VtblPtr: Pointer?
      get() = __544305497_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Disable(lineNumber: Int, columnNumber: Int): Unit {
      val fnPtr = _544305497_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__544305497_Ptr, lineNumber, columnNumber,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXamlBindScopeDiagnostics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __544305497_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlBindScopeDiagnostics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f264a29dbded43aaa5b026ac21a81eb8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlBindScopeDiagnostics(ptr: Pointer?): WithDefault =
        IXamlBindScopeDiagnostics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlBindScopeDiagnostics {
      val address = segment.toRawLongValue()
      return makeIXamlBindScopeDiagnostics(Pointer(address))
    }

    public override fun toNative(obj: IXamlBindScopeDiagnostics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__544305497_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlBindScopeDiagnostics):
        Array<IXamlBindScopeDiagnostics?> = (elements as
        Array<IXamlBindScopeDiagnostics?>).castToImpl<IXamlBindScopeDiagnostics,IXamlBindScopeDiagnostics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlBindScopeDiagnostics?> =
        arrayOfNulls<IXamlBindScopeDiagnostics_Impl>(size) as Array<IXamlBindScopeDiagnostics?>
  }
}
