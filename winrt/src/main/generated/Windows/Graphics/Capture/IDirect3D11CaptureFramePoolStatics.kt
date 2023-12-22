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

@ABIMarker(IDirect3D11CaptureFramePoolStatics.ABI::class)
@Signature("{7784056a-67aa-4d53-ae54-1088d5a8ca21}")
@Guid("7784056a67aa4d53ae541088d5a8ca21")
@WinRTInterface("7784056a67aa4d53ae541088d5a8ca21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDirect3D11CaptureFramePoolStatics.ByReference::class)
public interface IDirect3D11CaptureFramePoolStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(
    device: IDirect3DDevice?,
    pixelFormat: DirectXPixelFormat?,
    numberOfBuffers: Int,
    size: SizeInt32?
  ): Direct3D11CaptureFramePool?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDirect3D11CaptureFramePoolStatics> {
    public override fun getValue() =
        ABI.makeIDirect3D11CaptureFramePoolStatics(pointer.getPointer(0))

    public fun setValue(value: IDirect3D11CaptureFramePoolStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDirect3D11CaptureFramePoolStatics {
    public val __654693651_Ptr: Pointer?

    public val _654693651_VtblPtr: Pointer?
      get() = __654693651_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(
      device: IDirect3DDevice?,
      pixelFormat: DirectXPixelFormat?,
      numberOfBuffers: Int,
      size: SizeInt32?
    ): Direct3D11CaptureFramePool? {
      val fnPtr = _654693651_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Direct3D11CaptureFramePool>()
      val hr = fn.invokeHR(arrayOf(__654693651_Ptr, marshalToNative(device),
          marshalToNative(pixelFormat), numberOfBuffers, marshalToNative(size), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Direct3D11CaptureFramePool>(result.getValue())
      return resultValue
    }
  }

  public class IDirect3D11CaptureFramePoolStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __654693651_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDirect3D11CaptureFramePoolStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7784056a67aa4d53ae541088d5a8ca21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDirect3D11CaptureFramePoolStatics(ptr: Pointer?): WithDefault =
        IDirect3D11CaptureFramePoolStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDirect3D11CaptureFramePoolStatics {
      val address = segment.toRawLongValue()
      return makeIDirect3D11CaptureFramePoolStatics(Pointer(address))
    }

    public override fun toNative(obj: IDirect3D11CaptureFramePoolStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__654693651_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDirect3D11CaptureFramePoolStatics):
        Array<IDirect3D11CaptureFramePoolStatics?> = (elements as
        Array<IDirect3D11CaptureFramePoolStatics?>).castToImpl<IDirect3D11CaptureFramePoolStatics,IDirect3D11CaptureFramePoolStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDirect3D11CaptureFramePoolStatics?> =
        arrayOfNulls<IDirect3D11CaptureFramePoolStatics_Impl>(size) as
        Array<IDirect3D11CaptureFramePoolStatics?>
  }
}
