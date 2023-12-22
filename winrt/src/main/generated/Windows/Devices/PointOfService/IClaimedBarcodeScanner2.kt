package Windows.Devices.PointOfService

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IClaimedBarcodeScanner2.ABI::class)
@Signature("{e3b59e8c-2d8b-4f70-8af3-3448bedd5fe2}")
@Guid("e3b59e8c2d8b4f708af33448bedd5fe2")
@WinRTInterface("e3b59e8c2d8b4f708af33448bedd5fe2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedBarcodeScanner2.ByReference::class)
public interface IClaimedBarcodeScanner2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetSymbologyAttributesAsync(barcodeSymbology: WinDef.UINT):
      IAsyncOperation<BarcodeSymbologyAttributes?>?

  @InterfaceMethod(1)
  public fun SetSymbologyAttributesAsync(barcodeSymbology: WinDef.UINT,
      attributes: BarcodeSymbologyAttributes?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedBarcodeScanner2> {
    public override fun getValue() = ABI.makeIClaimedBarcodeScanner2(pointer.getPointer(0))

    public fun setValue(value: IClaimedBarcodeScanner2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedBarcodeScanner2 {
    public val __1237950184_Ptr: Pointer?

    public val _1237950184_VtblPtr: Pointer?
      get() = __1237950184_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetSymbologyAttributesAsync(barcodeSymbology: WinDef.UINT):
        IAsyncOperation<BarcodeSymbologyAttributes?>? {
      val fnPtr = _1237950184_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<BarcodeSymbologyAttributes?>>()
      val hr = fn.invokeHR(arrayOf(__1237950184_Ptr, barcodeSymbology, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<BarcodeSymbologyAttributes?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetSymbologyAttributesAsync(barcodeSymbology: WinDef.UINT,
        attributes: BarcodeSymbologyAttributes?): IAsyncOperation<Boolean>? {
      val fnPtr = _1237950184_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1237950184_Ptr, barcodeSymbology, marshalToNative(attributes),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IClaimedBarcodeScanner2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237950184_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedBarcodeScanner2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e3b59e8c2d8b4f708af33448bedd5fe2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedBarcodeScanner2(ptr: Pointer?): WithDefault =
        IClaimedBarcodeScanner2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedBarcodeScanner2 {
      val address = segment.toRawLongValue()
      return makeIClaimedBarcodeScanner2(Pointer(address))
    }

    public override fun toNative(obj: IClaimedBarcodeScanner2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237950184_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedBarcodeScanner2): Array<IClaimedBarcodeScanner2?>
        = (elements as
        Array<IClaimedBarcodeScanner2?>).castToImpl<IClaimedBarcodeScanner2,IClaimedBarcodeScanner2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedBarcodeScanner2?> =
        arrayOfNulls<IClaimedBarcodeScanner2_Impl>(size) as Array<IClaimedBarcodeScanner2?>
  }
}
