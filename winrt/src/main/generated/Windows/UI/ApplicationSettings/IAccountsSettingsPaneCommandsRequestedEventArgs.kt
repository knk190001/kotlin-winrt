package Windows.UI.ApplicationSettings

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IAccountsSettingsPaneCommandsRequestedEventArgs.ABI::class)
@Signature("{3b68c099-db19-45d0-9abf-95d3773c9330}")
@Guid("3b68c099db1945d09abf95d3773c9330")
@WinRTInterface("3b68c099db1945d09abf95d3773c9330")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccountsSettingsPaneCommandsRequestedEventArgs.ByReference::class)
public interface IAccountsSettingsPaneCommandsRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_WebAccountProviderCommands(): IVector<WebAccountProviderCommand?>?

  @InterfaceMethod(1)
  public fun get_WebAccountCommands(): IVector<WebAccountCommand?>?

  @InterfaceMethod(2)
  public fun get_CredentialCommands(): IVector<CredentialCommand?>?

  @InterfaceMethod(3)
  public fun get_Commands(): IVector<SettingsCommand?>?

  @InterfaceMethod(4)
  public fun get_HeaderText(): String?

  @InterfaceMethod(5)
  public fun put_HeaderText(value: String?): Unit

  @InterfaceMethod(6)
  public fun GetDeferral(): AccountsSettingsPaneEventDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccountsSettingsPaneCommandsRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIAccountsSettingsPaneCommandsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAccountsSettingsPaneCommandsRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccountsSettingsPaneCommandsRequestedEventArgs {
    public val __745879897_Ptr: Pointer?

    public val _745879897_VtblPtr: Pointer?
      get() = __745879897_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_WebAccountProviderCommands(): IVector<WebAccountProviderCommand?>? {
      val fnPtr = _745879897_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WebAccountProviderCommand?>>()
      val hr = fn.invokeHR(arrayOf(__745879897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WebAccountProviderCommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_WebAccountCommands(): IVector<WebAccountCommand?>? {
      val fnPtr = _745879897_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<WebAccountCommand?>>()
      val hr = fn.invokeHR(arrayOf(__745879897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<WebAccountCommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CredentialCommands(): IVector<CredentialCommand?>? {
      val fnPtr = _745879897_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<CredentialCommand?>>()
      val hr = fn.invokeHR(arrayOf(__745879897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<CredentialCommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Commands(): IVector<SettingsCommand?>? {
      val fnPtr = _745879897_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SettingsCommand?>>()
      val hr = fn.invokeHR(arrayOf(__745879897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SettingsCommand?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_HeaderText(): String? {
      val fnPtr = _745879897_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__745879897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_HeaderText(value: String?): Unit {
      val fnPtr = _745879897_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__745879897_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetDeferral(): AccountsSettingsPaneEventDeferral? {
      val fnPtr = _745879897_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccountsSettingsPaneEventDeferral>()
      val hr = fn.invokeHR(arrayOf(__745879897_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccountsSettingsPaneEventDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IAccountsSettingsPaneCommandsRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __745879897_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccountsSettingsPaneCommandsRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b68c099db1945d09abf95d3773c9330")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccountsSettingsPaneCommandsRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAccountsSettingsPaneCommandsRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAccountsSettingsPaneCommandsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAccountsSettingsPaneCommandsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAccountsSettingsPaneCommandsRequestedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__745879897_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccountsSettingsPaneCommandsRequestedEventArgs):
        Array<IAccountsSettingsPaneCommandsRequestedEventArgs?> = (elements as
        Array<IAccountsSettingsPaneCommandsRequestedEventArgs?>).castToImpl<IAccountsSettingsPaneCommandsRequestedEventArgs,IAccountsSettingsPaneCommandsRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccountsSettingsPaneCommandsRequestedEventArgs?>
        = arrayOfNulls<IAccountsSettingsPaneCommandsRequestedEventArgs_Impl>(size) as
        Array<IAccountsSettingsPaneCommandsRequestedEventArgs?>
  }
}
