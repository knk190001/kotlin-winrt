package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(ICubicEase.ABI::class)
@Signature("{1b94fc76-dad7-4354-b1a2-7969fbf6a70d}")
@Guid("1b94fc76dad74354b1a27969fbf6a70d")
@WinRTInterface("1b94fc76dad74354b1a27969fbf6a70d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICubicEase.ByReference::class)
public interface ICubicEase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICubicEase> {
    public override fun getValue() = ABI.makeICubicEase(pointer.getPointer(0))

    public fun setValue(value: ICubicEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICubicEase {
    public val __198342894_Ptr: Pointer?

    public val _198342894_VtblPtr: Pointer?
      get() = __198342894_Ptr?.getPointer(0)
  }

  public class ICubicEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __198342894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICubicEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1b94fc76dad74354b1a27969fbf6a70d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICubicEase(ptr: Pointer?): WithDefault = ICubicEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICubicEase {
      val address = segment.toRawLongValue()
      return makeICubicEase(Pointer(address))
    }

    public override fun toNative(obj: ICubicEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__198342894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICubicEase): Array<ICubicEase?> = (elements as
        Array<ICubicEase?>).castToImpl<ICubicEase,ICubicEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICubicEase?> = arrayOfNulls<ICubicEase_Impl>(size)
        as Array<ICubicEase?>
  }
}
