package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Media.ImageSource
import Microsoft.UI.Xaml.Media.Stretch
import Windows.Media.Playback.IMediaPlaybackSource
import Windows.Media.Playback.MediaPlayer
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

@ABIMarker(IMediaPlayerElement.ABI::class)
@Signature("{c314a38c-780c-558a-98cd-0a8deb467fcf}")
@Guid("c314a38c780c558a98cd0a8deb467fcf")
@WinRTInterface("c314a38c780c558a98cd0a8deb467fcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerElement.ByReference::class)
public interface IMediaPlayerElement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): IMediaPlaybackSource?

  @InterfaceMethod(1)
  public fun put_Source(value: IMediaPlaybackSource?): Unit

  @InterfaceMethod(2)
  public fun get_TransportControls(): MediaTransportControls?

  @InterfaceMethod(3)
  public fun put_TransportControls(value: MediaTransportControls?): Unit

  @InterfaceMethod(4)
  public fun get_AreTransportControlsEnabled(): Boolean

  @InterfaceMethod(5)
  public fun put_AreTransportControlsEnabled(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_PosterSource(): ImageSource?

  @InterfaceMethod(7)
  public fun put_PosterSource(value: ImageSource?): Unit

  @InterfaceMethod(8)
  public fun get_Stretch(): Stretch?

  @InterfaceMethod(9)
  public fun put_Stretch(value: Stretch?): Unit

  @InterfaceMethod(10)
  public fun get_AutoPlay(): Boolean

  @InterfaceMethod(11)
  public fun put_AutoPlay(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_IsFullWindow(): Boolean

  @InterfaceMethod(13)
  public fun put_IsFullWindow(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_MediaPlayer(): MediaPlayer?

  @InterfaceMethod(15)
  public fun SetMediaPlayer(mediaPlayer: MediaPlayer?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerElement> {
    public override fun getValue() = ABI.makeIMediaPlayerElement(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerElement {
    public val __1074301278_Ptr: Pointer?

    public val _1074301278_VtblPtr: Pointer?
      get() = __1074301278_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): IMediaPlaybackSource? {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaPlaybackSource>()
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaPlaybackSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: IMediaPlaybackSource?): Unit {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_TransportControls(): MediaTransportControls? {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaTransportControls>()
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaTransportControls>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_TransportControls(value: MediaTransportControls?): Unit {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AreTransportControlsEnabled(): Boolean {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AreTransportControlsEnabled(value: Boolean): Unit {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_PosterSource(): ImageSource? {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageSource>()
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_PosterSource(value: ImageSource?): Unit {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Stretch(): Stretch? {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stretch>()
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_Stretch(value: Stretch?): Unit {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_AutoPlay(): Boolean {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_AutoPlay(value: Boolean): Unit {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_IsFullWindow(): Boolean {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_IsFullWindow(value: Boolean): Unit {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_MediaPlayer(): MediaPlayer? {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayer>()
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun SetMediaPlayer(mediaPlayer: MediaPlayer?): Unit {
      val fnPtr = _1074301278_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074301278_Ptr, marshalToNative(mediaPlayer),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlayerElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1074301278_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c314a38c780c558a98cd0a8deb467fcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerElement(ptr: Pointer?): WithDefault = IMediaPlayerElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerElement {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerElement(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1074301278_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerElement): Array<IMediaPlayerElement?> =
        (elements as
        Array<IMediaPlayerElement?>).castToImpl<IMediaPlayerElement,IMediaPlayerElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerElement?> =
        arrayOfNulls<IMediaPlayerElement_Impl>(size) as Array<IMediaPlayerElement?>
  }
}
