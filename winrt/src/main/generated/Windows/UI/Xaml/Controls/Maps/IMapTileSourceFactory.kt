package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.GeoboundingBox
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

@ABIMarker(IMapTileSourceFactory.ABI::class)
@Signature("{cd7f811f-77fa-482b-9d34-71d31d465c48}")
@Guid("cd7f811f77fa482b9d3471d31d465c48")
@WinRTInterface("cd7f811f77fa482b9d3471d31d465c48")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileSourceFactory.ByReference::class)
public interface IMapTileSourceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?): MapTileSource?

  @InterfaceMethod(1)
  public fun CreateInstanceWithDataSource(
    dataSource: MapTileDataSource?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MapTileSource?

  @InterfaceMethod(2)
  public fun CreateInstanceWithDataSourceAndZoomRange(
    dataSource: MapTileDataSource?,
    zoomLevelRange: MapZoomLevelRange?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MapTileSource?

  @InterfaceMethod(3)
  public fun CreateInstanceWithDataSourceZoomRangeAndBounds(
    dataSource: MapTileDataSource?,
    zoomLevelRange: MapZoomLevelRange?,
    bounds: GeoboundingBox?,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MapTileSource?

  @InterfaceMethod(4)
  public fun CreateInstanceWithDataSourceZoomRangeBoundsAndTileSize(
    dataSource: MapTileDataSource?,
    zoomLevelRange: MapZoomLevelRange?,
    bounds: GeoboundingBox?,
    tileSizeInPixels: Int,
    baseInterface: IUnknown?,
    innerInterface: IUnknown?
  ): MapTileSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapTileSourceFactory> {
    public override fun getValue() = ABI.makeIMapTileSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IMapTileSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileSourceFactory {
    public val __2090517194_Ptr: Pointer?

    public val _2090517194_VtblPtr: Pointer?
      get() = __2090517194_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(baseInterface: IUnknown?, innerInterface: IUnknown?):
        MapTileSource? {
      val fnPtr = _2090517194_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileSource>()
      val hr = fn.invokeHR(arrayOf(__2090517194_Ptr, marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithDataSource(
      dataSource: MapTileDataSource?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MapTileSource? {
      val fnPtr = _2090517194_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileSource>()
      val hr = fn.invokeHR(arrayOf(__2090517194_Ptr, marshalToNative(dataSource),
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateInstanceWithDataSourceAndZoomRange(
      dataSource: MapTileDataSource?,
      zoomLevelRange: MapZoomLevelRange?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MapTileSource? {
      val fnPtr = _2090517194_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileSource>()
      val hr = fn.invokeHR(arrayOf(__2090517194_Ptr, marshalToNative(dataSource),
          marshalToNative(zoomLevelRange), marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateInstanceWithDataSourceZoomRangeAndBounds(
      dataSource: MapTileDataSource?,
      zoomLevelRange: MapZoomLevelRange?,
      bounds: GeoboundingBox?,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MapTileSource? {
      val fnPtr = _2090517194_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileSource>()
      val hr = fn.invokeHR(arrayOf(__2090517194_Ptr, marshalToNative(dataSource),
          marshalToNative(zoomLevelRange), marshalToNative(bounds), marshalToNative(baseInterface),
          marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateInstanceWithDataSourceZoomRangeBoundsAndTileSize(
      dataSource: MapTileDataSource?,
      zoomLevelRange: MapZoomLevelRange?,
      bounds: GeoboundingBox?,
      tileSizeInPixels: Int,
      baseInterface: IUnknown?,
      innerInterface: IUnknown?
    ): MapTileSource? {
      val fnPtr = _2090517194_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileSource>()
      val hr = fn.invokeHR(arrayOf(__2090517194_Ptr, marshalToNative(dataSource),
          marshalToNative(zoomLevelRange), marshalToNative(bounds), tileSizeInPixels,
          marshalToNative(baseInterface), marshalToNative(innerInterface), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileSource>(result.getValue())
      return resultValue
    }
  }

  public class IMapTileSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2090517194_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cd7f811f77fa482b9d3471d31d465c48")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileSourceFactory(ptr: Pointer?): WithDefault =
        IMapTileSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileSourceFactory {
      val address = segment.toRawLongValue()
      return makeIMapTileSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapTileSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2090517194_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileSourceFactory): Array<IMapTileSourceFactory?> =
        (elements as
        Array<IMapTileSourceFactory?>).castToImpl<IMapTileSourceFactory,IMapTileSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileSourceFactory?> =
        arrayOfNulls<IMapTileSourceFactory_Impl>(size) as Array<IMapTileSourceFactory?>
  }
}
