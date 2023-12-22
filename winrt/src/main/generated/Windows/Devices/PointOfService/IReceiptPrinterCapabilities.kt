package Windows.Devices.PointOfService

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

@ABIMarker(IReceiptPrinterCapabilities.ABI::class)
@Signature("{b8f0b58f-51a8-43fc-9bd5-8de272a6415b}")
@Guid("b8f0b58f51a843fc9bd58de272a6415b")
@WinRTInterface("b8f0b58f51a843fc9bd58de272a6415b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IReceiptPrinterCapabilities.ByReference::class)
public interface IReceiptPrinterCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CanCutPaper(): Boolean

  @InterfaceMethod(1)
  public fun get_IsStampSupported(): Boolean

  @InterfaceMethod(2)
  public fun get_MarkFeedCapabilities(): PosPrinterMarkFeedCapabilities?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IReceiptPrinterCapabilities> {
    public override fun getValue() = ABI.makeIReceiptPrinterCapabilities(pointer.getPointer(0))

    public fun setValue(value: IReceiptPrinterCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IReceiptPrinterCapabilities {
    public val __902185463_Ptr: Pointer?

    public val _902185463_VtblPtr: Pointer?
      get() = __902185463_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CanCutPaper(): Boolean {
      val fnPtr = _902185463_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__902185463_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsStampSupported(): Boolean {
      val fnPtr = _902185463_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__902185463_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MarkFeedCapabilities(): PosPrinterMarkFeedCapabilities? {
      val fnPtr = _902185463_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PosPrinterMarkFeedCapabilities>()
      val hr = fn.invokeHR(arrayOf(__902185463_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PosPrinterMarkFeedCapabilities>(result.getValue())
      return resultValue
    }
  }

  public class IReceiptPrinterCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __902185463_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IReceiptPrinterCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8f0b58f51a843fc9bd58de272a6415b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIReceiptPrinterCapabilities(ptr: Pointer?): WithDefault =
        IReceiptPrinterCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IReceiptPrinterCapabilities {
      val address = segment.toRawLongValue()
      return makeIReceiptPrinterCapabilities(Pointer(address))
    }

    public override fun toNative(obj: IReceiptPrinterCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__902185463_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IReceiptPrinterCapabilities):
        Array<IReceiptPrinterCapabilities?> = (elements as
        Array<IReceiptPrinterCapabilities?>).castToImpl<IReceiptPrinterCapabilities,IReceiptPrinterCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IReceiptPrinterCapabilities?> =
        arrayOfNulls<IReceiptPrinterCapabilities_Impl>(size) as Array<IReceiptPrinterCapabilities?>
  }
}
