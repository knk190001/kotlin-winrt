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

@ABIMarker(ICreateAudioFileOutputNodeResult.ABI::class)
@Signature("{47d6ba7b-e909-453f-866e-5540cda734ff}")
@Guid("47d6ba7be909453f866e5540cda734ff")
@WinRTInterface("47d6ba7be909453f866e5540cda734ff")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioFileOutputNodeResult.ByReference::class)
public interface ICreateAudioFileOutputNodeResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): AudioFileNodeCreationStatus?

  @InterfaceMethod(1)
  public fun get_FileOutputNode(): AudioFileOutputNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioFileOutputNodeResult> {
    public override fun getValue() = ABI.makeICreateAudioFileOutputNodeResult(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioFileOutputNodeResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioFileOutputNodeResult {
    public val __213962226_Ptr: Pointer?

    public val _213962226_VtblPtr: Pointer?
      get() = __213962226_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): AudioFileNodeCreationStatus? {
      val fnPtr = _213962226_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFileNodeCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__213962226_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFileNodeCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FileOutputNode(): AudioFileOutputNode? {
      val fnPtr = _213962226_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioFileOutputNode>()
      val hr = fn.invokeHR(arrayOf(__213962226_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioFileOutputNode>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioFileOutputNodeResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __213962226_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioFileOutputNodeResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("47d6ba7be909453f866e5540cda734ff")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioFileOutputNodeResult(ptr: Pointer?): WithDefault =
        ICreateAudioFileOutputNodeResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioFileOutputNodeResult {
      val address = segment.toRawLongValue()
      return makeICreateAudioFileOutputNodeResult(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioFileOutputNodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__213962226_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioFileOutputNodeResult):
        Array<ICreateAudioFileOutputNodeResult?> = (elements as
        Array<ICreateAudioFileOutputNodeResult?>).castToImpl<ICreateAudioFileOutputNodeResult,ICreateAudioFileOutputNodeResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioFileOutputNodeResult?> =
        arrayOfNulls<ICreateAudioFileOutputNodeResult_Impl>(size) as
        Array<ICreateAudioFileOutputNodeResult?>
  }
}
