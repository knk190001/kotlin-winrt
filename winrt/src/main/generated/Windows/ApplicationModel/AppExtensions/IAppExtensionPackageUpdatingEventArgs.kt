package Windows.ApplicationModel.AppExtensions

import Windows.ApplicationModel.Package
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

@ABIMarker(IAppExtensionPackageUpdatingEventArgs.ABI::class)
@Signature("{7ed59329-1a65-4800-a700-b321009e306a}")
@Guid("7ed593291a654800a700b321009e306a")
@WinRTInterface("7ed593291a654800a700b321009e306a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppExtensionPackageUpdatingEventArgs.ByReference::class)
public interface IAppExtensionPackageUpdatingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppExtensionName(): String?

  @InterfaceMethod(1)
  public fun get_Package(): Package?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppExtensionPackageUpdatingEventArgs> {
    public override fun getValue() =
        ABI.makeIAppExtensionPackageUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppExtensionPackageUpdatingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppExtensionPackageUpdatingEventArgs {
    public val __1618221511_Ptr: Pointer?

    public val _1618221511_VtblPtr: Pointer?
      get() = __1618221511_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppExtensionName(): String? {
      val fnPtr = _1618221511_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1618221511_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Package(): Package? {
      val fnPtr = _1618221511_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__1618221511_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }
  }

  public class IAppExtensionPackageUpdatingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1618221511_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppExtensionPackageUpdatingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ed593291a654800a700b321009e306a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppExtensionPackageUpdatingEventArgs(ptr: Pointer?): WithDefault =
        IAppExtensionPackageUpdatingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppExtensionPackageUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppExtensionPackageUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppExtensionPackageUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1618221511_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppExtensionPackageUpdatingEventArgs):
        Array<IAppExtensionPackageUpdatingEventArgs?> = (elements as
        Array<IAppExtensionPackageUpdatingEventArgs?>).castToImpl<IAppExtensionPackageUpdatingEventArgs,IAppExtensionPackageUpdatingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppExtensionPackageUpdatingEventArgs?> =
        arrayOfNulls<IAppExtensionPackageUpdatingEventArgs_Impl>(size) as
        Array<IAppExtensionPackageUpdatingEventArgs?>
  }
}
