package Windows.ApplicationModel.UserDataTasks

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

@ABIMarker(IUserDataTaskManagerStatics.ABI::class)
@Signature("{b35539f8-c502-47fc-a81e-100883719d55}")
@Guid("b35539f8c50247fca81e100883719d55")
@WinRTInterface("b35539f8c50247fca81e100883719d55")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataTaskManagerStatics.ByReference::class)
public interface IUserDataTaskManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): UserDataTaskManager?

  @InterfaceMethod(1)
  public fun GetForUser(user: User?): UserDataTaskManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataTaskManagerStatics> {
    public override fun getValue() = ABI.makeIUserDataTaskManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IUserDataTaskManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataTaskManagerStatics {
    public val __2110332684_Ptr: Pointer?

    public val _2110332684_VtblPtr: Pointer?
      get() = __2110332684_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): UserDataTaskManager? {
      val fnPtr = _2110332684_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskManager>()
      val hr = fn.invokeHR(arrayOf(__2110332684_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetForUser(user: User?): UserDataTaskManager? {
      val fnPtr = _2110332684_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataTaskManager>()
      val hr = fn.invokeHR(arrayOf(__2110332684_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataTaskManager>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataTaskManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2110332684_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataTaskManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b35539f8c50247fca81e100883719d55")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataTaskManagerStatics(ptr: Pointer?): WithDefault =
        IUserDataTaskManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataTaskManagerStatics {
      val address = segment.toRawLongValue()
      return makeIUserDataTaskManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserDataTaskManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2110332684_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataTaskManagerStatics):
        Array<IUserDataTaskManagerStatics?> = (elements as
        Array<IUserDataTaskManagerStatics?>).castToImpl<IUserDataTaskManagerStatics,IUserDataTaskManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataTaskManagerStatics?> =
        arrayOfNulls<IUserDataTaskManagerStatics_Impl>(size) as Array<IUserDataTaskManagerStatics?>
  }
}
