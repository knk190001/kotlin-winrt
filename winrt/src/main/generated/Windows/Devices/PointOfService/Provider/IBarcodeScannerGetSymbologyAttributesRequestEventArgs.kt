package Windows.Devices.PointOfService.Provider

import Windows.Foundation.Deferral
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

@ABIMarker(IBarcodeScannerGetSymbologyAttributesRequestEventArgs.ABI::class)
@Signature("{7f89de3e-fb5d-493c-b402-356b24d574a6}")
@Guid("7f89de3efb5d493cb402356b24d574a6")
@WinRTInterface("7f89de3efb5d493cb402356b24d574a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IBarcodeScannerGetSymbologyAttributesRequestEventArgs.ByReference::class)
public interface IBarcodeScannerGetSymbologyAttributesRequestEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): BarcodeScannerGetSymbologyAttributesRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerGetSymbologyAttributesRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerGetSymbologyAttributesRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerGetSymbologyAttributesRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerGetSymbologyAttributesRequestEventArgs {
    public val __1524933636_Ptr: Pointer?

    public val _1524933636_VtblPtr: Pointer?
      get() = __1524933636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): BarcodeScannerGetSymbologyAttributesRequest? {
      val fnPtr = _1524933636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerGetSymbologyAttributesRequest>()
      val hr = fn.invokeHR(arrayOf(__1524933636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<BarcodeScannerGetSymbologyAttributesRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1524933636_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1524933636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerGetSymbologyAttributesRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1524933636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerGetSymbologyAttributesRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f89de3efb5d493cb402356b24d574a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerGetSymbologyAttributesRequestEventArgs(ptr: Pointer?): WithDefault
        = IBarcodeScannerGetSymbologyAttributesRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerGetSymbologyAttributesRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerGetSymbologyAttributesRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerGetSymbologyAttributesRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1524933636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerGetSymbologyAttributesRequestEventArgs):
        Array<IBarcodeScannerGetSymbologyAttributesRequestEventArgs?> = (elements as
        Array<IBarcodeScannerGetSymbologyAttributesRequestEventArgs?>).castToImpl<IBarcodeScannerGetSymbologyAttributesRequestEventArgs,IBarcodeScannerGetSymbologyAttributesRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IBarcodeScannerGetSymbologyAttributesRequestEventArgs?> =
        arrayOfNulls<IBarcodeScannerGetSymbologyAttributesRequestEventArgs_Impl>(size) as
        Array<IBarcodeScannerGetSymbologyAttributesRequestEventArgs?>
  }
}
