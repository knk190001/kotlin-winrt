package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.Animation.NavigationTransitionInfo
import Microsoft.UI.Xaml.Navigation.FrameNavigationOptions
import Microsoft.UI.Xaml.Navigation.NavigatedEventHandler
import Microsoft.UI.Xaml.Navigation.NavigatingCancelEventHandler
import Microsoft.UI.Xaml.Navigation.NavigationFailedEventHandler
import Microsoft.UI.Xaml.Navigation.NavigationStoppedEventHandler
import Microsoft.UI.Xaml.Navigation.PageStackEntry
import Windows.Foundation.Collections.IVector
import Windows.Foundation.EventRegistrationToken
import Windows.UI.Xaml.Interop.TypeName
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IFrame.ABI::class)
@Signature("{e6d50443-621e-5360-856a-75b01e1fcd22}")
@Guid("e6d50443621e5360856a75b01e1fcd22")
@WinRTInterface("e6d50443621e5360856a75b01e1fcd22")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrame.ByReference::class)
public interface IFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CacheSize(): Int

  @InterfaceMethod(1)
  public fun put_CacheSize(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_CanGoBack(): Boolean

  @InterfaceMethod(3)
  public fun get_CanGoForward(): Boolean

  @InterfaceMethod(4)
  public fun get_CurrentSourcePageType(): TypeName?

  @InterfaceMethod(5)
  public fun get_SourcePageType(): TypeName?

  @InterfaceMethod(6)
  public fun put_SourcePageType(value: TypeName?): Unit

  @InterfaceMethod(7)
  public fun get_BackStackDepth(): Int

  @InterfaceMethod(8)
  public fun get_BackStack(): IVector<PageStackEntry?>?

  @InterfaceMethod(9)
  public fun get_ForwardStack(): IVector<PageStackEntry?>?

  @InterfaceMethod(10)
  public fun get_IsNavigationStackEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsNavigationStackEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun add_Navigated(handler: NavigatedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(13)
  public fun remove_Navigated(token: EventRegistrationToken?): Unit

  @InterfaceMethod(14)
  public fun add_Navigating(handler: NavigatingCancelEventHandler?): EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_Navigating(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_NavigationFailed(handler: NavigationFailedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_NavigationFailed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(18)
  public fun add_NavigationStopped(handler: NavigationStoppedEventHandler?): EventRegistrationToken?

  @InterfaceMethod(19)
  public fun remove_NavigationStopped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(20)
  public fun GoBack(): Unit

  @InterfaceMethod(21)
  public fun GoBack(transitionInfoOverride: NavigationTransitionInfo?): Unit

  @InterfaceMethod(22)
  public fun GoForward(): Unit

  @InterfaceMethod(23)
  public fun Navigate(sourcePageType: TypeName?, parameter: IUnknown?): Boolean

  @InterfaceMethod(24)
  public fun Navigate(
    sourcePageType: TypeName?,
    parameter: IUnknown?,
    infoOverride: NavigationTransitionInfo?
  ): Boolean

  @InterfaceMethod(25)
  public fun NavigateToType(
    sourcePageType: TypeName?,
    parameter: IUnknown?,
    navigationOptions: FrameNavigationOptions?
  ): Boolean

  @InterfaceMethod(26)
  public fun GetNavigationState(): String?

  @InterfaceMethod(27)
  public fun SetNavigationState(navigationState: String?): Unit

  @InterfaceMethod(28)
  public fun SetNavigationState(navigationState: String?, suppressNavigate: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFrame> {
    public override fun getValue() = ABI.makeIFrame(pointer.getPointer(0))

    public fun setValue(value: IFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrame {
    public val __2013831162_Ptr: Pointer?

    public val _2013831162_VtblPtr: Pointer?
      get() = __2013831162_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CacheSize(): Int {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_CacheSize(value: Int): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CanGoBack(): Boolean {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_CanGoForward(): Boolean {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_CurrentSourcePageType(): TypeName? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SourcePageType(): TypeName? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TypeName>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TypeName>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_SourcePageType(value: TypeName?): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_BackStackDepth(): Int {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_BackStack(): IVector<PageStackEntry?>? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PageStackEntry?>>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PageStackEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ForwardStack(): IVector<PageStackEntry?>? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<PageStackEntry?>>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<PageStackEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_IsNavigationStackEnabled(): Boolean {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsNavigationStackEnabled(value: Boolean): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun add_Navigated(handler: NavigatedEventHandler?): EventRegistrationToken? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun remove_Navigated(token: EventRegistrationToken?): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun add_Navigating(handler: NavigatingCancelEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_Navigating(token: EventRegistrationToken?): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_NavigationFailed(handler: NavigationFailedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_NavigationFailed(token: EventRegistrationToken?): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun add_NavigationStopped(handler: NavigationStoppedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun remove_NavigationStopped(token: EventRegistrationToken?): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun GoBack(): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun GoBack(transitionInfoOverride: NavigationTransitionInfo?): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(transitionInfoOverride),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun GoForward(): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun Navigate(sourcePageType: TypeName?, parameter: IUnknown?): Boolean {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(sourcePageType),
          marshalToNative(parameter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(24)
    public override fun Navigate(
      sourcePageType: TypeName?,
      parameter: IUnknown?,
      infoOverride: NavigationTransitionInfo?
    ): Boolean {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(30L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(sourcePageType),
          marshalToNative(parameter), marshalToNative(infoOverride), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(25)
    public override fun NavigateToType(
      sourcePageType: TypeName?,
      parameter: IUnknown?,
      navigationOptions: FrameNavigationOptions?
    ): Boolean {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(31L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(sourcePageType),
          marshalToNative(parameter), marshalToNative(navigationOptions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(26)
    public override fun GetNavigationState(): String? {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(32L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(27)
    public override fun SetNavigationState(navigationState: String?): Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(33L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(navigationState),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(28)
    public override fun SetNavigationState(navigationState: String?, suppressNavigate: Boolean):
        Unit {
      val fnPtr = _2013831162_VtblPtr!!.getPointer(34L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2013831162_Ptr, marshalToNative(navigationState),
          suppressNavigate,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2013831162_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6d50443621e5360856a75b01e1fcd22")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrame(ptr: Pointer?): WithDefault = IFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrame {
      val address = segment.toRawLongValue()
      return makeIFrame(Pointer(address))
    }

    public override fun toNative(obj: IFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2013831162_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrame): Array<IFrame?> = (elements as
        Array<IFrame?>).castToImpl<IFrame,IFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrame?> = arrayOfNulls<IFrame_Impl>(size) as
        Array<IFrame?>
  }
}
