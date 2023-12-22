package Microsoft.UI.Content

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

@ABIMarker(IContentEnvironmentSettingChangedEventArgs.ABI::class)
@Signature("{76478051-fc80-5eec-a3f3-62606abe06b7}")
@Guid("76478051fc805eeca3f362606abe06b7")
@WinRTInterface("76478051fc805eeca3f362606abe06b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentEnvironmentSettingChangedEventArgs.ByReference::class)
public interface IContentEnvironmentSettingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SettingName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentEnvironmentSettingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIContentEnvironmentSettingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentEnvironmentSettingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentEnvironmentSettingChangedEventArgs {
    public val __1675326833_Ptr: Pointer?

    public val _1675326833_VtblPtr: Pointer?
      get() = __1675326833_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SettingName(): String? {
      val fnPtr = _1675326833_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1675326833_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContentEnvironmentSettingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1675326833_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentEnvironmentSettingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76478051fc805eeca3f362606abe06b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentEnvironmentSettingChangedEventArgs(ptr: Pointer?): WithDefault =
        IContentEnvironmentSettingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContentEnvironmentSettingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentEnvironmentSettingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentEnvironmentSettingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1675326833_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentEnvironmentSettingChangedEventArgs):
        Array<IContentEnvironmentSettingChangedEventArgs?> = (elements as
        Array<IContentEnvironmentSettingChangedEventArgs?>).castToImpl<IContentEnvironmentSettingChangedEventArgs,IContentEnvironmentSettingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentEnvironmentSettingChangedEventArgs?> =
        arrayOfNulls<IContentEnvironmentSettingChangedEventArgs_Impl>(size) as
        Array<IContentEnvironmentSettingChangedEventArgs?>
  }
}
