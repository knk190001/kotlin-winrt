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

@ABIMarker(ISlipPrinterCapabilities.ABI::class)
@Signature("{99b16399-488c-4157-8ac2-9f57f708d3db}")
@Guid("99b16399488c41578ac29f57f708d3db")
@WinRTInterface("99b16399488c41578ac29f57f708d3db")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISlipPrinterCapabilities.ByReference::class)
public interface ISlipPrinterCapabilities : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsFullLengthSupported(): Boolean

  @InterfaceMethod(1)
  public fun get_IsBothSidesPrintingSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISlipPrinterCapabilities> {
    public override fun getValue() = ABI.makeISlipPrinterCapabilities(pointer.getPointer(0))

    public fun setValue(value: ISlipPrinterCapabilities_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISlipPrinterCapabilities {
    public val __1735159185_Ptr: Pointer?

    public val _1735159185_VtblPtr: Pointer?
      get() = __1735159185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsFullLengthSupported(): Boolean {
      val fnPtr = _1735159185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1735159185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsBothSidesPrintingSupported(): Boolean {
      val fnPtr = _1735159185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1735159185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class ISlipPrinterCapabilities_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1735159185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISlipPrinterCapabilities, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("99b16399488c41578ac29f57f708d3db")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISlipPrinterCapabilities(ptr: Pointer?): WithDefault =
        ISlipPrinterCapabilities_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISlipPrinterCapabilities {
      val address = segment.toRawLongValue()
      return makeISlipPrinterCapabilities(Pointer(address))
    }

    public override fun toNative(obj: ISlipPrinterCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1735159185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISlipPrinterCapabilities):
        Array<ISlipPrinterCapabilities?> = (elements as
        Array<ISlipPrinterCapabilities?>).castToImpl<ISlipPrinterCapabilities,ISlipPrinterCapabilities_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISlipPrinterCapabilities?> =
        arrayOfNulls<ISlipPrinterCapabilities_Impl>(size) as Array<ISlipPrinterCapabilities?>
  }
}
