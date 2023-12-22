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

@ABIMarker(ICreateAudioDeviceOutputNodeResult2.ABI::class)
@Signature("{4864269f-bdce-4ab1-bd38-fbae93aedaca}")
@Guid("4864269fbdce4ab1bd38fbae93aedaca")
@WinRTInterface("4864269fbdce4ab1bd38fbae93aedaca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioDeviceOutputNodeResult2.ByReference::class)
public interface ICreateAudioDeviceOutputNodeResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioDeviceOutputNodeResult2> {
    public override fun getValue() =
        ABI.makeICreateAudioDeviceOutputNodeResult2(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioDeviceOutputNodeResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioDeviceOutputNodeResult2 {
    public val __1221422390_Ptr: Pointer?

    public val _1221422390_VtblPtr: Pointer?
      get() = __1221422390_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1221422390_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1221422390_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioDeviceOutputNodeResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1221422390_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioDeviceOutputNodeResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4864269fbdce4ab1bd38fbae93aedaca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioDeviceOutputNodeResult2(ptr: Pointer?): WithDefault =
        ICreateAudioDeviceOutputNodeResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioDeviceOutputNodeResult2 {
      val address = segment.toRawLongValue()
      return makeICreateAudioDeviceOutputNodeResult2(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioDeviceOutputNodeResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1221422390_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioDeviceOutputNodeResult2):
        Array<ICreateAudioDeviceOutputNodeResult2?> = (elements as
        Array<ICreateAudioDeviceOutputNodeResult2?>).castToImpl<ICreateAudioDeviceOutputNodeResult2,ICreateAudioDeviceOutputNodeResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioDeviceOutputNodeResult2?> =
        arrayOfNulls<ICreateAudioDeviceOutputNodeResult2_Impl>(size) as
        Array<ICreateAudioDeviceOutputNodeResult2?>
  }
}
