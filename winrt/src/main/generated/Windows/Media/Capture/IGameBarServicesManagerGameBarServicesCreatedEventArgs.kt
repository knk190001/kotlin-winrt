package Windows.Media.Capture

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

@ABIMarker(IGameBarServicesManagerGameBarServicesCreatedEventArgs.ABI::class)
@Signature("{ededbd9c-143e-49a3-a5ea-0b1995c8d46e}")
@Guid("ededbd9c143e49a3a5ea0b1995c8d46e")
@WinRTInterface("ededbd9c143e49a3a5ea0b1995c8d46e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass =
    IGameBarServicesManagerGameBarServicesCreatedEventArgs.ByReference::class)
public interface IGameBarServicesManagerGameBarServicesCreatedEventArgs : NativeMapped,
    IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_GameBarServices(): GameBarServices?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameBarServicesManagerGameBarServicesCreatedEventArgs> {
    public override fun getValue() =
        ABI.makeIGameBarServicesManagerGameBarServicesCreatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGameBarServicesManagerGameBarServicesCreatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameBarServicesManagerGameBarServicesCreatedEventArgs {
    public val __1080955448_Ptr: Pointer?

    public val _1080955448_VtblPtr: Pointer?
      get() = __1080955448_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_GameBarServices(): GameBarServices? {
      val fnPtr = _1080955448_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameBarServices>()
      val hr = fn.invokeHR(arrayOf(__1080955448_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameBarServices>(result.getValue())
      return resultValue
    }
  }

  public class IGameBarServicesManagerGameBarServicesCreatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1080955448_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameBarServicesManagerGameBarServicesCreatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ededbd9c143e49a3a5ea0b1995c8d46e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameBarServicesManagerGameBarServicesCreatedEventArgs(ptr: Pointer?):
        WithDefault = IGameBarServicesManagerGameBarServicesCreatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IGameBarServicesManagerGameBarServicesCreatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGameBarServicesManagerGameBarServicesCreatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGameBarServicesManagerGameBarServicesCreatedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1080955448_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameBarServicesManagerGameBarServicesCreatedEventArgs):
        Array<IGameBarServicesManagerGameBarServicesCreatedEventArgs?> = (elements as
        Array<IGameBarServicesManagerGameBarServicesCreatedEventArgs?>).castToImpl<IGameBarServicesManagerGameBarServicesCreatedEventArgs,IGameBarServicesManagerGameBarServicesCreatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IGameBarServicesManagerGameBarServicesCreatedEventArgs?> =
        arrayOfNulls<IGameBarServicesManagerGameBarServicesCreatedEventArgs_Impl>(size) as
        Array<IGameBarServicesManagerGameBarServicesCreatedEventArgs?>
  }
}
