package Windows.System.UserProfile

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAdvertisingManagerForUser.ABI::class)
@Signature("{928bf3d0-cf7c-4ab0-a7dc-6dc5bcd44252}")
@Guid("928bf3d0cf7c4ab0a7dc6dc5bcd44252")
@WinRTInterface("928bf3d0cf7c4ab0a7dc6dc5bcd44252")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAdvertisingManagerForUser.ByReference::class)
public interface IAdvertisingManagerForUser : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AdvertisingId(): String?

  @InterfaceMethod(1)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAdvertisingManagerForUser> {
    public override fun getValue() = ABI.makeIAdvertisingManagerForUser(pointer.getPointer(0))

    public fun setValue(value: IAdvertisingManagerForUser_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAdvertisingManagerForUser {
    public val __1065562828_Ptr: Pointer?

    public val _1065562828_VtblPtr: Pointer?
      get() = __1065562828_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AdvertisingId(): String? {
      val fnPtr = _1065562828_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1065562828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _1065562828_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1065562828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IAdvertisingManagerForUser_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1065562828_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAdvertisingManagerForUser, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("928bf3d0cf7c4ab0a7dc6dc5bcd44252")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAdvertisingManagerForUser(ptr: Pointer?): WithDefault =
        IAdvertisingManagerForUser_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAdvertisingManagerForUser {
      val address = segment.toRawLongValue()
      return makeIAdvertisingManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: IAdvertisingManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1065562828_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAdvertisingManagerForUser):
        Array<IAdvertisingManagerForUser?> = (elements as
        Array<IAdvertisingManagerForUser?>).castToImpl<IAdvertisingManagerForUser,IAdvertisingManagerForUser_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAdvertisingManagerForUser?> =
        arrayOfNulls<IAdvertisingManagerForUser_Impl>(size) as Array<IAdvertisingManagerForUser?>
  }
}
