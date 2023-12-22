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

@ABIMarker(IMenuFlyoutItemTemplateSettings.ABI::class)
@Signature("{56ad1809-3a16-4147-81cb-d0b35c834e0f}")
@Guid("56ad18093a16414781cbd0b35c834e0f")
@WinRTInterface("56ad18093a16414781cbd0b35c834e0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutItemTemplateSettings.ByReference::class)
public interface IMenuFlyoutItemTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeyboardAcceleratorTextMinWidth(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutItemTemplateSettings> {
    public override fun getValue() = ABI.makeIMenuFlyoutItemTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutItemTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutItemTemplateSettings {
    public val __1906415322_Ptr: Pointer?

    public val _1906415322_VtblPtr: Pointer?
      get() = __1906415322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeyboardAcceleratorTextMinWidth(): Double {
      val fnPtr = _1906415322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1906415322_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IMenuFlyoutItemTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1906415322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutItemTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56ad18093a16414781cbd0b35c834e0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutItemTemplateSettings(ptr: Pointer?): WithDefault =
        IMenuFlyoutItemTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutItemTemplateSettings {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutItemTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutItemTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1906415322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutItemTemplateSettings):
        Array<IMenuFlyoutItemTemplateSettings?> = (elements as
        Array<IMenuFlyoutItemTemplateSettings?>).castToImpl<IMenuFlyoutItemTemplateSettings,IMenuFlyoutItemTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutItemTemplateSettings?> =
        arrayOfNulls<IMenuFlyoutItemTemplateSettings_Impl>(size) as
        Array<IMenuFlyoutItemTemplateSettings?>
  }
}
