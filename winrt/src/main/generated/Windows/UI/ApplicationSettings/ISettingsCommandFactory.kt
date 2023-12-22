package Windows.UI.ApplicationSettings

import Windows.UI.Popups.UICommandInvokedHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(ISettingsCommandFactory.ABI::class)
@Signature("{68e15b33-1c83-433a-aa5a-ceeea5bd4764}")
@Guid("68e15b331c83433aaa5aceeea5bd4764")
@WinRTInterface("68e15b331c83433aaa5aceeea5bd4764")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsCommandFactory.ByReference::class)
public interface ISettingsCommandFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateSettingsCommand(
    settingsCommandId: IUnknown?,
    label: String?,
    handler: UICommandInvokedHandler?
  ): SettingsCommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsCommandFactory> {
    public override fun getValue() = ABI.makeISettingsCommandFactory(pointer.getPointer(0))

    public fun setValue(value: ISettingsCommandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsCommandFactory {
    public val __854454681_Ptr: Pointer?

    public val _854454681_VtblPtr: Pointer?
      get() = __854454681_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateSettingsCommand(
      settingsCommandId: IUnknown?,
      label: String?,
      handler: UICommandInvokedHandler?
    ): SettingsCommand? {
      val fnPtr = _854454681_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsCommand>()
      val hr = fn.invokeHR(arrayOf(__854454681_Ptr, marshalToNative(settingsCommandId),
          marshalToNative(label), marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsCommand>(result.getValue())
      return resultValue
    }
  }

  public class ISettingsCommandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __854454681_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsCommandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68e15b331c83433aaa5aceeea5bd4764")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsCommandFactory(ptr: Pointer?): WithDefault =
        ISettingsCommandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISettingsCommandFactory {
      val address = segment.toRawLongValue()
      return makeISettingsCommandFactory(Pointer(address))
    }

    public override fun toNative(obj: ISettingsCommandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__854454681_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsCommandFactory): Array<ISettingsCommandFactory?>
        = (elements as
        Array<ISettingsCommandFactory?>).castToImpl<ISettingsCommandFactory,ISettingsCommandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsCommandFactory?> =
        arrayOfNulls<ISettingsCommandFactory_Impl>(size) as Array<ISettingsCommandFactory?>
  }
}
