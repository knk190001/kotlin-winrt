package Windows.Media

import Windows.Foundation.IAsyncOperation
import Windows.Storage.StorageFile
import Windows.Storage.Streams.RandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISystemMediaTransportControlsDisplayUpdater.ABI::class)
@Signature("{8abbc53e-fa55-4ecf-ad8e-c984e5dd1550}")
@Guid("8abbc53efa554ecfad8ec984e5dd1550")
@WinRTInterface("8abbc53efa554ecfad8ec984e5dd1550")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemMediaTransportControlsDisplayUpdater.ByReference::class)
public interface ISystemMediaTransportControlsDisplayUpdater : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Type(): MediaPlaybackType?

  @InterfaceMethod(1)
  public fun put_Type(value: MediaPlaybackType?): Unit

  @InterfaceMethod(2)
  public fun get_AppMediaId(): String?

  @InterfaceMethod(3)
  public fun put_AppMediaId(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_Thumbnail(): RandomAccessStreamReference?

  @InterfaceMethod(5)
  public fun put_Thumbnail(value: RandomAccessStreamReference?): Unit

  @InterfaceMethod(6)
  public fun get_MusicProperties(): MusicDisplayProperties?

  @InterfaceMethod(7)
  public fun get_VideoProperties(): VideoDisplayProperties?

  @InterfaceMethod(8)
  public fun get_ImageProperties(): ImageDisplayProperties?

  @InterfaceMethod(9)
  public fun CopyFromFileAsync(type: MediaPlaybackType?, source: StorageFile?):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(10)
  public fun ClearAll(): Unit

  @InterfaceMethod(11)
  public fun Update(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemMediaTransportControlsDisplayUpdater> {
    public override fun getValue() =
        ABI.makeISystemMediaTransportControlsDisplayUpdater(pointer.getPointer(0))

    public fun setValue(value: ISystemMediaTransportControlsDisplayUpdater_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemMediaTransportControlsDisplayUpdater {
    public val __1448600033_Ptr: Pointer?

    public val _1448600033_VtblPtr: Pointer?
      get() = __1448600033_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Type(): MediaPlaybackType? {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackType>()
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Type(value: MediaPlaybackType?): Unit {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AppMediaId(): String? {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AppMediaId(value: String?): Unit {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Thumbnail(): RandomAccessStreamReference? {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RandomAccessStreamReference>()
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RandomAccessStreamReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Thumbnail(value: RandomAccessStreamReference?): Unit {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_MusicProperties(): MusicDisplayProperties? {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MusicDisplayProperties>()
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MusicDisplayProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_VideoProperties(): VideoDisplayProperties? {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VideoDisplayProperties>()
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VideoDisplayProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_ImageProperties(): ImageDisplayProperties? {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageDisplayProperties>()
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageDisplayProperties>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CopyFromFileAsync(type: MediaPlaybackType?, source: StorageFile?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr, marshalToNative(type), marshalToNative(source),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun ClearAll(): Unit {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun Update(): Unit {
      val fnPtr = _1448600033_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1448600033_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemMediaTransportControlsDisplayUpdater_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1448600033_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemMediaTransportControlsDisplayUpdater, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8abbc53efa554ecfad8ec984e5dd1550")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemMediaTransportControlsDisplayUpdater(ptr: Pointer?): WithDefault =
        ISystemMediaTransportControlsDisplayUpdater_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISystemMediaTransportControlsDisplayUpdater {
      val address = segment.toRawLongValue()
      return makeISystemMediaTransportControlsDisplayUpdater(Pointer(address))
    }

    public override fun toNative(obj: ISystemMediaTransportControlsDisplayUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1448600033_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemMediaTransportControlsDisplayUpdater):
        Array<ISystemMediaTransportControlsDisplayUpdater?> = (elements as
        Array<ISystemMediaTransportControlsDisplayUpdater?>).castToImpl<ISystemMediaTransportControlsDisplayUpdater,ISystemMediaTransportControlsDisplayUpdater_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemMediaTransportControlsDisplayUpdater?> =
        arrayOfNulls<ISystemMediaTransportControlsDisplayUpdater_Impl>(size) as
        Array<ISystemMediaTransportControlsDisplayUpdater?>
  }
}
