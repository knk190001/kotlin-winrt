package Microsoft.UI.Xaml.Controls

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBreadcrumbBar.ABI::class)
@Signature("{2e47b7d6-5fbd-54c7-b0b1-ceff4a19c744}")
@Guid("2e47b7d65fbd54c7b0b1ceff4a19c744")
@WinRTInterface("2e47b7d65fbd54c7b0b1ceff4a19c744")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBreadcrumbBar.ByReference::class)
public interface IBreadcrumbBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ItemsSource(): IUnknown?

  @InterfaceMethod(1)
  public fun put_ItemsSource(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_ItemTemplate(): IUnknown?

  @InterfaceMethod(3)
  public fun put_ItemTemplate(value: IUnknown?): Unit

  @InterfaceMethod(4)
  public fun add_ItemClicked(handler: TypedEventHandler<BreadcrumbBar?,
      BreadcrumbBarItemClickedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_ItemClicked(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBreadcrumbBar>
      {
    public override fun getValue() = ABI.makeIBreadcrumbBar(pointer.getPointer(0))

    public fun setValue(value: IBreadcrumbBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBreadcrumbBar {
    public val __562938199_Ptr: Pointer?

    public val _562938199_VtblPtr: Pointer?
      get() = __562938199_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ItemsSource(): IUnknown? {
      val fnPtr = _562938199_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__562938199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ItemsSource(value: IUnknown?): Unit {
      val fnPtr = _562938199_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__562938199_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ItemTemplate(): IUnknown? {
      val fnPtr = _562938199_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__562938199_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ItemTemplate(value: IUnknown?): Unit {
      val fnPtr = _562938199_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__562938199_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_ItemClicked(handler: TypedEventHandler<BreadcrumbBar?,
        BreadcrumbBarItemClickedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _562938199_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__562938199_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_ItemClicked(token: EventRegistrationToken?): Unit {
      val fnPtr = _562938199_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__562938199_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBreadcrumbBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __562938199_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBreadcrumbBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2e47b7d65fbd54c7b0b1ceff4a19c744")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBreadcrumbBar(ptr: Pointer?): WithDefault = IBreadcrumbBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBreadcrumbBar {
      val address = segment.toRawLongValue()
      return makeIBreadcrumbBar(Pointer(address))
    }

    public override fun toNative(obj: IBreadcrumbBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__562938199_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBreadcrumbBar): Array<IBreadcrumbBar?> = (elements as
        Array<IBreadcrumbBar?>).castToImpl<IBreadcrumbBar,IBreadcrumbBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBreadcrumbBar?> =
        arrayOfNulls<IBreadcrumbBar_Impl>(size) as Array<IBreadcrumbBar?>
  }
}
