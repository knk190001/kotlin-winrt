package Windows.Perception.Spatial.Surfaces

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IMapView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Perception.Spatial.SpatialBoundingVolume
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISpatialSurfaceObserver.ABI::class)
@Signature("{10b69819-ddca-3483-ac3a-748fe8c86df5}")
@Guid("10b69819ddca3483ac3a748fe8c86df5")
@WinRTInterface("10b69819ddca3483ac3a748fe8c86df5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISpatialSurfaceObserver.ByReference::class)
public interface ISpatialSurfaceObserver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetObservedSurfaces(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
      SpatialSurfaceInfo?>?

  @InterfaceMethod(1)
  public fun SetBoundingVolume(bounds: SpatialBoundingVolume?): Unit

  @InterfaceMethod(2)
  public fun SetBoundingVolumes(bounds: IIterable<SpatialBoundingVolume?>?): Unit

  @InterfaceMethod(3)
  public fun add_ObservedSurfacesChanged(handler: TypedEventHandler<SpatialSurfaceObserver?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_ObservedSurfacesChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISpatialSurfaceObserver> {
    public override fun getValue() = ABI.makeISpatialSurfaceObserver(pointer.getPointer(0))

    public fun setValue(value: ISpatialSurfaceObserver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISpatialSurfaceObserver {
    public val __1501249690_Ptr: Pointer?

    public val _1501249690_VtblPtr: Pointer?
      get() = __1501249690_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetObservedSurfaces(): IMapView<com.sun.jna.platform.win32.Guid.GUID?,
        SpatialSurfaceInfo?>? {
      val fnPtr = _1501249690_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          SpatialSurfaceInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1501249690_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<com.sun.jna.platform.win32.Guid.GUID?,
          SpatialSurfaceInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetBoundingVolume(bounds: SpatialBoundingVolume?): Unit {
      val fnPtr = _1501249690_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1501249690_Ptr, marshalToNative(bounds),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun SetBoundingVolumes(bounds: IIterable<SpatialBoundingVolume?>?): Unit {
      val fnPtr = _1501249690_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1501249690_Ptr, marshalToNative(bounds),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override
        fun add_ObservedSurfacesChanged(handler: TypedEventHandler<SpatialSurfaceObserver?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1501249690_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1501249690_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_ObservedSurfacesChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1501249690_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1501249690_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISpatialSurfaceObserver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1501249690_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISpatialSurfaceObserver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10b69819ddca3483ac3a748fe8c86df5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISpatialSurfaceObserver(ptr: Pointer?): WithDefault =
        ISpatialSurfaceObserver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISpatialSurfaceObserver {
      val address = segment.toRawLongValue()
      return makeISpatialSurfaceObserver(Pointer(address))
    }

    public override fun toNative(obj: ISpatialSurfaceObserver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1501249690_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISpatialSurfaceObserver): Array<ISpatialSurfaceObserver?>
        = (elements as
        Array<ISpatialSurfaceObserver?>).castToImpl<ISpatialSurfaceObserver,ISpatialSurfaceObserver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISpatialSurfaceObserver?> =
        arrayOfNulls<ISpatialSurfaceObserver_Impl>(size) as Array<ISpatialSurfaceObserver?>
  }
}
