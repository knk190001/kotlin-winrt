package Windows.Gaming.Preview.GamesEnumeration

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

@ABIMarker(IGameModeUserConfigurationStatics.ABI::class)
@Signature("{6e50d97c-66ea-478e-a4a1-f57c0e8d00e7}")
@Guid("6e50d97c66ea478ea4a1f57c0e8d00e7")
@WinRTInterface("6e50d97c66ea478ea4a1f57c0e8d00e7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameModeUserConfigurationStatics.ByReference::class)
public interface IGameModeUserConfigurationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): GameModeUserConfiguration?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameModeUserConfigurationStatics> {
    public override fun getValue() =
        ABI.makeIGameModeUserConfigurationStatics(pointer.getPointer(0))

    public fun setValue(value: IGameModeUserConfigurationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameModeUserConfigurationStatics {
    public val __1171864328_Ptr: Pointer?

    public val _1171864328_VtblPtr: Pointer?
      get() = __1171864328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): GameModeUserConfiguration? {
      val fnPtr = _1171864328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameModeUserConfiguration>()
      val hr = fn.invokeHR(arrayOf(__1171864328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameModeUserConfiguration>(result.getValue())
      return resultValue
    }
  }

  public class IGameModeUserConfigurationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1171864328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameModeUserConfigurationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e50d97c66ea478ea4a1f57c0e8d00e7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameModeUserConfigurationStatics(ptr: Pointer?): WithDefault =
        IGameModeUserConfigurationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameModeUserConfigurationStatics {
      val address = segment.toRawLongValue()
      return makeIGameModeUserConfigurationStatics(Pointer(address))
    }

    public override fun toNative(obj: IGameModeUserConfigurationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1171864328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameModeUserConfigurationStatics):
        Array<IGameModeUserConfigurationStatics?> = (elements as
        Array<IGameModeUserConfigurationStatics?>).castToImpl<IGameModeUserConfigurationStatics,IGameModeUserConfigurationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameModeUserConfigurationStatics?> =
        arrayOfNulls<IGameModeUserConfigurationStatics_Impl>(size) as
        Array<IGameModeUserConfigurationStatics?>
  }
}
