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

@ABIMarker(IAppExtensionPackageStatusChangedEventArgs.ABI::class)
@Signature("{1ce17433-1153-44fd-87b1-8ae1050303df}")
@Guid("1ce17433115344fd87b18ae1050303df")
@WinRTInterface("1ce17433115344fd87b18ae1050303df")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppExtensionPackageStatusChangedEventArgs.ByReference::class)
public interface IAppExtensionPackageStatusChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppExtensionName(): String?

  @InterfaceMethod(1)
  public fun get_Package(): Package?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppExtensionPackageStatusChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppExtensionPackageStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppExtensionPackageStatusChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppExtensionPackageStatusChangedEventArgs {
    public val __740241471_Ptr: Pointer?

    public val _740241471_VtblPtr: Pointer?
      get() = __740241471_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppExtensionName(): String? {
      val fnPtr = _740241471_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__740241471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Package(): Package? {
      val fnPtr = _740241471_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__740241471_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }
  }

  public class IAppExtensionPackageStatusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __740241471_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppExtensionPackageStatusChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1ce17433115344fd87b18ae1050303df")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppExtensionPackageStatusChangedEventArgs(ptr: Pointer?): WithDefault =
        IAppExtensionPackageStatusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppExtensionPackageStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppExtensionPackageStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppExtensionPackageStatusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__740241471_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppExtensionPackageStatusChangedEventArgs):
        Array<IAppExtensionPackageStatusChangedEventArgs?> = (elements as
        Array<IAppExtensionPackageStatusChangedEventArgs?>).castToImpl<IAppExtensionPackageStatusChangedEventArgs,IAppExtensionPackageStatusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppExtensionPackageStatusChangedEventArgs?> =
        arrayOfNulls<IAppExtensionPackageStatusChangedEventArgs_Impl>(size) as
        Array<IAppExtensionPackageStatusChangedEventArgs?>
  }
}
