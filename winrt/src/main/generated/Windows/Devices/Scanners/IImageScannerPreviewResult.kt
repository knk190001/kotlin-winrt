package Windows.Devices.Scanners

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IImageScannerPreviewResult.ABI::class)
@Signature("{08b7fe8e-8891-441d-be9c-176fa109c8bb}")
@Guid("08b7fe8e8891441dbe9c176fa109c8bb")
@WinRTInterface("08b7fe8e8891441dbe9c176fa109c8bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageScannerPreviewResult.ByReference::class)
public interface IImageScannerPreviewResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Succeeded(): Boolean

  @InterfaceMethod(1)
  public fun get_Format(): ImageScannerFormat?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageScannerPreviewResult> {
    public override fun getValue() = ABI.makeIImageScannerPreviewResult(pointer.getPointer(0))

    public fun setValue(value: IImageScannerPreviewResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageScannerPreviewResult {
    public val __925661098_Ptr: Pointer?

    public val _925661098_VtblPtr: Pointer?
      get() = __925661098_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Succeeded(): Boolean {
      val fnPtr = _925661098_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__925661098_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Format(): ImageScannerFormat? {
      val fnPtr = _925661098_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ImageScannerFormat>()
      val hr = fn.invokeHR(arrayOf(__925661098_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ImageScannerFormat>(result.getValue())
      return resultValue
    }
  }

  public class IImageScannerPreviewResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __925661098_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageScannerPreviewResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08b7fe8e8891441dbe9c176fa109c8bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageScannerPreviewResult(ptr: Pointer?): WithDefault =
        IImageScannerPreviewResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageScannerPreviewResult {
      val address = segment.toRawLongValue()
      return makeIImageScannerPreviewResult(Pointer(address))
    }

    public override fun toNative(obj: IImageScannerPreviewResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__925661098_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageScannerPreviewResult):
        Array<IImageScannerPreviewResult?> = (elements as
        Array<IImageScannerPreviewResult?>).castToImpl<IImageScannerPreviewResult,IImageScannerPreviewResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageScannerPreviewResult?> =
        arrayOfNulls<IImageScannerPreviewResult_Impl>(size) as Array<IImageScannerPreviewResult?>
  }
}
