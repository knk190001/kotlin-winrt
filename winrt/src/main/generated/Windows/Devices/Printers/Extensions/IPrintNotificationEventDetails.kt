package Windows.Devices.Printers.Extensions

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPrintNotificationEventDetails.ABI::class)
@Signature("{e00e4c8a-4828-4da1-8bb8-8672df8515e7}")
@Guid("e00e4c8a48284da18bb88672df8515e7")
@WinRTInterface("e00e4c8a48284da18bb88672df8515e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPrintNotificationEventDetails.ByReference::class)
public interface IPrintNotificationEventDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrinterName(): String?

  @InterfaceMethod(1)
  public fun get_EventData(): String?

  @InterfaceMethod(2)
  public fun put_EventData(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPrintNotificationEventDetails> {
    public override fun getValue() = ABI.makeIPrintNotificationEventDetails(pointer.getPointer(0))

    public fun setValue(value: IPrintNotificationEventDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPrintNotificationEventDetails {
    public val __1264411620_Ptr: Pointer?

    public val _1264411620_VtblPtr: Pointer?
      get() = __1264411620_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrinterName(): String? {
      val fnPtr = _1264411620_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1264411620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EventData(): String? {
      val fnPtr = _1264411620_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1264411620_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_EventData(value: String?): Unit {
      val fnPtr = _1264411620_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1264411620_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPrintNotificationEventDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1264411620_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPrintNotificationEventDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e00e4c8a48284da18bb88672df8515e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPrintNotificationEventDetails(ptr: Pointer?): WithDefault =
        IPrintNotificationEventDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPrintNotificationEventDetails {
      val address = segment.toRawLongValue()
      return makeIPrintNotificationEventDetails(Pointer(address))
    }

    public override fun toNative(obj: IPrintNotificationEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1264411620_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPrintNotificationEventDetails):
        Array<IPrintNotificationEventDetails?> = (elements as
        Array<IPrintNotificationEventDetails?>).castToImpl<IPrintNotificationEventDetails,IPrintNotificationEventDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPrintNotificationEventDetails?> =
        arrayOfNulls<IPrintNotificationEventDetails_Impl>(size) as
        Array<IPrintNotificationEventDetails?>
  }
}
