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

@ABIMarker(IWidgetProvider2.ABI::class)
@Signature("{38c3a963-dd93-479d-9276-04bf84ee1816}")
@Guid("38c3a963dd93479d927604bf84ee1816")
@WinRTInterface("38c3a963dd93479d927604bf84ee1816")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWidgetProvider2.ByReference::class)
public interface IWidgetProvider2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun OnCustomizationRequested(customizationRequestedArgs: WidgetCustomizationRequestedArgs?):
      Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWidgetProvider2> {
    public override fun getValue() = ABI.makeIWidgetProvider2(pointer.getPointer(0))

    public fun setValue(value: IWidgetProvider2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWidgetProvider2 {
    public val __798607084_Ptr: Pointer?

    public val _798607084_VtblPtr: Pointer?
      get() = __798607084_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun OnCustomizationRequested(customizationRequestedArgs: WidgetCustomizationRequestedArgs?):
        Unit {
      val fnPtr = _798607084_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__798607084_Ptr, marshalToNative(customizationRequestedArgs),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IWidgetProvider2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __798607084_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWidgetProvider2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("38c3a963dd93479d927604bf84ee1816")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWidgetProvider2(ptr: Pointer?): WithDefault = IWidgetProvider2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWidgetProvider2 {
      val address = segment.toRawLongValue()
      return makeIWidgetProvider2(Pointer(address))
    }

    public override fun toNative(obj: IWidgetProvider2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__798607084_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWidgetProvider2): Array<IWidgetProvider2?> = (elements as
        Array<IWidgetProvider2?>).castToImpl<IWidgetProvider2,IWidgetProvider2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWidgetProvider2?> =
        arrayOfNulls<IWidgetProvider2_Impl>(size) as Array<IWidgetProvider2?>
  }
}
