package Windows.UI.Xaml

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Data.BindingExpression
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

@ABIMarker(IFrameworkElement2.ABI::class)
@Signature("{f19104be-422a-4904-a52f-ee72010429e5}")
@Guid("f19104be422a4904a52fee72010429e5")
@WinRTInterface("f19104be422a4904a52fee72010429e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElement2.ByReference::class)
public interface IFrameworkElement2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestedTheme(): ElementTheme?

  @InterfaceMethod(1)
  public fun put_RequestedTheme(value: ElementTheme?): Unit

  @InterfaceMethod(2)
  public fun add_DataContextChanged(handler: TypedEventHandler<FrameworkElement?,
      DataContextChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DataContextChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun GetBindingExpression(dp: DependencyProperty?): BindingExpression?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElement2> {
    public override fun getValue() = ABI.makeIFrameworkElement2(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElement2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElement2 {
    public val __329359554_Ptr: Pointer?

    public val _329359554_VtblPtr: Pointer?
      get() = __329359554_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestedTheme(): ElementTheme? {
      val fnPtr = _329359554_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ElementTheme>()
      val hr = fn.invokeHR(arrayOf(__329359554_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ElementTheme>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_RequestedTheme(value: ElementTheme?): Unit {
      val fnPtr = _329359554_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359554_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_DataContextChanged(handler: TypedEventHandler<FrameworkElement?,
        DataContextChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _329359554_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__329359554_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DataContextChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _329359554_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359554_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetBindingExpression(dp: DependencyProperty?): BindingExpression? {
      val fnPtr = _329359554_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BindingExpression>()
      val hr = fn.invokeHR(arrayOf(__329359554_Ptr, marshalToNative(dp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BindingExpression>(result.getValue())
      return resultValue
    }
  }

  public class IFrameworkElement2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329359554_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElement2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f19104be422a4904a52fee72010429e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElement2(ptr: Pointer?): WithDefault = IFrameworkElement2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElement2 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElement2(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElement2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329359554_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElement2): Array<IFrameworkElement2?> =
        (elements as
        Array<IFrameworkElement2?>).castToImpl<IFrameworkElement2,IFrameworkElement2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElement2?> =
        arrayOfNulls<IFrameworkElement2_Impl>(size) as Array<IFrameworkElement2?>
  }
}
