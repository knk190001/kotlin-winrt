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

@ABIMarker(IMediaPlayerSource2.ABI::class)
@Signature("{82449b9f-7322-4c0b-b03b-3e69a48260c5}")
@Guid("82449b9f73224c0bb03b3e69a48260c5")
@WinRTInterface("82449b9f73224c0bb03b3e69a48260c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerSource2.ByReference::class)
public interface IMediaPlayerSource2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Source(): IMediaPlaybackSource?

  @InterfaceMethod(1)
  public fun put_Source(value: IMediaPlaybackSource?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerSource2> {
    public override fun getValue() = ABI.makeIMediaPlayerSource2(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerSource2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerSource2 {
    public val __140536299_Ptr: Pointer?

    public val _140536299_VtblPtr: Pointer?
      get() = __140536299_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Source(): IMediaPlaybackSource? {
      val fnPtr = _140536299_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMediaPlaybackSource>()
      val hr = fn.invokeHR(arrayOf(__140536299_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMediaPlaybackSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Source(value: IMediaPlaybackSource?): Unit {
      val fnPtr = _140536299_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__140536299_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMediaPlayerSource2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __140536299_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerSource2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82449b9f73224c0bb03b3e69a48260c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerSource2(ptr: Pointer?): WithDefault = IMediaPlayerSource2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerSource2 {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerSource2(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerSource2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__140536299_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerSource2): Array<IMediaPlayerSource2?> =
        (elements as
        Array<IMediaPlayerSource2?>).castToImpl<IMediaPlayerSource2,IMediaPlayerSource2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerSource2?> =
        arrayOfNulls<IMediaPlayerSource2_Impl>(size) as Array<IMediaPlayerSource2?>
  }
}
