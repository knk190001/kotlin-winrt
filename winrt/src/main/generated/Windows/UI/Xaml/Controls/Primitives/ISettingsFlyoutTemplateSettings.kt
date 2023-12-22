package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Media.Animation.TransitionCollection
import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Media.ImageSource
import Windows.UI.Xaml.Thickness
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

@ABIMarker(ISettingsFlyoutTemplateSettings.ABI::class)
@Signature("{bcf14c10-cea7-43f1-9d68-57605ded69d4}")
@Guid("bcf14c10cea743f19d6857605ded69d4")
@WinRTInterface("bcf14c10cea743f19d6857605ded69d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsFlyoutTemplateSettings.ByReference::class)
public interface ISettingsFlyoutTemplateSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HeaderBackground(): Brush?

  @InterfaceMethod(1)
  public fun get_HeaderForeground(): Brush?

  @InterfaceMethod(2)
  public fun get_BorderBrush(): Brush?

  @InterfaceMethod(3)
  public fun get_BorderThickness(): Thickness?

  @InterfaceMethod(4)
  public fun get_IconSource(): ImageSource?

  @InterfaceMethod(5)
  public fun get_ContentTransitions(): TransitionCollection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsFlyoutTemplateSettings> {
    public override fun getValue() = ABI.makeISettingsFlyoutTemplateSettings(pointer.getPointer(0))

    public fun setValue(value: ISettingsFlyoutTemplateSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsFlyoutTemplateSettings {
    public val __2009896777_Ptr: Pointer?

    public val _2009896777_VtblPtr: Pointer?
      get() = __2009896777_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HeaderBackground(): Brush? {
      val fnPtr = _2009896777_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__2009896777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HeaderForeground(): Brush? {
      val fnPtr = _2009896777_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__2009896777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BorderBrush(): Brush? {
      val fnPtr = _2009896777_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__2009896777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BorderThickness(): Thickness? {
      val fnPtr = _2009896777_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__2009896777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IconSource(): ImageSource? {
      val fnPtr = _2009896777_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__2009896777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ContentTransitions(): TransitionCollection? {
      val fnPtr = _2009896777_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TransitionCollection>()
      val hr = fn.invokeHR(arrayOf(__2009896777_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TransitionCollection>(result.getValue())
      return resultValue
    }
  }

  public class ISettingsFlyoutTemplateSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2009896777_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsFlyoutTemplateSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bcf14c10cea743f19d6857605ded69d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsFlyoutTemplateSettings(ptr: Pointer?): WithDefault =
        ISettingsFlyoutTemplateSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISettingsFlyoutTemplateSettings {
      val address = segment.toRawLongValue()
      return makeISettingsFlyoutTemplateSettings(Pointer(address))
    }

    public override fun toNative(obj: ISettingsFlyoutTemplateSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2009896777_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsFlyoutTemplateSettings):
        Array<ISettingsFlyoutTemplateSettings?> = (elements as
        Array<ISettingsFlyoutTemplateSettings?>).castToImpl<ISettingsFlyoutTemplateSettings,ISettingsFlyoutTemplateSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsFlyoutTemplateSettings?> =
        arrayOfNulls<ISettingsFlyoutTemplateSettings_Impl>(size) as
        Array<ISettingsFlyoutTemplateSettings?>
  }
}
