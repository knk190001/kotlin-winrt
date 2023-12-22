package Windows.Media.Streaming.Adaptive

import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
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

@ABIMarker(IAdaptiveMediaSourceDiagnosticAvailableEventArgs3.ABI::class)
@Signature("{c3650cd5-daeb-4103-84da-68769ad513ff}")
@Guid("c3650cd5daeb410384da68769ad513ff")
@WinRTInterface("c3650cd5daeb410384da68769ad513ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdaptiveMediaSourceDiagnosticAvailableEventArgs3.ByReference::class)
public interface IAdaptiveMediaSourceDiagnosticAvailableEventArgs3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResourceDuration(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_ResourceContentType(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3> {
    public override fun getValue() =
        ABI.makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs3(pointer.getPointer(0))

    public fun setValue(value: IAdaptiveMediaSourceDiagnosticAvailableEventArgs3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdaptiveMediaSourceDiagnosticAvailableEventArgs3 {
    public val __423831975_Ptr: Pointer?

    public val _423831975_VtblPtr: Pointer?
      get() = __423831975_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResourceDuration(): IReference<TimeSpan?>? {
      val fnPtr = _423831975_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__423831975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ResourceContentType(): String? {
      val fnPtr = _423831975_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__423831975_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAdaptiveMediaSourceDiagnosticAvailableEventArgs3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __423831975_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3650cd5daeb410384da68769ad513ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs3(ptr: Pointer?): WithDefault =
        IAdaptiveMediaSourceDiagnosticAvailableEventArgs3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAdaptiveMediaSourceDiagnosticAvailableEventArgs3 {
      val address = segment.toRawLongValue()
      return makeIAdaptiveMediaSourceDiagnosticAvailableEventArgs3(Pointer(address))
    }

    public override fun toNative(obj: IAdaptiveMediaSourceDiagnosticAvailableEventArgs3):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__423831975_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdaptiveMediaSourceDiagnosticAvailableEventArgs3):
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3?> = (elements as
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3?>).castToImpl<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3,IAdaptiveMediaSourceDiagnosticAvailableEventArgs3_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3?> =
        arrayOfNulls<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3_Impl>(size) as
        Array<IAdaptiveMediaSourceDiagnosticAvailableEventArgs3?>
  }
}
