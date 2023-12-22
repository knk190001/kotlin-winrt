package Windows.Graphics.Capture

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import Windows.Graphics.DirectX.Direct3D11.IDirect3DDevice
import Windows.Graphics.DirectX.DirectXPixelFormat
import Windows.Graphics.SizeInt32
import Windows.System.DispatcherQueue
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IDirect3D11CaptureFramePool.ABI::class)
@Signature("{24eb6d22-1975-422e-82e7-780dbd8ddf24}")
@Guid("24eb6d221975422e82e7780dbd8ddf24")
@WinRTInterface("24eb6d221975422e82e7780dbd8ddf24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDirect3D11CaptureFramePool.ByReference::class)
public interface IDirect3D11CaptureFramePool : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Recreate(
    device: IDirect3DDevice?,
    pixelFormat: DirectXPixelFormat?,
    numberOfBuffers: Int,
    size: SizeInt32?
  ): Unit

  @InterfaceMethod(1)
  public fun TryGetNextFrame(): Direct3D11CaptureFrame?

  @InterfaceMethod(2)
  public fun add_FrameArrived(handler: TypedEventHandler<Direct3D11CaptureFramePool?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(3)
  public fun remove_FrameArrived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(4)
  public fun CreateCaptureSession(item: GraphicsCaptureItem?): GraphicsCaptureSession?

  @InterfaceMethod(5)
  public fun get_DispatcherQueue(): DispatcherQueue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDirect3D11CaptureFramePool> {
    public override fun getValue() = ABI.makeIDirect3D11CaptureFramePool(pointer.getPointer(0))

    public fun setValue(value: IDirect3D11CaptureFramePool_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDirect3D11CaptureFramePool {
    public val __1828057672_Ptr: Pointer?

    public val _1828057672_VtblPtr: Pointer?
      get() = __1828057672_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Recreate(
      device: IDirect3DDevice?,
      pixelFormat: DirectXPixelFormat?,
      numberOfBuffers: Int,
      size: SizeInt32?
    ): Unit {
      val fnPtr = _1828057672_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1828057672_Ptr, marshalToNative(device),
          marshalToNative(pixelFormat), numberOfBuffers, marshalToNative(size),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun TryGetNextFrame(): Direct3D11CaptureFrame? {
      val fnPtr = _1828057672_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Direct3D11CaptureFrame>()
      val hr = fn.invokeHR(arrayOf(__1828057672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Direct3D11CaptureFrame>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun add_FrameArrived(handler: TypedEventHandler<Direct3D11CaptureFramePool?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1828057672_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1828057672_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun remove_FrameArrived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1828057672_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1828057672_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun CreateCaptureSession(item: GraphicsCaptureItem?): GraphicsCaptureSession? {
      val fnPtr = _1828057672_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GraphicsCaptureSession>()
      val hr = fn.invokeHR(arrayOf(__1828057672_Ptr, marshalToNative(item), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GraphicsCaptureSession>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DispatcherQueue(): DispatcherQueue? {
      val fnPtr = _1828057672_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DispatcherQueue>()
      val hr = fn.invokeHR(arrayOf(__1828057672_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DispatcherQueue>(result.getValue())
      return resultValue
    }
  }

  public class IDirect3D11CaptureFramePool_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1828057672_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDirect3D11CaptureFramePool, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("24eb6d221975422e82e7780dbd8ddf24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDirect3D11CaptureFramePool(ptr: Pointer?): WithDefault =
        IDirect3D11CaptureFramePool_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDirect3D11CaptureFramePool {
      val address = segment.toRawLongValue()
      return makeIDirect3D11CaptureFramePool(Pointer(address))
    }

    public override fun toNative(obj: IDirect3D11CaptureFramePool): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1828057672_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDirect3D11CaptureFramePool):
        Array<IDirect3D11CaptureFramePool?> = (elements as
        Array<IDirect3D11CaptureFramePool?>).castToImpl<IDirect3D11CaptureFramePool,IDirect3D11CaptureFramePool_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDirect3D11CaptureFramePool?> =
        arrayOfNulls<IDirect3D11CaptureFramePool_Impl>(size) as Array<IDirect3D11CaptureFramePool?>
  }
}
