package Windows.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.ElementSoundMode
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

@ABIMarker(IControl4.ABI::class)
@Signature("{0e18aeee-5f2e-44ea-8513-d3875c0a7513}")
@Guid("0e18aeee5f2e44ea8513d3875c0a7513")
@WinRTInterface("0e18aeee5f2e44ea8513d3875c0a7513")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControl4.ByReference::class)
public interface IControl4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFocusEngagementEnabled(): Boolean

  @InterfaceMethod(1)
  public fun put_IsFocusEngagementEnabled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_IsFocusEngaged(): Boolean

  @InterfaceMethod(3)
  public fun put_IsFocusEngaged(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_RequiresPointer(): RequiresPointer?

  @InterfaceMethod(5)
  public fun put_RequiresPointer(value: RequiresPointer?): Unit

  @InterfaceMethod(6)
  public fun get_XYFocusLeft(): DependencyObject?

  @InterfaceMethod(7)
  public fun put_XYFocusLeft(value: DependencyObject?): Unit

  @InterfaceMethod(8)
  public fun get_XYFocusRight(): DependencyObject?

  @InterfaceMethod(9)
  public fun put_XYFocusRight(value: DependencyObject?): Unit

  @InterfaceMethod(10)
  public fun get_XYFocusUp(): DependencyObject?

  @InterfaceMethod(11)
  public fun put_XYFocusUp(value: DependencyObject?): Unit

  @InterfaceMethod(12)
  public fun get_XYFocusDown(): DependencyObject?

  @InterfaceMethod(13)
  public fun put_XYFocusDown(value: DependencyObject?): Unit

  @InterfaceMethod(14)
  public fun get_ElementSoundMode(): ElementSoundMode?

  @InterfaceMethod(15)
  public fun put_ElementSoundMode(value: ElementSoundMode?): Unit

  @InterfaceMethod(16)
  public fun add_FocusEngaged(handler: TypedEventHandler<Control?, FocusEngagedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_FocusEngaged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_FocusDisengaged(handler: TypedEventHandler<Control?, FocusDisengagedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_FocusDisengaged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun RemoveFocusEngagement(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IControl4> {
    public override fun getValue() = ABI.makeIControl4(pointer.getPointer(0))

    public fun setValue(value: IControl4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControl4 {
    public val __1055668589_Ptr: Pointer?

    public val _1055668589_VtblPtr: Pointer?
      get() = __1055668589_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFocusEngagementEnabled(): Boolean {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsFocusEngagementEnabled(value: Boolean): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsFocusEngaged(): Boolean {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_IsFocusEngaged(value: Boolean): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RequiresPointer(): RequiresPointer? {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RequiresPointer>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RequiresPointer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_RequiresPointer(value: RequiresPointer?): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_XYFocusLeft(): DependencyObject? {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_XYFocusLeft(value: DependencyObject?): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_XYFocusRight(): DependencyObject? {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_XYFocusRight(value: DependencyObject?): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_XYFocusUp(): DependencyObject? {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_XYFocusUp(value: DependencyObject?): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_XYFocusDown(): DependencyObject? {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_XYFocusDown(value: DependencyObject?): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ElementSoundMode(): ElementSoundMode? {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementSoundMode>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementSoundMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_ElementSoundMode(value: ElementSoundMode?): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_FocusEngaged(handler: TypedEventHandler<Control?,
        FocusEngagedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_FocusEngaged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_FocusDisengaged(handler: TypedEventHandler<Control?,
        FocusDisengagedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_FocusDisengaged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun RemoveFocusEngagement(): Unit {
      val fnPtr = _1055668589_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1055668589_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IControl4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1055668589_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControl4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0e18aeee5f2e44ea8513d3875c0a7513")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControl4(ptr: Pointer?): WithDefault = IControl4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IControl4 {
      val address = segment.toRawLongValue()
      return makeIControl4(Pointer(address))
    }

    public override fun toNative(obj: IControl4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1055668589_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControl4): Array<IControl4?> = (elements as
        Array<IControl4?>).castToImpl<IControl4,IControl4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControl4?> = arrayOfNulls<IControl4_Impl>(size)
        as Array<IControl4?>
  }
}
