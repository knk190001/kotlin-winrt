package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.AppBarToggleButtonTemplateSettings
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

@ABIMarker(IAppBarToggleButton.ABI::class)
@Signature("{9687c0b1-c390-59be-acdc-4fc48f552823}")
@Guid("9687c0b1c39059beacdc4fc48f552823")
@WinRTInterface("9687c0b1c39059beacdc4fc48f552823")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarToggleButton.ByReference::class)
public interface IAppBarToggleButton : NativeMapped, IWinRTInterface {
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
  public fun get_TemplateSettings(): AppBarToggleButtonTemplateSettings?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarToggleButton> {
    public override fun getValue() = ABI.makeIAppBarToggleButton(pointer.getPointer(0))

    public fun setValue(value: IAppBarToggleButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarToggleButton {
    public val __1581346047_Ptr: Pointer?

    public val _1581346047_VtblPtr: Pointer?
      get() = __1581346047_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Label(): String? {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Label(value: String?): Unit {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Icon(): IconElement? {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Icon(value: IconElement?): Unit {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_LabelPosition(): CommandBarLabelPosition? {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarLabelPosition>()
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarLabelPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_LabelPosition(value: CommandBarLabelPosition?): Unit {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_KeyboardAcceleratorTextOverride(): String? {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_KeyboardAcceleratorTextOverride(value: String?): Unit {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TemplateSettings(): AppBarToggleButtonTemplateSettings? {
      val fnPtr = _1581346047_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarToggleButtonTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__1581346047_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarToggleButtonTemplateSettings>(result.getValue())
      return resultValue
    }
  }

  public class IAppBarToggleButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1581346047_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarToggleButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9687c0b1c39059beacdc4fc48f552823")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarToggleButton(ptr: Pointer?): WithDefault = IAppBarToggleButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarToggleButton {
      val address = segment.toRawLongValue()
      return makeIAppBarToggleButton(Pointer(address))
    }

    public override fun toNative(obj: IAppBarToggleButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1581346047_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarToggleButton): Array<IAppBarToggleButton?> =
        (elements as
        Array<IAppBarToggleButton?>).castToImpl<IAppBarToggleButton,IAppBarToggleButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarToggleButton?> =
        arrayOfNulls<IAppBarToggleButton_Impl>(size) as Array<IAppBarToggleButton?>
  }
}
