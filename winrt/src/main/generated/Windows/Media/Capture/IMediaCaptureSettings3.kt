package Windows.Media.Capture

import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
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

@ABIMarker(IMediaCaptureSettings3.ABI::class)
@Signature("{303c67c2-8058-4b1b-b877-8c2ef3528440}")
@Guid("303c67c280584b1bb8778c2ef3528440")
@WinRTInterface("303c67c280584b1bb8778c2ef3528440")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMediaCaptureSettings3.ByReference::class)
public interface IMediaCaptureSettings3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Direct3D11Device(): IDirect3DDevice?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMediaCaptureSettings3> {
    public override fun getValue() = ABI.makeIMediaCaptureSettings3(pointer.getPointer(0))

    public fun setValue(value: IMediaCaptureSettings3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMediaCaptureSettings3 {
    public val __1896001802_Ptr: Pointer?

    public val _1896001802_VtblPtr: Pointer?
      get() = __1896001802_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Direct3D11Device(): IDirect3DDevice? {
      val fnPtr = _1896001802_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DDevice>()
      val hr = fn.invokeHR(arrayOf(__1896001802_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DDevice>(result.getValue())
      return resultValue
    }
  }

  public class IMediaCaptureSettings3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1896001802_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMediaCaptureSettings3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("303c67c280584b1bb8778c2ef3528440")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMediaCaptureSettings3(ptr: Pointer?): WithDefault =
        IMediaCaptureSettings3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMediaCaptureSettings3 {
      val address = segment.toRawLongValue()
      return makeIMediaCaptureSettings3(Pointer(address))
    }

    public override fun toNative(obj: IMediaCaptureSettings3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1896001802_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMediaCaptureSettings3): Array<IMediaCaptureSettings3?> =
        (elements as
        Array<IMediaCaptureSettings3?>).castToImpl<IMediaCaptureSettings3,IMediaCaptureSettings3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMediaCaptureSettings3?> =
        arrayOfNulls<IMediaCaptureSettings3_Impl>(size) as Array<IMediaCaptureSettings3?>
  }
}
