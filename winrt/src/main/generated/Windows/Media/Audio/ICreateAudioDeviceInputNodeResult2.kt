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

@ABIMarker(ICreateAudioDeviceInputNodeResult2.ABI::class)
@Signature("{921c69ce-3f35-41c7-9622-79f608baedc2}")
@Guid("921c69ce3f3541c7962279f608baedc2")
@WinRTInterface("921c69ce3f3541c7962279f608baedc2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioDeviceInputNodeResult2.ByReference::class)
public interface ICreateAudioDeviceInputNodeResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioDeviceInputNodeResult2> {
    public override fun getValue() =
        ABI.makeICreateAudioDeviceInputNodeResult2(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioDeviceInputNodeResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioDeviceInputNodeResult2 {
    public val __252631311_Ptr: Pointer?

    public val _252631311_VtblPtr: Pointer?
      get() = __252631311_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _252631311_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__252631311_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioDeviceInputNodeResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __252631311_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioDeviceInputNodeResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("921c69ce3f3541c7962279f608baedc2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioDeviceInputNodeResult2(ptr: Pointer?): WithDefault =
        ICreateAudioDeviceInputNodeResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioDeviceInputNodeResult2 {
      val address = segment.toRawLongValue()
      return makeICreateAudioDeviceInputNodeResult2(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioDeviceInputNodeResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__252631311_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioDeviceInputNodeResult2):
        Array<ICreateAudioDeviceInputNodeResult2?> = (elements as
        Array<ICreateAudioDeviceInputNodeResult2?>).castToImpl<ICreateAudioDeviceInputNodeResult2,ICreateAudioDeviceInputNodeResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioDeviceInputNodeResult2?> =
        arrayOfNulls<ICreateAudioDeviceInputNodeResult2_Impl>(size) as
        Array<ICreateAudioDeviceInputNodeResult2?>
  }
}
