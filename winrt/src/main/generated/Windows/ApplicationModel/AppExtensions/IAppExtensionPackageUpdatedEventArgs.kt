package Windows.ApplicationModel.AppExtensions

import Windows.ApplicationModel.Package
import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IAppExtensionPackageUpdatedEventArgs.ABI::class)
@Signature("{3a83c43f-797e-44b5-ba24-a4c8b5a543d7}")
@Guid("3a83c43f797e44b5ba24a4c8b5a543d7")
@WinRTInterface("3a83c43f797e44b5ba24a4c8b5a543d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppExtensionPackageUpdatedEventArgs.ByReference::class)
public interface IAppExtensionPackageUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppExtensionName(): String?

  @InterfaceMethod(1)
  public fun get_Package(): Package?

  @InterfaceMethod(2)
  public fun get_Extensions(): IVectorView<AppExtension?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppExtensionPackageUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppExtensionPackageUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppExtensionPackageUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppExtensionPackageUpdatedEventArgs {
    public val __1436209542_Ptr: Pointer?

    public val _1436209542_VtblPtr: Pointer?
      get() = __1436209542_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppExtensionName(): String? {
      val fnPtr = _1436209542_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1436209542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Package(): Package? {
      val fnPtr = _1436209542_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__1436209542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Extensions(): IVectorView<AppExtension?>? {
      val fnPtr = _1436209542_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppExtension?>>()
      val hr = fn.invokeHR(arrayOf(__1436209542_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AppExtension?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppExtensionPackageUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1436209542_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppExtensionPackageUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a83c43f797e44b5ba24a4c8b5a543d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppExtensionPackageUpdatedEventArgs(ptr: Pointer?): WithDefault =
        IAppExtensionPackageUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppExtensionPackageUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppExtensionPackageUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppExtensionPackageUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1436209542_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppExtensionPackageUpdatedEventArgs):
        Array<IAppExtensionPackageUpdatedEventArgs?> = (elements as
        Array<IAppExtensionPackageUpdatedEventArgs?>).castToImpl<IAppExtensionPackageUpdatedEventArgs,IAppExtensionPackageUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppExtensionPackageUpdatedEventArgs?> =
        arrayOfNulls<IAppExtensionPackageUpdatedEventArgs_Impl>(size) as
        Array<IAppExtensionPackageUpdatedEventArgs?>
  }
}
