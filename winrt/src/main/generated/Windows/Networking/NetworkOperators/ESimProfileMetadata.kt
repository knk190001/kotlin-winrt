package Windows.Networking.NetworkOperators

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ESimProfileMetadata.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimProfileMetadata;{ed25831f-90db-498d-a7b4-ebce807d3c23})")
@WinRTByReference(brClass = ESimProfileMetadata.ByReference::class)
public class ESimProfileMetadata(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimProfileMetadata.WithDefault, IWinRTObject {
  private val __1971437773_Interface: IESimProfileMetadata.WithDefault by lazy {
    as_1971437773()
  }


  public override val __1971437773_Ptr: JNAPointer? by lazy {
    __1971437773_Interface.__1971437773_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1971437773_Interface)

  private fun as_1971437773(): IESimProfileMetadata.WithDefault {
    if(pointer == NULL) {
      return(IESimProfileMetadata.ABI.makeIESimProfileMetadata(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimProfileMetadata>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimProfileMetadata.ABI.makeIESimProfileMetadata(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ESimProfileMetadata> {
    public override fun getValue() = ESimProfileMetadata(pointer.getPointer(0))

    public fun setValue(value: ESimProfileMetadata): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimProfileMetadata, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimProfileMetadata {
      val address = segment.toRawLongValue()
      return ESimProfileMetadata(Pointer(address))
    }

    public override fun toNative(obj: ESimProfileMetadata): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
