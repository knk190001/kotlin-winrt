package Windows.UI.Core

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreComponentFocusable.ABI::class)
@Signature("{52f96fa3-8742-4411-ae69-79a85f29ac8b}")
@Guid("52f96fa387424411ae6979a85f29ac8b")
@WinRTInterface("52f96fa387424411ae6979a85f29ac8b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreComponentFocusable.ByReference::class)
public interface ICoreComponentFocusable : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HasFocus(): Boolean

  @InterfaceMethod(1)
  public fun add_GotFocus(handler: TypedEventHandler<IUnknown?, CoreWindowEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(2)
  public fun remove_GotFocus(cookie: EventRegistrationToken?): Unit

  @InterfaceMethod(3)
  public fun add_LostFocus(handler: TypedEventHandler<IUnknown?, CoreWindowEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_LostFocus(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreComponentFocusable> {
    public override fun getValue() = ABI.makeICoreComponentFocusable(pointer.getPointer(0))

    public fun setValue(value: ICoreComponentFocusable_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreComponentFocusable {
    public val __1843433807_Ptr: Pointer?

    public val _1843433807_VtblPtr: Pointer?
      get() = __1843433807_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HasFocus(): Boolean {
      val fnPtr = _1843433807_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1843433807_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun add_GotFocus(handler: TypedEventHandler<IUnknown?, CoreWindowEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1843433807_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1843433807_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun remove_GotFocus(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1843433807_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1843433807_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_LostFocus(handler: TypedEventHandler<IUnknown?, CoreWindowEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _1843433807_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1843433807_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_LostFocus(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1843433807_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1843433807_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreComponentFocusable_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1843433807_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreComponentFocusable, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("52f96fa387424411ae6979a85f29ac8b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreComponentFocusable(ptr: Pointer?): WithDefault =
        ICoreComponentFocusable_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreComponentFocusable {
      val address = segment.toRawLongValue()
      return makeICoreComponentFocusable(Pointer(address))
    }

    public override fun toNative(obj: ICoreComponentFocusable): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1843433807_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreComponentFocusable): Array<ICoreComponentFocusable?>
        = (elements as
        Array<ICoreComponentFocusable?>).castToImpl<ICoreComponentFocusable,ICoreComponentFocusable_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreComponentFocusable?> =
        arrayOfNulls<ICoreComponentFocusable_Impl>(size) as Array<ICoreComponentFocusable?>
  }
}
