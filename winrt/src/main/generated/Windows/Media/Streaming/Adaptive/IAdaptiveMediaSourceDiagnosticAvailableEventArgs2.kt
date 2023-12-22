package Windows.Media.Streaming.Adaptive

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

@ABIMarker(IAdaptiveMediaSourceDiagnosticAvailableEventArgs2.ABI::class)
@Signature("{8c6dd857-16a5-4d9f-810e-00bd901b3ef9}")
@Guid("8c6dd85716a54d9f810e00bd901b3ef9")
@WinRTInterface("8c6dd85716a54d9f810e00bd901b3ef9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDiagnosticAvailableEventArgs2.ByReference::class)
public interface IAdaptiveMediaSourceDiagnosticAvailableEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDiagnosticAvailableEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDiagnosticAvailableEventArgs2 {
    public val __423831974_Ptr: Pointer?

    public val _423831974_VtblPtr: Pointer?
      get() = __423831974_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _423831974_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__423831974_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDiagnosticAvailableEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __423831974_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c6dd85716a54d9f810e00bd901b3ef9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs2(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDiagnosticAvailableEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDiagnosticAvailableEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDiagnosticAvailableEventArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__423831974_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDiagnosticAvailableEventArgs2):
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2?> = (elements as
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2?>).castToImpl<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2,IAdaptiveMediaSourceDiagnosticAvailableEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2?> =
        arrayOfNulls<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2_Impl>(size) as
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs2?>
  }
}
