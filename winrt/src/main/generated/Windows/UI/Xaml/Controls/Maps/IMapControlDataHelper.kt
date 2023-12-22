package Windows.UI.Xaml.Controls.Maps

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

@ABIMarker(IMapControlDataHelper.ABI::class)
@Signature("{8bb0f09c-14ab-486c-9de5-5a5def0205a2}")
@Guid("8bb0f09c14ab486c9de55a5def0205a2")
@WinRTInterface("8bb0f09c14ab486c9de55a5def0205a2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlDataHelper.ByReference::class)
public interface IMapControlDataHelper : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_BusinessLandmarkClick(value: TypedEventHandler<MapControl?,
      MapControlBusinessLandmarkClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_BusinessLandmarkClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_TransitFeatureClick(value: TypedEventHandler<MapControl?,
      MapControlTransitFeatureClickEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_TransitFeatureClick(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_BusinessLandmarkRightTapped(value: TypedEventHandler<MapControl?,
      MapControlBusinessLandmarkRightTappedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_BusinessLandmarkRightTapped(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_TransitFeatureRightTapped(value: TypedEventHandler<MapControl?,
      MapControlTransitFeatureRightTappedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_TransitFeatureRightTapped(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlDataHelper> {
    public override fun getValue() = ABI.makeIMapControlDataHelper(pointer.getPointer(0))

    public fun setValue(value: IMapControlDataHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlDataHelper {
    public val __2034232842_Ptr: Pointer?

    public val _2034232842_VtblPtr: Pointer?
      get() = __2034232842_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_BusinessLandmarkClick(value: TypedEventHandler<MapControl?,
        MapControlBusinessLandmarkClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2034232842_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2034232842_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_BusinessLandmarkClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _2034232842_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034232842_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_TransitFeatureClick(value: TypedEventHandler<MapControl?,
        MapControlTransitFeatureClickEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2034232842_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2034232842_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_TransitFeatureClick(token: EventRegistrationToken?): Unit {
      val fnPtr = _2034232842_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034232842_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_BusinessLandmarkRightTapped(value: TypedEventHandler<MapControl?,
        MapControlBusinessLandmarkRightTappedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2034232842_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2034232842_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_BusinessLandmarkRightTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _2034232842_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034232842_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_TransitFeatureRightTapped(value: TypedEventHandler<MapControl?,
        MapControlTransitFeatureRightTappedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2034232842_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2034232842_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_TransitFeatureRightTapped(token: EventRegistrationToken?): Unit {
      val fnPtr = _2034232842_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2034232842_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapControlDataHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2034232842_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlDataHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bb0f09c14ab486c9de55a5def0205a2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlDataHelper(ptr: Pointer?): WithDefault =
        IMapControlDataHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlDataHelper {
      val address = segment.toRawLongValue()
      return makeIMapControlDataHelper(Pointer(address))
    }

    public override fun toNative(obj: IMapControlDataHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2034232842_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlDataHelper): Array<IMapControlDataHelper?> =
        (elements as
        Array<IMapControlDataHelper?>).castToImpl<IMapControlDataHelper,IMapControlDataHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlDataHelper?> =
        arrayOfNulls<IMapControlDataHelper_Impl>(size) as Array<IMapControlDataHelper?>
  }
}
