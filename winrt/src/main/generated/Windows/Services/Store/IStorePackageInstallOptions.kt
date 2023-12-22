package Windows.Services.Store

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorePackageInstallOptions.ABI::class)
@Signature("{1d3d630c-0ccd-44dd-8c59-80810a729973}")
@Guid("1d3d630c0ccd44dd8c5980810a729973")
@WinRTInterface("1d3d630c0ccd44dd8c5980810a729973")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePackageInstallOptions.ByReference::class)
public interface IStorePackageInstallOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AllowForcedAppRestart(): Boolean

  @InterfaceMethod(1)
  public fun put_AllowForcedAppRestart(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePackageInstallOptions> {
    public override fun getValue() = ABI.makeIStorePackageInstallOptions(pointer.getPointer(0))

    public fun setValue(value: IStorePackageInstallOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePackageInstallOptions {
    public val __39669621_Ptr: Pointer?

    public val _39669621_VtblPtr: Pointer?
      get() = __39669621_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AllowForcedAppRestart(): Boolean {
      val fnPtr = _39669621_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__39669621_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_AllowForcedAppRestart(value: Boolean): Unit {
      val fnPtr = _39669621_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__39669621_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IStorePackageInstallOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __39669621_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePackageInstallOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d3d630c0ccd44dd8c5980810a729973")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePackageInstallOptions(ptr: Pointer?): WithDefault =
        IStorePackageInstallOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePackageInstallOptions {
      val address = segment.toRawLongValue()
      return makeIStorePackageInstallOptions(Pointer(address))
    }

    public override fun toNative(obj: IStorePackageInstallOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__39669621_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePackageInstallOptions):
        Array<IStorePackageInstallOptions?> = (elements as
        Array<IStorePackageInstallOptions?>).castToImpl<IStorePackageInstallOptions,IStorePackageInstallOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePackageInstallOptions?> =
        arrayOfNulls<IStorePackageInstallOptions_Impl>(size) as Array<IStorePackageInstallOptions?>
  }
}
