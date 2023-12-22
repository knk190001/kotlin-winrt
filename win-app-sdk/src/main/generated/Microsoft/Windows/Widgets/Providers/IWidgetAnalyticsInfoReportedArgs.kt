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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWidgetAnalyticsInfoReportedArgs.ABI::class)
@Signature("{1d9e5fb5-2bce-5350-87b1-d63199526639}")
@Guid("1d9e5fb52bce535087b1d63199526639")
@WinRTInterface("1d9e5fb52bce535087b1d63199526639")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetAnalyticsInfoReportedArgs.ByReference::class)
public interface IWidgetAnalyticsInfoReportedArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WidgetContext(): WidgetContext?

  @InterfaceMethod(1)
  public fun get_AnalyticsJson(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetAnalyticsInfoReportedArgs> {
    public override fun getValue() = ABI.makeIWidgetAnalyticsInfoReportedArgs(pointer.getPointer(0))

    public fun setValue(value: IWidgetAnalyticsInfoReportedArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetAnalyticsInfoReportedArgs {
    public val __1315481521_Ptr: Pointer?

    public val _1315481521_VtblPtr: Pointer?
      get() = __1315481521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WidgetContext(): WidgetContext? {
      val fnPtr = _1315481521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WidgetContext>()
      val hr = fn.invokeHR(arrayOf(__1315481521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WidgetContext>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_AnalyticsJson(): String? {
      val fnPtr = _1315481521_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1315481521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWidgetAnalyticsInfoReportedArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1315481521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetAnalyticsInfoReportedArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d9e5fb52bce535087b1d63199526639")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetAnalyticsInfoReportedArgs(ptr: Pointer?): WithDefault =
        IWidgetAnalyticsInfoReportedArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetAnalyticsInfoReportedArgs {
      val address = segment.toRawLongValue()
      return makeIWidgetAnalyticsInfoReportedArgs(Pointer(address))
    }

    public override fun toNative(obj: IWidgetAnalyticsInfoReportedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1315481521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetAnalyticsInfoReportedArgs):
        Array<IWidgetAnalyticsInfoReportedArgs?> = (elements as
        Array<IWidgetAnalyticsInfoReportedArgs?>).castToImpl<IWidgetAnalyticsInfoReportedArgs,IWidgetAnalyticsInfoReportedArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetAnalyticsInfoReportedArgs?> =
        arrayOfNulls<IWidgetAnalyticsInfoReportedArgs_Impl>(size) as
        Array<IWidgetAnalyticsInfoReportedArgs?>
  }
}
