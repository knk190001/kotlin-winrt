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

@ABIMarker(IClaimedBarcodeScanner3.ABI::class)
@Signature("{e6ceb430-712e-45fc-8b86-cd55f5aef79d}")
@Guid("e6ceb430712e45fc8b86cd55f5aef79d")
@WinRTInterface("e6ceb430712e45fc8b86cd55f5aef79d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedBarcodeScanner3.ByReference::class)
public interface IClaimedBarcodeScanner3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowVideoPreviewAsync(): IAsyncOperation<Boolean>?

  @InterfaceMethod(1)
  public fun HideVideoPreview(): Unit

  @InterfaceMethod(2)
  public fun put_IsVideoPreviewShownOnEnable(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_IsVideoPreviewShownOnEnable(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedBarcodeScanner3> {
    public override fun getValue() = ABI.makeIClaimedBarcodeScanner3(pointer.getPointer(0))

    public fun setValue(value: IClaimedBarcodeScanner3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedBarcodeScanner3 {
    public val __1237950183_Ptr: Pointer?

    public val _1237950183_VtblPtr: Pointer?
      get() = __1237950183_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowVideoPreviewAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _1237950183_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1237950183_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun HideVideoPreview(): Unit {
      val fnPtr = _1237950183_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237950183_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun put_IsVideoPreviewShownOnEnable(value: Boolean): Unit {
      val fnPtr = _1237950183_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1237950183_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsVideoPreviewShownOnEnable(): Boolean {
      val fnPtr = _1237950183_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1237950183_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IClaimedBarcodeScanner3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237950183_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedBarcodeScanner3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e6ceb430712e45fc8b86cd55f5aef79d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedBarcodeScanner3(ptr: Pointer?): WithDefault =
        IClaimedBarcodeScanner3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedBarcodeScanner3 {
      val address = segment.toRawLongValue()
      return makeIClaimedBarcodeScanner3(Pointer(address))
    }

    public override fun toNative(obj: IClaimedBarcodeScanner3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237950183_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedBarcodeScanner3): Array<IClaimedBarcodeScanner3?>
        = (elements as
        Array<IClaimedBarcodeScanner3?>).castToImpl<IClaimedBarcodeScanner3,IClaimedBarcodeScanner3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedBarcodeScanner3?> =
        arrayOfNulls<IClaimedBarcodeScanner3_Impl>(size) as Array<IClaimedBarcodeScanner3?>
  }
}
