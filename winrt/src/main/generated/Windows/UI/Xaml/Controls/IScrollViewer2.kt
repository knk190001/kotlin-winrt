package Windows.UI.Xaml.Controls

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.UI.Xaml.UIElement
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
import kotlin.Double
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IScrollViewer2.ABI::class)
@Signature("{64e9be10-4dd1-494d-abf7-cbd3c577491d}")
@Guid("64e9be104dd1494dabf7cbd3c577491d")
@WinRTInterface("64e9be104dd1494dabf7cbd3c577491d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollViewer2.ByReference::class)
public interface IScrollViewer2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TopLeftHeader(): UIElement?

  @InterfaceMethod(1)
  public fun put_TopLeftHeader(value: UIElement?): Unit

  @InterfaceMethod(2)
  public fun get_LeftHeader(): UIElement?

  @InterfaceMethod(3)
  public fun put_LeftHeader(value: UIElement?): Unit

  @InterfaceMethod(4)
  public fun get_TopHeader(): UIElement?

  @InterfaceMethod(5)
  public fun put_TopHeader(value: UIElement?): Unit

  @InterfaceMethod(6)
  public fun add_ViewChanging(handler: EventHandler<ScrollViewerViewChangingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ViewChanging(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun ChangeView(
    horizontalOffset: IReference<Double>?,
    verticalOffset: IReference<Double>?,
    zoomFactor: IReference<Float>?
  ): Boolean

  @InterfaceMethod(9)
  public fun ChangeView(
    horizontalOffset: IReference<Double>?,
    verticalOffset: IReference<Double>?,
    zoomFactor: IReference<Float>?,
    disableAnimation: Boolean
  ): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IScrollViewer2>
      {
    public override fun getValue() = ABI.makeIScrollViewer2(pointer.getPointer(0))

    public fun setValue(value: IScrollViewer2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollViewer2 {
    public val __174137911_Ptr: Pointer?

    public val _174137911_VtblPtr: Pointer?
      get() = __174137911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TopLeftHeader(): UIElement? {
      val fnPtr = _174137911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_TopLeftHeader(value: UIElement?): Unit {
      val fnPtr = _174137911_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_LeftHeader(): UIElement? {
      val fnPtr = _174137911_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_LeftHeader(value: UIElement?): Unit {
      val fnPtr = _174137911_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_TopHeader(): UIElement? {
      val fnPtr = _174137911_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_TopHeader(value: UIElement?): Unit {
      val fnPtr = _174137911_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override
        fun add_ViewChanging(handler: EventHandler<ScrollViewerViewChangingEventArgs?>?):
        EventRegistrationToken? {
      val fnPtr = _174137911_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ViewChanging(token: EventRegistrationToken?): Unit {
      val fnPtr = _174137911_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun ChangeView(
      horizontalOffset: IReference<Double>?,
      verticalOffset: IReference<Double>?,
      zoomFactor: IReference<Float>?
    ): Boolean {
      val fnPtr = _174137911_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr, marshalToNative(horizontalOffset),
          marshalToNative(verticalOffset), marshalToNative(zoomFactor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun ChangeView(
      horizontalOffset: IReference<Double>?,
      verticalOffset: IReference<Double>?,
      zoomFactor: IReference<Float>?,
      disableAnimation: Boolean
    ): Boolean {
      val fnPtr = _174137911_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__174137911_Ptr, marshalToNative(horizontalOffset),
          marshalToNative(verticalOffset), marshalToNative(zoomFactor), disableAnimation, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IScrollViewer2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __174137911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollViewer2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64e9be104dd1494dabf7cbd3c577491d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollViewer2(ptr: Pointer?): WithDefault = IScrollViewer2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollViewer2 {
      val address = segment.toRawLongValue()
      return makeIScrollViewer2(Pointer(address))
    }

    public override fun toNative(obj: IScrollViewer2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__174137911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollViewer2): Array<IScrollViewer2?> = (elements as
        Array<IScrollViewer2?>).castToImpl<IScrollViewer2,IScrollViewer2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollViewer2?> =
        arrayOfNulls<IScrollViewer2_Impl>(size) as Array<IScrollViewer2?>
  }
}
