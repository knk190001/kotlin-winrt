package Microsoft.UI.Xaml.Controls

import Windows.Foundation.EventRegistrationToken
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISemanticZoom.ABI::class)
@Signature("{7e14616d-55ef-548c-a997-c923e302718f}")
@Guid("7e14616d55ef548ca997c923e302718f")
@WinRTInterface("7e14616d55ef548ca997c923e302718f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISemanticZoom.ByReference::class)
public interface ISemanticZoom : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ZoomedInView(): ISemanticZoomInformation?

  @InterfaceMethod(1)
  public fun put_ZoomedInView(value: ISemanticZoomInformation?): Unit

  @InterfaceMethod(2)
  public fun get_ZoomedOutView(): ISemanticZoomInformation?

  @InterfaceMethod(3)
  public fun put_ZoomedOutView(value: ISemanticZoomInformation?): Unit

  @InterfaceMethod(4)
  public fun get_IsZoomedInViewActive(): Boolean

  @InterfaceMethod(5)
  public fun put_IsZoomedInViewActive(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_CanChangeViews(): Boolean

  @InterfaceMethod(7)
  public fun put_CanChangeViews(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun add_ViewChangeStarted(handler: SemanticZoomViewChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_ViewChangeStarted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_ViewChangeCompleted(handler: SemanticZoomViewChangedEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_ViewChangeCompleted(token: EventRegistrationToken?): Unit

  @InterfaceMethod(12)
  public fun ToggleActiveView(): Unit

  @InterfaceMethod(13)
  public fun get_IsZoomOutButtonEnabled(): Boolean

  @InterfaceMethod(14)
  public fun put_IsZoomOutButtonEnabled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ISemanticZoom>
      {
    public override fun getValue() = ABI.makeISemanticZoom(pointer.getPointer(0))

    public fun setValue(value: ISemanticZoom_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISemanticZoom {
    public val __1894780416_Ptr: Pointer?

    public val _1894780416_VtblPtr: Pointer?
      get() = __1894780416_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ZoomedInView(): ISemanticZoomInformation? {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISemanticZoomInformation>()
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISemanticZoomInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ZoomedInView(value: ISemanticZoomInformation?): Unit {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ZoomedOutView(): ISemanticZoomInformation? {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISemanticZoomInformation>()
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISemanticZoomInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_ZoomedOutView(value: ISemanticZoomInformation?): Unit {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsZoomedInViewActive(): Boolean {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsZoomedInViewActive(value: Boolean): Unit {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_CanChangeViews(): Boolean {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_CanChangeViews(value: Boolean): Unit {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_ViewChangeStarted(handler: SemanticZoomViewChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_ViewChangeStarted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_ViewChangeCompleted(handler: SemanticZoomViewChangedEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_ViewChangeCompleted(token: EventRegistrationToken?): Unit {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun ToggleActiveView(): Unit {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_IsZoomOutButtonEnabled(): Boolean {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun put_IsZoomOutButtonEnabled(value: Boolean): Unit {
      val fnPtr = _1894780416_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894780416_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISemanticZoom_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1894780416_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISemanticZoom, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e14616d55ef548ca997c923e302718f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISemanticZoom(ptr: Pointer?): WithDefault = ISemanticZoom_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISemanticZoom {
      val address = segment.toRawLongValue()
      return makeISemanticZoom(Pointer(address))
    }

    public override fun toNative(obj: ISemanticZoom): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1894780416_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISemanticZoom): Array<ISemanticZoom?> = (elements as
        Array<ISemanticZoom?>).castToImpl<ISemanticZoom,ISemanticZoom_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISemanticZoom?> =
        arrayOfNulls<ISemanticZoom_Impl>(size) as Array<ISemanticZoom?>
  }
}
