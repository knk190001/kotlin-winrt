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

@ABIMarker(ICreateAudioDeviceInputNodeResult.ABI::class)
@Signature("{16eec7a8-1ca7-40ef-91a4-d346e0aa1bba}")
@Guid("16eec7a81ca740ef91a4d346e0aa1bba")
@WinRTInterface("16eec7a81ca740ef91a4d346e0aa1bba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioDeviceInputNodeResult.ByReference::class)
public interface ICreateAudioDeviceInputNodeResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): AudioDeviceNodeCreationStatus?

  @InterfaceMethod(1)
  public fun get_DeviceInputNode(): AudioDeviceInputNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioDeviceInputNodeResult> {
    public override fun getValue() =
        ABI.makeICreateAudioDeviceInputNodeResult(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioDeviceInputNodeResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioDeviceInputNodeResult {
    public val __285244063_Ptr: Pointer?

    public val _285244063_VtblPtr: Pointer?
      get() = __285244063_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): AudioDeviceNodeCreationStatus? {
      val fnPtr = _285244063_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDeviceNodeCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__285244063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDeviceNodeCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceInputNode(): AudioDeviceInputNode? {
      val fnPtr = _285244063_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AudioDeviceInputNode>()
      val hr = fn.invokeHR(arrayOf(__285244063_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AudioDeviceInputNode>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioDeviceInputNodeResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __285244063_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioDeviceInputNodeResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16eec7a81ca740ef91a4d346e0aa1bba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioDeviceInputNodeResult(ptr: Pointer?): WithDefault =
        ICreateAudioDeviceInputNodeResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioDeviceInputNodeResult {
      val address = segment.toRawLongValue()
      return makeICreateAudioDeviceInputNodeResult(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioDeviceInputNodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__285244063_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioDeviceInputNodeResult):
        Array<ICreateAudioDeviceInputNodeResult?> = (elements as
        Array<ICreateAudioDeviceInputNodeResult?>).castToImpl<ICreateAudioDeviceInputNodeResult,ICreateAudioDeviceInputNodeResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioDeviceInputNodeResult?> =
        arrayOfNulls<ICreateAudioDeviceInputNodeResult_Impl>(size) as
        Array<ICreateAudioDeviceInputNodeResult?>
  }
}
