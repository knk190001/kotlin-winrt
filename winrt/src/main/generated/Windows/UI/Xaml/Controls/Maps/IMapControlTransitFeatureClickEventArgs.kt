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

@ABIMarker(IMapControlTransitFeatureClickEventArgs.ABI::class)
@Signature("{76179969-b765-4622-b08a-3072745a4541}")
@Guid("76179969b7654622b08a3072745a4541")
@WinRTInterface("76179969b7654622b08a3072745a4541")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControlTransitFeatureClickEventArgs.ByReference::class)
public interface IMapControlTransitFeatureClickEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DisplayName(): String?

  @InterfaceMethod(1)
  public fun get_Location(): Geopoint?

  @InterfaceMethod(2)
  public fun get_TransitProperties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapControlTransitFeatureClickEventArgs> {
    public override fun getValue() =
        ABI.makeIMapControlTransitFeatureClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMapControlTransitFeatureClickEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControlTransitFeatureClickEventArgs {
    public val __8020996_Ptr: Pointer?

    public val _8020996_VtblPtr: Pointer?
      get() = __8020996_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DisplayName(): String? {
      val fnPtr = _8020996_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__8020996_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Location(): Geopoint? {
      val fnPtr = _8020996_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__8020996_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_TransitProperties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _8020996_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__8020996_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControlTransitFeatureClickEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __8020996_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControlTransitFeatureClickEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76179969b7654622b08a3072745a4541")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControlTransitFeatureClickEventArgs(ptr: Pointer?): WithDefault =
        IMapControlTransitFeatureClickEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMapControlTransitFeatureClickEventArgs {
      val address = segment.toRawLongValue()
      return makeIMapControlTransitFeatureClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMapControlTransitFeatureClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__8020996_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControlTransitFeatureClickEventArgs):
        Array<IMapControlTransitFeatureClickEventArgs?> = (elements as
        Array<IMapControlTransitFeatureClickEventArgs?>).castToImpl<IMapControlTransitFeatureClickEventArgs,IMapControlTransitFeatureClickEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControlTransitFeatureClickEventArgs?> =
        arrayOfNulls<IMapControlTransitFeatureClickEventArgs_Impl>(size) as
        Array<IMapControlTransitFeatureClickEventArgs?>
  }
}
