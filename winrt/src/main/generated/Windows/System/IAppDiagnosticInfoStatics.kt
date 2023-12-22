package Windows.System

import Windows.Foundation.Collections.IVector
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppDiagnosticInfoStatics.ABI::class)
@Signature("{ce6925bf-10ca-40c8-a9ca-c5c96501866e}")
@Guid("ce6925bf10ca40c8a9cac5c96501866e")
@WinRTInterface("ce6925bf10ca40c8a9cac5c96501866e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppDiagnosticInfoStatics.ByReference::class)
public interface IAppDiagnosticInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestInfoAsync(): IAsyncOperation<IVector<AppDiagnosticInfo?>?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppDiagnosticInfoStatics> {
    public override fun getValue() = ABI.makeIAppDiagnosticInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IAppDiagnosticInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppDiagnosticInfoStatics {
    public val __415215582_Ptr: Pointer?

    public val _415215582_VtblPtr: Pointer?
      get() = __415215582_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestInfoAsync(): IAsyncOperation<IVector<AppDiagnosticInfo?>?>? {
      val fnPtr = _415215582_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVector<AppDiagnosticInfo?>?>>()
      val hr = fn.invokeHR(arrayOf(__415215582_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVector<AppDiagnosticInfo?>?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppDiagnosticInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __415215582_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppDiagnosticInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce6925bf10ca40c8a9cac5c96501866e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppDiagnosticInfoStatics(ptr: Pointer?): WithDefault =
        IAppDiagnosticInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppDiagnosticInfoStatics {
      val address = segment.toRawLongValue()
      return makeIAppDiagnosticInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppDiagnosticInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__415215582_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppDiagnosticInfoStatics):
        Array<IAppDiagnosticInfoStatics?> = (elements as
        Array<IAppDiagnosticInfoStatics?>).castToImpl<IAppDiagnosticInfoStatics,IAppDiagnosticInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppDiagnosticInfoStatics?> =
        arrayOfNulls<IAppDiagnosticInfoStatics_Impl>(size) as Array<IAppDiagnosticInfoStatics?>
  }
}
