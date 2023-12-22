package Microsoft.UI.Xaml

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

@ABIMarker(IGridLengthHelper.ABI::class)
@Signature("{592b4fd5-6564-54e0-87d6-1c41939ed499}")
@Guid("592b4fd5656454e087d61c41939ed499")
@WinRTInterface("592b4fd5656454e087d61c41939ed499")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGridLengthHelper.ByReference::class)
public interface IGridLengthHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGridLengthHelper> {
    public override fun getValue() = ABI.makeIGridLengthHelper(pointer.getPointer(0))

    public fun setValue(value: IGridLengthHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGridLengthHelper {
    public val __1575052001_Ptr: Pointer?

    public val _1575052001_VtblPtr: Pointer?
      get() = __1575052001_Ptr?.getPointer(0)
  }

  public class IGridLengthHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1575052001_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGridLengthHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("592b4fd5656454e087d61c41939ed499")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGridLengthHelper(ptr: Pointer?): WithDefault = IGridLengthHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGridLengthHelper {
      val address = segment.toRawLongValue()
      return makeIGridLengthHelper(Pointer(address))
    }

    public override fun toNative(obj: IGridLengthHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1575052001_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGridLengthHelper): Array<IGridLengthHelper?> = (elements
        as Array<IGridLengthHelper?>).castToImpl<IGridLengthHelper,IGridLengthHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGridLengthHelper?> =
        arrayOfNulls<IGridLengthHelper_Impl>(size) as Array<IGridLengthHelper?>
  }
}
