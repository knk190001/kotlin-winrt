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

@ABIMarker(IAppBarSeparator.ABI::class)
@Signature("{1b0795a1-1bc1-4d53-95ea-fb0a2cccc905}")
@Guid("1b0795a11bc14d5395eafb0a2cccc905")
@WinRTInterface("1b0795a11bc14d5395eafb0a2cccc905")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarSeparator.ByReference::class)
public interface IAppBarSeparator : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarSeparator> {
    public override fun getValue() = ABI.makeIAppBarSeparator(pointer.getPointer(0))

    public fun setValue(value: IAppBarSeparator_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarSeparator {
    public val __19629769_Ptr: Pointer?

    public val _19629769_VtblPtr: Pointer?
      get() = __19629769_Ptr?.getPointer(0)
  }

  public class IAppBarSeparator_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __19629769_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarSeparator, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b0795a11bc14d5395eafb0a2cccc905")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarSeparator(ptr: Pointer?): WithDefault = IAppBarSeparator_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarSeparator {
      val address = segment.toRawLongValue()
      return makeIAppBarSeparator(Pointer(address))
    }

    public override fun toNative(obj: IAppBarSeparator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__19629769_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarSeparator): Array<IAppBarSeparator?> = (elements as
        Array<IAppBarSeparator?>).castToImpl<IAppBarSeparator,IAppBarSeparator_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarSeparator?> =
        arrayOfNulls<IAppBarSeparator_Impl>(size) as Array<IAppBarSeparator?>
  }
}
