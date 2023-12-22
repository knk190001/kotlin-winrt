package Windows.Security.DataProtection

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

@ABIMarker(IUserDataProtectionManagerStatics.ABI::class)
@Signature("{977780e8-6dce-4fae-af85-782ac2cf4572}")
@Guid("977780e86dce4faeaf85782ac2cf4572")
@WinRTInterface("977780e86dce4faeaf85782ac2cf4572")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataProtectionManagerStatics.ByReference::class)
public interface IUserDataProtectionManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryGetDefault(): UserDataProtectionManager?

  @InterfaceMethod(1)
  public fun TryGetForUser(user: User?): UserDataProtectionManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataProtectionManagerStatics> {
    public override fun getValue() =
        ABI.makeIUserDataProtectionManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IUserDataProtectionManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataProtectionManagerStatics {
    public val __968470249_Ptr: Pointer?

    public val _968470249_VtblPtr: Pointer?
      get() = __968470249_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryGetDefault(): UserDataProtectionManager? {
      val fnPtr = _968470249_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataProtectionManager>()
      val hr = fn.invokeHR(arrayOf(__968470249_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataProtectionManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryGetForUser(user: User?): UserDataProtectionManager? {
      val fnPtr = _968470249_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataProtectionManager>()
      val hr = fn.invokeHR(arrayOf(__968470249_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataProtectionManager>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataProtectionManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __968470249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataProtectionManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("977780e86dce4faeaf85782ac2cf4572")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataProtectionManagerStatics(ptr: Pointer?): WithDefault =
        IUserDataProtectionManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataProtectionManagerStatics {
      val address = segment.toRawLongValue()
      return makeIUserDataProtectionManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserDataProtectionManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__968470249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataProtectionManagerStatics):
        Array<IUserDataProtectionManagerStatics?> = (elements as
        Array<IUserDataProtectionManagerStatics?>).castToImpl<IUserDataProtectionManagerStatics,IUserDataProtectionManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataProtectionManagerStatics?> =
        arrayOfNulls<IUserDataProtectionManagerStatics_Impl>(size) as
        Array<IUserDataProtectionManagerStatics?>
  }
}
