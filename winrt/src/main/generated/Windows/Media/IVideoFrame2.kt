package Windows.Media

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IReference
import Windows.Graphics.Imaging.BitmapBounds
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

@ABIMarker(IVideoFrame2.ABI::class)
@Signature("{3837840d-336c-4366-8d46-060798736c5d}")
@Guid("3837840d336c43668d46060798736c5d")
@WinRTInterface("3837840d336c43668d46060798736c5d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVideoFrame2.ByReference::class)
public interface IVideoFrame2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CopyToAsync(
    frame: VideoFrame?,
    sourceBounds: IReference<BitmapBounds?>?,
    destinationBounds: IReference<BitmapBounds?>?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IVideoFrame2> {
    public override fun getValue() = ABI.makeIVideoFrame2(pointer.getPointer(0))

    public fun setValue(value: IVideoFrame2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVideoFrame2 {
    public val __1429737552_Ptr: Pointer?

    public val _1429737552_VtblPtr: Pointer?
      get() = __1429737552_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CopyToAsync(
      frame: VideoFrame?,
      sourceBounds: IReference<BitmapBounds?>?,
      destinationBounds: IReference<BitmapBounds?>?
    ): IAsyncAction? {
      val fnPtr = _1429737552_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1429737552_Ptr, marshalToNative(frame),
          marshalToNative(sourceBounds), marshalToNative(destinationBounds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IVideoFrame2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1429737552_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVideoFrame2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3837840d336c43668d46060798736c5d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVideoFrame2(ptr: Pointer?): WithDefault = IVideoFrame2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVideoFrame2 {
      val address = segment.toRawLongValue()
      return makeIVideoFrame2(Pointer(address))
    }

    public override fun toNative(obj: IVideoFrame2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1429737552_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVideoFrame2): Array<IVideoFrame2?> = (elements as
        Array<IVideoFrame2?>).castToImpl<IVideoFrame2,IVideoFrame2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVideoFrame2?> =
        arrayOfNulls<IVideoFrame2_Impl>(size) as Array<IVideoFrame2?>
  }
}
