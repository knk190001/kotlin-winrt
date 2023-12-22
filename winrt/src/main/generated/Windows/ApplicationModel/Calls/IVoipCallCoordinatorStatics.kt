package Windows.ApplicationModel.Calls

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

@ABIMarker(IVoipCallCoordinatorStatics.ABI::class)
@Signature("{7f5d1f2b-e04a-4d10-b31a-a55c922cc2fb}")
@Guid("7f5d1f2be04a4d10b31aa55c922cc2fb")
@WinRTInterface("7f5d1f2be04a4d10b31aa55c922cc2fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVoipCallCoordinatorStatics.ByReference::class)
public interface IVoipCallCoordinatorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): VoipCallCoordinator?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVoipCallCoordinatorStatics> {
    public override fun getValue() = ABI.makeIVoipCallCoordinatorStatics(pointer.getPointer(0))

    public fun setValue(value: IVoipCallCoordinatorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVoipCallCoordinatorStatics {
    public val __1735425999_Ptr: Pointer?

    public val _1735425999_VtblPtr: Pointer?
      get() = __1735425999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): VoipCallCoordinator? {
      val fnPtr = _1735425999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VoipCallCoordinator>()
      val hr = fn.invokeHR(arrayOf(__1735425999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VoipCallCoordinator>(result.getValue())
      return resultValue
    }
  }

  public class IVoipCallCoordinatorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1735425999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVoipCallCoordinatorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7f5d1f2be04a4d10b31aa55c922cc2fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVoipCallCoordinatorStatics(ptr: Pointer?): WithDefault =
        IVoipCallCoordinatorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVoipCallCoordinatorStatics {
      val address = segment.toRawLongValue()
      return makeIVoipCallCoordinatorStatics(Pointer(address))
    }

    public override fun toNative(obj: IVoipCallCoordinatorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1735425999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVoipCallCoordinatorStatics):
        Array<IVoipCallCoordinatorStatics?> = (elements as
        Array<IVoipCallCoordinatorStatics?>).castToImpl<IVoipCallCoordinatorStatics,IVoipCallCoordinatorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVoipCallCoordinatorStatics?> =
        arrayOfNulls<IVoipCallCoordinatorStatics_Impl>(size) as Array<IVoipCallCoordinatorStatics?>
  }
}
