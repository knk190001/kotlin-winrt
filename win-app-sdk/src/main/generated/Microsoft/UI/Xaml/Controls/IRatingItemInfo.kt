package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IRatingItemInfo.ABI::class)
@Signature("{801e924e-3613-55dd-8321-9ebabbed0b8a}")
@Guid("801e924e361355dd83219ebabbed0b8a")
@WinRTInterface("801e924e361355dd83219ebabbed0b8a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRatingItemInfo.ByReference::class)
public interface IRatingItemInfo : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRatingItemInfo> {
    public override fun getValue() = ABI.makeIRatingItemInfo(pointer.getPointer(0))

    public fun setValue(value: IRatingItemInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRatingItemInfo {
    public val __1216241829_Ptr: Pointer?

    public val _1216241829_VtblPtr: Pointer?
      get() = __1216241829_Ptr?.getPointer(0)
  }

  public class IRatingItemInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1216241829_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRatingItemInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("801e924e361355dd83219ebabbed0b8a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRatingItemInfo(ptr: Pointer?): WithDefault = IRatingItemInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRatingItemInfo {
      val address = segment.toRawLongValue()
      return makeIRatingItemInfo(Pointer(address))
    }

    public override fun toNative(obj: IRatingItemInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1216241829_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRatingItemInfo): Array<IRatingItemInfo?> = (elements as
        Array<IRatingItemInfo?>).castToImpl<IRatingItemInfo,IRatingItemInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRatingItemInfo?> =
        arrayOfNulls<IRatingItemInfo_Impl>(size) as Array<IRatingItemInfo?>
  }
}
