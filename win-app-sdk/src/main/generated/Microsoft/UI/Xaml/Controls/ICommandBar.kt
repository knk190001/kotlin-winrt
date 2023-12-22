package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.CommandBarTemplateSettings
import Microsoft.UI.Xaml.Style
import Windows.Foundation.Collections.IObservableVector
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICommandBar.ABI::class)
@Signature("{b7ca8ee3-a07a-5f69-8ab8-be4e3e4cf0c8}")
@Guid("b7ca8ee3a07a5f698ab8be4e3e4cf0c8")
@WinRTInterface("b7ca8ee3a07a5f698ab8be4e3e4cf0c8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBar.ByReference::class)
public interface ICommandBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrimaryCommands(): IObservableVector<ICommandBarElement?>?

  @InterfaceMethod(1)
  public fun get_SecondaryCommands(): IObservableVector<ICommandBarElement?>?

  @InterfaceMethod(2)
  public fun get_CommandBarOverflowPresenterStyle(): Style?

  @InterfaceMethod(3)
  public fun put_CommandBarOverflowPresenterStyle(value: Style?): Unit

  @InterfaceMethod(4)
  public fun get_CommandBarTemplateSettings(): CommandBarTemplateSettings?

  @InterfaceMethod(5)
  public fun get_DefaultLabelPosition(): CommandBarDefaultLabelPosition?

  @InterfaceMethod(6)
  public fun put_DefaultLabelPosition(value: CommandBarDefaultLabelPosition?): Unit

  @InterfaceMethod(7)
  public fun get_OverflowButtonVisibility(): CommandBarOverflowButtonVisibility?

  @InterfaceMethod(8)
  public fun put_OverflowButtonVisibility(value: CommandBarOverflowButtonVisibility?): Unit

  @InterfaceMethod(9)
  public fun get_IsDynamicOverflowEnabled(): Boolean

  @InterfaceMethod(10)
  public fun put_IsDynamicOverflowEnabled(value: Boolean): Unit

  @InterfaceMethod(11)
  public fun add_DynamicOverflowItemsChanging(handler: TypedEventHandler<CommandBar?,
      DynamicOverflowItemsChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_DynamicOverflowItemsChanging(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICommandBar> {
    public override fun getValue() = ABI.makeICommandBar(pointer.getPointer(0))

    public fun setValue(value: ICommandBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBar {
    public val __97559089_Ptr: Pointer?

    public val _97559089_VtblPtr: Pointer?
      get() = __97559089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrimaryCommands(): IObservableVector<ICommandBarElement?>? {
      val fnPtr = _97559089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<ICommandBarElement?>>()
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<ICommandBarElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SecondaryCommands(): IObservableVector<ICommandBarElement?>? {
      val fnPtr = _97559089_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<ICommandBarElement?>>()
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<ICommandBarElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CommandBarOverflowPresenterStyle(): Style? {
      val fnPtr = _97559089_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_CommandBarOverflowPresenterStyle(value: Style?): Unit {
      val fnPtr = _97559089_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_CommandBarTemplateSettings(): CommandBarTemplateSettings? {
      val fnPtr = _97559089_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarTemplateSettings>()
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarTemplateSettings>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DefaultLabelPosition(): CommandBarDefaultLabelPosition? {
      val fnPtr = _97559089_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarDefaultLabelPosition>()
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarDefaultLabelPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_DefaultLabelPosition(value: CommandBarDefaultLabelPosition?): Unit {
      val fnPtr = _97559089_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_OverflowButtonVisibility(): CommandBarOverflowButtonVisibility? {
      val fnPtr = _97559089_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CommandBarOverflowButtonVisibility>()
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CommandBarOverflowButtonVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_OverflowButtonVisibility(value: CommandBarOverflowButtonVisibility?):
        Unit {
      val fnPtr = _97559089_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_IsDynamicOverflowEnabled(): Boolean {
      val fnPtr = _97559089_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_IsDynamicOverflowEnabled(value: Boolean): Unit {
      val fnPtr = _97559089_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_DynamicOverflowItemsChanging(handler: TypedEventHandler<CommandBar?,
        DynamicOverflowItemsChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _97559089_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_DynamicOverflowItemsChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _97559089_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__97559089_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICommandBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __97559089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b7ca8ee3a07a5f698ab8be4e3e4cf0c8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBar(ptr: Pointer?): WithDefault = ICommandBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBar {
      val address = segment.toRawLongValue()
      return makeICommandBar(Pointer(address))
    }

    public override fun toNative(obj: ICommandBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__97559089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBar): Array<ICommandBar?> = (elements as
        Array<ICommandBar?>).castToImpl<ICommandBar,ICommandBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBar?> =
        arrayOfNulls<ICommandBar_Impl>(size) as Array<ICommandBar?>
  }
}
