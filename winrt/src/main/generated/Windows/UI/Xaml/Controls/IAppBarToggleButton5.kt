package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.AppBarToggleButtonTemplateSettings
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

@ABIMarker(IAppBarToggleButton5.ABI::class)
@Signature("{9dca3357-c130-4fb6-a1e2-d2b348fe43be}")
@Guid("9dca3357c1304fb6a1e2d2b348fe43be")
@WinRTInterface("9dca3357c1304fb6a1e2d2b348fe43be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButton5.ByReference::class)
public interface IAppBarToggleButton5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TemplateSettings(): AppBarToggleButtonTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButton5> {
    public override fun getValue() = ABI.makeIAppBarToggleButton5(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButton5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButton5 {
    public val __1248128351_Ptr: Pointer?

    public val _1248128351_VtblPtr: Pointer?
      get() = __1248128351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TemplateSettings(): AppBarToggleButtonTemplateSettings? {
      val fnPtr = _1248128351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarToggleButtonTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1248128351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarToggleButtonTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarToggleButton5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1248128351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButton5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9dca3357c1304fb6a1e2d2b348fe43be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButton5(ptr: Pointer?): WithDefault = IAppBarToggleButton5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButton5 {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButton5(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButton5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1248128351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButton5): Array<IAppBarToggleButton5?> =
        (elements as
        Array<IAppBarToggleButton5?>).castToImpl<IAppBarToggleButton5,IAppBarToggleButton5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButton5?> =
        arrayOfNulls<IAppBarToggleButton5_Impl>(size) as Array<IAppBarToggleButton5?>
  }
}
