package Windows.Media.Core

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

@ABIMarker(IMediaStreamSampleStatics2.ABI::class)
@Signature("{9efe9521-6d46-494c-a2f8-d662922e2dd7}")
@Guid("9efe95216d46494ca2f8d662922e2dd7")
@WinRTInterface("9efe95216d46494ca2f8d662922e2dd7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSampleStatics2.ByReference::class)
public interface IMediaStreamSampleStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromDirect3D11Surface(surface: IDirect3DSurface?, timestamp: TimeSpan?):
      MediaStreamSample?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSampleStatics2> {
    public override fun getValue() = ABI.makeIMediaStreamSampleStatics2(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSampleStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSampleStatics2 {
    public val __413884742_Ptr: Pointer?

    public val _413884742_VtblPtr: Pointer?
      get() = __413884742_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromDirect3D11Surface(surface: IDirect3DSurface?,
        timestamp: TimeSpan?): MediaStreamSample? {
      val fnPtr = _413884742_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaStreamSample>()
      val hr = fn.invokeHR(arrayOf(__413884742_Ptr, marshalToNative(surface),
          marshalToNative(timestamp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaStreamSample>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSampleStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __413884742_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSampleStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9efe95216d46494ca2f8d662922e2dd7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSampleStatics2(ptr: Pointer?): WithDefault =
        IMediaStreamSampleStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSampleStatics2 {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSampleStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSampleStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__413884742_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSampleStatics2):
        Array<IMediaStreamSampleStatics2?> = (elements as
        Array<IMediaStreamSampleStatics2?>).castToImpl<IMediaStreamSampleStatics2,IMediaStreamSampleStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSampleStatics2?> =
        arrayOfNulls<IMediaStreamSampleStatics2_Impl>(size) as Array<IMediaStreamSampleStatics2?>
  }
}
