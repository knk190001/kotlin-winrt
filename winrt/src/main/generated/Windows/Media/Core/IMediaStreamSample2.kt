package Windows.Media.Core

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

@ABIMarker(IMediaStreamSample2.ABI::class)
@Signature("{45078691-fce8-4746-a1c8-10c25d3d7cd3}")
@Guid("45078691fce84746a1c810c25d3d7cd3")
@WinRTInterface("45078691fce84746a1c810c25d3d7cd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaStreamSample2.ByReference::class)
public interface IMediaStreamSample2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Direct3D11Surface(): IDirect3DSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaStreamSample2> {
    public override fun getValue() = ABI.makeIMediaStreamSample2(pointer.getPointer(0))

    public fun setValue(value: IMediaStreamSample2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaStreamSample2 {
    public val __1650095673_Ptr: Pointer?

    public val _1650095673_VtblPtr: Pointer?
      get() = __1650095673_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Direct3D11Surface(): IDirect3DSurface? {
      val fnPtr = _1650095673_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DSurface>()
      val hr = fn.invokeHR(arrayOf(__1650095673_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DSurface>(result.getValue())
      return resultValue
    }
  }

  public class IMediaStreamSample2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1650095673_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaStreamSample2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("45078691fce84746a1c810c25d3d7cd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaStreamSample2(ptr: Pointer?): WithDefault = IMediaStreamSample2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaStreamSample2 {
      val address = segment.toRawLongValue()
      return makeIMediaStreamSample2(Pointer(address))
    }

    public override fun toNative(obj: IMediaStreamSample2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1650095673_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaStreamSample2): Array<IMediaStreamSample2?> =
        (elements as
        Array<IMediaStreamSample2?>).castToImpl<IMediaStreamSample2,IMediaStreamSample2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaStreamSample2?> =
        arrayOfNulls<IMediaStreamSample2_Impl>(size) as Array<IMediaStreamSample2?>
  }
}
