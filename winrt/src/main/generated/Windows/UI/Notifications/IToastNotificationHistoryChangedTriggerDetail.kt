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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IToastNotificationHistoryChangedTriggerDetail.ABI::class)
@Signature("{db037ffa-0068-412c-9c83-267c37f65670}")
@Guid("db037ffa0068412c9c83267c37f65670")
@WinRTInterface("db037ffa0068412c9c83267c37f65670")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationHistoryChangedTriggerDetail.ByReference::class)
public interface IToastNotificationHistoryChangedTriggerDetail : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ChangeType(): ToastHistoryChangedType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationHistoryChangedTriggerDetail> {
    public override fun getValue() =
        ABI.makeIToastNotificationHistoryChangedTriggerDetail(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationHistoryChangedTriggerDetail_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationHistoryChangedTriggerDetail {
    public val __416500967_Ptr: Pointer?

    public val _416500967_VtblPtr: Pointer?
      get() = __416500967_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ChangeType(): ToastHistoryChangedType? {
      val fnPtr = _416500967_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastHistoryChangedType>()
      val hr = fn.invokeHR(arrayOf(__416500967_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastHistoryChangedType>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationHistoryChangedTriggerDetail_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __416500967_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationHistoryChangedTriggerDetail, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db037ffa0068412c9c83267c37f65670")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationHistoryChangedTriggerDetail(ptr: Pointer?): WithDefault =
        IToastNotificationHistoryChangedTriggerDetail_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IToastNotificationHistoryChangedTriggerDetail {
      val address = segment.toRawLongValue()
      return makeIToastNotificationHistoryChangedTriggerDetail(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationHistoryChangedTriggerDetail): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__416500967_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationHistoryChangedTriggerDetail):
        Array<IToastNotificationHistoryChangedTriggerDetail?> = (elements as
        Array<IToastNotificationHistoryChangedTriggerDetail?>).castToImpl<IToastNotificationHistoryChangedTriggerDetail,IToastNotificationHistoryChangedTriggerDetail_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationHistoryChangedTriggerDetail?> =
        arrayOfNulls<IToastNotificationHistoryChangedTriggerDetail_Impl>(size) as
        Array<IToastNotificationHistoryChangedTriggerDetail?>
  }
}
