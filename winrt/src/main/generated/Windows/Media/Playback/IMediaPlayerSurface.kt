package Windows.Media.Playback

import Windows.UI.Composition.Compositor
import Windows.UI.Composition.ICompositionSurface
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

@ABIMarker(IMediaPlayerSurface.ABI::class)
@Signature("{0ed653bc-b736-49c3-830b-764a3845313a}")
@Guid("0ed653bcb73649c3830b764a3845313a")
@WinRTInterface("0ed653bcb73649c3830b764a3845313a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaPlayerSurface.ByReference::class)
public interface IMediaPlayerSurface : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CompositionSurface(): ICompositionSurface?

  @InterfaceMethod(1)
  public fun get_Compositor(): Compositor?

  @InterfaceMethod(2)
  public fun get_MediaPlayer(): MediaPlayer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaPlayerSurface> {
    public override fun getValue() = ABI.makeIMediaPlayerSurface(pointer.getPointer(0))

    public fun setValue(value: IMediaPlayerSurface_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaPlayerSurface {
    public val __309181217_Ptr: Pointer?

    public val _309181217_VtblPtr: Pointer?
      get() = __309181217_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CompositionSurface(): ICompositionSurface? {
      val fnPtr = _309181217_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ICompositionSurface>()
      val hr = fn.invokeHR(arrayOf(__309181217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ICompositionSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Compositor(): Compositor? {
      val fnPtr = _309181217_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Compositor>()
      val hr = fn.invokeHR(arrayOf(__309181217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Compositor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MediaPlayer(): MediaPlayer? {
      val fnPtr = _309181217_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaPlayer>()
      val hr = fn.invokeHR(arrayOf(__309181217_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaPlayer>(result.getValue())
      return resultValue
    }
  }

  public class IMediaPlayerSurface_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __309181217_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaPlayerSurface, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0ed653bcb73649c3830b764a3845313a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaPlayerSurface(ptr: Pointer?): WithDefault = IMediaPlayerSurface_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaPlayerSurface {
      val address = segment.toRawLongValue()
      return makeIMediaPlayerSurface(Pointer(address))
    }

    public override fun toNative(obj: IMediaPlayerSurface): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__309181217_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaPlayerSurface): Array<IMediaPlayerSurface?> =
        (elements as
        Array<IMediaPlayerSurface?>).castToImpl<IMediaPlayerSurface,IMediaPlayerSurface_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaPlayerSurface?> =
        arrayOfNulls<IMediaPlayerSurface_Impl>(size) as Array<IMediaPlayerSurface?>
  }
}
