package Microsoft.UI.Xaml.Documents

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

@ABIMarker(IBold.ABI::class)
@Signature("{241a5f5a-c164-597f-b0db-fac7431297f2}")
@Guid("241a5f5ac164597fb0dbfac7431297f2")
@WinRTInterface("241a5f5ac164597fb0dbfac7431297f2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBold.ByReference::class)
public interface IBold : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBold> {
    public override fun getValue() = ABI.makeIBold(pointer.getPointer(0))

    public fun setValue(value: IBold_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBold {
    public val __1717894626_Ptr: Pointer?

    public val _1717894626_VtblPtr: Pointer?
      get() = __1717894626_Ptr?.getPointer(0)
  }

  public class IBold_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1717894626_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBold, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("241a5f5ac164597fb0dbfac7431297f2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBold(ptr: Pointer?): WithDefault = IBold_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBold {
      val address = segment.toRawLongValue()
      return makeIBold(Pointer(address))
    }

    public override fun toNative(obj: IBold): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1717894626_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBold): Array<IBold?> = (elements as
        Array<IBold?>).castToImpl<IBold,IBold_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBold?> = arrayOfNulls<IBold_Impl>(size) as
        Array<IBold?>
  }
}
