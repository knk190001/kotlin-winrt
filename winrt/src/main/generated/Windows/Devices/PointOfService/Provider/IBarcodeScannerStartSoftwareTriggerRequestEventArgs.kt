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

@ABIMarker(IBarcodeScannerStartSoftwareTriggerRequestEventArgs.ABI::class)
@Signature("{2305d843-c88f-4f3b-8c3b-d3df071051ec}")
@Guid("2305d843c88f4f3b8c3bd3df071051ec")
@WinRTInterface("2305d843c88f4f3b8c3bd3df071051ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBarcodeScannerStartSoftwareTriggerRequestEventArgs.ByReference::class)
public interface IBarcodeScannerStartSoftwareTriggerRequestEventArgs : NativeMapped, IWinRTInterface
    {
  @InterfaceMethod(0)
  public fun get_Request(): BarcodeScannerStartSoftwareTriggerRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBarcodeScannerStartSoftwareTriggerRequestEventArgs> {
    public override fun getValue() =
        ABI.makeIBarcodeScannerStartSoftwareTriggerRequestEventArgs(pointer.getPointer(0))

    public fun setValue(value: IBarcodeScannerStartSoftwareTriggerRequestEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBarcodeScannerStartSoftwareTriggerRequestEventArgs {
    public val __154832841_Ptr: Pointer?

    public val _154832841_VtblPtr: Pointer?
      get() = __154832841_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): BarcodeScannerStartSoftwareTriggerRequest? {
      val fnPtr = _154832841_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BarcodeScannerStartSoftwareTriggerRequest>()
      val hr = fn.invokeHR(arrayOf(__154832841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<BarcodeScannerStartSoftwareTriggerRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _154832841_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__154832841_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IBarcodeScannerStartSoftwareTriggerRequestEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __154832841_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBarcodeScannerStartSoftwareTriggerRequestEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2305d843c88f4f3b8c3bd3df071051ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBarcodeScannerStartSoftwareTriggerRequestEventArgs(ptr: Pointer?): WithDefault =
        IBarcodeScannerStartSoftwareTriggerRequestEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBarcodeScannerStartSoftwareTriggerRequestEventArgs {
      val address = segment.toRawLongValue()
      return makeIBarcodeScannerStartSoftwareTriggerRequestEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IBarcodeScannerStartSoftwareTriggerRequestEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__154832841_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBarcodeScannerStartSoftwareTriggerRequestEventArgs):
        Array<IBarcodeScannerStartSoftwareTriggerRequestEventArgs?> = (elements as
        Array<IBarcodeScannerStartSoftwareTriggerRequestEventArgs?>).castToImpl<IBarcodeScannerStartSoftwareTriggerRequestEventArgs,IBarcodeScannerStartSoftwareTriggerRequestEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IBarcodeScannerStartSoftwareTriggerRequestEventArgs?> =
        arrayOfNulls<IBarcodeScannerStartSoftwareTriggerRequestEventArgs_Impl>(size) as
        Array<IBarcodeScannerStartSoftwareTriggerRequestEventArgs?>
  }
}
