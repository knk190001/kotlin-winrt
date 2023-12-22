package Windows.Networking.NetworkOperators

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

@ABIMarker(INetworkOperatorDataUsageTriggerDetails.ABI::class)
@Signature("{50e3126d-a465-4eeb-9317-28a167630cea}")
@Guid("50e3126da4654eeb931728a167630cea")
@WinRTInterface("50e3126da4654eeb931728a167630cea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INetworkOperatorDataUsageTriggerDetails.ByReference::class)
public interface INetworkOperatorDataUsageTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NotificationKind(): NetworkOperatorDataUsageNotificationKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INetworkOperatorDataUsageTriggerDetails> {
    public override fun getValue() =
        ABI.makeINetworkOperatorDataUsageTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: INetworkOperatorDataUsageTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INetworkOperatorDataUsageTriggerDetails {
    public val __1541749944_Ptr: Pointer?

    public val _1541749944_VtblPtr: Pointer?
      get() = __1541749944_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NotificationKind(): NetworkOperatorDataUsageNotificationKind? {
      val fnPtr = _1541749944_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NetworkOperatorDataUsageNotificationKind>()
      val hr = fn.invokeHR(arrayOf(__1541749944_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<NetworkOperatorDataUsageNotificationKind>(result.getValue())
      return resultValue
    }
  }

  public class INetworkOperatorDataUsageTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1541749944_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INetworkOperatorDataUsageTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50e3126da4654eeb931728a167630cea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINetworkOperatorDataUsageTriggerDetails(ptr: Pointer?): WithDefault =
        INetworkOperatorDataUsageTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        INetworkOperatorDataUsageTriggerDetails {
      val address = segment.toRawLongValue()
      return makeINetworkOperatorDataUsageTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: INetworkOperatorDataUsageTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1541749944_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INetworkOperatorDataUsageTriggerDetails):
        Array<INetworkOperatorDataUsageTriggerDetails?> = (elements as
        Array<INetworkOperatorDataUsageTriggerDetails?>).castToImpl<INetworkOperatorDataUsageTriggerDetails,INetworkOperatorDataUsageTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INetworkOperatorDataUsageTriggerDetails?> =
        arrayOfNulls<INetworkOperatorDataUsageTriggerDetails_Impl>(size) as
        Array<INetworkOperatorDataUsageTriggerDetails?>
  }
}
