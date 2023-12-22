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

@ABIMarker(IBarcodeScannerSetSymbologyAttributesRequestEventArgs.ABI::class)
@Signature("{b2b89809-9824-47d4-85bd-d0077baa7bd2}")
@Guid("b2b89809982447d485bdd0077baa7bd2")
@WinRTInterface("b2b89809982447d485bdd0077baa7bd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IBarcodeScannerSetSymbologyAttributesRequestEventArgs.ByReference::class)
public interface IBarcodeScannerSetSymbologyAttributesRequestEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): BarcodeScannerSetSymbologyAttributesRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerSetSymbologyAttributesRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerSetSymbologyAttributesRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerSetSymbologyAttributesRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerSetSymbologyAttributesRequestEventArgs {
    public val __356254856_Ptr: Pointer?

    public val _356254856_VtblPtr: Pointer?
      get() = __356254856_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): BarcodeScannerSetSymbologyAttributesRequest? {
      val fnPtr = _356254856_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerSetSymbologyAttributesRequest>()
      val hr = fn.invokeHR(arrayOf(__356254856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<BarcodeScannerSetSymbologyAttributesRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _356254856_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__356254856_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerSetSymbologyAttributesRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __356254856_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerSetSymbologyAttributesRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2b89809982447d485bdd0077baa7bd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerSetSymbologyAttributesRequestEventArgs(ptr: Pointer?): WithDefault
        = IBarcodeScannerSetSymbologyAttributesRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerSetSymbologyAttributesRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerSetSymbologyAttributesRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerSetSymbologyAttributesRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__356254856_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerSetSymbologyAttributesRequestEventArgs):
        Array<IBarcodeScannerSetSymbologyAttributesRequestEventArgs?> = (elements as
        Array<IBarcodeScannerSetSymbologyAttributesRequestEventArgs?>).castToImpl<IBarcodeScannerSetSymbologyAttributesRequestEventArgs,IBarcodeScannerSetSymbologyAttributesRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IBarcodeScannerSetSymbologyAttributesRequestEventArgs?> =
        arrayOfNulls<IBarcodeScannerSetSymbologyAttributesRequestEventArgs_Impl>(size) as
        Array<IBarcodeScannerSetSymbologyAttributesRequestEventArgs?>
  }
}
