package Windows.Media.Control

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IReference
import Windows.Media.MediaPlaybackType
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGlobalSystemMediaTransportControlsSessionMediaProperties.ABI::class)
@Signature("{68856cf6-adb4-54b2-ac16-05837907acb6}")
@Guid("68856cf6adb454b2ac1605837907acb6")
@WinRTInterface("68856cf6adb454b2ac1605837907acb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IGlobalSystemMediaTransportControlsSessionMediaProperties.ByReference::class)
public interface IGlobalSystemMediaTransportControlsSessionMediaProperties : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun get_Subtitle(): String?

  @InterfaceMethod(2)
  public fun get_AlbumArtist(): String?

  @InterfaceMethod(3)
  public fun get_Artist(): String?

  @InterfaceMethod(4)
  public fun get_AlbumTitle(): String?

  @InterfaceMethod(5)
  public fun get_TrackNumber(): Int

  @InterfaceMethod(6)
  public fun get_Genres(): IVectorView<String?>?

  @InterfaceMethod(7)
  public fun get_AlbumTrackCount(): Int

  @InterfaceMethod(8)
  public fun get_PlaybackType(): IReference<MediaPlaybackType?>?

  @InterfaceMethod(9)
  public fun get_Thumbnail(): IRandomAccessStreamReference?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGlobalSystemMediaTransportControlsSessionMediaProperties> {
    public override fun getValue() =
        ABI.makeIGlobalSystemMediaTransportControlsSessionMediaProperties(pointer.getPointer(0))

    public fun setValue(value: IGlobalSystemMediaTransportControlsSessionMediaProperties_Impl):
        Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGlobalSystemMediaTransportControlsSessionMediaProperties {
    public val __823858033_Ptr: Pointer?

    public val _823858033_VtblPtr: Pointer?
      get() = __823858033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _823858033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Subtitle(): String? {
      val fnPtr = _823858033_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AlbumArtist(): String? {
      val fnPtr = _823858033_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Artist(): String? {
      val fnPtr = _823858033_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AlbumTitle(): String? {
      val fnPtr = _823858033_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TrackNumber(): Int {
      val fnPtr = _823858033_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_Genres(): IVectorView<String?>? {
      val fnPtr = _823858033_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_AlbumTrackCount(): Int {
      val fnPtr = _823858033_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_PlaybackType(): IReference<MediaPlaybackType?>? {
      val fnPtr = _823858033_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<MediaPlaybackType?>>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<MediaPlaybackType?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_Thumbnail(): IRandomAccessStreamReference? {
      val fnPtr = _823858033_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IRandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__823858033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IRandomAccessStreamReference>(result.getValue())
      return resultValue
    }
  }

  public class IGlobalSystemMediaTransportControlsSessionMediaProperties_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __823858033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGlobalSystemMediaTransportControlsSessionMediaProperties, MemoryAddress>
      {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68856cf6adb454b2ac1605837907acb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGlobalSystemMediaTransportControlsSessionMediaProperties(ptr: Pointer?):
        WithDefault = IGlobalSystemMediaTransportControlsSessionMediaProperties_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGlobalSystemMediaTransportControlsSessionMediaProperties {
      val address = segment.toRawLongValue()
      return makeIGlobalSystemMediaTransportControlsSessionMediaProperties(Pointer(address))
    }

    public override fun toNative(obj: IGlobalSystemMediaTransportControlsSessionMediaProperties):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__823858033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg
        elements: IGlobalSystemMediaTransportControlsSessionMediaProperties):
        Array<IGlobalSystemMediaTransportControlsSessionMediaProperties?> = (elements as
        Array<IGlobalSystemMediaTransportControlsSessionMediaProperties?>).castToImpl<IGlobalSystemMediaTransportControlsSessionMediaProperties,IGlobalSystemMediaTransportControlsSessionMediaProperties_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IGlobalSystemMediaTransportControlsSessionMediaProperties?> =
        arrayOfNulls<IGlobalSystemMediaTransportControlsSessionMediaProperties_Impl>(size) as
        Array<IGlobalSystemMediaTransportControlsSessionMediaProperties?>
  }
}
