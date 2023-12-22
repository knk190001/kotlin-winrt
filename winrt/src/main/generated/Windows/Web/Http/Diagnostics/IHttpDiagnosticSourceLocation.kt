package Windows.Web.Http.Diagnostics

import Windows.Foundation.Uri
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHttpDiagnosticSourceLocation.ABI::class)
@Signature("{54a9d260-8860-423f-b6fa-d77716f647a7}")
@Guid("54a9d2608860423fb6fad77716f647a7")
@WinRTInterface("54a9d2608860423fb6fad77716f647a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpDiagnosticSourceLocation.ByReference::class)
public interface IHttpDiagnosticSourceLocation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SourceUri(): Uri?

  @InterfaceMethod(1)
  public fun get_LineNumber(): WinDef.ULONG

  @InterfaceMethod(2)
  public fun get_ColumnNumber(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpDiagnosticSourceLocation> {
    public override fun getValue() = ABI.makeIHttpDiagnosticSourceLocation(pointer.getPointer(0))

    public fun setValue(value: IHttpDiagnosticSourceLocation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpDiagnosticSourceLocation {
    public val __1724752259_Ptr: Pointer?

    public val _1724752259_VtblPtr: Pointer?
      get() = __1724752259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SourceUri(): Uri? {
      val fnPtr = _1724752259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1724752259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LineNumber(): WinDef.ULONG {
      val fnPtr = _1724752259_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1724752259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ColumnNumber(): WinDef.ULONG {
      val fnPtr = _1724752259_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1724752259_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpDiagnosticSourceLocation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1724752259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpDiagnosticSourceLocation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("54a9d2608860423fb6fad77716f647a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpDiagnosticSourceLocation(ptr: Pointer?): WithDefault =
        IHttpDiagnosticSourceLocation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpDiagnosticSourceLocation {
      val address = segment.toRawLongValue()
      return makeIHttpDiagnosticSourceLocation(Pointer(address))
    }

    public override fun toNative(obj: IHttpDiagnosticSourceLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1724752259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpDiagnosticSourceLocation):
        Array<IHttpDiagnosticSourceLocation?> = (elements as
        Array<IHttpDiagnosticSourceLocation?>).castToImpl<IHttpDiagnosticSourceLocation,IHttpDiagnosticSourceLocation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpDiagnosticSourceLocation?> =
        arrayOfNulls<IHttpDiagnosticSourceLocation_Impl>(size) as
        Array<IHttpDiagnosticSourceLocation?>
  }
}
