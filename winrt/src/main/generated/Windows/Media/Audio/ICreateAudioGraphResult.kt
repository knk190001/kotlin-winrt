package Windows.Media.Audio

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

@ABIMarker(ICreateAudioGraphResult.ABI::class)
@Signature("{5453ef7e-7bde-4b76-bb5d-48f79cfc8c0b}")
@Guid("5453ef7e7bde4b76bb5d48f79cfc8c0b")
@WinRTInterface("5453ef7e7bde4b76bb5d48f79cfc8c0b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioGraphResult.ByReference::class)
public interface ICreateAudioGraphResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): AudioGraphCreationStatus?

  @InterfaceMethod(1)
  public fun get_Graph(): AudioGraph?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioGraphResult> {
    public override fun getValue() = ABI.makeICreateAudioGraphResult(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioGraphResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioGraphResult {
    public val __451305735_Ptr: Pointer?

    public val _451305735_VtblPtr: Pointer?
      get() = __451305735_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): AudioGraphCreationStatus? {
      val fnPtr = _451305735_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioGraphCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__451305735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioGraphCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Graph(): AudioGraph? {
      val fnPtr = _451305735_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioGraph>()
      val hr = fn.invokeHR(arrayOf(__451305735_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioGraph>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioGraphResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __451305735_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioGraphResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5453ef7e7bde4b76bb5d48f79cfc8c0b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioGraphResult(ptr: Pointer?): WithDefault =
        ICreateAudioGraphResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioGraphResult {
      val address = segment.toRawLongValue()
      return makeICreateAudioGraphResult(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioGraphResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__451305735_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioGraphResult): Array<ICreateAudioGraphResult?>
        = (elements as
        Array<ICreateAudioGraphResult?>).castToImpl<ICreateAudioGraphResult,ICreateAudioGraphResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioGraphResult?> =
        arrayOfNulls<ICreateAudioGraphResult_Impl>(size) as Array<ICreateAudioGraphResult?>
  }
}
