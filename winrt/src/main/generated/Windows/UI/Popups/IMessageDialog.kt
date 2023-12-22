package Windows.UI.Popups

import Windows.Foundation.Collections.IVector
import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMessageDialog.ABI::class)
@Signature("{33f59b01-5325-43ab-9ab3-bdae440e4121}")
@Guid("33f59b01532543ab9ab3bdae440e4121")
@WinRTInterface("33f59b01532543ab9ab3bdae440e4121")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMessageDialog.ByReference::class)
public interface IMessageDialog : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_Commands(): IVector<IUICommand?>?

  @InterfaceMethod(3)
  public fun get_DefaultCommandIndex(): WinDef.UINT

  @InterfaceMethod(4)
  public fun put_DefaultCommandIndex(value: WinDef.UINT): Unit

  @InterfaceMethod(5)
  public fun get_CancelCommandIndex(): WinDef.UINT

  @InterfaceMethod(6)
  public fun put_CancelCommandIndex(value: WinDef.UINT): Unit

  @InterfaceMethod(7)
  public fun get_Content(): String?

  @InterfaceMethod(8)
  public fun put_Content(value: String?): Unit

  @InterfaceMethod(9)
  public fun ShowAsync(): IAsyncOperation<IUICommand?>?

  @InterfaceMethod(10)
  public fun get_Options(): MessageDialogOptions?

  @InterfaceMethod(11)
  public fun put_Options(value: MessageDialogOptions?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMessageDialog>
      {
    public override fun getValue() = ABI.makeIMessageDialog(pointer.getPointer(0))

    public fun setValue(value: IMessageDialog_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMessageDialog {
    public val __1900260380_Ptr: Pointer?

    public val _1900260380_VtblPtr: Pointer?
      get() = __1900260380_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Commands(): IVector<IUICommand?>? {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<IUICommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DefaultCommandIndex(): WinDef.UINT {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_DefaultCommandIndex(value: WinDef.UINT): Unit {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_CancelCommandIndex(): WinDef.UINT {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun put_CancelCommandIndex(value: WinDef.UINT): Unit {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Content(): String? {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Content(value: String?): Unit {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun ShowAsync(): IAsyncOperation<IUICommand?>? {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IUICommand?>>()
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IUICommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Options(): MessageDialogOptions? {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MessageDialogOptions>()
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MessageDialogOptions>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_Options(value: MessageDialogOptions?): Unit {
      val fnPtr = _1900260380_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1900260380_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMessageDialog_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1900260380_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMessageDialog, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("33f59b01532543ab9ab3bdae440e4121")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMessageDialog(ptr: Pointer?): WithDefault = IMessageDialog_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMessageDialog {
      val address = segment.toRawLongValue()
      return makeIMessageDialog(Pointer(address))
    }

    public override fun toNative(obj: IMessageDialog): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1900260380_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMessageDialog): Array<IMessageDialog?> = (elements as
        Array<IMessageDialog?>).castToImpl<IMessageDialog,IMessageDialog_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMessageDialog?> =
        arrayOfNulls<IMessageDialog_Impl>(size) as Array<IMessageDialog?>
  }
}
