package Microsoft.Graphics.Display

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.Point
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDisplayInformation2.ABI::class)
@Signature("{5586d03c-b4b6-594e-96ad-8372700b08dd}")
@Guid("5586d03cb4b6594e96ad8372700b08dd")
@WinRTInterface("5586d03cb4b6594e96ad8372700b08dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayInformation2.ByReference::class)
public interface IDisplayInformation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RawDpi(): IReference<Point?>?

  @InterfaceMethod(1)
  public fun get_RawPixelsPerViewPixel(): Double

  @InterfaceMethod(2)
  public fun add_DpiChanged(handler: TypedEventHandler<DisplayInformation?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_DpiChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun get_AngularOffsetFromNativeOrientation(): DisplayOrientation?

  @InterfaceMethod(5)
  public fun add_OrientationChanged(handler: TypedEventHandler<DisplayInformation?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_OrientationChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayInformation2> {
    public override fun getValue() = ABI.makeIDisplayInformation2(pointer.getPointer(0))

    public fun setValue(value: IDisplayInformation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayInformation2 {
    public val __1461795678_Ptr: Pointer?

    public val _1461795678_VtblPtr: Pointer?
      get() = __1461795678_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RawDpi(): IReference<Point?>? {
      val fnPtr = _1461795678_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Point?>>()
      val hr = fn.invokeHR(arrayOf(__1461795678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Point?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RawPixelsPerViewPixel(): Double {
      val fnPtr = _1461795678_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1461795678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun add_DpiChanged(handler: TypedEventHandler<DisplayInformation?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1461795678_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1461795678_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_DpiChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1461795678_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461795678_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AngularOffsetFromNativeOrientation(): DisplayOrientation? {
      val fnPtr = _1461795678_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DisplayOrientation>()
      val hr = fn.invokeHR(arrayOf(__1461795678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DisplayOrientation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_OrientationChanged(handler: TypedEventHandler<DisplayInformation?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1461795678_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1461795678_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_OrientationChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1461795678_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1461795678_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDisplayInformation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1461795678_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayInformation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5586d03cb4b6594e96ad8372700b08dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayInformation2(ptr: Pointer?): WithDefault = IDisplayInformation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayInformation2 {
      val address = segment.toRawLongValue()
      return makeIDisplayInformation2(Pointer(address))
    }

    public override fun toNative(obj: IDisplayInformation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1461795678_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayInformation2): Array<IDisplayInformation2?> =
        (elements as
        Array<IDisplayInformation2?>).castToImpl<IDisplayInformation2,IDisplayInformation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayInformation2?> =
        arrayOfNulls<IDisplayInformation2_Impl>(size) as Array<IDisplayInformation2?>
  }
}
