package Windows.Graphics.Imaging

import Windows.Foundation.IAsyncOperation
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IBitmapDecoder.ABI::class)
@Signature("{acef22ba-1d74-4c91-9dfc-9620745233e6}")
@Guid("acef22ba1d744c919dfc9620745233e6")
@WinRTInterface("acef22ba1d744c919dfc9620745233e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapDecoder.ByReference::class)
public interface IBitmapDecoder : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BitmapContainerProperties(): BitmapPropertiesView?

  @InterfaceMethod(1)
  public fun get_DecoderInformation(): BitmapCodecInformation?

  @InterfaceMethod(2)
  public fun get_FrameCount(): WinDef.UINT

  @InterfaceMethod(3)
  public fun GetPreviewAsync(): IAsyncOperation<ImageStream?>?

  @InterfaceMethod(4)
  public fun GetFrameAsync(frameIndex: WinDef.UINT): IAsyncOperation<BitmapFrame?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapDecoder>
      {
    public override fun getValue() = ABI.makeIBitmapDecoder(pointer.getPointer(0))

    public fun setValue(value: IBitmapDecoder_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapDecoder {
    public val __1430141292_Ptr: Pointer?

    public val _1430141292_VtblPtr: Pointer?
      get() = __1430141292_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BitmapContainerProperties(): BitmapPropertiesView? {
      val fnPtr = _1430141292_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapPropertiesView>()
      val hr = fn.invokeHR(arrayOf(__1430141292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapPropertiesView>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DecoderInformation(): BitmapCodecInformation? {
      val fnPtr = _1430141292_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BitmapCodecInformation>()
      val hr = fn.invokeHR(arrayOf(__1430141292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BitmapCodecInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FrameCount(): WinDef.UINT {
      val fnPtr = _1430141292_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1430141292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun GetPreviewAsync(): IAsyncOperation<ImageStream?>? {
      val fnPtr = _1430141292_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ImageStream?>>()
      val hr = fn.invokeHR(arrayOf(__1430141292_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ImageStream?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetFrameAsync(frameIndex: WinDef.UINT): IAsyncOperation<BitmapFrame?>? {
      val fnPtr = _1430141292_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BitmapFrame?>>()
      val hr = fn.invokeHR(arrayOf(__1430141292_Ptr, frameIndex, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<BitmapFrame?>>(result.getValue())
      return resultValue
    }
  }

  public class IBitmapDecoder_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1430141292_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapDecoder, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("acef22ba1d744c919dfc9620745233e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapDecoder(ptr: Pointer?): WithDefault = IBitmapDecoder_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapDecoder {
      val address = segment.toRawLongValue()
      return makeIBitmapDecoder(Pointer(address))
    }

    public override fun toNative(obj: IBitmapDecoder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1430141292_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapDecoder): Array<IBitmapDecoder?> = (elements as
        Array<IBitmapDecoder?>).castToImpl<IBitmapDecoder,IBitmapDecoder_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapDecoder?> =
        arrayOfNulls<IBitmapDecoder_Impl>(size) as Array<IBitmapDecoder?>
  }
}
