package Windows.Media.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncOperationWithProgress
import Windows.Graphics.Imaging.BitmapPixelFormat
import Windows.Graphics.Imaging.SoftwareBitmap
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ILowLightFusionStatics.ABI::class)
@Signature("{5305016d-c29e-40e2-87a9-9e1fd2f192f5}")
@Guid("5305016dc29e40e287a99e1fd2f192f5")
@WinRTInterface("5305016dc29e40e287a99e1fd2f192f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILowLightFusionStatics.ByReference::class)
public interface ILowLightFusionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedBitmapPixelFormats(): IVectorView<BitmapPixelFormat?>?

  @InterfaceMethod(1)
  public fun get_MaxSupportedFrameCount(): Int

  @InterfaceMethod(2)
  public fun FuseAsync(frameSet: IIterable<SoftwareBitmap?>?):
      IAsyncOperationWithProgress<LowLightFusionResult?, Double>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILowLightFusionStatics> {
    public override fun getValue() = ABI.makeILowLightFusionStatics(pointer.getPointer(0))

    public fun setValue(value: ILowLightFusionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILowLightFusionStatics {
    public val __185978774_Ptr: Pointer?

    public val _185978774_VtblPtr: Pointer?
      get() = __185978774_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedBitmapPixelFormats(): IVectorView<BitmapPixelFormat?>? {
      val fnPtr = _185978774_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<BitmapPixelFormat?>>()
      val hr = fn.invokeHR(arrayOf(__185978774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<BitmapPixelFormat?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MaxSupportedFrameCount(): Int {
      val fnPtr = _185978774_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__185978774_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun FuseAsync(frameSet: IIterable<SoftwareBitmap?>?):
        IAsyncOperationWithProgress<LowLightFusionResult?, Double>? {
      val fnPtr = _185978774_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<LowLightFusionResult?, Double>>()
      val hr = fn.invokeHR(arrayOf(__185978774_Ptr, marshalToNative(frameSet), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<LowLightFusionResult?,
          Double>>(result.getValue())
      return resultValue
    }
  }

  public class ILowLightFusionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __185978774_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILowLightFusionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5305016dc29e40e287a99e1fd2f192f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILowLightFusionStatics(ptr: Pointer?): WithDefault =
        ILowLightFusionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILowLightFusionStatics {
      val address = segment.toRawLongValue()
      return makeILowLightFusionStatics(Pointer(address))
    }

    public override fun toNative(obj: ILowLightFusionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__185978774_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILowLightFusionStatics): Array<ILowLightFusionStatics?> =
        (elements as
        Array<ILowLightFusionStatics?>).castToImpl<ILowLightFusionStatics,ILowLightFusionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILowLightFusionStatics?> =
        arrayOfNulls<ILowLightFusionStatics_Impl>(size) as Array<ILowLightFusionStatics?>
  }
}
