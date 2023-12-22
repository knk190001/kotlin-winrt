package Windows.Media.Core

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Foundation.Uri
import Windows.Media.Core.IMediaSource3.ABI.IID
import Windows.Media.Playback.IMediaPlaybackSource
import Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IMediaSource4.ABI::class)
@Signature("{bdafad57-8eff-4c63-85a6-84de0ae3e4f2}")
@Guid("bdafad578eff4c6385a684de0ae3e4f2")
@WinRTInterface("bdafad578eff4c6385a684de0ae3e4f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaSource4.ByReference::class)
public interface IMediaSource4 : NativeMapped, IWinRTInterface, IMediaSource3, IMediaSource2,
    IMediaPlaybackSource, IClosable {
  @InterfaceMethod(0)
  public fun get_AdaptiveMediaSource(): AdaptiveMediaSource?

  @InterfaceMethod(1)
  public fun get_MediaStreamSource(): MediaStreamSource?

  @InterfaceMethod(2)
  public fun get_MseStreamSource(): MseStreamSource?

  @InterfaceMethod(3)
  public fun get_Uri(): Uri?

  @InterfaceMethod(4)
  public fun OpenAsync(): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaSource4>
      {
    public override fun getValue() = ABI.makeIMediaSource4(pointer.getPointer(0))

    public fun setValue(value: IMediaSource4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaSource4, IMediaSource3.WithDefault,
      IMediaSource2.WithDefault, IMediaPlaybackSource.WithDefault, IClosable.WithDefault {
    public val __983754166_Ptr: Pointer?

    public val _983754166_VtblPtr: Pointer?
      get() = __983754166_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdaptiveMediaSource(): AdaptiveMediaSource? {
      val fnPtr = _983754166_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AdaptiveMediaSource>()
      val hr = fn.invokeHR(arrayOf(__983754166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AdaptiveMediaSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MediaStreamSource(): MediaStreamSource? {
      val fnPtr = _983754166_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSource>()
      val hr = fn.invokeHR(arrayOf(__983754166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MseStreamSource(): MseStreamSource? {
      val fnPtr = _983754166_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MseStreamSource>()
      val hr = fn.invokeHR(arrayOf(__983754166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MseStreamSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Uri(): Uri? {
      val fnPtr = _983754166_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__983754166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun OpenAsync(): IAsyncAction? {
      val fnPtr = _983754166_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__983754166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IMediaSource4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaSource3, IMediaSource2,
      IMediaPlaybackSource, IClosable {
    public override val __983754167_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754166_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __983754168_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaSource2.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754166_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1097311199_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IMediaPlaybackSource.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754166_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_983754166_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __983754166_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaSource4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bdafad578eff4c6385a684de0ae3e4f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaSource4(ptr: Pointer?): WithDefault = IMediaSource4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaSource4 {
      val address = segment.toRawLongValue()
      return makeIMediaSource4(Pointer(address))
    }

    public override fun toNative(obj: IMediaSource4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__983754166_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaSource4): Array<IMediaSource4?> = (elements as
        Array<IMediaSource4?>).castToImpl<IMediaSource4,IMediaSource4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaSource4?> =
        arrayOfNulls<IMediaSource4_Impl>(size) as Array<IMediaSource4?>
  }
}
