package Windows.Management.Deployment

import Windows.ApplicationModel.Package
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageVolume.ABI::class)
@Signature("{cf2672c3-1a40-4450-9739-2ace2e898853}")
@Guid("cf2672c31a40445097392ace2e898853")
@WinRTInterface("cf2672c31a40445097392ace2e898853")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageVolume.ByReference::class)
public interface IPackageVolume : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsOffline(): Boolean

  @InterfaceMethod(1)
  public fun get_IsSystemVolume(): Boolean

  @InterfaceMethod(2)
  public fun get_MountPoint(): String?

  @InterfaceMethod(3)
  public fun get_Name(): String?

  @InterfaceMethod(4)
  public fun get_PackageStorePath(): String?

  @InterfaceMethod(5)
  public fun get_SupportsHardLinks(): Boolean

  @InterfaceMethod(6)
  public fun FindPackages(): IVector<Package?>?

  @InterfaceMethod(7)
  public fun FindPackages(packageName: String?, packagePublisher: String?): IVector<Package?>?

  @InterfaceMethod(8)
  public fun FindPackages(packageFamilyName: String?): IVector<Package?>?

  @InterfaceMethod(9)
  public fun FindPackagesWithPackageTypes(packageTypes: PackageTypes?): IVector<Package?>?

  @InterfaceMethod(10)
  public fun FindPackagesWithPackageTypes(
    packageTypes: PackageTypes?,
    packageName: String?,
    packagePublisher: String?
  ): IVector<Package?>?

  @InterfaceMethod(11)
  public fun FindPackagesWithPackageTypes(packageTypes: PackageTypes?, packageFamilyName: String?):
      IVector<Package?>?

  @InterfaceMethod(12)
  public fun FindPackage(packageFullName: String?): IVector<Package?>?

  @InterfaceMethod(13)
  public fun FindPackagesForUser(userSecurityId: String?): IVector<Package?>?

  @InterfaceMethod(14)
  public fun FindPackagesForUser(
    userSecurityId: String?,
    packageName: String?,
    packagePublisher: String?
  ): IVector<Package?>?

  @InterfaceMethod(15)
  public fun FindPackagesForUser(userSecurityId: String?, packageFamilyName: String?):
      IVector<Package?>?

  @InterfaceMethod(16)
  public fun FindPackagesForUserWithPackageTypes(userSecurityId: String?,
      packageTypes: PackageTypes?): IVector<Package?>?

  @InterfaceMethod(17)
  public fun FindPackagesForUserWithPackageTypes(
    userSecurityId: String?,
    packageTypes: PackageTypes?,
    packageName: String?,
    packagePublisher: String?
  ): IVector<Package?>?

  @InterfaceMethod(18)
  public fun FindPackagesForUserWithPackageTypes(
    userSecurityId: String?,
    packageTypes: PackageTypes?,
    packageFamilyName: String?
  ): IVector<Package?>?

  @InterfaceMethod(19)
  public fun FindPackageForUser(userSecurityId: String?, packageFullName: String?):
      IVector<Package?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPackageVolume>
      {
    public override fun getValue() = ABI.makeIPackageVolume(pointer.getPointer(0))

    public fun setValue(value: IPackageVolume_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageVolume {
    public val __229549956_Ptr: Pointer?

    public val _229549956_VtblPtr: Pointer?
      get() = __229549956_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsOffline(): Boolean {
      val fnPtr = _229549956_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_IsSystemVolume(): Boolean {
      val fnPtr = _229549956_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_MountPoint(): String? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Name(): String? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_PackageStorePath(): String? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SupportsHardLinks(): Boolean {
      val fnPtr = _229549956_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun FindPackages(): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun FindPackages(packageName: String?, packagePublisher: String?):
        IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(packageName),
          marshalToNative(packagePublisher), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun FindPackages(packageFamilyName: String?): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun FindPackagesWithPackageTypes(packageTypes: PackageTypes?):
        IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(packageTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun FindPackagesWithPackageTypes(
      packageTypes: PackageTypes?,
      packageName: String?,
      packagePublisher: String?
    ): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(packageTypes),
          marshalToNative(packageName), marshalToNative(packagePublisher), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun FindPackagesWithPackageTypes(packageTypes: PackageTypes?,
        packageFamilyName: String?): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(packageTypes),
          marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun FindPackage(packageFullName: String?): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun FindPackagesForUser(userSecurityId: String?): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(userSecurityId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun FindPackagesForUser(
      userSecurityId: String?,
      packageName: String?,
      packagePublisher: String?
    ): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageName), marshalToNative(packagePublisher), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun FindPackagesForUser(userSecurityId: String?, packageFamilyName: String?):
        IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun FindPackagesForUserWithPackageTypes(userSecurityId: String?,
        packageTypes: PackageTypes?): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageTypes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun FindPackagesForUserWithPackageTypes(
      userSecurityId: String?,
      packageTypes: PackageTypes?,
      packageName: String?,
      packagePublisher: String?
    ): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageTypes), marshalToNative(packageName),
          marshalToNative(packagePublisher), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun FindPackagesForUserWithPackageTypes(
      userSecurityId: String?,
      packageTypes: PackageTypes?,
      packageFamilyName: String?
    ): IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageTypes), marshalToNative(packageFamilyName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun FindPackageForUser(userSecurityId: String?, packageFullName: String?):
        IVector<Package?>? {
      val fnPtr = _229549956_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Package?>>()
      val hr = fn.invokeHR(arrayOf(__229549956_Ptr, marshalToNative(userSecurityId),
          marshalToNative(packageFullName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Package?>>(result.getValue())
      return resultValue
    }
  }

  public class IPackageVolume_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __229549956_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageVolume, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf2672c31a40445097392ace2e898853")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageVolume(ptr: Pointer?): WithDefault = IPackageVolume_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageVolume {
      val address = segment.toRawLongValue()
      return makeIPackageVolume(Pointer(address))
    }

    public override fun toNative(obj: IPackageVolume): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__229549956_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageVolume): Array<IPackageVolume?> = (elements as
        Array<IPackageVolume?>).castToImpl<IPackageVolume,IPackageVolume_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageVolume?> =
        arrayOfNulls<IPackageVolume_Impl>(size) as Array<IPackageVolume?>
  }
}
