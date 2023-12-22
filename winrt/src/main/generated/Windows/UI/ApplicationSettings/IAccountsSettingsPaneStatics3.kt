package Windows.UI.ApplicationSettings

import Windows.Foundation.IAsyncAction
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

@ABIMarker(IAccountsSettingsPaneStatics3.ABI::class)
@Signature("{08410458-a2ba-4c6f-b4ac-48f514331216}")
@Guid("08410458a2ba4c6fb4ac48f514331216")
@WinRTInterface("08410458a2ba4c6fb4ac48f514331216")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccountsSettingsPaneStatics3.ByReference::class)
public interface IAccountsSettingsPaneStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ShowManageAccountsForUserAsync(user: User?): IAsyncAction?

  @InterfaceMethod(1)
  public fun ShowAddAccountForUserAsync(user: User?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccountsSettingsPaneStatics3> {
    public override fun getValue() = ABI.makeIAccountsSettingsPaneStatics3(pointer.getPointer(0))

    public fun setValue(value: IAccountsSettingsPaneStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccountsSettingsPaneStatics3 {
    public val __708718020_Ptr: Pointer?

    public val _708718020_VtblPtr: Pointer?
      get() = __708718020_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ShowManageAccountsForUserAsync(user: User?): IAsyncAction? {
      val fnPtr = _708718020_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__708718020_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ShowAddAccountForUserAsync(user: User?): IAsyncAction? {
      val fnPtr = _708718020_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__708718020_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IAccountsSettingsPaneStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __708718020_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccountsSettingsPaneStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("08410458a2ba4c6fb4ac48f514331216")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccountsSettingsPaneStatics3(ptr: Pointer?): WithDefault =
        IAccountsSettingsPaneStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccountsSettingsPaneStatics3 {
      val address = segment.toRawLongValue()
      return makeIAccountsSettingsPaneStatics3(Pointer(address))
    }

    public override fun toNative(obj: IAccountsSettingsPaneStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__708718020_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccountsSettingsPaneStatics3):
        Array<IAccountsSettingsPaneStatics3?> = (elements as
        Array<IAccountsSettingsPaneStatics3?>).castToImpl<IAccountsSettingsPaneStatics3,IAccountsSettingsPaneStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccountsSettingsPaneStatics3?> =
        arrayOfNulls<IAccountsSettingsPaneStatics3_Impl>(size) as
        Array<IAccountsSettingsPaneStatics3?>
  }
}
