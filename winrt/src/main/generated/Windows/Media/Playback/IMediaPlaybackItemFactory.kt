package Windows.Media.Playback

import Windows.Media.Core.MediaSource
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

@ABIMarker(IMediaPlaybackItemFactory.ABI::class)
@Signature("{7133fce1-1769-4ff9-a7c1-38d2c4d42360}")
@Guid("7133fce117694ff9a7c138d2c4d42360")
@WinRTInterface("7133fce117694ff9a7c138d2c4d42360")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlaybackItemFactory.ByReference::class)
public interface IMediaPlaybackItemFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(source: MediaSource?): MediaPlaybackItem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlaybackItemFactory> {
    public override fun getValue() = ABI.makeIMediaPlaybackItemFactory(pointer.getPointer(0))

    public fun setValue(value: IMediaPlaybackItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlaybackItemFactory {
    public val __2145000911_Ptr: Pointer?

    public val _2145000911_VtblPtr: Pointer?
      get() = __2145000911_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(source: MediaSource?): MediaPlaybackItem? {
      val fnPtr = _2145000911_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlaybackItem>()
      val hr = fn.invokeHR(arrayOf(__2145000911_Ptr, marshalToNative(source), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlaybackItem>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlaybackItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2145000911_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlaybackItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7133fce117694ff9a7c138d2c4d42360")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlaybackItemFactory(ptr: Pointer?): WithDefault =
        IMediaPlaybackItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlaybackItemFactory {
      val address = segment.toRawLongValue()
      return makeIMediaPlaybackItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlaybackItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2145000911_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlaybackItemFactory):
        Array<IMediaPlaybackItemFactory?> = (elements as
        Array<IMediaPlaybackItemFactory?>).castToImpl<IMediaPlaybackItemFactory,IMediaPlaybackItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlaybackItemFactory?> =
        arrayOfNulls<IMediaPlaybackItemFactory_Impl>(size) as Array<IMediaPlaybackItemFactory?>
  }
}
