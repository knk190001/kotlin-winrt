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

@ABIMarker(IListViewPersistenceHelper.ABI::class)
@Signature("{05bde8a6-2191-4b4b-8c22-9b25676e806e}")
@Guid("05bde8a621914b4b8c229b25676e806e")
@WinRTInterface("05bde8a621914b4b8c229b25676e806e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewPersistenceHelper.ByReference::class)
public interface IListViewPersistenceHelper : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewPersistenceHelper> {
    public override fun getValue() = ABI.makeIListViewPersistenceHelper(pointer.getPointer(0))

    public fun setValue(value: IListViewPersistenceHelper_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewPersistenceHelper {
    public val __547723374_Ptr: Pointer?

    public val _547723374_VtblPtr: Pointer?
      get() = __547723374_Ptr?.getPointer(0)
  }

  public class IListViewPersistenceHelper_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __547723374_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewPersistenceHelper, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("05bde8a621914b4b8c229b25676e806e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewPersistenceHelper(ptr: Pointer?): WithDefault =
        IListViewPersistenceHelper_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewPersistenceHelper {
      val address = segment.toRawLongValue()
      return makeIListViewPersistenceHelper(Pointer(address))
    }

    public override fun toNative(obj: IListViewPersistenceHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__547723374_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewPersistenceHelper):
        Array<IListViewPersistenceHelper?> = (elements as
        Array<IListViewPersistenceHelper?>).castToImpl<IListViewPersistenceHelper,IListViewPersistenceHelper_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewPersistenceHelper?> =
        arrayOfNulls<IListViewPersistenceHelper_Impl>(size) as Array<IListViewPersistenceHelper?>
  }
}
