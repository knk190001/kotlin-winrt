package Windows.ApplicationModel.Calls

import Windows.System.User
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

@ABIMarker(IPhoneCallHistoryManagerStatics2.ABI::class)
@Signature("{efd474f0-a2db-4188-9e92-bc3cfa6813cf}")
@Guid("efd474f0a2db41889e92bc3cfa6813cf")
@WinRTInterface("efd474f0a2db41889e92bc3cfa6813cf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryManagerStatics2.ByReference::class)
public interface IPhoneCallHistoryManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): PhoneCallHistoryManagerForUser?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryManagerStatics2> {
    public override fun getValue() = ABI.makeIPhoneCallHistoryManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryManagerStatics2 {
    public val __1879820684_Ptr: Pointer?

    public val _1879820684_VtblPtr: Pointer?
      get() = __1879820684_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): PhoneCallHistoryManagerForUser? {
      val fnPtr = _1879820684_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryManagerForUser>()
      val hr = fn.invokeHR(arrayOf(__1879820684_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistoryManagerForUser>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallHistoryManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1879820684_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efd474f0a2db41889e92bc3cfa6813cf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryManagerStatics2(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1879820684_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryManagerStatics2):
        Array<IPhoneCallHistoryManagerStatics2?> = (elements as
        Array<IPhoneCallHistoryManagerStatics2?>).castToImpl<IPhoneCallHistoryManagerStatics2,IPhoneCallHistoryManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryManagerStatics2?> =
        arrayOfNulls<IPhoneCallHistoryManagerStatics2_Impl>(size) as
        Array<IPhoneCallHistoryManagerStatics2?>
  }
}
