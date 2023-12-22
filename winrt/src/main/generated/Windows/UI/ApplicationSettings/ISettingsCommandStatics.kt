package Windows.UI.ApplicationSettings

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

@ABIMarker(ISettingsCommandStatics.ABI::class)
@Signature("{749ae954-2f69-4b17-8aba-d05ce5778e46}")
@Guid("749ae9542f694b178abad05ce5778e46")
@WinRTInterface("749ae9542f694b178abad05ce5778e46")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISettingsCommandStatics.ByReference::class)
public interface ISettingsCommandStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AccountsCommand(): SettingsCommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISettingsCommandStatics> {
    public override fun getValue() = ABI.makeISettingsCommandStatics(pointer.getPointer(0))

    public fun setValue(value: ISettingsCommandStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISettingsCommandStatics {
    public val __1659708126_Ptr: Pointer?

    public val _1659708126_VtblPtr: Pointer?
      get() = __1659708126_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AccountsCommand(): SettingsCommand? {
      val fnPtr = _1659708126_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SettingsCommand>()
      val hr = fn.invokeHR(arrayOf(__1659708126_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SettingsCommand>(result.getValue())
      return resultValue
    }
  }

  public class ISettingsCommandStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1659708126_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISettingsCommandStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("749ae9542f694b178abad05ce5778e46")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISettingsCommandStatics(ptr: Pointer?): WithDefault =
        ISettingsCommandStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISettingsCommandStatics {
      val address = segment.toRawLongValue()
      return makeISettingsCommandStatics(Pointer(address))
    }

    public override fun toNative(obj: ISettingsCommandStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1659708126_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISettingsCommandStatics): Array<ISettingsCommandStatics?>
        = (elements as
        Array<ISettingsCommandStatics?>).castToImpl<ISettingsCommandStatics,ISettingsCommandStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISettingsCommandStatics?> =
        arrayOfNulls<ISettingsCommandStatics_Impl>(size) as Array<ISettingsCommandStatics?>
  }
}
