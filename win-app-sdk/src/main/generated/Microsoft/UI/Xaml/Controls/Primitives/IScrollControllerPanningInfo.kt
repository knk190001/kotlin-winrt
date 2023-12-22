package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Composition.CompositionPropertySet
import Microsoft.UI.Xaml.Controls.Orientation
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

@ABIMarker(IScrollControllerPanningInfo.ABI::class)
@Signature("{53d5b301-9aab-59bc-92cd-42cf21abd590}")
@Guid("53d5b3019aab59bc92cd42cf21abd590")
@WinRTInterface("53d5b3019aab59bc92cd42cf21abd590")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollControllerPanningInfo.ByReference::class)
public interface IScrollControllerPanningInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsRailEnabled(): Boolean

  @InterfaceMethod(1)
  public fun get_PanOrientation(): Orientation?

  @InterfaceMethod(2)
  public fun get_PanningElementAncestor(): UIElement?

  @InterfaceMethod(3)
  public fun SetPanningElementExpressionAnimationSources(
    propertySet: CompositionPropertySet?,
    minOffsetPropertyName: String?,
    maxOffsetPropertyName: String?,
    offsetPropertyName: String?,
    multiplierPropertyName: String?
  ): Unit

  @InterfaceMethod(4)
  public fun add_Changed(handler: TypedEventHandler<IScrollControllerPanningInfo?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_Changed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_PanRequested(handler: TypedEventHandler<IScrollControllerPanningInfo?,
      ScrollControllerPanRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_PanRequested(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollControllerPanningInfo> {
    public override fun getValue() = ABI.makeIScrollControllerPanningInfo(pointer.getPointer(0))

    public fun setValue(value: IScrollControllerPanningInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollControllerPanningInfo {
    public val __500868645_Ptr: Pointer?

    public val _500868645_VtblPtr: Pointer?
      get() = __500868645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsRailEnabled(): Boolean {
      val fnPtr = _500868645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__500868645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_PanOrientation(): Orientation? {
      val fnPtr = _500868645_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Orientation>()
      val hr = fn.invokeHR(arrayOf(__500868645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Orientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_PanningElementAncestor(): UIElement? {
      val fnPtr = _500868645_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIElement>()
      val hr = fn.invokeHR(arrayOf(__500868645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetPanningElementExpressionAnimationSources(
      propertySet: CompositionPropertySet?,
      minOffsetPropertyName: String?,
      maxOffsetPropertyName: String?,
      offsetPropertyName: String?,
      multiplierPropertyName: String?
    ): Unit {
      val fnPtr = _500868645_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__500868645_Ptr, marshalToNative(propertySet),
          marshalToNative(minOffsetPropertyName), marshalToNative(maxOffsetPropertyName),
          marshalToNative(offsetPropertyName), marshalToNative(multiplierPropertyName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_Changed(handler: TypedEventHandler<IScrollControllerPanningInfo?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _500868645_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__500868645_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_Changed(token: EventRegistrationToken?): Unit {
      val fnPtr = _500868645_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__500868645_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_PanRequested(handler: TypedEventHandler<IScrollControllerPanningInfo?,
        ScrollControllerPanRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _500868645_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__500868645_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_PanRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _500868645_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__500868645_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IScrollControllerPanningInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __500868645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollControllerPanningInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("53d5b3019aab59bc92cd42cf21abd590")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollControllerPanningInfo(ptr: Pointer?): WithDefault =
        IScrollControllerPanningInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollControllerPanningInfo {
      val address = segment.toRawLongValue()
      return makeIScrollControllerPanningInfo(Pointer(address))
    }

    public override fun toNative(obj: IScrollControllerPanningInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__500868645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollControllerPanningInfo):
        Array<IScrollControllerPanningInfo?> = (elements as
        Array<IScrollControllerPanningInfo?>).castToImpl<IScrollControllerPanningInfo,IScrollControllerPanningInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollControllerPanningInfo?> =
        arrayOfNulls<IScrollControllerPanningInfo_Impl>(size) as
        Array<IScrollControllerPanningInfo?>
  }
}
