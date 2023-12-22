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

@ABIMarker(IMapTileSource.ABI::class)
@Signature("{88a76e4e-2fdf-4567-9255-1100519c8d62}")
@Guid("88a76e4e2fdf456792551100519c8d62")
@WinRTInterface("88a76e4e2fdf456792551100519c8d62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapTileSource.ByReference::class)
public interface IMapTileSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DataSource(): MapTileDataSource?

  @InterfaceMethod(1)
  public fun put_DataSource(value: MapTileDataSource?): Unit

  @InterfaceMethod(2)
  public fun get_Layer(): MapTileLayer?

  @InterfaceMethod(3)
  public fun put_Layer(value: MapTileLayer?): Unit

  @InterfaceMethod(4)
  public fun get_ZoomLevelRange(): MapZoomLevelRange?

  @InterfaceMethod(5)
  public fun put_ZoomLevelRange(value: MapZoomLevelRange?): Unit

  @InterfaceMethod(6)
  public fun get_Bounds(): GeoboundingBox?

  @InterfaceMethod(7)
  public fun put_Bounds(value: GeoboundingBox?): Unit

  @InterfaceMethod(8)
  public fun get_AllowOverstretch(): Boolean

  @InterfaceMethod(9)
  public fun put_AllowOverstretch(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_IsFadingEnabled(): Boolean

  @InterfaceMethod(11)
  public fun put_IsFadingEnabled(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsTransparencyEnabled(): Boolean

  @InterfaceMethod(13)
  public fun put_IsTransparencyEnabled(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_IsRetryEnabled(): Boolean

  @InterfaceMethod(15)
  public fun put_IsRetryEnabled(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_ZIndex(): Int

  @InterfaceMethod(17)
  public fun put_ZIndex(value: Int): Unit

  @InterfaceMethod(18)
  public fun get_TilePixelSize(): Int

  @InterfaceMethod(19)
  public fun put_TilePixelSize(value: Int): Unit

  @InterfaceMethod(20)
  public fun get_Visible(): Boolean

  @InterfaceMethod(21)
  public fun put_Visible(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapTileSource>
      {
    public override fun getValue() = ABI.makeIMapTileSource(pointer.getPointer(0))

    public fun setValue(value: IMapTileSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapTileSource {
    public val __413108532_Ptr: Pointer?

    public val _413108532_VtblPtr: Pointer?
      get() = __413108532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DataSource(): MapTileDataSource? {
      val fnPtr = _413108532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileDataSource>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileDataSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DataSource(value: MapTileDataSource?): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Layer(): MapTileLayer? {
      val fnPtr = _413108532_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapTileLayer>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapTileLayer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Layer(value: MapTileLayer?): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ZoomLevelRange(): MapZoomLevelRange? {
      val fnPtr = _413108532_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapZoomLevelRange>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapZoomLevelRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ZoomLevelRange(value: MapZoomLevelRange?): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Bounds(): GeoboundingBox? {
      val fnPtr = _413108532_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Bounds(value: GeoboundingBox?): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_AllowOverstretch(): Boolean {
      val fnPtr = _413108532_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_AllowOverstretch(value: Boolean): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_IsFadingEnabled(): Boolean {
      val fnPtr = _413108532_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_IsFadingEnabled(value: Boolean): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsTransparencyEnabled(): Boolean {
      val fnPtr = _413108532_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsTransparencyEnabled(value: Boolean): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_IsRetryEnabled(): Boolean {
      val fnPtr = _413108532_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_IsRetryEnabled(value: Boolean): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_ZIndex(): Int {
      val fnPtr = _413108532_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_ZIndex(value: Int): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_TilePixelSize(): Int {
      val fnPtr = _413108532_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_TilePixelSize(value: Int): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Visible(): Boolean {
      val fnPtr = _413108532_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_Visible(value: Boolean): Unit {
      val fnPtr = _413108532_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__413108532_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapTileSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __413108532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapTileSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88a76e4e2fdf456792551100519c8d62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapTileSource(ptr: Pointer?): WithDefault = IMapTileSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapTileSource {
      val address = segment.toRawLongValue()
      return makeIMapTileSource(Pointer(address))
    }

    public override fun toNative(obj: IMapTileSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__413108532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapTileSource): Array<IMapTileSource?> = (elements as
        Array<IMapTileSource?>).castToImpl<IMapTileSource,IMapTileSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapTileSource?> =
        arrayOfNulls<IMapTileSource_Impl>(size) as Array<IMapTileSource?>
  }
}
