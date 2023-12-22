package Windows.UI.Xaml.Documents

import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.FocusState
import Windows.UI.Xaml.Input.XYFocusNavigationStrategy
import Windows.UI.Xaml.RoutedEventHandler
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

@ABIMarker(IHyperlink4.ABI::class)
@Signature("{f7d02959-82fb-400a-a407-5a4ee677988a}")
@Guid("f7d0295982fb400aa4075a4ee677988a")
@WinRTInterface("f7d0295982fb400aa4075a4ee677988a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlink4.ByReference::class)
public interface IHyperlink4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FocusState(): FocusState?

  @InterfaceMethod(1)
  public fun get_XYFocusUpNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(2)
  public fun put_XYFocusUpNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(3)
  public fun get_XYFocusDownNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(4)
  public fun put_XYFocusDownNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(5)
  public fun get_XYFocusLeftNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(6)
  public fun put_XYFocusLeftNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(7)
  public fun get_XYFocusRightNavigationStrategy(): XYFocusNavigationStrategy?

  @InterfaceMethod(8)
  public fun put_XYFocusRightNavigationStrategy(value: XYFocusNavigationStrategy?): Unit

  @InterfaceMethod(9)
  public fun add_GotFocus(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_GotFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_LostFocus(handler: RoutedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_LostFocus(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun Focus(value: FocusState?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHyperlink4> {
    public override fun getValue() = ABI.makeIHyperlink4(pointer.getPointer(0))

    public fun setValue(value: IHyperlink4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlink4 {
    public val __932194122_Ptr: Pointer?

    public val _932194122_VtblPtr: Pointer?
      get() = __932194122_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FocusState(): FocusState? {
      val fnPtr = _932194122_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FocusState>()
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FocusState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_XYFocusUpNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _932194122_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_XYFocusUpNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _932194122_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_XYFocusDownNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _932194122_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_XYFocusDownNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _932194122_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_XYFocusLeftNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _932194122_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_XYFocusLeftNavigationStrategy(value: XYFocusNavigationStrategy?): Unit {
      val fnPtr = _932194122_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_XYFocusRightNavigationStrategy(): XYFocusNavigationStrategy? {
      val fnPtr = _932194122_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XYFocusNavigationStrategy>()
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XYFocusNavigationStrategy>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_XYFocusRightNavigationStrategy(value: XYFocusNavigationStrategy?):
        Unit {
      val fnPtr = _932194122_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_GotFocus(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _932194122_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_GotFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _932194122_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_LostFocus(handler: RoutedEventHandler?): EventRegistrationToken? {
      val fnPtr = _932194122_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_LostFocus(token: EventRegistrationToken?): Unit {
      val fnPtr = _932194122_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun Focus(value: FocusState?): Boolean {
      val fnPtr = _932194122_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__932194122_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHyperlink4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __932194122_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlink4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7d0295982fb400aa4075a4ee677988a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlink4(ptr: Pointer?): WithDefault = IHyperlink4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlink4 {
      val address = segment.toRawLongValue()
      return makeIHyperlink4(Pointer(address))
    }

    public override fun toNative(obj: IHyperlink4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__932194122_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlink4): Array<IHyperlink4?> = (elements as
        Array<IHyperlink4?>).castToImpl<IHyperlink4,IHyperlink4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlink4?> =
        arrayOfNulls<IHyperlink4_Impl>(size) as Array<IHyperlink4?>
  }
}
