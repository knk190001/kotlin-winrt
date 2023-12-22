package Windows.Graphics.Capture

import Windows.Foundation.TimeSpan
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
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

@ABIMarker(IDirect3D11CaptureFrame.ABI::class)
@Signature("{fa50c623-38da-4b32-acf3-fa9734ad800e}")
@Guid("fa50c62338da4b32acf3fa9734ad800e")
@WinRTInterface("fa50c62338da4b32acf3fa9734ad800e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDirect3D11CaptureFrame.ByReference::class)
public interface IDirect3D11CaptureFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Surface(): IDirect3DSurface?

  @InterfaceMethod(1)
  public fun get_SystemRelativeTime(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_ContentSize(): SizeInt32?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDirect3D11CaptureFrame> {
    public override fun getValue() = ABI.makeIDirect3D11CaptureFrame(pointer.getPointer(0))

    public fun setValue(value: IDirect3D11CaptureFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDirect3D11CaptureFrame {
    public val __859316092_Ptr: Pointer?

    public val _859316092_VtblPtr: Pointer?
      get() = __859316092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Surface(): IDirect3DSurface? {
      val fnPtr = _859316092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DSurface>()
      val hr = fn.invokeHR(arrayOf(__859316092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DSurface>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SystemRelativeTime(): TimeSpan? {
      val fnPtr = _859316092_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__859316092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ContentSize(): SizeInt32? {
      val fnPtr = _859316092_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SizeInt32>()
      val hr = fn.invokeHR(arrayOf(__859316092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SizeInt32>(result.getValue())
      return resultValue
    }
  }

  public class IDirect3D11CaptureFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __859316092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDirect3D11CaptureFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa50c62338da4b32acf3fa9734ad800e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDirect3D11CaptureFrame(ptr: Pointer?): WithDefault =
        IDirect3D11CaptureFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDirect3D11CaptureFrame {
      val address = segment.toRawLongValue()
      return makeIDirect3D11CaptureFrame(Pointer(address))
    }

    public override fun toNative(obj: IDirect3D11CaptureFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__859316092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDirect3D11CaptureFrame): Array<IDirect3D11CaptureFrame?>
        = (elements as
        Array<IDirect3D11CaptureFrame?>).castToImpl<IDirect3D11CaptureFrame,IDirect3D11CaptureFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDirect3D11CaptureFrame?> =
        arrayOfNulls<IDirect3D11CaptureFrame_Impl>(size) as Array<IDirect3D11CaptureFrame?>
  }
}
