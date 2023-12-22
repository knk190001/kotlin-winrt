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

@ABIMarker(ICreateAudioFileInputNodeResult2.ABI::class)
@Signature("{f9082020-3d80-4fe0-81c1-768fea7ca7e0}")
@Guid("f90820203d804fe081c1768fea7ca7e0")
@WinRTInterface("f90820203d804fe081c1768fea7ca7e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICreateAudioFileInputNodeResult2.ByReference::class)
public interface ICreateAudioFileInputNodeResult2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICreateAudioFileInputNodeResult2> {
    public override fun getValue() = ABI.makeICreateAudioFileInputNodeResult2(pointer.getPointer(0))

    public fun setValue(value: ICreateAudioFileInputNodeResult2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICreateAudioFileInputNodeResult2 {
    public val __288645481_Ptr: Pointer?

    public val _288645481_VtblPtr: Pointer?
      get() = __288645481_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _288645481_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__288645481_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class ICreateAudioFileInputNodeResult2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __288645481_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICreateAudioFileInputNodeResult2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f90820203d804fe081c1768fea7ca7e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICreateAudioFileInputNodeResult2(ptr: Pointer?): WithDefault =
        ICreateAudioFileInputNodeResult2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICreateAudioFileInputNodeResult2 {
      val address = segment.toRawLongValue()
      return makeICreateAudioFileInputNodeResult2(Pointer(address))
    }

    public override fun toNative(obj: ICreateAudioFileInputNodeResult2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__288645481_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICreateAudioFileInputNodeResult2):
        Array<ICreateAudioFileInputNodeResult2?> = (elements as
        Array<ICreateAudioFileInputNodeResult2?>).castToImpl<ICreateAudioFileInputNodeResult2,ICreateAudioFileInputNodeResult2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICreateAudioFileInputNodeResult2?> =
        arrayOfNulls<ICreateAudioFileInputNodeResult2_Impl>(size) as
        Array<ICreateAudioFileInputNodeResult2?>
  }
}
