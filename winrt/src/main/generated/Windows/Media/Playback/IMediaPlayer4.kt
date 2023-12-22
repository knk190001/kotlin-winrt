package Windows.Media.Playback

import Windows.Foundation.Size
import Windows.UI.Composition.Compositor
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

@ABIMarker(IMediaPlayer4.ABI::class)
@Signature("{80035db0-7448-4770-afcf-2a57450914c5}")
@Guid("80035db074484770afcf2a57450914c5")
@WinRTInterface("80035db074484770afcf2a57450914c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayer4.ByReference::class)
public interface IMediaPlayer4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetSurfaceSize(size: Size?): Unit

  @InterfaceMethod(1)
  public fun GetSurface(compositor: Compositor?): MediaPlayerSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMediaPlayer4>
      {
    public override fun getValue() = ABI.makeIMediaPlayer4(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayer4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayer4 {
    public val __1314081336_Ptr: Pointer?

    public val _1314081336_VtblPtr: Pointer?
      get() = __1314081336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetSurfaceSize(size: Size?): Unit {
      val fnPtr = _1314081336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1314081336_Ptr, marshalToNative(size),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun GetSurface(compositor: Compositor?): MediaPlayerSurface? {
      val fnPtr = _1314081336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayerSurface>()
      val hr = fn.invokeHR(arrayOf(__1314081336_Ptr, marshalToNative(compositor), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayerSurface>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayer4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1314081336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayer4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80035db074484770afcf2a57450914c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayer4(ptr: Pointer?): WithDefault = IMediaPlayer4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayer4 {
      val address = segment.toRawLongValue()
      return makeIMediaPlayer4(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayer4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1314081336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayer4): Array<IMediaPlayer4?> = (elements as
        Array<IMediaPlayer4?>).castToImpl<IMediaPlayer4,IMediaPlayer4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayer4?> =
        arrayOfNulls<IMediaPlayer4_Impl>(size) as Array<IMediaPlayer4?>
  }
}
