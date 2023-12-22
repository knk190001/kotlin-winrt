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

@ABIMarker(IFocusDisengagedEventArgs.ABI::class)
@Signature("{5e14280f-953e-4cf8-b9ea-c530a1ce02ad}")
@Guid("5e14280f953e4cf8b9eac530a1ce02ad")
@WinRTInterface("5e14280f953e4cf8b9eac530a1ce02ad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusDisengagedEventArgs.ByReference::class)
public interface IFocusDisengagedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusDisengagedEventArgs> {
    public override fun getValue() = ABI.makeIFocusDisengagedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFocusDisengagedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusDisengagedEventArgs {
    public val __1498462874_Ptr: Pointer?

    public val _1498462874_VtblPtr: Pointer?
      get() = __1498462874_Ptr?.getPointer(0)
  }

  public class IFocusDisengagedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1498462874_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusDisengagedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e14280f953e4cf8b9eac530a1ce02ad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusDisengagedEventArgs(ptr: Pointer?): WithDefault =
        IFocusDisengagedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusDisengagedEventArgs {
      val address = segment.toRawLongValue()
      return makeIFocusDisengagedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFocusDisengagedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1498462874_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusDisengagedEventArgs):
        Array<IFocusDisengagedEventArgs?> = (elements as
        Array<IFocusDisengagedEventArgs?>).castToImpl<IFocusDisengagedEventArgs,IFocusDisengagedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusDisengagedEventArgs?> =
        arrayOfNulls<IFocusDisengagedEventArgs_Impl>(size) as Array<IFocusDisengagedEventArgs?>
  }
}
