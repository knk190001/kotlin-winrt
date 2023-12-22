package Microsoft.UI.Xaml.Hosting

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IWindowsXamlManagerStatics.ABI::class)
@Signature("{56cb591d-de97-539f-881d-8ccdc44fa6c4}")
@Guid("56cb591dde97539f881d8ccdc44fa6c4")
@WinRTInterface("56cb591dde97539f881d8ccdc44fa6c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWindowsXamlManagerStatics.ByReference::class)
public interface IWindowsXamlManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun InitializeForCurrentThread(): WindowsXamlManager?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWindowsXamlManagerStatics> {
    public override fun getValue() = ABI.makeIWindowsXamlManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IWindowsXamlManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWindowsXamlManagerStatics {
    public val __352162152_Ptr: Pointer?

    public val _352162152_VtblPtr: Pointer?
      get() = __352162152_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun InitializeForCurrentThread(): WindowsXamlManager? {
      val fnPtr = _352162152_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WindowsXamlManager>()
      val hr = fn.invokeHR(arrayOf(__352162152_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WindowsXamlManager>(result.getValue())
      return resultValue
    }
  }

  public class IWindowsXamlManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __352162152_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWindowsXamlManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("56cb591dde97539f881d8ccdc44fa6c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWindowsXamlManagerStatics(ptr: Pointer?): WithDefault =
        IWindowsXamlManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWindowsXamlManagerStatics {
      val address = segment.toRawLongValue()
      return makeIWindowsXamlManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IWindowsXamlManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__352162152_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWindowsXamlManagerStatics):
        Array<IWindowsXamlManagerStatics?> = (elements as
        Array<IWindowsXamlManagerStatics?>).castToImpl<IWindowsXamlManagerStatics,IWindowsXamlManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWindowsXamlManagerStatics?> =
        arrayOfNulls<IWindowsXamlManagerStatics_Impl>(size) as Array<IWindowsXamlManagerStatics?>
  }
}
