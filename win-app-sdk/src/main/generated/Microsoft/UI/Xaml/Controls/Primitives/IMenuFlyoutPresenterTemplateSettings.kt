package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IMenuFlyoutPresenterTemplateSettings.ABI::class)
@Signature("{2bfcfa7e-483c-5fc9-b070-fbb58e6e974d}")
@Guid("2bfcfa7e483c5fc9b070fbb58e6e974d")
@WinRTInterface("2bfcfa7e483c5fc9b070fbb58e6e974d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutPresenterTemplateSettings.ByReference::class)
public interface IMenuFlyoutPresenterTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FlyoutContentMinWidth(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutPresenterTemplateSettings> {
    public override fun getValue() =
        ABI.makeIMenuFlyoutPresenterTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutPresenterTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutPresenterTemplateSettings {
    public val __827309178_Ptr: Pointer?

    public val _827309178_VtblPtr: Pointer?
      get() = __827309178_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FlyoutContentMinWidth(): Double {
      val fnPtr = _827309178_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__827309178_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IMenuFlyoutPresenterTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __827309178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutPresenterTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2bfcfa7e483c5fc9b070fbb58e6e974d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutPresenterTemplateSettings(ptr: Pointer?): WithDefault =
        IMenuFlyoutPresenterTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutPresenterTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutPresenterTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutPresenterTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__827309178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutPresenterTemplateSettings):
        Array<IMenuFlyoutPresenterTemplateSettings?> = (elements as
        Array<IMenuFlyoutPresenterTemplateSettings?>).castToImpl<IMenuFlyoutPresenterTemplateSettings,IMenuFlyoutPresenterTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutPresenterTemplateSettings?> =
        arrayOfNulls<IMenuFlyoutPresenterTemplateSettings_Impl>(size) as
        Array<IMenuFlyoutPresenterTemplateSettings?>
  }
}
