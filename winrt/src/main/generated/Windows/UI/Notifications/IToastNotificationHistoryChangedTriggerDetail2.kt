package Windows.UI.Notifications

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

@ABIMarker(IToastNotificationHistoryChangedTriggerDetail2.ABI::class)
@Signature("{0b36e982-c871-49fb-babb-25bdbc4cc45b}")
@Guid("0b36e982c87149fbbabb25bdbc4cc45b")
@WinRTInterface("0b36e982c87149fbbabb25bdbc4cc45b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationHistoryChangedTriggerDetail2.ByReference::class)
public interface IToastNotificationHistoryChangedTriggerDetail2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CollectionId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationHistoryChangedTriggerDetail2> {
    public override fun getValue() =
        ABI.makeIToastNotificationHistoryChangedTriggerDetail2(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationHistoryChangedTriggerDetail2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationHistoryChangedTriggerDetail2 {
    public val __26628139_Ptr: Pointer?

    public val _26628139_VtblPtr: Pointer?
      get() = __26628139_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CollectionId(): String? {
      val fnPtr = _26628139_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__26628139_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationHistoryChangedTriggerDetail2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __26628139_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationHistoryChangedTriggerDetail2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b36e982c87149fbbabb25bdbc4cc45b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationHistoryChangedTriggerDetail2(ptr: Pointer?): WithDefault =
        IToastNotificationHistoryChangedTriggerDetail2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IToastNotificationHistoryChangedTriggerDetail2 {
      val address = segment.toRawLongValue()
      return makeIToastNotificationHistoryChangedTriggerDetail2(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationHistoryChangedTriggerDetail2): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__26628139_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationHistoryChangedTriggerDetail2):
        Array<IToastNotificationHistoryChangedTriggerDetail2?> = (elements as
        Array<IToastNotificationHistoryChangedTriggerDetail2?>).castToImpl<IToastNotificationHistoryChangedTriggerDetail2,IToastNotificationHistoryChangedTriggerDetail2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationHistoryChangedTriggerDetail2?> =
        arrayOfNulls<IToastNotificationHistoryChangedTriggerDetail2_Impl>(size) as
        Array<IToastNotificationHistoryChangedTriggerDetail2?>
  }
}
