package Windows.Graphics.Display

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayPropertiesStatics.ABI::class)
@Signature("{6937ed8d-30ea-4ded-8271-4553ff02f68a}")
@Guid("6937ed8d30ea4ded82714553ff02f68a")
@WinRTInterface("6937ed8d30ea4ded82714553ff02f68a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayPropertiesStatics.ByReference::class)
public interface IDisplayPropertiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentOrientation(): DisplayOrientations?

  @InterfaceMethod(1)
  public fun get_NativeOrientation(): DisplayOrientations?

  @InterfaceMethod(2)
  public fun get_AutoRotationPreferences(): DisplayOrientations?

  @InterfaceMethod(3)
  public fun put_AutoRotationPreferences(value: DisplayOrientations?): Unit

  @InterfaceMethod(4)
  public fun add_OrientationChanged(handler: DisplayPropertiesEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_OrientationChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun get_ResolutionScale(): ResolutionScale?

  @InterfaceMethod(7)
  public fun get_LogicalDpi(): Float

  @InterfaceMethod(8)
  public fun add_LogicalDpiChanged(handler: DisplayPropertiesEventHandler?): EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_LogicalDpiChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun get_StereoEnabled(): Boolean

  @InterfaceMethod(11)
  public fun add_StereoEnabledChanged(handler: DisplayPropertiesEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(12)
  public fun remove_StereoEnabledChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(13)
  public fun GetColorProfileAsync(): IAsyncOperation<IRandomAccessStream?>?

  @InterfaceMethod(14)
  public fun add_ColorProfileChanged(handler: DisplayPropertiesEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(15)
  public fun remove_ColorProfileChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(16)
  public fun add_DisplayContentsInvalidated(handler: DisplayPropertiesEventHandler?):
      EventRegistrationToken?

  @InterfaceMethod(17)
  public fun remove_DisplayContentsInvalidated(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayPropertiesStatics> {
    public override fun getValue() = ABI.makeIDisplayPropertiesStatics(pointer.getPointer(0))

    public fun setValue(value: IDisplayPropertiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayPropertiesStatics {
    public val __407139983_Ptr: Pointer?

    public val _407139983_VtblPtr: Pointer?
      get() = __407139983_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentOrientation(): DisplayOrientations? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NativeOrientation(): DisplayOrientations? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AutoRotationPreferences(): DisplayOrientations? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayOrientations>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayOrientations>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AutoRotationPreferences(value: DisplayOrientations?): Unit {
      val fnPtr = _407139983_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_OrientationChanged(handler: DisplayPropertiesEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_OrientationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _407139983_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ResolutionScale(): ResolutionScale? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ResolutionScale>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ResolutionScale>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_LogicalDpi(): Float {
      val fnPtr = _407139983_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun add_LogicalDpiChanged(handler: DisplayPropertiesEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_LogicalDpiChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _407139983_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_StereoEnabled(): Boolean {
      val fnPtr = _407139983_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun add_StereoEnabledChanged(handler: DisplayPropertiesEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun remove_StereoEnabledChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _407139983_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun GetColorProfileAsync(): IAsyncOperation<IRandomAccessStream?>? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IRandomAccessStream?>>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IRandomAccessStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun add_ColorProfileChanged(handler: DisplayPropertiesEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun remove_ColorProfileChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _407139983_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun add_DisplayContentsInvalidated(handler: DisplayPropertiesEventHandler?):
        EventRegistrationToken? {
      val fnPtr = _407139983_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun remove_DisplayContentsInvalidated(token: EventRegistrationToken?): Unit {
      val fnPtr = _407139983_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__407139983_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayPropertiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __407139983_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayPropertiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6937ed8d30ea4ded82714553ff02f68a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayPropertiesStatics(ptr: Pointer?): WithDefault =
        IDisplayPropertiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayPropertiesStatics {
      val address = segment.toRawLongValue()
      return makeIDisplayPropertiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IDisplayPropertiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__407139983_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayPropertiesStatics):
        Array<IDisplayPropertiesStatics?> = (elements as
        Array<IDisplayPropertiesStatics?>).castToImpl<IDisplayPropertiesStatics,IDisplayPropertiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayPropertiesStatics?> =
        arrayOfNulls<IDisplayPropertiesStatics_Impl>(size) as Array<IDisplayPropertiesStatics?>
  }
}
