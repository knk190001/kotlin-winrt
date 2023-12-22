package Windows.Media.Audio

import Windows.Foundation.HResult
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

@ABIMarker(ICreateAudioFileOutputNodeResult2.ABI::class)
@Signature("{9f01b50d-3318-47b3-a60a-1b492be7fc0d}")
@Guid("9f01b50d331847b3a60a1b492be7fc0d")
@WinRTInterface("9f01b50d331847b3a60a1b492be7fc0d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioFileOutputNodeResult2.ByReference::class)
public interface ICreateAudioFileOutputNodeResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioFileOutputNodeResult2> {
    public override fun getValue() =
        ABI.makeICreateAudioFileOutputNodeResult2(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioFileOutputNodeResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioFileOutputNodeResult2 {
    public val __1957105636_Ptr: Pointer?

    public val _1957105636_VtblPtr: Pointer?
      get() = __1957105636_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1957105636_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1957105636_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioFileOutputNodeResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1957105636_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioFileOutputNodeResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9f01b50d331847b3a60a1b492be7fc0d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioFileOutputNodeResult2(ptr: Pointer?): WithDefault =
        ICreateAudioFileOutputNodeResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioFileOutputNodeResult2 {
      val address = segment.toRawLongValue()
      return makeICreateAudioFileOutputNodeResult2(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioFileOutputNodeResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1957105636_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioFileOutputNodeResult2):
        Array<ICreateAudioFileOutputNodeResult2?> = (elements as
        Array<ICreateAudioFileOutputNodeResult2?>).castToImpl<ICreateAudioFileOutputNodeResult2,ICreateAudioFileOutputNodeResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioFileOutputNodeResult2?> =
        arrayOfNulls<ICreateAudioFileOutputNodeResult2_Impl>(size) as
        Array<ICreateAudioFileOutputNodeResult2?>
  }
}
