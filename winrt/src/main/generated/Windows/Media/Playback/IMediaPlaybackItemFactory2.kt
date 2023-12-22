package Windows.Media.Playback

import Windows.Foundation.TimeSpan
import Windows.Media.Core.MediaSource
import Windows.Media.Playback.IMediaPlaybackItemFactory.ABI.IID
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

@ABIMarker(IMediaPlaybackItemFactory2.ABI::class)
@Signature("{d77cdf3a-b947-4972-b35d-adfb931a71e6}")
@Guid("d77cdf3ab9474972b35dadfb931a71e6")
@WinRTInterface("d77cdf3ab9474972b35dadfb931a71e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItemFactory2.ByReference::class)
public interface IMediaPlaybackItemFactory2 : NativeMapped, IWinRTInterface,
    IMediaPlaybackItemFactory {
  @InterfaceMethod(0)
  public fun CreateWithStartTime(source: MediaSource?, startTime: TimeSpan?): MediaPlaybackItem?

  @InterfaceMethod(1)
  public fun CreateWithStartTimeAndDurationLimit(
    source: MediaSource?,
    startTime: TimeSpan?,
    durationLimit: TimeSpan?
  ): MediaPlaybackItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItemFactory2> {
    public override fun getValue() = ABI.makeIMediaPlaybackItemFactory2(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItemFactory2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItemFactory2, IMediaPlaybackItemFactory.WithDefault {
    public val __2070518751_Ptr: Pointer?

    public val _2070518751_VtblPtr: Pointer?
      get() = __2070518751_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithStartTime(source: MediaSource?, startTime: TimeSpan?):
        MediaPlaybackItem? {
      val fnPtr = _2070518751_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__2070518751_Ptr, marshalToNative(source),
          marshalToNative(startTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithStartTimeAndDurationLimit(
      source: MediaSource?,
      startTime: TimeSpan?,
      durationLimit: TimeSpan?
    ): MediaPlaybackItem? {
      val fnPtr = _2070518751_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__2070518751_Ptr, marshalToNative(source),
          marshalToNative(startTime), marshalToNative(durationLimit), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackItemFactory2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaPlaybackItemFactory {
    public override val __2145000911_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2070518751_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2070518751_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItemFactory2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d77cdf3ab9474972b35dadfb931a71e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItemFactory2(ptr: Pointer?): WithDefault =
        IMediaPlaybackItemFactory2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItemFactory2 {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItemFactory2(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItemFactory2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2070518751_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItemFactory2):
        Array<IMediaPlaybackItemFactory2?> = (elements as
        Array<IMediaPlaybackItemFactory2?>).castToImpl<IMediaPlaybackItemFactory2,IMediaPlaybackItemFactory2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItemFactory2?> =
        arrayOfNulls<IMediaPlaybackItemFactory2_Impl>(size) as Array<IMediaPlaybackItemFactory2?>
  }
}
