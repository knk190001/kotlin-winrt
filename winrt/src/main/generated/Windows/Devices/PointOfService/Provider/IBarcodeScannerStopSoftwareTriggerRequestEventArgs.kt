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

@ABIMarker(IBarcodeScannerStopSoftwareTriggerRequestEventArgs.ABI::class)
@Signature("{eac34450-4eb7-481a-9273-147a273b99b8}")
@Guid("eac344504eb7481a9273147a273b99b8")
@WinRTInterface("eac344504eb7481a9273147a273b99b8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerStopSoftwareTriggerRequestEventArgs.ByReference::class)
public interface IBarcodeScannerStopSoftwareTriggerRequestEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Request(): BarcodeScannerStopSoftwareTriggerRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerStopSoftwareTriggerRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerStopSoftwareTriggerRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerStopSoftwareTriggerRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerStopSoftwareTriggerRequestEventArgs {
    public val __1497389371_Ptr: Pointer?

    public val _1497389371_VtblPtr: Pointer?
      get() = __1497389371_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): BarcodeScannerStopSoftwareTriggerRequest? {
      val fnPtr = _1497389371_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerStopSoftwareTriggerRequest>()
      val hr = fn.invokeHR(arrayOf(__1497389371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<BarcodeScannerStopSoftwareTriggerRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1497389371_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1497389371_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerStopSoftwareTriggerRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1497389371_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerStopSoftwareTriggerRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eac344504eb7481a9273147a273b99b8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerStopSoftwareTriggerRequestEventArgs(ptr: Pointer?): WithDefault =
        IBarcodeScannerStopSoftwareTriggerRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerStopSoftwareTriggerRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerStopSoftwareTriggerRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerStopSoftwareTriggerRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1497389371_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerStopSoftwareTriggerRequestEventArgs):
        Array<IBarcodeScannerStopSoftwareTriggerRequestEventArgs?> = (elements as
        Array<IBarcodeScannerStopSoftwareTriggerRequestEventArgs?>).castToImpl<IBarcodeScannerStopSoftwareTriggerRequestEventArgs,IBarcodeScannerStopSoftwareTriggerRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IBarcodeScannerStopSoftwareTriggerRequestEventArgs?> =
        arrayOfNulls<IBarcodeScannerStopSoftwareTriggerRequestEventArgs_Impl>(size) as
        Array<IBarcodeScannerStopSoftwareTriggerRequestEventArgs?>
  }
}
