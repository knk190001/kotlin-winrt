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

@ABIMarker(ICreateMediaSourceAudioInputNodeResult2.ABI::class)
@Signature("{63514ce8-6a1a-49e3-97ec-28fd5be114e5}")
@Guid("63514ce86a1a49e397ec28fd5be114e5")
@WinRTInterface("63514ce86a1a49e397ec28fd5be114e5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateMediaSourceAudioInputNodeResult2.ByReference::class)
public interface ICreateMediaSourceAudioInputNodeResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateMediaSourceAudioInputNodeResult2> {
    public override fun getValue() =
        ABI.makeICreateMediaSourceAudioInputNodeResult2(pointer.getPointer(0))

    public fun setValue(value: ICreateMediaSourceAudioInputNodeResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateMediaSourceAudioInputNodeResult2 {
    public val __636712220_Ptr: Pointer?

    public val _636712220_VtblPtr: Pointer?
      get() = __636712220_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _636712220_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__636712220_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ICreateMediaSourceAudioInputNodeResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __636712220_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateMediaSourceAudioInputNodeResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63514ce86a1a49e397ec28fd5be114e5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateMediaSourceAudioInputNodeResult2(ptr: Pointer?): WithDefault =
        ICreateMediaSourceAudioInputNodeResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ICreateMediaSourceAudioInputNodeResult2 {
      val address = segment.toRawLongValue()
      return makeICreateMediaSourceAudioInputNodeResult2(Pointer(address))
    }

    public override fun toNative(obj: ICreateMediaSourceAudioInputNodeResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__636712220_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateMediaSourceAudioInputNodeResult2):
        Array<ICreateMediaSourceAudioInputNodeResult2?> = (elements as
        Array<ICreateMediaSourceAudioInputNodeResult2?>).castToImpl<ICreateMediaSourceAudioInputNodeResult2,ICreateMediaSourceAudioInputNodeResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateMediaSourceAudioInputNodeResult2?> =
        arrayOfNulls<ICreateMediaSourceAudioInputNodeResult2_Impl>(size) as
        Array<ICreateMediaSourceAudioInputNodeResult2?>
  }
}
