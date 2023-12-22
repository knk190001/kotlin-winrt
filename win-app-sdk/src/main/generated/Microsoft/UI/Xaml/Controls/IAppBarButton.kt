package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.AppBarButtonTemplateSettings
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

@ABIMarker(IAppBarButton.ABI::class)
@Signature("{8ab0e278-b6ae-569e-8dcd-d293552fe4d5}")
@Guid("8ab0e278b6ae569e8dcdd293552fe4d5")
@WinRTInterface("8ab0e278b6ae569e8dcdd293552fe4d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarButton.ByReference::class)
public interface IAppBarButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Label(): String?

  @InterfaceMethod(1)
  public fun put_Label(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Icon(): IconElement?

  @InterfaceMethod(3)
  public fun put_Icon(value: IconElement?): Unit

  @InterfaceMethod(4)
  public fun get_LabelPosition(): CommandBarLabelPosition?

  @InterfaceMethod(5)
  public fun put_LabelPosition(value: CommandBarLabelPosition?): Unit

  @InterfaceMethod(6)
  public fun get_KeyboardAcceleratorTextOverride(): String?

  @InterfaceMethod(7)
  public fun put_KeyboardAcceleratorTextOverride(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_TemplateSettings(): AppBarButtonTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBarButton>
      {
    public override fun getValue() = ABI.makeIAppBarButton(pointer.getPointer(0))

    public fun setValue(value: IAppBarButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarButton {
    public val __1125763915_Ptr: Pointer?

    public val _1125763915_VtblPtr: Pointer?
      get() = __1125763915_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Label(): String? {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Icon(): IconElement? {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Icon(value: IconElement?): Unit {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_LabelPosition(): CommandBarLabelPosition? {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarLabelPosition>()
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarLabelPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_LabelPosition(value: CommandBarLabelPosition?): Unit {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_KeyboardAcceleratorTextOverride(): String? {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_KeyboardAcceleratorTextOverride(value: String?): Unit {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TemplateSettings(): AppBarButtonTemplateSettings? {
      val fnPtr = _1125763915_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarButtonTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1125763915_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarButtonTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1125763915_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8ab0e278b6ae569e8dcdd293552fe4d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarButton(ptr: Pointer?): WithDefault = IAppBarButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarButton {
      val address = segment.toRawLongValue()
      return makeIAppBarButton(Pointer(address))
    }

    public override fun toNative(obj: IAppBarButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1125763915_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarButton): Array<IAppBarButton?> = (elements as
        Array<IAppBarButton?>).castToImpl<IAppBarButton,IAppBarButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarButton?> =
        arrayOfNulls<IAppBarButton_Impl>(size) as Array<IAppBarButton?>
  }
}
