package Windows.UI.Xaml.Controls.Primitives

import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.Controls.Orientation
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollBar.ABI::class)
@Signature("{f57ae6ca-d1a6-4b90-a4e9-54df1ba8d2ec}")
@Guid("f57ae6cad1a64b90a4e954df1ba8d2ec")
@WinRTInterface("f57ae6cad1a64b90a4e954df1ba8d2ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollBar.ByReference::class)
public interface IScrollBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Orientation(): Orientation?

  @InterfaceMethod(1)
  public fun put_Orientation(value: Orientation?): Unit

  @InterfaceMethod(2)
  public fun get_ViewportSize(): Double

  @InterfaceMethod(3)
  public fun put_ViewportSize(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_IndicatorMode(): ScrollingIndicatorMode?

  @InterfaceMethod(5)
  public fun put_IndicatorMode(value: ScrollingIndicatorMode?): Unit

  @InterfaceMethod(6)
  public fun add_Scroll(handler: ScrollEventHandler?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_Scroll(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IScrollBar> {
    public override fun getValue() = ABI.makeIScrollBar(pointer.getPointer(0))

    public fun setValue(value: IScrollBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollBar {
    public val __1511966038_Ptr: Pointer?

    public val _1511966038_VtblPtr: Pointer?
      get() = __1511966038_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Orientation(): Orientation? {
      val fnPtr = _1511966038_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__1511966038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Orientation(value: Orientation?): Unit {
      val fnPtr = _1511966038_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511966038_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ViewportSize(): Double {
      val fnPtr = _1511966038_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1511966038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ViewportSize(value: Double): Unit {
      val fnPtr = _1511966038_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511966038_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IndicatorMode(): ScrollingIndicatorMode? {
      val fnPtr = _1511966038_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ScrollingIndicatorMode>()
      val hr = fn.invokeHR(arrayOf(__1511966038_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ScrollingIndicatorMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_IndicatorMode(value: ScrollingIndicatorMode?): Unit {
      val fnPtr = _1511966038_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511966038_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_Scroll(handler: ScrollEventHandler?): EventRegistrationToken? {
      val fnPtr = _1511966038_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1511966038_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_Scroll(token: EventRegistrationToken?): Unit {
      val fnPtr = _1511966038_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1511966038_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1511966038_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f57ae6cad1a64b90a4e954df1ba8d2ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollBar(ptr: Pointer?): WithDefault = IScrollBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollBar {
      val address = segment.toRawLongValue()
      return makeIScrollBar(Pointer(address))
    }

    public override fun toNative(obj: IScrollBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1511966038_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollBar): Array<IScrollBar?> = (elements as
        Array<IScrollBar?>).castToImpl<IScrollBar,IScrollBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollBar?> = arrayOfNulls<IScrollBar_Impl>(size)
        as Array<IScrollBar?>
  }
}
