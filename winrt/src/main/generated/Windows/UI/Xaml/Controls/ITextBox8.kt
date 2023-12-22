package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Controls.Primitives.FlyoutBase
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

@ABIMarker(ITextBox8.ABI::class)
@Signature("{1eb6d027-0317-5c37-8aea-f747ae7f0463}")
@Guid("1eb6d02703175c378aeaf747ae7f0463")
@WinRTInterface("1eb6d02703175c378aeaf747ae7f0463")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBox8.ByReference::class)
public interface ITextBox8 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanPasteClipboardContent(): Boolean

  @InterfaceMethod(1)
  public fun get_CanUndo(): Boolean

  @InterfaceMethod(2)
  public fun get_CanRedo(): Boolean

  @InterfaceMethod(3)
  public fun get_SelectionFlyout(): FlyoutBase?

  @InterfaceMethod(4)
  public fun put_SelectionFlyout(value: FlyoutBase?): Unit

  @InterfaceMethod(5)
  public fun get_ProofingMenuFlyout(): FlyoutBase?

  @InterfaceMethod(6)
  public fun get_Description(): IUnknown?

  @InterfaceMethod(7)
  public fun put_Description(value: IUnknown?): Unit

  @InterfaceMethod(8)
  public fun add_SelectionChanging(handler: TypedEventHandler<TextBox?,
      TextBoxSelectionChangingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_SelectionChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun Undo(): Unit

  @InterfaceMethod(11)
  public fun Redo(): Unit

  @InterfaceMethod(12)
  public fun PasteFromClipboard(): Unit

  @InterfaceMethod(13)
  public fun CopySelectionToClipboard(): Unit

  @InterfaceMethod(14)
  public fun CutSelectionToClipboard(): Unit

  @InterfaceMethod(15)
  public fun ClearUndoRedoHistory(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITextBox8> {
    public override fun getValue() = ABI.makeITextBox8(pointer.getPointer(0))

    public fun setValue(value: ITextBox8_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBox8 {
    public val __1492904266_Ptr: Pointer?

    public val _1492904266_VtblPtr: Pointer?
      get() = __1492904266_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanPasteClipboardContent(): Boolean {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_CanUndo(): Boolean {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_CanRedo(): Boolean {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_SelectionFlyout(): FlyoutBase? {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_SelectionFlyout(value: FlyoutBase?): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ProofingMenuFlyout(): FlyoutBase? {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Description(): IUnknown? {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Description(value: IUnknown?): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_SelectionChanging(handler: TypedEventHandler<TextBox?,
        TextBoxSelectionChangingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_SelectionChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun Undo(): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Redo(): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun PasteFromClipboard(): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun CopySelectionToClipboard(): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun CutSelectionToClipboard(): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(15)
    public override fun ClearUndoRedoHistory(): Unit {
      val fnPtr = _1492904266_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1492904266_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextBox8_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1492904266_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBox8, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1eb6d02703175c378aeaf747ae7f0463")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBox8(ptr: Pointer?): WithDefault = ITextBox8_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBox8 {
      val address = segment.toRawLongValue()
      return makeITextBox8(Pointer(address))
    }

    public override fun toNative(obj: ITextBox8): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1492904266_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBox8): Array<ITextBox8?> = (elements as
        Array<ITextBox8?>).castToImpl<ITextBox8,ITextBox8_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBox8?> = arrayOfNulls<ITextBox8_Impl>(size)
        as Array<ITextBox8?>
  }
}
