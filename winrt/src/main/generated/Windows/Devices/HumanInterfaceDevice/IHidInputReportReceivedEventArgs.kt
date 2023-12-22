package Windows.Devices.HumanInterfaceDevice

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

@ABIMarker(IHidInputReportReceivedEventArgs.ABI::class)
@Signature("{7059c5cb-59b2-4dc2-985c-0adc6136fa2d}")
@Guid("7059c5cb59b24dc2985c0adc6136fa2d")
@WinRTInterface("7059c5cb59b24dc2985c0adc6136fa2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHidInputReportReceivedEventArgs.ByReference::class)
public interface IHidInputReportReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Report(): HidInputReport?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHidInputReportReceivedEventArgs> {
    public override fun getValue() = ABI.makeIHidInputReportReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHidInputReportReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHidInputReportReceivedEventArgs {
    public val __1228187568_Ptr: Pointer?

    public val _1228187568_VtblPtr: Pointer?
      get() = __1228187568_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Report(): HidInputReport? {
      val fnPtr = _1228187568_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HidInputReport>()
      val hr = fn.invokeHR(arrayOf(__1228187568_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HidInputReport>(result.getValue())
      return resultValue
    }
  }

  public class IHidInputReportReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1228187568_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHidInputReportReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7059c5cb59b24dc2985c0adc6136fa2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHidInputReportReceivedEventArgs(ptr: Pointer?): WithDefault =
        IHidInputReportReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHidInputReportReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHidInputReportReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHidInputReportReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1228187568_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHidInputReportReceivedEventArgs):
        Array<IHidInputReportReceivedEventArgs?> = (elements as
        Array<IHidInputReportReceivedEventArgs?>).castToImpl<IHidInputReportReceivedEventArgs,IHidInputReportReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHidInputReportReceivedEventArgs?> =
        arrayOfNulls<IHidInputReportReceivedEventArgs_Impl>(size) as
        Array<IHidInputReportReceivedEventArgs?>
  }
}
