package Windows.Management.Deployment

import Windows.Foundation.DateTime
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

@ABIMarker(IAppInstallerManager.ABI::class)
@Signature("{e7ee21c3-2103-53ee-9b18-68afeab0033d}")
@Guid("e7ee21c3210353ee9b1868afeab0033d")
@WinRTInterface("e7ee21c3210353ee9b1868afeab0033d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallerManager.ByReference::class)
public interface IAppInstallerManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetAutoUpdateSettings(packageFamilyName: String?,
      appInstallerInfo: AutoUpdateSettingsOptions?): Unit

  @InterfaceMethod(1)
  public fun ClearAutoUpdateSettings(packageFamilyName: String?): Unit

  @InterfaceMethod(2)
  public fun PauseAutoUpdatesUntil(packageFamilyName: String?, dateTime: DateTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallerManager> {
    public override fun getValue() = ABI.makeIAppInstallerManager(pointer.getPointer(0))

    public fun setValue(value: IAppInstallerManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallerManager {
    public val __1078209598_Ptr: Pointer?

    public val _1078209598_VtblPtr: Pointer?
      get() = __1078209598_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetAutoUpdateSettings(packageFamilyName: String?,
        appInstallerInfo: AutoUpdateSettingsOptions?): Unit {
      val fnPtr = _1078209598_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1078209598_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(appInstallerInfo),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun ClearAutoUpdateSettings(packageFamilyName: String?): Unit {
      val fnPtr = _1078209598_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1078209598_Ptr, marshalToNative(packageFamilyName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun PauseAutoUpdatesUntil(packageFamilyName: String?, dateTime: DateTime?):
        Unit {
      val fnPtr = _1078209598_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1078209598_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(dateTime),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstallerManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1078209598_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallerManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7ee21c3210353ee9b1868afeab0033d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallerManager(ptr: Pointer?): WithDefault = IAppInstallerManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallerManager {
      val address = segment.toRawLongValue()
      return makeIAppInstallerManager(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallerManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1078209598_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallerManager): Array<IAppInstallerManager?> =
        (elements as
        Array<IAppInstallerManager?>).castToImpl<IAppInstallerManager,IAppInstallerManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallerManager?> =
        arrayOfNulls<IAppInstallerManager_Impl>(size) as Array<IAppInstallerManager?>
  }
}
