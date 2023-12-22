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

@ABIMarker(INavigationViewList.ABI::class)
@Signature("{4f726f85-5ce0-48cd-8ef2-1a29458a3404}")
@Guid("4f726f855ce048cd8ef21a29458a3404")
@WinRTInterface("4f726f855ce048cd8ef21a29458a3404")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewList.ByReference::class)
public interface INavigationViewList : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewList> {
    public override fun getValue() = ABI.makeINavigationViewList(pointer.getPointer(0))

    public fun setValue(value: INavigationViewList_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewList {
    public val __1651200973_Ptr: Pointer?

    public val _1651200973_VtblPtr: Pointer?
      get() = __1651200973_Ptr?.getPointer(0)
  }

  public class INavigationViewList_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1651200973_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewList, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4f726f855ce048cd8ef21a29458a3404")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewList(ptr: Pointer?): WithDefault = INavigationViewList_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewList {
      val address = segment.toRawLongValue()
      return makeINavigationViewList(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewList): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1651200973_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewList): Array<INavigationViewList?> =
        (elements as
        Array<INavigationViewList?>).castToImpl<INavigationViewList,INavigationViewList_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewList?> =
        arrayOfNulls<INavigationViewList_Impl>(size) as Array<INavigationViewList?>
  }
}
