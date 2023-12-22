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

@ABIMarker(ITreeViewList.ABI::class)
@Signature("{0f00a54e-099a-47a5-a942-94692b01f452}")
@Guid("0f00a54e099a47a5a94294692b01f452")
@WinRTInterface("0f00a54e099a47a5a94294692b01f452")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITreeViewList.ByReference::class)
public interface ITreeViewList : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITreeViewList>
      {
    public override fun getValue() = ABI.makeITreeViewList(pointer.getPointer(0))

    public fun setValue(value: ITreeViewList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITreeViewList {
    public val __1184297149_Ptr: Pointer?

    public val _1184297149_VtblPtr: Pointer?
      get() = __1184297149_Ptr?.getPointer(0)
  }

  public class ITreeViewList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1184297149_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITreeViewList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0f00a54e099a47a5a94294692b01f452")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITreeViewList(ptr: Pointer?): WithDefault = ITreeViewList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITreeViewList {
      val address = segment.toRawLongValue()
      return makeITreeViewList(Pointer(address))
    }

    public override fun toNative(obj: ITreeViewList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1184297149_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITreeViewList): Array<ITreeViewList?> = (elements as
        Array<ITreeViewList?>).castToImpl<ITreeViewList,ITreeViewList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITreeViewList?> =
        arrayOfNulls<ITreeViewList_Impl>(size) as Array<ITreeViewList?>
  }
}
