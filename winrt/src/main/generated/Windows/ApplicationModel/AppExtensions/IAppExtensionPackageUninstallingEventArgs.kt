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

@ABIMarker(IAppExtensionPackageUninstallingEventArgs.ABI::class)
@Signature("{60f160c5-171e-40ff-ae98-ab2c20dd4d75}")
@Guid("60f160c5171e40ffae98ab2c20dd4d75")
@WinRTInterface("60f160c5171e40ffae98ab2c20dd4d75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppExtensionPackageUninstallingEventArgs.ByReference::class)
public interface IAppExtensionPackageUninstallingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppExtensionName(): String?

  @InterfaceMethod(1)
  public fun get_Package(): Package?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppExtensionPackageUninstallingEventArgs> {
    public override fun getValue() =
        ABI.makeIAppExtensionPackageUninstallingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppExtensionPackageUninstallingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppExtensionPackageUninstallingEventArgs {
    public val __23905165_Ptr: Pointer?

    public val _23905165_VtblPtr: Pointer?
      get() = __23905165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppExtensionName(): String? {
      val fnPtr = _23905165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__23905165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Package(): Package? {
      val fnPtr = _23905165_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Package>()
      val hr = fn.invokeHR(arrayOf(__23905165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Package>(result.getValue())
      return resultValue
    }
  }

  public class IAppExtensionPackageUninstallingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __23905165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppExtensionPackageUninstallingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60f160c5171e40ffae98ab2c20dd4d75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppExtensionPackageUninstallingEventArgs(ptr: Pointer?): WithDefault =
        IAppExtensionPackageUninstallingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAppExtensionPackageUninstallingEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppExtensionPackageUninstallingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppExtensionPackageUninstallingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__23905165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppExtensionPackageUninstallingEventArgs):
        Array<IAppExtensionPackageUninstallingEventArgs?> = (elements as
        Array<IAppExtensionPackageUninstallingEventArgs?>).castToImpl<IAppExtensionPackageUninstallingEventArgs,IAppExtensionPackageUninstallingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppExtensionPackageUninstallingEventArgs?> =
        arrayOfNulls<IAppExtensionPackageUninstallingEventArgs_Impl>(size) as
        Array<IAppExtensionPackageUninstallingEventArgs?>
  }
}
