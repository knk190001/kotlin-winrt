package Windows.UI.Notifications

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IToastNotificationActionTriggerDetail.ABI::class)
@Signature("{9445135a-38f3-42f6-96aa-7955b0f03da2}")
@Guid("9445135a38f342f696aa7955b0f03da2")
@WinRTInterface("9445135a38f342f696aa7955b0f03da2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToastNotificationActionTriggerDetail.ByReference::class)
public interface IToastNotificationActionTriggerDetail : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Argument(): String?

  @InterfaceMethod(1)
  public fun get_UserInput(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToastNotificationActionTriggerDetail> {
    public override fun getValue() =
        ABI.makeIToastNotificationActionTriggerDetail(pointer.getPointer(0))

    public fun setValue(value: IToastNotificationActionTriggerDetail_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToastNotificationActionTriggerDetail {
    public val __1979427825_Ptr: Pointer?

    public val _1979427825_VtblPtr: Pointer?
      get() = __1979427825_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Argument(): String? {
      val fnPtr = _1979427825_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1979427825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UserInput(): ValueSet? {
      val fnPtr = _1979427825_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__1979427825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IToastNotificationActionTriggerDetail_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1979427825_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToastNotificationActionTriggerDetail, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9445135a38f342f696aa7955b0f03da2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToastNotificationActionTriggerDetail(ptr: Pointer?): WithDefault =
        IToastNotificationActionTriggerDetail_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToastNotificationActionTriggerDetail {
      val address = segment.toRawLongValue()
      return makeIToastNotificationActionTriggerDetail(Pointer(address))
    }

    public override fun toNative(obj: IToastNotificationActionTriggerDetail): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1979427825_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToastNotificationActionTriggerDetail):
        Array<IToastNotificationActionTriggerDetail?> = (elements as
        Array<IToastNotificationActionTriggerDetail?>).castToImpl<IToastNotificationActionTriggerDetail,IToastNotificationActionTriggerDetail_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToastNotificationActionTriggerDetail?> =
        arrayOfNulls<IToastNotificationActionTriggerDetail_Impl>(size) as
        Array<IToastNotificationActionTriggerDetail?>
  }
}
