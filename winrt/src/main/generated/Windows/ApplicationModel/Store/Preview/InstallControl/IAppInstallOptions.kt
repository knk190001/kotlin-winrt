package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.Management.Deployment.PackageVolume
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstallOptions.ABI::class)
@Signature("{c9808300-1cb8-4eb6-8c9f-6a30c64a5b51}")
@Guid("c98083001cb84eb68c9f6a30c64a5b51")
@WinRTInterface("c98083001cb84eb68c9f6a30c64a5b51")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallOptions.ByReference::class)
public interface IAppInstallOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CatalogId(): String?

  @InterfaceMethod(1)
  public fun put_CatalogId(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_ForceUseOfNonRemovableStorage(): Boolean

  @InterfaceMethod(3)
  public fun put_ForceUseOfNonRemovableStorage(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_AllowForcedAppRestart(): Boolean

  @InterfaceMethod(5)
  public fun put_AllowForcedAppRestart(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_Repair(): Boolean

  @InterfaceMethod(7)
  public fun put_Repair(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_TargetVolume(): PackageVolume?

  @InterfaceMethod(9)
  public fun put_TargetVolume(value: PackageVolume?): Unit

  @InterfaceMethod(10)
  public fun get_LaunchAfterInstall(): Boolean

  @InterfaceMethod(11)
  public fun put_LaunchAfterInstall(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallOptions> {
    public override fun getValue() = ABI.makeIAppInstallOptions(pointer.getPointer(0))

    public fun setValue(value: IAppInstallOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallOptions {
    public val __1275944486_Ptr: Pointer?

    public val _1275944486_VtblPtr: Pointer?
      get() = __1275944486_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CatalogId(): String? {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_CatalogId(value: String?): Unit {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_ForceUseOfNonRemovableStorage(): Boolean {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_ForceUseOfNonRemovableStorage(value: Boolean): Unit {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_AllowForcedAppRestart(): Boolean {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_AllowForcedAppRestart(value: Boolean): Unit {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Repair(): Boolean {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Repair(value: Boolean): Unit {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_TargetVolume(): PackageVolume? {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageVolume>()
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageVolume>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_TargetVolume(value: PackageVolume?): Unit {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_LaunchAfterInstall(): Boolean {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_LaunchAfterInstall(value: Boolean): Unit {
      val fnPtr = _1275944486_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1275944486_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstallOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1275944486_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c98083001cb84eb68c9f6a30c64a5b51")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallOptions(ptr: Pointer?): WithDefault = IAppInstallOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallOptions {
      val address = segment.toRawLongValue()
      return makeIAppInstallOptions(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1275944486_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallOptions): Array<IAppInstallOptions?> =
        (elements as
        Array<IAppInstallOptions?>).castToImpl<IAppInstallOptions,IAppInstallOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallOptions?> =
        arrayOfNulls<IAppInstallOptions_Impl>(size) as Array<IAppInstallOptions?>
  }
}
