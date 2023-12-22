package Windows.Management.Deployment

import Windows.ApplicationModel.AppInstallerInfo
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

@ABIMarker(IAutoUpdateSettingsOptionsStatics.ABI::class)
@Signature("{887b337d-0c05-54d0-bd49-3bb7a2c084cb}")
@Guid("887b337d0c0554d0bd493bb7a2c084cb")
@WinRTInterface("887b337d0c0554d0bd493bb7a2c084cb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoUpdateSettingsOptionsStatics.ByReference::class)
public interface IAutoUpdateSettingsOptionsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromAppInstallerInfo(appInstallerInfo: AppInstallerInfo?):
      AutoUpdateSettingsOptions?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoUpdateSettingsOptionsStatics> {
    public override fun getValue() =
        ABI.makeIAutoUpdateSettingsOptionsStatics(pointer.getPointer(0))

    public fun setValue(value: IAutoUpdateSettingsOptionsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoUpdateSettingsOptionsStatics {
    public val __620787514_Ptr: Pointer?

    public val _620787514_VtblPtr: Pointer?
      get() = __620787514_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromAppInstallerInfo(appInstallerInfo: AppInstallerInfo?):
        AutoUpdateSettingsOptions? {
      val fnPtr = _620787514_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutoUpdateSettingsOptions>()
      val hr = fn.invokeHR(arrayOf(__620787514_Ptr, marshalToNative(appInstallerInfo), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutoUpdateSettingsOptions>(result.getValue())
      return resultValue
    }
  }

  public class IAutoUpdateSettingsOptionsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __620787514_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoUpdateSettingsOptionsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("887b337d0c0554d0bd493bb7a2c084cb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoUpdateSettingsOptionsStatics(ptr: Pointer?): WithDefault =
        IAutoUpdateSettingsOptionsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoUpdateSettingsOptionsStatics {
      val address = segment.toRawLongValue()
      return makeIAutoUpdateSettingsOptionsStatics(Pointer(address))
    }

    public override fun toNative(obj: IAutoUpdateSettingsOptionsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__620787514_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoUpdateSettingsOptionsStatics):
        Array<IAutoUpdateSettingsOptionsStatics?> = (elements as
        Array<IAutoUpdateSettingsOptionsStatics?>).castToImpl<IAutoUpdateSettingsOptionsStatics,IAutoUpdateSettingsOptionsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoUpdateSettingsOptionsStatics?> =
        arrayOfNulls<IAutoUpdateSettingsOptionsStatics_Impl>(size) as
        Array<IAutoUpdateSettingsOptionsStatics?>
  }
}
