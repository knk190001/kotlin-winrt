package Windows.Networking.Sockets

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

@ABIMarker(IControlChannelTriggerResetEventDetails.ABI::class)
@Signature("{6851038e-8ec4-42fe-9bb2-21e91b7bfcb1}")
@Guid("6851038e8ec442fe9bb221e91b7bfcb1")
@WinRTInterface("6851038e8ec442fe9bb221e91b7bfcb1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IControlChannelTriggerResetEventDetails.ByReference::class)
public interface IControlChannelTriggerResetEventDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ResetReason(): ControlChannelTriggerResetReason?

  @InterfaceMethod(1)
  public fun get_HardwareSlotReset(): Boolean

  @InterfaceMethod(2)
  public fun get_SoftwareSlotReset(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IControlChannelTriggerResetEventDetails> {
    public override fun getValue() =
        ABI.makeIControlChannelTriggerResetEventDetails(pointer.getPointer(0))

    public fun setValue(value: IControlChannelTriggerResetEventDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IControlChannelTriggerResetEventDetails {
    public val __1486084637_Ptr: Pointer?

    public val _1486084637_VtblPtr: Pointer?
      get() = __1486084637_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ResetReason(): ControlChannelTriggerResetReason? {
      val fnPtr = _1486084637_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ControlChannelTriggerResetReason>()
      val hr = fn.invokeHR(arrayOf(__1486084637_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ControlChannelTriggerResetReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_HardwareSlotReset(): Boolean {
      val fnPtr = _1486084637_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1486084637_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_SoftwareSlotReset(): Boolean {
      val fnPtr = _1486084637_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1486084637_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IControlChannelTriggerResetEventDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1486084637_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IControlChannelTriggerResetEventDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6851038e8ec442fe9bb221e91b7bfcb1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIControlChannelTriggerResetEventDetails(ptr: Pointer?): WithDefault =
        IControlChannelTriggerResetEventDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IControlChannelTriggerResetEventDetails {
      val address = segment.toRawLongValue()
      return makeIControlChannelTriggerResetEventDetails(Pointer(address))
    }

    public override fun toNative(obj: IControlChannelTriggerResetEventDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1486084637_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IControlChannelTriggerResetEventDetails):
        Array<IControlChannelTriggerResetEventDetails?> = (elements as
        Array<IControlChannelTriggerResetEventDetails?>).castToImpl<IControlChannelTriggerResetEventDetails,IControlChannelTriggerResetEventDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IControlChannelTriggerResetEventDetails?> =
        arrayOfNulls<IControlChannelTriggerResetEventDetails_Impl>(size) as
        Array<IControlChannelTriggerResetEventDetails?>
  }
}
