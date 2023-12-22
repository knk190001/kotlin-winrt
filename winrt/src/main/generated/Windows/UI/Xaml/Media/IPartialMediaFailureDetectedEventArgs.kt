package Windows.UI.Xaml.Media

import Windows.Media.Playback.FailedMediaStreamKind
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

@ABIMarker(IPartialMediaFailureDetectedEventArgs.ABI::class)
@Signature("{02b65a91-e5a1-442b-88d3-2dc127bfc59b}")
@Guid("02b65a91e5a1442b88d32dc127bfc59b")
@WinRTInterface("02b65a91e5a1442b88d32dc127bfc59b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPartialMediaFailureDetectedEventArgs.ByReference::class)
public interface IPartialMediaFailureDetectedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StreamKind(): FailedMediaStreamKind?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPartialMediaFailureDetectedEventArgs> {
    public override fun getValue() =
        ABI.makeIPartialMediaFailureDetectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPartialMediaFailureDetectedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPartialMediaFailureDetectedEventArgs {
    public val __626644938_Ptr: Pointer?

    public val _626644938_VtblPtr: Pointer?
      get() = __626644938_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StreamKind(): FailedMediaStreamKind? {
      val fnPtr = _626644938_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FailedMediaStreamKind>()
      val hr = fn.invokeHR(arrayOf(__626644938_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FailedMediaStreamKind>(result.getValue())
      return resultValue
    }
  }

  public class IPartialMediaFailureDetectedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __626644938_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPartialMediaFailureDetectedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("02b65a91e5a1442b88d32dc127bfc59b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPartialMediaFailureDetectedEventArgs(ptr: Pointer?): WithDefault =
        IPartialMediaFailureDetectedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPartialMediaFailureDetectedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPartialMediaFailureDetectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPartialMediaFailureDetectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__626644938_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPartialMediaFailureDetectedEventArgs):
        Array<IPartialMediaFailureDetectedEventArgs?> = (elements as
        Array<IPartialMediaFailureDetectedEventArgs?>).castToImpl<IPartialMediaFailureDetectedEventArgs,IPartialMediaFailureDetectedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPartialMediaFailureDetectedEventArgs?> =
        arrayOfNulls<IPartialMediaFailureDetectedEventArgs_Impl>(size) as
        Array<IPartialMediaFailureDetectedEventArgs?>
  }
}
