package Windows.Management.Deployment

import Windows.ApplicationModel.PackageVersion
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Uri
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
import com.sun.jna.platform.win32.WinDef
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutoUpdateSettingsOptions.ABI::class)
@Signature("{67491d87-35e1-512a-8968-1ae88d1be6d3}")
@Guid("67491d8735e1512a89681ae88d1be6d3")
@WinRTInterface("67491d8735e1512a89681ae88d1be6d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoUpdateSettingsOptions.ByReference::class)
public interface IAutoUpdateSettingsOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Version(): PackageVersion?

  @InterfaceMethod(1)
  public fun put_Version(value: PackageVersion?): Unit

  @InterfaceMethod(2)
  public fun get_AppInstallerUri(): Uri?

  @InterfaceMethod(3)
  public fun put_AppInstallerUri(value: Uri?): Unit

  @InterfaceMethod(4)
  public fun get_OnLaunch(): Boolean

  @InterfaceMethod(5)
  public fun put_OnLaunch(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_HoursBetweenUpdateChecks(): WinDef.UINT

  @InterfaceMethod(7)
  public fun put_HoursBetweenUpdateChecks(value: WinDef.UINT): Unit

  @InterfaceMethod(8)
  public fun get_ShowPrompt(): Boolean

  @InterfaceMethod(9)
  public fun put_ShowPrompt(value: Boolean): Unit

  @InterfaceMethod(10)
  public fun get_UpdateBlocksActivation(): Boolean

  @InterfaceMethod(11)
  public fun put_UpdateBlocksActivation(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_AutomaticBackgroundTask(): Boolean

  @InterfaceMethod(13)
  public fun put_AutomaticBackgroundTask(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_ForceUpdateFromAnyVersion(): Boolean

  @InterfaceMethod(15)
  public fun put_ForceUpdateFromAnyVersion(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_IsAutoRepairEnabled(): Boolean

  @InterfaceMethod(17)
  public fun put_IsAutoRepairEnabled(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_UpdateUris(): IVector<Uri?>?

  @InterfaceMethod(19)
  public fun get_RepairUris(): IVector<Uri?>?

  @InterfaceMethod(20)
  public fun get_DependencyPackageUris(): IVector<Uri?>?

  @InterfaceMethod(21)
  public fun get_OptionalPackageUris(): IVector<Uri?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoUpdateSettingsOptions> {
    public override fun getValue() = ABI.makeIAutoUpdateSettingsOptions(pointer.getPointer(0))

    public fun setValue(value: IAutoUpdateSettingsOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoUpdateSettingsOptions {
    public val __294232575_Ptr: Pointer?

    public val _294232575_VtblPtr: Pointer?
      get() = __294232575_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Version(): PackageVersion? {
      val fnPtr = _294232575_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageVersion>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageVersion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Version(value: PackageVersion?): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_AppInstallerUri(): Uri? {
      val fnPtr = _294232575_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_AppInstallerUri(value: Uri?): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_OnLaunch(): Boolean {
      val fnPtr = _294232575_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_OnLaunch(value: Boolean): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_HoursBetweenUpdateChecks(): WinDef.UINT {
      val fnPtr = _294232575_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_HoursBetweenUpdateChecks(value: WinDef.UINT): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ShowPrompt(): Boolean {
      val fnPtr = _294232575_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_ShowPrompt(value: Boolean): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_UpdateBlocksActivation(): Boolean {
      val fnPtr = _294232575_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_UpdateBlocksActivation(value: Boolean): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_AutomaticBackgroundTask(): Boolean {
      val fnPtr = _294232575_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_AutomaticBackgroundTask(value: Boolean): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ForceUpdateFromAnyVersion(): Boolean {
      val fnPtr = _294232575_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_ForceUpdateFromAnyVersion(value: Boolean): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_IsAutoRepairEnabled(): Boolean {
      val fnPtr = _294232575_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_IsAutoRepairEnabled(value: Boolean): Unit {
      val fnPtr = _294232575_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_UpdateUris(): IVector<Uri?>? {
      val fnPtr = _294232575_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_RepairUris(): IVector<Uri?>? {
      val fnPtr = _294232575_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_DependencyPackageUris(): IVector<Uri?>? {
      val fnPtr = _294232575_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun get_OptionalPackageUris(): IVector<Uri?>? {
      val fnPtr = _294232575_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__294232575_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }
  }

  public class IAutoUpdateSettingsOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __294232575_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoUpdateSettingsOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("67491d8735e1512a89681ae88d1be6d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoUpdateSettingsOptions(ptr: Pointer?): WithDefault =
        IAutoUpdateSettingsOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoUpdateSettingsOptions {
      val address = segment.toRawLongValue()
      return makeIAutoUpdateSettingsOptions(Pointer(address))
    }

    public override fun toNative(obj: IAutoUpdateSettingsOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__294232575_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoUpdateSettingsOptions):
        Array<IAutoUpdateSettingsOptions?> = (elements as
        Array<IAutoUpdateSettingsOptions?>).castToImpl<IAutoUpdateSettingsOptions,IAutoUpdateSettingsOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoUpdateSettingsOptions?> =
        arrayOfNulls<IAutoUpdateSettingsOptions_Impl>(size) as Array<IAutoUpdateSettingsOptions?>
  }
}
