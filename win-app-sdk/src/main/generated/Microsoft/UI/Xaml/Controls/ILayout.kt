package Microsoft.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Size
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

@ABIMarker(ILayout.ABI::class)
@Signature("{24e50c1c-9c51-5144-9ddc-3f500191c262}")
@Guid("24e50c1c9c5151449ddc3f500191c262")
@WinRTInterface("24e50c1c9c5151449ddc3f500191c262")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayout.ByReference::class)
public interface ILayout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InitializeForContext(context: LayoutContext?): Unit

  @InterfaceMethod(1)
  public fun UninitializeForContext(context: LayoutContext?): Unit

  @InterfaceMethod(2)
  public fun Measure(context: LayoutContext?, availableSize: Size?): Size?

  @InterfaceMethod(3)
  public fun Arrange(context: LayoutContext?, finalSize: Size?): Size?

  @InterfaceMethod(4)
  public fun add_MeasureInvalidated(handler: TypedEventHandler<Layout?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_MeasureInvalidated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_ArrangeInvalidated(handler: TypedEventHandler<Layout?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_ArrangeInvalidated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILayout> {
    public override fun getValue() = ABI.makeILayout(pointer.getPointer(0))

    public fun setValue(value: ILayout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayout {
    public val __2142431311_Ptr: Pointer?

    public val _2142431311_VtblPtr: Pointer?
      get() = __2142431311_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InitializeForContext(context: LayoutContext?): Unit {
      val fnPtr = _2142431311_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2142431311_Ptr, marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun UninitializeForContext(context: LayoutContext?): Unit {
      val fnPtr = _2142431311_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2142431311_Ptr, marshalToNative(context),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Measure(context: LayoutContext?, availableSize: Size?): Size? {
      val fnPtr = _2142431311_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__2142431311_Ptr, marshalToNative(context),
          marshalToNative(availableSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Arrange(context: LayoutContext?, finalSize: Size?): Size? {
      val fnPtr = _2142431311_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Size>()
      val hr = fn.invokeHR(arrayOf(__2142431311_Ptr, marshalToNative(context),
          marshalToNative(finalSize), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Size>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun add_MeasureInvalidated(handler: TypedEventHandler<Layout?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2142431311_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2142431311_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_MeasureInvalidated(token: EventRegistrationToken?): Unit {
      val fnPtr = _2142431311_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2142431311_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_ArrangeInvalidated(handler: TypedEventHandler<Layout?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _2142431311_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2142431311_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_ArrangeInvalidated(token: EventRegistrationToken?): Unit {
      val fnPtr = _2142431311_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2142431311_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILayout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2142431311_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24e50c1c9c5151449ddc3f500191c262")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayout(ptr: Pointer?): WithDefault = ILayout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayout {
      val address = segment.toRawLongValue()
      return makeILayout(Pointer(address))
    }

    public override fun toNative(obj: ILayout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2142431311_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayout): Array<ILayout?> = (elements as
        Array<ILayout?>).castToImpl<ILayout,ILayout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayout?> = arrayOfNulls<ILayout_Impl>(size) as
        Array<ILayout?>
  }
}
