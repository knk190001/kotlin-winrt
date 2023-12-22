package Windows.Devices.Scanners

import Windows.Foundation.Collections.IVectorView
import Windows.Storage.StorageFile
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

@ABIMarker(IImageScannerScanResult.ABI::class)
@Signature("{c91624cd-9037-4e48-84c1-ac0975076bc5}")
@Guid("c91624cd90374e4884c1ac0975076bc5")
@WinRTInterface("c91624cd90374e4884c1ac0975076bc5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IImageScannerScanResult.ByReference::class)
public interface IImageScannerScanResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ScannedFiles(): IVectorView<StorageFile?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IImageScannerScanResult> {
    public override fun getValue() = ABI.makeIImageScannerScanResult(pointer.getPointer(0))

    public fun setValue(value: IImageScannerScanResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IImageScannerScanResult {
    public val __1206026891_Ptr: Pointer?

    public val _1206026891_VtblPtr: Pointer?
      get() = __1206026891_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ScannedFiles(): IVectorView<StorageFile?>? {
      val fnPtr = _1206026891_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<StorageFile?>>()
      val hr = fn.invokeHR(arrayOf(__1206026891_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<StorageFile?>>(result.getValue())
      return resultValue
    }
  }

  public class IImageScannerScanResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1206026891_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IImageScannerScanResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c91624cd90374e4884c1ac0975076bc5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIImageScannerScanResult(ptr: Pointer?): WithDefault =
        IImageScannerScanResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IImageScannerScanResult {
      val address = segment.toRawLongValue()
      return makeIImageScannerScanResult(Pointer(address))
    }

    public override fun toNative(obj: IImageScannerScanResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1206026891_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IImageScannerScanResult): Array<IImageScannerScanResult?>
        = (elements as
        Array<IImageScannerScanResult?>).castToImpl<IImageScannerScanResult,IImageScannerScanResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IImageScannerScanResult?> =
        arrayOfNulls<IImageScannerScanResult_Impl>(size) as Array<IImageScannerScanResult?>
  }
}
