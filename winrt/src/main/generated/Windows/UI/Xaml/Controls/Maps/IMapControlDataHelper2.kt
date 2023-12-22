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

@ABIMarker(IMapControlDataHelper2.ABI::class)
@Signature("{59ce429e-562f-4c21-a674-0f11decf0fb3}")
@Guid("59ce429e562f4c21a6740f11decf0fb3")
@WinRTInterface("59ce429e562f4c21a6740f11decf0fb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlDataHelper2.ByReference::class)
public interface IMapControlDataHelper2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_BusinessLandmarkPointerEntered(value: TypedEventHandler<MapControl?,
      MapControlBusinessLandmarkPointerEnteredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_BusinessLandmarkPointerEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun add_TransitFeaturePointerEntered(value: TypedEventHandler<MapControl?,
      MapControlTransitFeaturePointerEnteredEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_TransitFeaturePointerEntered(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun add_BusinessLandmarkPointerExited(value: TypedEventHandler<MapControl?,
      MapControlBusinessLandmarkPointerExitedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(5)
  public fun remove_BusinessLandmarkPointerExited(token: EventRegistrationToken?): Unit

  @InterfaceMethod(6)
  public fun add_TransitFeaturePointerExited(value: TypedEventHandler<MapControl?,
      MapControlTransitFeaturePointerExitedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_TransitFeaturePointerExited(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlDataHelper2> {
    public override fun getValue() = ABI.makeIMapControlDataHelper2(pointer.getPointer(0))

    public fun setValue(value: IMapControlDataHelper2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlDataHelper2 {
    public val __1363291288_Ptr: Pointer?

    public val _1363291288_VtblPtr: Pointer?
      get() = __1363291288_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_BusinessLandmarkPointerEntered(value: TypedEventHandler<MapControl?,
        MapControlBusinessLandmarkPointerEnteredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1363291288_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1363291288_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_BusinessLandmarkPointerEntered(token: EventRegistrationToken?):
        Unit {
      val fnPtr = _1363291288_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1363291288_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun add_TransitFeaturePointerEntered(value: TypedEventHandler<MapControl?,
        MapControlTransitFeaturePointerEnteredEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1363291288_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1363291288_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_TransitFeaturePointerEntered(token: EventRegistrationToken?): Unit {
      val fnPtr = _1363291288_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1363291288_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun add_BusinessLandmarkPointerExited(value: TypedEventHandler<MapControl?,
        MapControlBusinessLandmarkPointerExitedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1363291288_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1363291288_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun remove_BusinessLandmarkPointerExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _1363291288_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1363291288_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_TransitFeaturePointerExited(value: TypedEventHandler<MapControl?,
        MapControlTransitFeaturePointerExitedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1363291288_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1363291288_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_TransitFeaturePointerExited(token: EventRegistrationToken?): Unit {
      val fnPtr = _1363291288_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1363291288_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapControlDataHelper2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1363291288_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlDataHelper2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59ce429e562f4c21a6740f11decf0fb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlDataHelper2(ptr: Pointer?): WithDefault =
        IMapControlDataHelper2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControlDataHelper2 {
      val address = segment.toRawLongValue()
      return makeIMapControlDataHelper2(Pointer(address))
    }

    public override fun toNative(obj: IMapControlDataHelper2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1363291288_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlDataHelper2): Array<IMapControlDataHelper2?> =
        (elements as
        Array<IMapControlDataHelper2?>).castToImpl<IMapControlDataHelper2,IMapControlDataHelper2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlDataHelper2?> =
        arrayOfNulls<IMapControlDataHelper2_Impl>(size) as Array<IMapControlDataHelper2?>
  }
}
