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

@ABIMarker(IMapControlTransitFeaturePointerExitedEventArgs.ABI::class)
@Signature("{6a11258d-448d-44e7-bc69-d13d497154e9}")
@Guid("6a11258d448d44e7bc69d13d497154e9")
@WinRTInterface("6a11258d448d44e7bc69d13d497154e9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlTransitFeaturePointerExitedEventArgs.ByReference::class)
public interface IMapControlTransitFeaturePointerExitedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(2)
  public fun get_TransitProperties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlTransitFeaturePointerExitedEventArgs> {
    public override fun getValue() =
        ABI.makeIMapControlTransitFeaturePointerExitedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapControlTransitFeaturePointerExitedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlTransitFeaturePointerExitedEventArgs {
    public val __1913265678_Ptr: Pointer?

    public val _1913265678_VtblPtr: Pointer?
      get() = __1913265678_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1913265678_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1913265678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _1913265678_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1913265678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TransitProperties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1913265678_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1913265678_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlTransitFeaturePointerExitedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1913265678_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlTransitFeaturePointerExitedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6a11258d448d44e7bc69d13d497154e9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlTransitFeaturePointerExitedEventArgs(ptr: Pointer?): WithDefault =
        IMapControlTransitFeaturePointerExitedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMapControlTransitFeaturePointerExitedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapControlTransitFeaturePointerExitedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapControlTransitFeaturePointerExitedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1913265678_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlTransitFeaturePointerExitedEventArgs):
        Array<IMapControlTransitFeaturePointerExitedEventArgs?> = (elements as
        Array<IMapControlTransitFeaturePointerExitedEventArgs?>).castToImpl<IMapControlTransitFeaturePointerExitedEventArgs,IMapControlTransitFeaturePointerExitedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlTransitFeaturePointerExitedEventArgs?>
        = arrayOfNulls<IMapControlTransitFeaturePointerExitedEventArgs_Impl>(size) as
        Array<IMapControlTransitFeaturePointerExitedEventArgs?>
  }
}
