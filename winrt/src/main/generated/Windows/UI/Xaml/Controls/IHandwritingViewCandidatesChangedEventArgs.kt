package Windows.UI.Xaml.Controls

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IHandwritingViewCandidatesChangedEventArgs.ABI::class)
@Signature("{6f5f63d8-56b1-56c5-a416-c19c16bf7884}")
@Guid("6f5f63d856b156c5a416c19c16bf7884")
@WinRTInterface("6f5f63d856b156c5a416c19c16bf7884")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandwritingViewCandidatesChangedEventArgs.ByReference::class)
public interface IHandwritingViewCandidatesChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CandidatesSessionId(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandwritingViewCandidatesChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIHandwritingViewCandidatesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHandwritingViewCandidatesChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandwritingViewCandidatesChangedEventArgs {
    public val __1236206455_Ptr: Pointer?

    public val _1236206455_VtblPtr: Pointer?
      get() = __1236206455_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CandidatesSessionId(): WinDef.UINT {
      val fnPtr = _1236206455_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1236206455_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IHandwritingViewCandidatesChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1236206455_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandwritingViewCandidatesChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f5f63d856b156c5a416c19c16bf7884")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandwritingViewCandidatesChangedEventArgs(ptr: Pointer?): WithDefault =
        IHandwritingViewCandidatesChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHandwritingViewCandidatesChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHandwritingViewCandidatesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHandwritingViewCandidatesChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1236206455_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandwritingViewCandidatesChangedEventArgs):
        Array<IHandwritingViewCandidatesChangedEventArgs?> = (elements as
        Array<IHandwritingViewCandidatesChangedEventArgs?>).castToImpl<IHandwritingViewCandidatesChangedEventArgs,IHandwritingViewCandidatesChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandwritingViewCandidatesChangedEventArgs?> =
        arrayOfNulls<IHandwritingViewCandidatesChangedEventArgs_Impl>(size) as
        Array<IHandwritingViewCandidatesChangedEventArgs?>
  }
}
