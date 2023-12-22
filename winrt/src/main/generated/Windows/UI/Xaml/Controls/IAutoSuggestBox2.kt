package Windows.UI.Xaml.Controls

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutoSuggestBox2.ABI::class)
@Signature("{aa87ddde-e679-45b2-a7c9-9aedc39db886}")
@Guid("aa87dddee67945b2a7c99aedc39db886")
@WinRTInterface("aa87dddee67945b2a7c99aedc39db886")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBox2.ByReference::class)
public interface IAutoSuggestBox2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryIcon(): IconElement?

  @InterfaceMethod(1)
  public fun put_QueryIcon(value: IconElement?): Unit

  @InterfaceMethod(2)
  public fun add_QuerySubmitted(handler: TypedEventHandler<AutoSuggestBox?,
      AutoSuggestBoxQuerySubmittedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_QuerySubmitted(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBox2> {
    public override fun getValue() = ABI.makeIAutoSuggestBox2(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBox2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBox2 {
    public val __1925569696_Ptr: Pointer?

    public val _1925569696_VtblPtr: Pointer?
      get() = __1925569696_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryIcon(): IconElement? {
      val fnPtr = _1925569696_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__1925569696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_QueryIcon(value: IconElement?): Unit {
      val fnPtr = _1925569696_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925569696_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_QuerySubmitted(handler: TypedEventHandler<AutoSuggestBox?,
        AutoSuggestBoxQuerySubmittedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1925569696_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1925569696_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_QuerySubmitted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1925569696_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1925569696_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAutoSuggestBox2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1925569696_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBox2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa87dddee67945b2a7c99aedc39db886")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBox2(ptr: Pointer?): WithDefault = IAutoSuggestBox2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBox2 {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBox2(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBox2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1925569696_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBox2): Array<IAutoSuggestBox2?> = (elements as
        Array<IAutoSuggestBox2?>).castToImpl<IAutoSuggestBox2,IAutoSuggestBox2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBox2?> =
        arrayOfNulls<IAutoSuggestBox2_Impl>(size) as Array<IAutoSuggestBox2?>
  }
}
