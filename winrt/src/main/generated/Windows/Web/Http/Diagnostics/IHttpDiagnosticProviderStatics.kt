package Windows.Web.Http.Diagnostics

import Windows.System.Diagnostics.ProcessDiagnosticInfo
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

@ABIMarker(IHttpDiagnosticProviderStatics.ABI::class)
@Signature("{5b824ec1-6a6c-47cc-afec-1e86bc26053b}")
@Guid("5b824ec16a6c47ccafec1e86bc26053b")
@WinRTInterface("5b824ec16a6c47ccafec1e86bc26053b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpDiagnosticProviderStatics.ByReference::class)
public interface IHttpDiagnosticProviderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromProcessDiagnosticInfo(processDiagnosticInfo: ProcessDiagnosticInfo?):
      HttpDiagnosticProvider?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpDiagnosticProviderStatics> {
    public override fun getValue() = ABI.makeIHttpDiagnosticProviderStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpDiagnosticProviderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpDiagnosticProviderStatics {
    public val __1187273561_Ptr: Pointer?

    public val _1187273561_VtblPtr: Pointer?
      get() = __1187273561_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun CreateFromProcessDiagnosticInfo(processDiagnosticInfo: ProcessDiagnosticInfo?):
        HttpDiagnosticProvider? {
      val fnPtr = _1187273561_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpDiagnosticProvider>()
      val hr = fn.invokeHR(arrayOf(__1187273561_Ptr, marshalToNative(processDiagnosticInfo),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpDiagnosticProvider>(result.getValue())
      return resultValue
    }
  }

  public class IHttpDiagnosticProviderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1187273561_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpDiagnosticProviderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b824ec16a6c47ccafec1e86bc26053b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpDiagnosticProviderStatics(ptr: Pointer?): WithDefault =
        IHttpDiagnosticProviderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpDiagnosticProviderStatics {
      val address = segment.toRawLongValue()
      return makeIHttpDiagnosticProviderStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpDiagnosticProviderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1187273561_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpDiagnosticProviderStatics):
        Array<IHttpDiagnosticProviderStatics?> = (elements as
        Array<IHttpDiagnosticProviderStatics?>).castToImpl<IHttpDiagnosticProviderStatics,IHttpDiagnosticProviderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpDiagnosticProviderStatics?> =
        arrayOfNulls<IHttpDiagnosticProviderStatics_Impl>(size) as
        Array<IHttpDiagnosticProviderStatics?>
  }
}
