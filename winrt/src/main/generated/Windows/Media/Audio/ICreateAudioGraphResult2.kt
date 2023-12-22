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

@ABIMarker(ICreateAudioGraphResult2.ABI::class)
@Signature("{6d738dfc-88c6-4fcb-a534-85cedd4050a1}")
@Guid("6d738dfc88c64fcba53485cedd4050a1")
@WinRTInterface("6d738dfc88c64fcba53485cedd4050a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioGraphResult2.ByReference::class)
public interface ICreateAudioGraphResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioGraphResult2> {
    public override fun getValue() = ABI.makeICreateAudioGraphResult2(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioGraphResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioGraphResult2 {
    public val __1105575847_Ptr: Pointer?

    public val _1105575847_VtblPtr: Pointer?
      get() = __1105575847_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _1105575847_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__1105575847_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioGraphResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1105575847_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioGraphResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d738dfc88c64fcba53485cedd4050a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioGraphResult2(ptr: Pointer?): WithDefault =
        ICreateAudioGraphResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioGraphResult2 {
      val address = segment.toRawLongValue()
      return makeICreateAudioGraphResult2(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioGraphResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1105575847_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioGraphResult2):
        Array<ICreateAudioGraphResult2?> = (elements as
        Array<ICreateAudioGraphResult2?>).castToImpl<ICreateAudioGraphResult2,ICreateAudioGraphResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioGraphResult2?> =
        arrayOfNulls<ICreateAudioGraphResult2_Impl>(size) as Array<ICreateAudioGraphResult2?>
  }
}
