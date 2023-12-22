package Windows.Media

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IClosable
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Graphics.Imaging.SoftwareBitmap
import Windows.Media.IMediaFrame.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IVideoFrame.ABI::class)
@Signature("{0cc06625-90fc-4c92-bd95-7ded21819d1c}")
@Guid("0cc0662590fc4c92bd957ded21819d1c")
@WinRTInterface("0cc0662590fc4c92bd957ded21819d1c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoFrame.ByReference::class)
public interface IVideoFrame : NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
  @InterfaceMethod(0)
  public fun get_SoftwareBitmap(): SoftwareBitmap?

  @InterfaceMethod(1)
  public fun CopyToAsync(frame: VideoFrame?): IAsyncAction?

  @InterfaceMethod(2)
  public fun get_Direct3DSurface(): IDirect3DSurface?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVideoFrame> {
    public override fun getValue() = ABI.makeIVideoFrame(pointer.getPointer(0))

    public fun setValue(value: IVideoFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoFrame, IMediaFrame.WithDefault, IClosable.WithDefault {
    public val __1893542082_Ptr: Pointer?

    public val _1893542082_VtblPtr: Pointer?
      get() = __1893542082_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SoftwareBitmap(): SoftwareBitmap? {
      val fnPtr = _1893542082_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SoftwareBitmap>()
      val hr = fn.invokeHR(arrayOf(__1893542082_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SoftwareBitmap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CopyToAsync(frame: VideoFrame?): IAsyncAction? {
      val fnPtr = _1893542082_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1893542082_Ptr, marshalToNative(frame), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Direct3DSurface(): IDirect3DSurface? {
      val fnPtr = _1893542082_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IDirect3DSurface>()
      val hr = fn.invokeHR(arrayOf(__1893542082_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IDirect3DSurface>(result.getValue())
      return resultValue
    }
  }

  public class IVideoFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMediaFrame, IClosable {
    public override val __1156286201_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1893542082_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IClosable.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_1893542082_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1893542082_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0cc0662590fc4c92bd957ded21819d1c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoFrame(ptr: Pointer?): WithDefault = IVideoFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoFrame {
      val address = segment.toRawLongValue()
      return makeIVideoFrame(Pointer(address))
    }

    public override fun toNative(obj: IVideoFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1893542082_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoFrame): Array<IVideoFrame?> = (elements as
        Array<IVideoFrame?>).castToImpl<IVideoFrame,IVideoFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoFrame?> =
        arrayOfNulls<IVideoFrame_Impl>(size) as Array<IVideoFrame?>
  }
}
