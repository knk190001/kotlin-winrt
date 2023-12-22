package Windows.Media.Playback

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMediaEnginePlaybackSource.ABI::class)
@Signature("{5c1d0ba7-3856-48b9-8dc6-244bf107bf8c}")
@Guid("5c1d0ba7385648b98dc6244bf107bf8c")
@WinRTInterface("5c1d0ba7385648b98dc6244bf107bf8c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaEnginePlaybackSource.ByReference::class)
public interface IMediaEnginePlaybackSource : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CurrentItem(): MediaPlaybackItem?

  @InterfaceMethod(1)
  public fun SetPlaybackSource(source: IMediaPlaybackSource?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaEnginePlaybackSource> {
    public override fun getValue() = ABI.makeIMediaEnginePlaybackSource(pointer.getPointer(0))

    public fun setValue(value: IMediaEnginePlaybackSource_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaEnginePlaybackSource {
    public val __1829900995_Ptr: Pointer?

    public val _1829900995_VtblPtr: Pointer?
      get() = __1829900995_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CurrentItem(): MediaPlaybackItem? {
      val fnPtr = _1829900995_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__1829900995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetPlaybackSource(source: IMediaPlaybackSource?): Unit {
      val fnPtr = _1829900995_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1829900995_Ptr, marshalToNative(source),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaEnginePlaybackSource_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1829900995_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaEnginePlaybackSource, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5c1d0ba7385648b98dc6244bf107bf8c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaEnginePlaybackSource(ptr: Pointer?): WithDefault =
        IMediaEnginePlaybackSource_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaEnginePlaybackSource {
      val address = segment.toRawLongValue()
      return makeIMediaEnginePlaybackSource(Pointer(address))
    }

    public override fun toNative(obj: IMediaEnginePlaybackSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1829900995_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaEnginePlaybackSource):
        Array<IMediaEnginePlaybackSource?> = (elements as
        Array<IMediaEnginePlaybackSource?>).castToImpl<IMediaEnginePlaybackSource,IMediaEnginePlaybackSource_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaEnginePlaybackSource?> =
        arrayOfNulls<IMediaEnginePlaybackSource_Impl>(size) as Array<IMediaEnginePlaybackSource?>
  }
}
