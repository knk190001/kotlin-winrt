package Windows.System.RemoteDesktop

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInteractiveSessionStatics.ABI::class)
@Signature("{60884631-dd3a-4576-9c8d-e8027618bdce}")
@Guid("60884631dd3a45769c8de8027618bdce")
@WinRTInterface("60884631dd3a45769c8de8027618bdce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInteractiveSessionStatics.ByReference::class)
public interface IInteractiveSessionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsRemote(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInteractiveSessionStatics> {
    public override fun getValue() = ABI.makeIInteractiveSessionStatics(pointer.getPointer(0))

    public fun setValue(value: IInteractiveSessionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInteractiveSessionStatics {
    public val __1605806890_Ptr: Pointer?

    public val _1605806890_VtblPtr: Pointer?
      get() = __1605806890_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsRemote(): Boolean {
      val fnPtr = _1605806890_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1605806890_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IInteractiveSessionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1605806890_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInteractiveSessionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("60884631dd3a45769c8de8027618bdce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInteractiveSessionStatics(ptr: Pointer?): WithDefault =
        IInteractiveSessionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInteractiveSessionStatics {
      val address = segment.toRawLongValue()
      return makeIInteractiveSessionStatics(Pointer(address))
    }

    public override fun toNative(obj: IInteractiveSessionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1605806890_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInteractiveSessionStatics):
        Array<IInteractiveSessionStatics?> = (elements as
        Array<IInteractiveSessionStatics?>).castToImpl<IInteractiveSessionStatics,IInteractiveSessionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInteractiveSessionStatics?> =
        arrayOfNulls<IInteractiveSessionStatics_Impl>(size) as Array<IInteractiveSessionStatics?>
  }
}
