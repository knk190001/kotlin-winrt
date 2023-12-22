package Windows.UI.ApplicationSettings

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

@ABIMarker(IAccountsSettingsPaneCommandsRequestedEventArgs2.ABI::class)
@Signature("{362f7bad-4e37-4967-8c40-e78ee7a1e5bb}")
@Guid("362f7bad4e3749678c40e78ee7a1e5bb")
@WinRTInterface("362f7bad4e3749678c40e78ee7a1e5bb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccountsSettingsPaneCommandsRequestedEventArgs2.ByReference::class)
public interface IAccountsSettingsPaneCommandsRequestedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccountsSettingsPaneCommandsRequestedEventArgs2> {
    public override fun getValue() =
        ABI.makeIAccountsSettingsPaneCommandsRequestedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IAccountsSettingsPaneCommandsRequestedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccountsSettingsPaneCommandsRequestedEventArgs2 {
    public val __1647440277_Ptr: Pointer?

    public val _1647440277_VtblPtr: Pointer?
      get() = __1647440277_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _1647440277_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1647440277_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IAccountsSettingsPaneCommandsRequestedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1647440277_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccountsSettingsPaneCommandsRequestedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("362f7bad4e3749678c40e78ee7a1e5bb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccountsSettingsPaneCommandsRequestedEventArgs2(ptr: Pointer?): WithDefault =
        IAccountsSettingsPaneCommandsRequestedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAccountsSettingsPaneCommandsRequestedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIAccountsSettingsPaneCommandsRequestedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IAccountsSettingsPaneCommandsRequestedEventArgs2):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1647440277_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccountsSettingsPaneCommandsRequestedEventArgs2):
        Array<IAccountsSettingsPaneCommandsRequestedEventArgs2?> = (elements as
        Array<IAccountsSettingsPaneCommandsRequestedEventArgs2?>).castToImpl<IAccountsSettingsPaneCommandsRequestedEventArgs2,IAccountsSettingsPaneCommandsRequestedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccountsSettingsPaneCommandsRequestedEventArgs2?>
        = arrayOfNulls<IAccountsSettingsPaneCommandsRequestedEventArgs2_Impl>(size) as
        Array<IAccountsSettingsPaneCommandsRequestedEventArgs2?>
  }
}
