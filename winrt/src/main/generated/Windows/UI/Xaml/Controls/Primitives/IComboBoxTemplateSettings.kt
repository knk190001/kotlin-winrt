package Windows.UI.Xaml.Controls.Primitives

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IComboBoxTemplateSettings.ABI::class)
@Signature("{83285c4e-17f6-4aa3-b61b-e87c718604ea}")
@Guid("83285c4e17f64aa3b61be87c718604ea")
@WinRTInterface("83285c4e17f64aa3b61be87c718604ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComboBoxTemplateSettings.ByReference::class)
public interface IComboBoxTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DropDownOpenedHeight(): Double

  @InterfaceMethod(1)
  public fun get_DropDownClosedHeight(): Double

  @InterfaceMethod(2)
  public fun get_DropDownOffset(): Double

  @InterfaceMethod(3)
  public fun get_SelectedItemDirection(): AnimationDirection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComboBoxTemplateSettings> {
    public override fun getValue() = ABI.makeIComboBoxTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IComboBoxTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComboBoxTemplateSettings {
    public val __1957989098_Ptr: Pointer?

    public val _1957989098_VtblPtr: Pointer?
      get() = __1957989098_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DropDownOpenedHeight(): Double {
      val fnPtr = _1957989098_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1957989098_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_DropDownClosedHeight(): Double {
      val fnPtr = _1957989098_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1957989098_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_DropDownOffset(): Double {
      val fnPtr = _1957989098_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1957989098_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SelectedItemDirection(): AnimationDirection? {
      val fnPtr = _1957989098_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationDirection>()
      val hr = fn.invokeHR(arrayOf(__1957989098_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationDirection>(result.getValue())
      return resultValue
    }
  }

  public class IComboBoxTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1957989098_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComboBoxTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("83285c4e17f64aa3b61be87c718604ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComboBoxTemplateSettings(ptr: Pointer?): WithDefault =
        IComboBoxTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComboBoxTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIComboBoxTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IComboBoxTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1957989098_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComboBoxTemplateSettings):
        Array<IComboBoxTemplateSettings?> = (elements as
        Array<IComboBoxTemplateSettings?>).castToImpl<IComboBoxTemplateSettings,IComboBoxTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComboBoxTemplateSettings?> =
        arrayOfNulls<IComboBoxTemplateSettings_Impl>(size) as Array<IComboBoxTemplateSettings?>
  }
}
