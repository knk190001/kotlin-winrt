package Microsoft.Windows.ApplicationModel.DynamicDependency

import Windows.ApplicationModel.PackageVersion
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageDependencyStatics.ABI::class)
@Signature("{17b656e1-1a58-5f3c-84a8-4430f6e749c2}")
@Guid("17b656e11a585f3c84a84430f6e749c2")
@WinRTInterface("17b656e11a585f3c84a84430f6e749c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageDependencyStatics.ByReference::class)
public interface IPackageDependencyStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFromId(id: String?): PackageDependency?

  @InterfaceMethod(1)
  public fun GetFromIdForSystem(id: String?): PackageDependency?

  @InterfaceMethod(2)
  public fun Create(packageFamilyName: String?, minVersion: PackageVersion?): PackageDependency?

  @InterfaceMethod(3)
  public fun Create(
    packageFamilyName: String?,
    minVersion: PackageVersion?,
    options: CreatePackageDependencyOptions?
  ): PackageDependency?

  @InterfaceMethod(4)
  public fun CreateForSystem(
    packageFamilyName: String?,
    minVersion: PackageVersion?,
    options: CreatePackageDependencyOptions?
  ): PackageDependency?

  @InterfaceMethod(5)
  public fun get_GenerationId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageDependencyStatics> {
    public override fun getValue() = ABI.makeIPackageDependencyStatics(pointer.getPointer(0))

    public fun setValue(value: IPackageDependencyStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageDependencyStatics {
    public val __1238039235_Ptr: Pointer?

    public val _1238039235_VtblPtr: Pointer?
      get() = __1238039235_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFromId(id: String?): PackageDependency? {
      val fnPtr = _1238039235_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependency>()
      val hr = fn.invokeHR(arrayOf(__1238039235_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageDependency>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetFromIdForSystem(id: String?): PackageDependency? {
      val fnPtr = _1238039235_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependency>()
      val hr = fn.invokeHR(arrayOf(__1238039235_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageDependency>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun Create(packageFamilyName: String?, minVersion: PackageVersion?):
        PackageDependency? {
      val fnPtr = _1238039235_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependency>()
      val hr = fn.invokeHR(arrayOf(__1238039235_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(minVersion), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageDependency>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun Create(
      packageFamilyName: String?,
      minVersion: PackageVersion?,
      options: CreatePackageDependencyOptions?
    ): PackageDependency? {
      val fnPtr = _1238039235_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependency>()
      val hr = fn.invokeHR(arrayOf(__1238039235_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(minVersion), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageDependency>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateForSystem(
      packageFamilyName: String?,
      minVersion: PackageVersion?,
      options: CreatePackageDependencyOptions?
    ): PackageDependency? {
      val fnPtr = _1238039235_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependency>()
      val hr = fn.invokeHR(arrayOf(__1238039235_Ptr, marshalToNative(packageFamilyName),
          marshalToNative(minVersion), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageDependency>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_GenerationId(): WinDef.UINT {
      val fnPtr = _1238039235_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1238039235_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPackageDependencyStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1238039235_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageDependencyStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("17b656e11a585f3c84a84430f6e749c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageDependencyStatics(ptr: Pointer?): WithDefault =
        IPackageDependencyStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageDependencyStatics {
      val address = segment.toRawLongValue()
      return makeIPackageDependencyStatics(Pointer(address))
    }

    public override fun toNative(obj: IPackageDependencyStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1238039235_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageDependencyStatics):
        Array<IPackageDependencyStatics?> = (elements as
        Array<IPackageDependencyStatics?>).castToImpl<IPackageDependencyStatics,IPackageDependencyStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageDependencyStatics?> =
        arrayOfNulls<IPackageDependencyStatics_Impl>(size) as Array<IPackageDependencyStatics?>
  }
}
