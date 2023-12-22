package Windows.UI.ViewManagement

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IReference
import Windows.Foundation.Rect
import Windows.Foundation.TypedEventHandler
import Windows.UI.Color
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStatusBar.ABI::class)
@Signature("{0ffcc5bf-98d0-4864-b1e8-b3f4020be8b4}")
@Guid("0ffcc5bf98d04864b1e8b3f4020be8b4")
@WinRTInterface("0ffcc5bf98d04864b1e8b3f4020be8b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStatusBar.ByReference::class)
public interface IStatusBar : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun HideAsync(): IAsyncAction?

  @InterfaceMethod(2)
  public fun get_BackgroundOpacity(): Double

  @InterfaceMethod(3)
  public fun put_BackgroundOpacity(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_ForegroundColor(): IReference<Color?>?

  @InterfaceMethod(5)
  public fun put_ForegroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(6)
  public fun get_BackgroundColor(): IReference<Color?>?

  @InterfaceMethod(7)
  public fun put_BackgroundColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(8)
  public fun get_ProgressIndicator(): StatusBarProgressIndicator?

  @InterfaceMethod(9)
  public fun get_OccludedRect(): Rect?

  @InterfaceMethod(10)
  public fun add_Showing(eventHandler: TypedEventHandler<StatusBar?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_Showing(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun add_Hiding(eventHandler: TypedEventHandler<StatusBar?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_Hiding(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStatusBar> {
    public override fun getValue() = ABI.makeIStatusBar(pointer.getPointer(0))

    public fun setValue(value: IStatusBar_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStatusBar {
    public val __1523338351_Ptr: Pointer?

    public val _1523338351_VtblPtr: Pointer?
      get() = __1523338351_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowAsync(): IAsyncAction? {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun HideAsync(): IAsyncAction? {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_BackgroundOpacity(): Double {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_BackgroundOpacity(value: Double): Unit {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ForegroundColor(): IReference<Color?>? {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ForegroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_BackgroundColor(): IReference<Color?>? {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_BackgroundColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ProgressIndicator(): StatusBarProgressIndicator? {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StatusBarProgressIndicator>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StatusBarProgressIndicator>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_OccludedRect(): Rect? {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun add_Showing(eventHandler: TypedEventHandler<StatusBar?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_Showing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_Hiding(eventHandler: TypedEventHandler<StatusBar?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_Hiding(token: EventRegistrationToken?): Unit {
      val fnPtr = _1523338351_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1523338351_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStatusBar_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1523338351_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStatusBar, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ffcc5bf98d04864b1e8b3f4020be8b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStatusBar(ptr: Pointer?): WithDefault = IStatusBar_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStatusBar {
      val address = segment.toRawLongValue()
      return makeIStatusBar(Pointer(address))
    }

    public override fun toNative(obj: IStatusBar): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1523338351_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStatusBar): Array<IStatusBar?> = (elements as
        Array<IStatusBar?>).castToImpl<IStatusBar,IStatusBar_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStatusBar?> = arrayOfNulls<IStatusBar_Impl>(size)
        as Array<IStatusBar?>
  }
}
