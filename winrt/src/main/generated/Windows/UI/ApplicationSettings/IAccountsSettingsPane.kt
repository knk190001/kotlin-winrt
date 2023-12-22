package Windows.UI.ApplicationSettings

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(IAccountsSettingsPane.ABI::class)
@Signature("{81ea942c-4f09-4406-a538-838d9b14b7e6}")
@Guid("81ea942c4f094406a538838d9b14b7e6")
@WinRTInterface("81ea942c4f094406a538838d9b14b7e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccountsSettingsPane.ByReference::class)
public interface IAccountsSettingsPane : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_AccountCommandsRequested(handler: TypedEventHandler<AccountsSettingsPane?,
      AccountsSettingsPaneCommandsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_AccountCommandsRequested(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccountsSettingsPane> {
    public override fun getValue() = ABI.makeIAccountsSettingsPane(pointer.getPointer(0))

    public fun setValue(value: IAccountsSettingsPane_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccountsSettingsPane {
    public val __1512257898_Ptr: Pointer?

    public val _1512257898_VtblPtr: Pointer?
      get() = __1512257898_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_AccountCommandsRequested(handler: TypedEventHandler<AccountsSettingsPane?,
        AccountsSettingsPaneCommandsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1512257898_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1512257898_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_AccountCommandsRequested(cookie: EventRegistrationToken?): Unit {
      val fnPtr = _1512257898_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1512257898_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccountsSettingsPane_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1512257898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccountsSettingsPane, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81ea942c4f094406a538838d9b14b7e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccountsSettingsPane(ptr: Pointer?): WithDefault =
        IAccountsSettingsPane_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccountsSettingsPane {
      val address = segment.toRawLongValue()
      return makeIAccountsSettingsPane(Pointer(address))
    }

    public override fun toNative(obj: IAccountsSettingsPane): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1512257898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccountsSettingsPane): Array<IAccountsSettingsPane?> =
        (elements as
        Array<IAccountsSettingsPane?>).castToImpl<IAccountsSettingsPane,IAccountsSettingsPane_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccountsSettingsPane?> =
        arrayOfNulls<IAccountsSettingsPane_Impl>(size) as Array<IAccountsSettingsPane?>
  }
}
