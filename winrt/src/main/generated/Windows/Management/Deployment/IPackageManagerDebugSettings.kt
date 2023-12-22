package Windows.Management.Deployment

import Windows.ApplicationModel.Package
import Windows.ApplicationModel.PackageContentGroupState
import Windows.Foundation.IAsyncAction
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPackageManagerDebugSettings.ABI::class)
@Signature("{1a611683-a988-4fcf-8f0f-ce175898e8eb}")
@Guid("1a611683a9884fcf8f0fce175898e8eb")
@WinRTInterface("1a611683a9884fcf8f0fce175898e8eb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPackageManagerDebugSettings.ByReference::class)
public interface IPackageManagerDebugSettings : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetContentGroupStateAsync(
    `package`: Package?,
    contentGroupName: String?,
    state: PackageContentGroupState?
  ): IAsyncAction?

  @InterfaceMethod(1)
  public fun SetContentGroupStateAsync(
    `package`: Package?,
    contentGroupName: String?,
    state: PackageContentGroupState?,
    completionPercentage: Double
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPackageManagerDebugSettings> {
    public override fun getValue() = ABI.makeIPackageManagerDebugSettings(pointer.getPointer(0))

    public fun setValue(value: IPackageManagerDebugSettings_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPackageManagerDebugSettings {
    public val __813355723_Ptr: Pointer?

    public val _813355723_VtblPtr: Pointer?
      get() = __813355723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetContentGroupStateAsync(
      `package`: Package?,
      contentGroupName: String?,
      state: PackageContentGroupState?
    ): IAsyncAction? {
      val fnPtr = _813355723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__813355723_Ptr, marshalToNative(`package`),
          marshalToNative(contentGroupName), marshalToNative(state), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetContentGroupStateAsync(
      `package`: Package?,
      contentGroupName: String?,
      state: PackageContentGroupState?,
      completionPercentage: Double
    ): IAsyncAction? {
      val fnPtr = _813355723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__813355723_Ptr, marshalToNative(`package`),
          marshalToNative(contentGroupName), marshalToNative(state), completionPercentage, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IPackageManagerDebugSettings_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __813355723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPackageManagerDebugSettings, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1a611683a9884fcf8f0fce175898e8eb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPackageManagerDebugSettings(ptr: Pointer?): WithDefault =
        IPackageManagerDebugSettings_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPackageManagerDebugSettings {
      val address = segment.toRawLongValue()
      return makeIPackageManagerDebugSettings(Pointer(address))
    }

    public override fun toNative(obj: IPackageManagerDebugSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__813355723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPackageManagerDebugSettings):
        Array<IPackageManagerDebugSettings?> = (elements as
        Array<IPackageManagerDebugSettings?>).castToImpl<IPackageManagerDebugSettings,IPackageManagerDebugSettings_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPackageManagerDebugSettings?> =
        arrayOfNulls<IPackageManagerDebugSettings_Impl>(size) as
        Array<IPackageManagerDebugSettings?>
  }
}
