package Microsoft.Windows.ApplicationModel.DynamicDependency

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

@ABIMarker(ICreatePackageDependencyOptions.ABI::class)
@Signature("{cdbb820f-3c69-55dc-a017-b4132574c5d6}")
@Guid("cdbb820f3c6955dca017b4132574c5d6")
@WinRTInterface("cdbb820f3c6955dca017b4132574c5d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreatePackageDependencyOptions.ByReference::class)
public interface ICreatePackageDependencyOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Architectures(): PackageDependencyProcessorArchitectures?

  @InterfaceMethod(1)
  public fun put_Architectures(value: PackageDependencyProcessorArchitectures?): Unit

  @InterfaceMethod(2)
  public fun get_VerifyDependencyResolution(): Boolean

  @InterfaceMethod(3)
  public fun put_VerifyDependencyResolution(value: Boolean): Unit

  @InterfaceMethod(4)
  public fun get_LifetimeArtifactKind(): PackageDependencyLifetimeArtifactKind?

  @InterfaceMethod(5)
  public fun put_LifetimeArtifactKind(value: PackageDependencyLifetimeArtifactKind?): Unit

  @InterfaceMethod(6)
  public fun get_LifetimeArtifact(): String?

  @InterfaceMethod(7)
  public fun put_LifetimeArtifact(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreatePackageDependencyOptions> {
    public override fun getValue() = ABI.makeICreatePackageDependencyOptions(pointer.getPointer(0))

    public fun setValue(value: ICreatePackageDependencyOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreatePackageDependencyOptions {
    public val __1518368142_Ptr: Pointer?

    public val _1518368142_VtblPtr: Pointer?
      get() = __1518368142_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Architectures(): PackageDependencyProcessorArchitectures? {
      val fnPtr = _1518368142_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependencyProcessorArchitectures>()
      val hr = fn.invokeHR(arrayOf(__1518368142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<PackageDependencyProcessorArchitectures>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Architectures(value: PackageDependencyProcessorArchitectures?): Unit {
      val fnPtr = _1518368142_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1518368142_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_VerifyDependencyResolution(): Boolean {
      val fnPtr = _1518368142_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1518368142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_VerifyDependencyResolution(value: Boolean): Unit {
      val fnPtr = _1518368142_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1518368142_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_LifetimeArtifactKind(): PackageDependencyLifetimeArtifactKind? {
      val fnPtr = _1518368142_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PackageDependencyLifetimeArtifactKind>()
      val hr = fn.invokeHR(arrayOf(__1518368142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PackageDependencyLifetimeArtifactKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_LifetimeArtifactKind(value: PackageDependencyLifetimeArtifactKind?):
        Unit {
      val fnPtr = _1518368142_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1518368142_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LifetimeArtifact(): String? {
      val fnPtr = _1518368142_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1518368142_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_LifetimeArtifact(value: String?): Unit {
      val fnPtr = _1518368142_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1518368142_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICreatePackageDependencyOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1518368142_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreatePackageDependencyOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cdbb820f3c6955dca017b4132574c5d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreatePackageDependencyOptions(ptr: Pointer?): WithDefault =
        ICreatePackageDependencyOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreatePackageDependencyOptions {
      val address = segment.toRawLongValue()
      return makeICreatePackageDependencyOptions(Pointer(address))
    }

    public override fun toNative(obj: ICreatePackageDependencyOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1518368142_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreatePackageDependencyOptions):
        Array<ICreatePackageDependencyOptions?> = (elements as
        Array<ICreatePackageDependencyOptions?>).castToImpl<ICreatePackageDependencyOptions,ICreatePackageDependencyOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreatePackageDependencyOptions?> =
        arrayOfNulls<ICreatePackageDependencyOptions_Impl>(size) as
        Array<ICreatePackageDependencyOptions?>
  }
}
