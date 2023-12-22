package Windows.ApplicationModel.UserDataTasks.DataProvider

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

@ABIMarker(IUserDataTaskDataProviderTriggerDetails.ABI::class)
@Signature("{ae273202-b1c9-453e-afc5-b30af3bd217d}")
@Guid("ae273202b1c9453eafc5b30af3bd217d")
@WinRTInterface("ae273202b1c9453eafc5b30af3bd217d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskDataProviderTriggerDetails.ByReference::class)
public interface IUserDataTaskDataProviderTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Connection(): UserDataTaskDataProviderConnection?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskDataProviderTriggerDetails> {
    public override fun getValue() =
        ABI.makeIUserDataTaskDataProviderTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskDataProviderTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskDataProviderTriggerDetails {
    public val __164107726_Ptr: Pointer?

    public val _164107726_VtblPtr: Pointer?
      get() = __164107726_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Connection(): UserDataTaskDataProviderConnection? {
      val fnPtr = _164107726_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskDataProviderConnection>()
      val hr = fn.invokeHR(arrayOf(__164107726_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskDataProviderConnection>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskDataProviderTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __164107726_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskDataProviderTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ae273202b1c9453eafc5b30af3bd217d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskDataProviderTriggerDetails(ptr: Pointer?): WithDefault =
        IUserDataTaskDataProviderTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUserDataTaskDataProviderTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskDataProviderTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskDataProviderTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__164107726_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskDataProviderTriggerDetails):
        Array<IUserDataTaskDataProviderTriggerDetails?> = (elements as
        Array<IUserDataTaskDataProviderTriggerDetails?>).castToImpl<IUserDataTaskDataProviderTriggerDetails,IUserDataTaskDataProviderTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskDataProviderTriggerDetails?> =
        arrayOfNulls<IUserDataTaskDataProviderTriggerDetails_Impl>(size) as
        Array<IUserDataTaskDataProviderTriggerDetails?>
  }
}
