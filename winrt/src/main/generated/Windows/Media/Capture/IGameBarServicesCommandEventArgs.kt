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

@ABIMarker(IGameBarServicesCommandEventArgs.ABI::class)
@Signature("{a74226b2-f176-4fcf-8fbb-cf698b2eb8e0}")
@Guid("a74226b2f1764fcf8fbbcf698b2eb8e0")
@WinRTInterface("a74226b2f1764fcf8fbbcf698b2eb8e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGameBarServicesCommandEventArgs.ByReference::class)
public interface IGameBarServicesCommandEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Command(): GameBarCommand?

  @InterfaceMethod(1)
  public fun get_Origin(): GameBarCommandOrigin?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGameBarServicesCommandEventArgs> {
    public override fun getValue() = ABI.makeIGameBarServicesCommandEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGameBarServicesCommandEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGameBarServicesCommandEventArgs {
    public val __384424685_Ptr: Pointer?

    public val _384424685_VtblPtr: Pointer?
      get() = __384424685_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Command(): GameBarCommand? {
      val fnPtr = _384424685_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameBarCommand>()
      val hr = fn.invokeHR(arrayOf(__384424685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameBarCommand>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Origin(): GameBarCommandOrigin? {
      val fnPtr = _384424685_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GameBarCommandOrigin>()
      val hr = fn.invokeHR(arrayOf(__384424685_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GameBarCommandOrigin>(result.getValue())
      return resultValue
    }
  }

  public class IGameBarServicesCommandEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __384424685_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGameBarServicesCommandEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a74226b2f1764fcf8fbbcf698b2eb8e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGameBarServicesCommandEventArgs(ptr: Pointer?): WithDefault =
        IGameBarServicesCommandEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGameBarServicesCommandEventArgs {
      val address = segment.toRawLongValue()
      return makeIGameBarServicesCommandEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGameBarServicesCommandEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__384424685_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGameBarServicesCommandEventArgs):
        Array<IGameBarServicesCommandEventArgs?> = (elements as
        Array<IGameBarServicesCommandEventArgs?>).castToImpl<IGameBarServicesCommandEventArgs,IGameBarServicesCommandEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGameBarServicesCommandEventArgs?> =
        arrayOfNulls<IGameBarServicesCommandEventArgs_Impl>(size) as
        Array<IGameBarServicesCommandEventArgs?>
  }
}
