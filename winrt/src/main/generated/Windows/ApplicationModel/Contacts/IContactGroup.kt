package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactGroup.ABI::class)
@Signature("{59bdeb01-9e9a-475d-bfe5-a37b806d852c}")
@Guid("59bdeb019e9a475dbfe5a37b806d852c")
@WinRTInterface("59bdeb019e9a475dbfe5a37b806d852c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactGroup.ByReference::class)
public interface IContactGroup : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactGroup>
      {
    public override fun getValue() = ABI.makeIContactGroup(pointer.getPointer(0))

    public fun setValue(value: IContactGroup_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactGroup {
    public val __1324328661_Ptr: Pointer?

    public val _1324328661_VtblPtr: Pointer?
      get() = __1324328661_Ptr?.getPointer(0)
  }

  public class IContactGroup_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1324328661_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactGroup, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59bdeb019e9a475dbfe5a37b806d852c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactGroup(ptr: Pointer?): WithDefault = IContactGroup_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactGroup {
      val address = segment.toRawLongValue()
      return makeIContactGroup(Pointer(address))
    }

    public override fun toNative(obj: IContactGroup): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1324328661_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactGroup): Array<IContactGroup?> = (elements as
        Array<IContactGroup?>).castToImpl<IContactGroup,IContactGroup_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactGroup?> =
        arrayOfNulls<IContactGroup_Impl>(size) as Array<IContactGroup?>
  }
}
