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

@ABIMarker(ICreateMediaSourceAudioInputNodeResult.ABI::class)
@Signature("{46a658a3-53c0-4d59-9e51-cc1d1044a4c4}")
@Guid("46a658a353c04d599e51cc1d1044a4c4")
@WinRTInterface("46a658a353c04d599e51cc1d1044a4c4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateMediaSourceAudioInputNodeResult.ByReference::class)
public interface ICreateMediaSourceAudioInputNodeResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): MediaSourceAudioInputNodeCreationStatus?

  @InterfaceMethod(1)
  public fun get_Node(): MediaSourceAudioInputNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateMediaSourceAudioInputNodeResult> {
    public override fun getValue() =
        ABI.makeICreateMediaSourceAudioInputNodeResult(pointer.getPointer(0))

    public fun setValue(value: ICreateMediaSourceAudioInputNodeResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateMediaSourceAudioInputNodeResult {
    public val __574728434_Ptr: Pointer?

    public val _574728434_VtblPtr: Pointer?
      get() = __574728434_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): MediaSourceAudioInputNodeCreationStatus? {
      val fnPtr = _574728434_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSourceAudioInputNodeCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__574728434_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<MediaSourceAudioInputNodeCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Node(): MediaSourceAudioInputNode? {
      val fnPtr = _574728434_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaSourceAudioInputNode>()
      val hr = fn.invokeHR(arrayOf(__574728434_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaSourceAudioInputNode>(result.getValue())
      return resultValue
    }
  }

  public class ICreateMediaSourceAudioInputNodeResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __574728434_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateMediaSourceAudioInputNodeResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("46a658a353c04d599e51cc1d1044a4c4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateMediaSourceAudioInputNodeResult(ptr: Pointer?): WithDefault =
        ICreateMediaSourceAudioInputNodeResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateMediaSourceAudioInputNodeResult {
      val address = segment.toRawLongValue()
      return makeICreateMediaSourceAudioInputNodeResult(Pointer(address))
    }

    public override fun toNative(obj: ICreateMediaSourceAudioInputNodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574728434_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateMediaSourceAudioInputNodeResult):
        Array<ICreateMediaSourceAudioInputNodeResult?> = (elements as
        Array<ICreateMediaSourceAudioInputNodeResult?>).castToImpl<ICreateMediaSourceAudioInputNodeResult,ICreateMediaSourceAudioInputNodeResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateMediaSourceAudioInputNodeResult?> =
        arrayOfNulls<ICreateMediaSourceAudioInputNodeResult_Impl>(size) as
        Array<ICreateMediaSourceAudioInputNodeResult?>
  }
}
