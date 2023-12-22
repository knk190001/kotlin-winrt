package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageLibraryContentChangedTrigger.ABI::class)
@Signature("{1637e0a7-829c-45bc-929b-a1e7ea78d89b}")
@Guid("1637e0a7829c45bc929ba1e7ea78d89b")
@WinRTInterface("1637e0a7829c45bc929ba1e7ea78d89b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibraryContentChangedTrigger.ByReference::class)
public interface IStorageLibraryContentChangedTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibraryContentChangedTrigger> {
    public override fun getValue() =
        ABI.makeIStorageLibraryContentChangedTrigger(pointer.getPointer(0))

    public fun setValue(value: IStorageLibraryContentChangedTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibraryContentChangedTrigger,
      IBackgroundTrigger.WithDefault {
    public val __1110334412_Ptr: Pointer?

    public val _1110334412_VtblPtr: Pointer?
      get() = __1110334412_Ptr?.getPointer(0)
  }

  public class IStorageLibraryContentChangedTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1110334412_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1110334412_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibraryContentChangedTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1637e0a7829c45bc929ba1e7ea78d89b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibraryContentChangedTrigger(ptr: Pointer?): WithDefault =
        IStorageLibraryContentChangedTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibraryContentChangedTrigger {
      val address = segment.toRawLongValue()
      return makeIStorageLibraryContentChangedTrigger(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibraryContentChangedTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1110334412_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibraryContentChangedTrigger):
        Array<IStorageLibraryContentChangedTrigger?> = (elements as
        Array<IStorageLibraryContentChangedTrigger?>).castToImpl<IStorageLibraryContentChangedTrigger,IStorageLibraryContentChangedTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibraryContentChangedTrigger?> =
        arrayOfNulls<IStorageLibraryContentChangedTrigger_Impl>(size) as
        Array<IStorageLibraryContentChangedTrigger?>
  }
}
