package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISplitButtonClickEventArgs.ABI::class)
@Signature("{c227c2ca-26f4-5960-98d5-919149d1b525}")
@Guid("c227c2ca26f4596098d5919149d1b525")
@WinRTInterface("c227c2ca26f4596098d5919149d1b525")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitButtonClickEventArgs.ByReference::class)
public interface ISplitButtonClickEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitButtonClickEventArgs> {
    public override fun getValue() = ABI.makeISplitButtonClickEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISplitButtonClickEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitButtonClickEventArgs {
    public val __2077598881_Ptr: Pointer?

    public val _2077598881_VtblPtr: Pointer?
      get() = __2077598881_Ptr?.getPointer(0)
  }

  public class ISplitButtonClickEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2077598881_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitButtonClickEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c227c2ca26f4596098d5919149d1b525")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitButtonClickEventArgs(ptr: Pointer?): WithDefault =
        ISplitButtonClickEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitButtonClickEventArgs {
      val address = segment.toRawLongValue()
      return makeISplitButtonClickEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISplitButtonClickEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2077598881_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitButtonClickEventArgs):
        Array<ISplitButtonClickEventArgs?> = (elements as
        Array<ISplitButtonClickEventArgs?>).castToImpl<ISplitButtonClickEventArgs,ISplitButtonClickEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitButtonClickEventArgs?> =
        arrayOfNulls<ISplitButtonClickEventArgs_Impl>(size) as Array<ISplitButtonClickEventArgs?>
  }
}
