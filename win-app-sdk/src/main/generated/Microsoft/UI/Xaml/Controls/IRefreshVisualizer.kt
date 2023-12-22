package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.UIElement
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

@ABIMarker(IRefreshVisualizer.ABI::class)
@Signature("{d6c55db6-d82d-5b68-ba1d-28593fb0ab12}")
@Guid("d6c55db6d82d5b68ba1d28593fb0ab12")
@WinRTInterface("d6c55db6d82d5b68ba1d28593fb0ab12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRefreshVisualizer.ByReference::class)
public interface IRefreshVisualizer : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestRefresh(): Unit

  @InterfaceMethod(1)
  public fun get_Orientation(): RefreshVisualizerOrientation?

  @InterfaceMethod(2)
  public fun put_Orientation(value: RefreshVisualizerOrientation?): Unit

  @InterfaceMethod(3)
  public fun get_Content(): UIElement?

  @InterfaceMethod(4)
  public fun put_Content(value: UIElement?): Unit

  @InterfaceMethod(5)
  public fun get_State(): RefreshVisualizerState?

  @InterfaceMethod(6)
  public fun add_RefreshRequested(handler: TypedEventHandler<RefreshVisualizer?,
      RefreshRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_RefreshRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun add_RefreshStateChanged(handler: TypedEventHandler<RefreshVisualizer?,
      RefreshStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_RefreshStateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRefreshVisualizer> {
    public override fun getValue() = ABI.makeIRefreshVisualizer(pointer.getPointer(0))

    public fun setValue(value: IRefreshVisualizer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRefreshVisualizer {
    public val __626857166_Ptr: Pointer?

    public val _626857166_VtblPtr: Pointer?
      get() = __626857166_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestRefresh(): Unit {
      val fnPtr = _626857166_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_Orientation(): RefreshVisualizerOrientation? {
      val fnPtr = _626857166_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RefreshVisualizerOrientation>()
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RefreshVisualizerOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Orientation(value: RefreshVisualizerOrientation?): Unit {
      val fnPtr = _626857166_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Content(): UIElement? {
      val fnPtr = _626857166_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Content(value: UIElement?): Unit {
      val fnPtr = _626857166_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_State(): RefreshVisualizerState? {
      val fnPtr = _626857166_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RefreshVisualizerState>()
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RefreshVisualizerState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_RefreshRequested(handler: TypedEventHandler<RefreshVisualizer?,
        RefreshRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _626857166_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_RefreshRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _626857166_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_RefreshStateChanged(handler: TypedEventHandler<RefreshVisualizer?,
        RefreshStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _626857166_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_RefreshStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _626857166_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__626857166_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRefreshVisualizer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626857166_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRefreshVisualizer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d6c55db6d82d5b68ba1d28593fb0ab12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRefreshVisualizer(ptr: Pointer?): WithDefault = IRefreshVisualizer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRefreshVisualizer {
      val address = segment.toRawLongValue()
      return makeIRefreshVisualizer(Pointer(address))
    }

    public override fun toNative(obj: IRefreshVisualizer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626857166_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRefreshVisualizer): Array<IRefreshVisualizer?> =
        (elements as
        Array<IRefreshVisualizer?>).castToImpl<IRefreshVisualizer,IRefreshVisualizer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRefreshVisualizer?> =
        arrayOfNulls<IRefreshVisualizer_Impl>(size) as Array<IRefreshVisualizer?>
  }
}
