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

@ABIMarker(ICreateAudioFileInputNodeResult.ABI::class)
@Signature("{ce83d61c-e297-4c50-9ce7-1c7a69d6bd09}")
@Guid("ce83d61ce2974c509ce71c7a69d6bd09")
@WinRTInterface("ce83d61ce2974c509ce71c7a69d6bd09")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioFileInputNodeResult.ByReference::class)
public interface ICreateAudioFileInputNodeResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): AudioFileNodeCreationStatus?

  @InterfaceMethod(1)
  public fun get_FileInputNode(): AudioFileInputNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioFileInputNodeResult> {
    public override fun getValue() = ABI.makeICreateAudioFileInputNodeResult(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioFileInputNodeResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioFileInputNodeResult {
    public val __1237614843_Ptr: Pointer?

    public val _1237614843_VtblPtr: Pointer?
      get() = __1237614843_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): AudioFileNodeCreationStatus? {
      val fnPtr = _1237614843_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFileNodeCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__1237614843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFileNodeCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FileInputNode(): AudioFileInputNode? {
      val fnPtr = _1237614843_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFileInputNode>()
      val hr = fn.invokeHR(arrayOf(__1237614843_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFileInputNode>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioFileInputNodeResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1237614843_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioFileInputNodeResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce83d61ce2974c509ce71c7a69d6bd09")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioFileInputNodeResult(ptr: Pointer?): WithDefault =
        ICreateAudioFileInputNodeResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioFileInputNodeResult {
      val address = segment.toRawLongValue()
      return makeICreateAudioFileInputNodeResult(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioFileInputNodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1237614843_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioFileInputNodeResult):
        Array<ICreateAudioFileInputNodeResult?> = (elements as
        Array<ICreateAudioFileInputNodeResult?>).castToImpl<ICreateAudioFileInputNodeResult,ICreateAudioFileInputNodeResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioFileInputNodeResult?> =
        arrayOfNulls<ICreateAudioFileInputNodeResult_Impl>(size) as
        Array<ICreateAudioFileInputNodeResult?>
  }
}
