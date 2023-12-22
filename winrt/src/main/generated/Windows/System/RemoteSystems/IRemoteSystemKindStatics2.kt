package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemKindStatics2.ABI::class)
@Signature("{b9e3a3d0-0466-4749-91e8-65f9d19a96a5}")
@Guid("b9e3a3d00466474991e865f9d19a96a5")
@WinRTInterface("b9e3a3d00466474991e865f9d19a96a5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemKindStatics2.ByReference::class)
public interface IRemoteSystemKindStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Iot(): String?

  @InterfaceMethod(1)
  public fun get_Tablet(): String?

  @InterfaceMethod(2)
  public fun get_Laptop(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemKindStatics2> {
    public override fun getValue() = ABI.makeIRemoteSystemKindStatics2(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemKindStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemKindStatics2 {
    public val __1837953547_Ptr: Pointer?

    public val _1837953547_VtblPtr: Pointer?
      get() = __1837953547_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Iot(): String? {
      val fnPtr = _1837953547_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1837953547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Tablet(): String? {
      val fnPtr = _1837953547_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1837953547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Laptop(): String? {
      val fnPtr = _1837953547_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1837953547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemKindStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1837953547_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemKindStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9e3a3d00466474991e865f9d19a96a5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemKindStatics2(ptr: Pointer?): WithDefault =
        IRemoteSystemKindStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemKindStatics2 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemKindStatics2(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemKindStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1837953547_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemKindStatics2):
        Array<IRemoteSystemKindStatics2?> = (elements as
        Array<IRemoteSystemKindStatics2?>).castToImpl<IRemoteSystemKindStatics2,IRemoteSystemKindStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemKindStatics2?> =
        arrayOfNulls<IRemoteSystemKindStatics2_Impl>(size) as Array<IRemoteSystemKindStatics2?>
  }
}
