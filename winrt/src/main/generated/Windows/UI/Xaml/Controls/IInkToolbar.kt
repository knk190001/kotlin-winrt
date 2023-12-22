package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Input.Inking.InkDrawingAttributes
import Windows.UI.Xaml.DependencyObjectCollection
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IInkToolbar.ABI::class)
@Signature("{3ddd0cca-51f0-486f-a03e-4ee13dc12bcb}")
@Guid("3ddd0cca51f0486fa03e4ee13dc12bcb")
@WinRTInterface("3ddd0cca51f0486fa03e4ee13dc12bcb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbar.ByReference::class)
public interface IInkToolbar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InitialControls(): InkToolbarInitialControls?

  @InterfaceMethod(1)
  public fun put_InitialControls(value: InkToolbarInitialControls?): Unit

  @InterfaceMethod(2)
  public fun get_Children(): DependencyObjectCollection?

  @InterfaceMethod(3)
  public fun get_ActiveTool(): InkToolbarToolButton?

  @InterfaceMethod(4)
  public fun put_ActiveTool(value: InkToolbarToolButton?): Unit

  @InterfaceMethod(5)
  public fun get_InkDrawingAttributes(): InkDrawingAttributes?

  @InterfaceMethod(6)
  public fun get_IsRulerButtonChecked(): Boolean

  @InterfaceMethod(7)
  public fun put_IsRulerButtonChecked(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_TargetInkCanvas(): InkCanvas?

  @InterfaceMethod(9)
  public fun put_TargetInkCanvas(value: InkCanvas?): Unit

  @InterfaceMethod(10)
  public fun add_ActiveToolChanged(handler: TypedEventHandler<InkToolbar?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ActiveToolChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_InkDrawingAttributesChanged(handler: TypedEventHandler<InkToolbar?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_InkDrawingAttributesChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_EraseAllClicked(handler: TypedEventHandler<InkToolbar?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_EraseAllClicked(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_IsRulerButtonCheckedChanged(handler: TypedEventHandler<InkToolbar?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_IsRulerButtonCheckedChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun GetToolButton(tool: InkToolbarTool?): InkToolbarToolButton?

  @InterfaceMethod(19)
  public fun GetToggleButton(tool: InkToolbarToggle?): InkToolbarToggleButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkToolbar> {
    public override fun getValue() = ABI.makeIInkToolbar(pointer.getPointer(0))

    public fun setValue(value: IInkToolbar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbar {
    public val __388490705_Ptr: Pointer?

    public val _388490705_VtblPtr: Pointer?
      get() = __388490705_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InitialControls(): InkToolbarInitialControls? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarInitialControls>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarInitialControls>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_InitialControls(value: InkToolbarInitialControls?): Unit {
      val fnPtr = _388490705_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Children(): DependencyObjectCollection? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObjectCollection>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObjectCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ActiveTool(): InkToolbarToolButton? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarToolButton>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarToolButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_ActiveTool(value: InkToolbarToolButton?): Unit {
      val fnPtr = _388490705_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_InkDrawingAttributes(): InkDrawingAttributes? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributes>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsRulerButtonChecked(): Boolean {
      val fnPtr = _388490705_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsRulerButtonChecked(value: Boolean): Unit {
      val fnPtr = _388490705_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TargetInkCanvas(): InkCanvas? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkCanvas>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkCanvas>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TargetInkCanvas(value: InkCanvas?): Unit {
      val fnPtr = _388490705_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_ActiveToolChanged(handler: TypedEventHandler<InkToolbar?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ActiveToolChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _388490705_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_InkDrawingAttributesChanged(handler: TypedEventHandler<InkToolbar?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_InkDrawingAttributesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _388490705_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_EraseAllClicked(handler: TypedEventHandler<InkToolbar?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_EraseAllClicked(token: EventRegistrationToken?): Unit {
      val fnPtr = _388490705_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_IsRulerButtonCheckedChanged(handler: TypedEventHandler<InkToolbar?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_IsRulerButtonCheckedChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _388490705_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun GetToolButton(tool: InkToolbarTool?): InkToolbarToolButton? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarToolButton>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(tool), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarToolButton>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun GetToggleButton(tool: InkToolbarToggle?): InkToolbarToggleButton? {
      val fnPtr = _388490705_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarToggleButton>()
      val hr = fn.invokeHR(arrayOf(__388490705_Ptr, marshalToNative(tool), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarToggleButton>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __388490705_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3ddd0cca51f0486fa03e4ee13dc12bcb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbar(ptr: Pointer?): WithDefault = IInkToolbar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbar {
      val address = segment.toRawLongValue()
      return makeIInkToolbar(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__388490705_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbar): Array<IInkToolbar?> = (elements as
        Array<IInkToolbar?>).castToImpl<IInkToolbar,IInkToolbar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbar?> =
        arrayOfNulls<IInkToolbar_Impl>(size) as Array<IInkToolbar?>
  }
}
