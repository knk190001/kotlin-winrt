package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(IWidgetProviderErrors.ABI::class)
@Signature("{90c1b5f0-0d3a-4ac6-abb7-c97b367b8fcc}")
@Guid("90c1b5f00d3a4ac6abb7c97b367b8fcc")
@WinRTInterface("90c1b5f00d3a4ac6abb7c97b367b8fcc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetProviderErrors.ByReference::class)
public interface IWidgetProviderErrors : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OnErrorInfoReported(args: WidgetErrorInfoReportedArgs?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetProviderErrors> {
    public override fun getValue() = ABI.makeIWidgetProviderErrors(pointer.getPointer(0))

    public fun setValue(value: IWidgetProviderErrors_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetProviderErrors {
    public val __1093777681_Ptr: Pointer?

    public val _1093777681_VtblPtr: Pointer?
      get() = __1093777681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun OnErrorInfoReported(args: WidgetErrorInfoReportedArgs?): Unit {
      val fnPtr = _1093777681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1093777681_Ptr, marshalToNative(args),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWidgetProviderErrors_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1093777681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetProviderErrors, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("90c1b5f00d3a4ac6abb7c97b367b8fcc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetProviderErrors(ptr: Pointer?): WithDefault =
        IWidgetProviderErrors_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetProviderErrors {
      val address = segment.toRawLongValue()
      return makeIWidgetProviderErrors(Pointer(address))
    }

    public override fun toNative(obj: IWidgetProviderErrors): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1093777681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetProviderErrors): Array<IWidgetProviderErrors?> =
        (elements as
        Array<IWidgetProviderErrors?>).castToImpl<IWidgetProviderErrors,IWidgetProviderErrors_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetProviderErrors?> =
        arrayOfNulls<IWidgetProviderErrors_Impl>(size) as Array<IWidgetProviderErrors?>
  }
}
