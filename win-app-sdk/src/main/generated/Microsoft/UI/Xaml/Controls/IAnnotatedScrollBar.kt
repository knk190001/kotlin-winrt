package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.IScrollController
import Microsoft.UI.Xaml.IElementFactory
import Windows.Foundation.Collections.IVector
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAnnotatedScrollBar.ABI::class)
@Signature("{0f4904a9-b6f9-5834-8d5d-59bc3b7b7ee2}")
@Guid("0f4904a9b6f958348d5d59bc3b7b7ee2")
@WinRTInterface("0f4904a9b6f958348d5d59bc3b7b7ee2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAnnotatedScrollBar.ByReference::class)
public interface IAnnotatedScrollBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScrollController(): IScrollController?

  @InterfaceMethod(1)
  public fun get_Labels(): IVector<AnnotatedScrollBarLabel?>?

  @InterfaceMethod(2)
  public fun put_Labels(value: IVector<AnnotatedScrollBarLabel?>?): Unit

  @InterfaceMethod(3)
  public fun get_LabelTemplate(): IElementFactory?

  @InterfaceMethod(4)
  public fun put_LabelTemplate(value: IElementFactory?): Unit

  @InterfaceMethod(5)
  public fun get_DetailLabelTemplate(): IElementFactory?

  @InterfaceMethod(6)
  public fun put_DetailLabelTemplate(value: IElementFactory?): Unit

  @InterfaceMethod(7)
  public fun get_SmallChange(): Double

  @InterfaceMethod(8)
  public fun put_SmallChange(value: Double): Unit

  @InterfaceMethod(9)
  public fun add_Scrolling(handler: TypedEventHandler<AnnotatedScrollBar?,
      AnnotatedScrollBarScrollingEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(10)
  public fun remove_Scrolling(token: EventRegistrationToken?): Unit

  @InterfaceMethod(11)
  public fun add_DetailLabelRequested(handler: TypedEventHandler<AnnotatedScrollBar?,
      AnnotatedScrollBarDetailLabelRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_DetailLabelRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAnnotatedScrollBar> {
    public override fun getValue() = ABI.makeIAnnotatedScrollBar(pointer.getPointer(0))

    public fun setValue(value: IAnnotatedScrollBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAnnotatedScrollBar {
    public val __1170462123_Ptr: Pointer?

    public val _1170462123_VtblPtr: Pointer?
      get() = __1170462123_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScrollController(): IScrollController? {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IScrollController>()
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IScrollController>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Labels(): IVector<AnnotatedScrollBarLabel?>? {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<AnnotatedScrollBarLabel?>>()
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<AnnotatedScrollBarLabel?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Labels(value: IVector<AnnotatedScrollBarLabel?>?): Unit {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_LabelTemplate(): IElementFactory? {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IElementFactory>()
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IElementFactory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_LabelTemplate(value: IElementFactory?): Unit {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_DetailLabelTemplate(): IElementFactory? {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IElementFactory>()
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IElementFactory>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_DetailLabelTemplate(value: IElementFactory?): Unit {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_SmallChange(): Double {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_SmallChange(value: Double): Unit {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun add_Scrolling(handler: TypedEventHandler<AnnotatedScrollBar?,
        AnnotatedScrollBarScrollingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun remove_Scrolling(token: EventRegistrationToken?): Unit {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun add_DetailLabelRequested(handler: TypedEventHandler<AnnotatedScrollBar?,
        AnnotatedScrollBarDetailLabelRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_DetailLabelRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1170462123_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1170462123_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAnnotatedScrollBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1170462123_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAnnotatedScrollBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f4904a9b6f958348d5d59bc3b7b7ee2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAnnotatedScrollBar(ptr: Pointer?): WithDefault = IAnnotatedScrollBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAnnotatedScrollBar {
      val address = segment.toRawLongValue()
      return makeIAnnotatedScrollBar(Pointer(address))
    }

    public override fun toNative(obj: IAnnotatedScrollBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1170462123_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAnnotatedScrollBar): Array<IAnnotatedScrollBar?> =
        (elements as
        Array<IAnnotatedScrollBar?>).castToImpl<IAnnotatedScrollBar,IAnnotatedScrollBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAnnotatedScrollBar?> =
        arrayOfNulls<IAnnotatedScrollBar_Impl>(size) as Array<IAnnotatedScrollBar?>
  }
}
