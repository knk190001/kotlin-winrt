package Windows.Media.Editing

import Windows.Foundation.TimeSpan
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
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

@ABIMarker(IMediaClipStatics2.ABI::class)
@Signature("{5b1dd7b3-854e-4d9b-877d-4774a556cd12}")
@Guid("5b1dd7b3854e4d9b877d4774a556cd12")
@WinRTInterface("5b1dd7b3854e4d9b877d4774a556cd12")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaClipStatics2.ByReference::class)
public interface IMediaClipStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromSurface(surface: IDirect3DSurface?, originalDuration: TimeSpan?): MediaClip?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaClipStatics2> {
    public override fun getValue() = ABI.makeIMediaClipStatics2(pointer.getPointer(0))

    public fun setValue(value: IMediaClipStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaClipStatics2 {
    public val __614499195_Ptr: Pointer?

    public val _614499195_VtblPtr: Pointer?
      get() = __614499195_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromSurface(surface: IDirect3DSurface?, originalDuration: TimeSpan?):
        MediaClip? {
      val fnPtr = _614499195_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaClip>()
      val hr = fn.invokeHR(arrayOf(__614499195_Ptr, marshalToNative(surface),
          marshalToNative(originalDuration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaClip>(result.getValue())
      return resultValue
    }
  }

  public class IMediaClipStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __614499195_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaClipStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5b1dd7b3854e4d9b877d4774a556cd12")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaClipStatics2(ptr: Pointer?): WithDefault = IMediaClipStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaClipStatics2 {
      val address = segment.toRawLongValue()
      return makeIMediaClipStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMediaClipStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__614499195_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaClipStatics2): Array<IMediaClipStatics2?> =
        (elements as
        Array<IMediaClipStatics2?>).castToImpl<IMediaClipStatics2,IMediaClipStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaClipStatics2?> =
        arrayOfNulls<IMediaClipStatics2_Impl>(size) as Array<IMediaClipStatics2?>
  }
}
