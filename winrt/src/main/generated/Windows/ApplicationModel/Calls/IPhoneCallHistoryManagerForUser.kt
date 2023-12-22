package Windows.ApplicationModel.Calls

import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IPhoneCallHistoryManagerForUser.ABI::class)
@Signature("{d925c523-f55f-4353-9db4-0205a5265a55}")
@Guid("d925c523f55f43539db40205a5265a55")
@WinRTInterface("d925c523f55f43539db40205a5265a55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryManagerForUser.ByReference::class)
public interface IPhoneCallHistoryManagerForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(accessType: PhoneCallHistoryStoreAccessType?):
      IAsyncOperation<PhoneCallHistoryStore?>?

  @InterfaceMethod(1)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryManagerForUser> {
    public override fun getValue() = ABI.makeIPhoneCallHistoryManagerForUser(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryManagerForUser {
    public val __1712544237_Ptr: Pointer?

    public val _1712544237_VtblPtr: Pointer?
      get() = __1712544237_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(accessType: PhoneCallHistoryStoreAccessType?):
        IAsyncOperation<PhoneCallHistoryStore?>? {
      val fnPtr = _1712544237_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallHistoryStore?>>()
      val hr = fn.invokeHR(arrayOf(__1712544237_Ptr, marshalToNative(accessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallHistoryStore?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _1712544237_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1712544237_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallHistoryManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1712544237_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d925c523f55f43539db40205a5265a55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryManagerForUser(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryManagerForUser {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1712544237_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryManagerForUser):
        Array<IPhoneCallHistoryManagerForUser?> = (elements as
        Array<IPhoneCallHistoryManagerForUser?>).castToImpl<IPhoneCallHistoryManagerForUser,IPhoneCallHistoryManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryManagerForUser?> =
        arrayOfNulls<IPhoneCallHistoryManagerForUser_Impl>(size) as
        Array<IPhoneCallHistoryManagerForUser?>
  }
}
