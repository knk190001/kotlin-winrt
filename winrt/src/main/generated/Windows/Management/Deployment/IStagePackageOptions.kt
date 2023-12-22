package Windows.Management.Deployment

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

@ABIMarker(IStagePackageOptions.ABI::class)
@Signature("{0b110c9c-b95d-4c56-bd36-6d656800d06b}")
@Guid("0b110c9cb95d4c56bd366d656800d06b")
@WinRTInterface("0b110c9cb95d4c56bd366d656800d06b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStagePackageOptions.ByReference::class)
public interface IStagePackageOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DependencyPackageUris(): IVector<Uri?>?

  @InterfaceMethod(1)
  public fun get_TargetVolume(): PackageVolume?

  @InterfaceMethod(2)
  public fun put_TargetVolume(value: PackageVolume?): Unit

  @InterfaceMethod(3)
  public fun get_OptionalPackageFamilyNames(): IVector<String?>?

  @InterfaceMethod(4)
  public fun get_OptionalPackageUris(): IVector<Uri?>?

  @InterfaceMethod(5)
  public fun get_RelatedPackageUris(): IVector<Uri?>?

  @InterfaceMethod(6)
  public fun get_ExternalLocationUri(): Uri?

  @InterfaceMethod(7)
  public fun put_ExternalLocationUri(value: Uri?): Unit

  @InterfaceMethod(8)
  public fun get_StubPackageOption(): StubPackageOption?

  @InterfaceMethod(9)
  public fun put_StubPackageOption(value: StubPackageOption?): Unit

  @InterfaceMethod(10)
  public fun get_DeveloperMode(): Boolean

  @InterfaceMethod(11)
  public fun put_DeveloperMode(value: Boolean): Unit

  @InterfaceMethod(12)
  public fun get_ForceUpdateFromAnyVersion(): Boolean

  @InterfaceMethod(13)
  public fun put_ForceUpdateFromAnyVersion(value: Boolean): Unit

  @InterfaceMethod(14)
  public fun get_InstallAllResources(): Boolean

  @InterfaceMethod(15)
  public fun put_InstallAllResources(value: Boolean): Unit

  @InterfaceMethod(16)
  public fun get_RequiredContentGroupOnly(): Boolean

  @InterfaceMethod(17)
  public fun put_RequiredContentGroupOnly(value: Boolean): Unit

  @InterfaceMethod(18)
  public fun get_StageInPlace(): Boolean

  @InterfaceMethod(19)
  public fun put_StageInPlace(value: Boolean): Unit

  @InterfaceMethod(20)
  public fun get_AllowUnsigned(): Boolean

  @InterfaceMethod(21)
  public fun put_AllowUnsigned(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStagePackageOptions> {
    public override fun getValue() = ABI.makeIStagePackageOptions(pointer.getPointer(0))

    public fun setValue(value: IStagePackageOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStagePackageOptions {
    public val __1601357166_Ptr: Pointer?

    public val _1601357166_VtblPtr: Pointer?
      get() = __1601357166_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DependencyPackageUris(): IVector<Uri?>? {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TargetVolume(): PackageVolume? {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageVolume>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageVolume>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_TargetVolume(value: PackageVolume?): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_OptionalPackageFamilyNames(): IVector<String?>? {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_OptionalPackageUris(): IVector<Uri?>? {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RelatedPackageUris(): IVector<Uri?>? {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Uri?>>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Uri?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ExternalLocationUri(): Uri? {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ExternalLocationUri(value: Uri?): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_StubPackageOption(): StubPackageOption? {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StubPackageOption>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StubPackageOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_StubPackageOption(value: StubPackageOption?): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_DeveloperMode(): Boolean {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_DeveloperMode(value: Boolean): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_ForceUpdateFromAnyVersion(): Boolean {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_ForceUpdateFromAnyVersion(value: Boolean): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_InstallAllResources(): Boolean {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_InstallAllResources(value: Boolean): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_RequiredContentGroupOnly(): Boolean {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_RequiredContentGroupOnly(value: Boolean): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_StageInPlace(): Boolean {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_StageInPlace(value: Boolean): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_AllowUnsigned(): Boolean {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_AllowUnsigned(value: Boolean): Unit {
      val fnPtr = _1601357166_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1601357166_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStagePackageOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1601357166_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStagePackageOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0b110c9cb95d4c56bd366d656800d06b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStagePackageOptions(ptr: Pointer?): WithDefault = IStagePackageOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStagePackageOptions {
      val address = segment.toRawLongValue()
      return makeIStagePackageOptions(Pointer(address))
    }

    public override fun toNative(obj: IStagePackageOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1601357166_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStagePackageOptions): Array<IStagePackageOptions?> =
        (elements as
        Array<IStagePackageOptions?>).castToImpl<IStagePackageOptions,IStagePackageOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStagePackageOptions?> =
        arrayOfNulls<IStagePackageOptions_Impl>(size) as Array<IStagePackageOptions?>
  }
}
