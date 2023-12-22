package Windows.Graphics.Capture

import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.SizeInt32
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

@ABIMarker(IDirect3D11CaptureFramePoolStatics2.ABI::class)
@Signature("{589b103f-6bbc-5df5-a991-02e28b3b66d5}")
@Guid("589b103f6bbc5df5a99102e28b3b66d5")
@WinRTInterface("589b103f6bbc5df5a99102e28b3b66d5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDirect3D11CaptureFramePoolStatics2.ByReference::class)
public interface IDirect3D11CaptureFramePoolStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFreeThreaded(
    device: IDirect3DDevice?,
    pixelFormat: DirectXPixelFormat?,
    numberOfBuffers: Int,
    size: SizeInt32?
  ): Direct3D11CaptureFramePool?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDirect3D11CaptureFramePoolStatics2> {
    public override fun getValue() =
        ABI.makeIDirect3D11CaptureFramePoolStatics2(pointer.getPointer(0))

    public fun setValue(value: IDirect3D11CaptureFramePoolStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDirect3D11CaptureFramePoolStatics2 {
    public val __1179333349_Ptr: Pointer?

    public val _1179333349_VtblPtr: Pointer?
      get() = __1179333349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFreeThreaded(
      device: IDirect3DDevice?,
      pixelFormat: DirectXPixelFormat?,
      numberOfBuffers: Int,
      size: SizeInt32?
    ): Direct3D11CaptureFramePool? {
      val fnPtr = _1179333349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Direct3D11CaptureFramePool>()
      val hr = fn.invokeHR(arrayOf(__1179333349_Ptr, marshalToNative(device),
          marshalToNative(pixelFormat), numberOfBuffers, marshalToNative(size), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Direct3D11CaptureFramePool>(result.getValue())
      return resultValue
    }
  }

  public class IDirect3D11CaptureFramePoolStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1179333349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDirect3D11CaptureFramePoolStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("589b103f6bbc5df5a99102e28b3b66d5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDirect3D11CaptureFramePoolStatics2(ptr: Pointer?): WithDefault =
        IDirect3D11CaptureFramePoolStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDirect3D11CaptureFramePoolStatics2 {
      val address = segment.toRawLongValue()
      return makeIDirect3D11CaptureFramePoolStatics2(Pointer(address))
    }

    public override fun toNative(obj: IDirect3D11CaptureFramePoolStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1179333349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDirect3D11CaptureFramePoolStatics2):
        Array<IDirect3D11CaptureFramePoolStatics2?> = (elements as
        Array<IDirect3D11CaptureFramePoolStatics2?>).castToImpl<IDirect3D11CaptureFramePoolStatics2,IDirect3D11CaptureFramePoolStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDirect3D11CaptureFramePoolStatics2?> =
        arrayOfNulls<IDirect3D11CaptureFramePoolStatics2_Impl>(size) as
        Array<IDirect3D11CaptureFramePoolStatics2?>
  }
}
