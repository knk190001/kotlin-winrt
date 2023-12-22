package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ClickMode
import Microsoft.UI.Xaml.Input.ICommand
import Microsoft.UI.Xaml.RoutedEventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(IButtonBase.ABI::class)
@Signature("{65714269-2473-5327-a652-0ea6bce7f403}")
@Guid("6571426924735327a6520ea6bce7f403")
@WinRTInterface("6571426924735327a6520ea6bce7f403")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButtonBase.ByReference::class)
public interface IButtonBase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClickMode(): ClickMode?

  @InterfaceMethod(1)
  public fun put_ClickMode(value: ClickMode?): Unit

  @InterfaceMethod(2)
  public fun get_IsPointerOver(): Boolean

  @InterfaceMethod(3)
  public fun get_IsPressed(): Boolean

  @InterfaceMethod(4)
  public fun get_Command(): ICommand?

  @InterfaceMethod(5)
  public fun put_Command(value: ICommand?): Unit

  @InterfaceMethod(6)
  public fun get_CommandParameter(): IUnknown?

  @InterfaceMethod(7)
  public fun put_CommandParameter(value: IUnknown?): Unit

  @InterfaceMethod(8)
  public fun add_Click(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Click(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IButtonBase> {
    public override fun getValue() = ABI.makeIButtonBase(pointer.getPointer(0))

    public fun setValue(value: IButtonBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButtonBase {
    public val __205289524_Ptr: Pointer?

    public val _205289524_VtblPtr: Pointer?
      get() = __205289524_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClickMode(): ClickMode? {
      val fnPtr = _205289524_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ClickMode>()
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ClickMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ClickMode(value: ClickMode?): Unit {
      val fnPtr = _205289524_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsPointerOver(): Boolean {
      val fnPtr = _205289524_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_IsPressed(): Boolean {
      val fnPtr = _205289524_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Command(): ICommand? {
      val fnPtr = _205289524_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICommand>()
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Command(value: ICommand?): Unit {
      val fnPtr = _205289524_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CommandParameter(): IUnknown? {
      val fnPtr = _205289524_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_CommandParameter(value: IUnknown?): Unit {
      val fnPtr = _205289524_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Click(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _205289524_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Click(token: EventRegistrationToken?): Unit {
      val fnPtr = _205289524_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__205289524_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IButtonBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __205289524_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButtonBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6571426924735327a6520ea6bce7f403")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButtonBase(ptr: Pointer?): WithDefault = IButtonBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButtonBase {
      val address = segment.toRawLongValue()
      return makeIButtonBase(Pointer(address))
    }

    public override fun toNative(obj: IButtonBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__205289524_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButtonBase): Array<IButtonBase?> = (elements as
        Array<IButtonBase?>).castToImpl<IButtonBase,IButtonBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButtonBase?> =
        arrayOfNulls<IButtonBase_Impl>(size) as Array<IButtonBase?>
  }
}
