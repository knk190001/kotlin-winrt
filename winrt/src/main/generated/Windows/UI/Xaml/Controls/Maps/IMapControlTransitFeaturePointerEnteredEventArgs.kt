package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Collections.IMapView
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapControlTransitFeaturePointerEnteredEventArgs.ABI::class)
@Signature("{73911a4e-ec4f-479e-94a1-36e081d0d897}")
@Guid("73911a4eec4f479e94a136e081d0d897")
@WinRTInterface("73911a4eec4f479e94a136e081d0d897")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlTransitFeaturePointerEnteredEventArgs.ByReference::class)
public interface IMapControlTransitFeaturePointerEnteredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(2)
  public fun get_TransitProperties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlTransitFeaturePointerEnteredEventArgs> {
    public override fun getValue() =
        ABI.makeIMapControlTransitFeaturePointerEnteredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapControlTransitFeaturePointerEnteredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlTransitFeaturePointerEnteredEventArgs {
    public val __1743033144_Ptr: Pointer?

    public val _1743033144_VtblPtr: Pointer?
      get() = __1743033144_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1743033144_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1743033144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1743033144_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1743033144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TransitProperties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1743033144_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1743033144_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlTransitFeaturePointerEnteredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1743033144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlTransitFeaturePointerEnteredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("73911a4eec4f479e94a136e081d0d897")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlTransitFeaturePointerEnteredEventArgs(ptr: Pointer?): WithDefault =
        IMapControlTransitFeaturePointerEnteredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMapControlTransitFeaturePointerEnteredEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapControlTransitFeaturePointerEnteredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapControlTransitFeaturePointerEnteredEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1743033144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlTransitFeaturePointerEnteredEventArgs):
        Array<IMapControlTransitFeaturePointerEnteredEventArgs?> = (elements as
        Array<IMapControlTransitFeaturePointerEnteredEventArgs?>).castToImpl<IMapControlTransitFeaturePointerEnteredEventArgs,IMapControlTransitFeaturePointerEnteredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlTransitFeaturePointerEnteredEventArgs?>
        = arrayOfNulls<IMapControlTransitFeaturePointerEnteredEventArgs_Impl>(size) as
        Array<IMapControlTransitFeaturePointerEnteredEventArgs?>
  }
}
