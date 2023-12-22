package Windows.Storage

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

@ABIMarker(IUserDataPathsStatics.ABI::class)
@Signature("{01b29def-e062-48a1-8b0c-f2c7a9ca56c0}")
@Guid("01b29defe06248a18b0cf2c7a9ca56c0")
@WinRTInterface("01b29defe06248a18b0cf2c7a9ca56c0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataPathsStatics.ByReference::class)
public interface IUserDataPathsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForUser(user: User?): UserDataPaths?

  @InterfaceMethod(1)
  public fun GetDefault(): UserDataPaths?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataPathsStatics> {
    public override fun getValue() = ABI.makeIUserDataPathsStatics(pointer.getPointer(0))

    public fun setValue(value: IUserDataPathsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataPathsStatics {
    public val __596763589_Ptr: Pointer?

    public val _596763589_VtblPtr: Pointer?
      get() = __596763589_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForUser(user: User?): UserDataPaths? {
      val fnPtr = _596763589_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataPaths>()
      val hr = fn.invokeHR(arrayOf(__596763589_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataPaths>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDefault(): UserDataPaths? {
      val fnPtr = _596763589_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserDataPaths>()
      val hr = fn.invokeHR(arrayOf(__596763589_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserDataPaths>(result.getValue())
      return resultValue
    }
  }

  public class IUserDataPathsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __596763589_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataPathsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("01b29defe06248a18b0cf2c7a9ca56c0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataPathsStatics(ptr: Pointer?): WithDefault =
        IUserDataPathsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataPathsStatics {
      val address = segment.toRawLongValue()
      return makeIUserDataPathsStatics(Pointer(address))
    }

    public override fun toNative(obj: IUserDataPathsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__596763589_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataPathsStatics): Array<IUserDataPathsStatics?> =
        (elements as
        Array<IUserDataPathsStatics?>).castToImpl<IUserDataPathsStatics,IUserDataPathsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataPathsStatics?> =
        arrayOfNulls<IUserDataPathsStatics_Impl>(size) as Array<IUserDataPathsStatics?>
  }
}
