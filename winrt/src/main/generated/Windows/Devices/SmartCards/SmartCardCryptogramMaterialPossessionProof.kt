package Windows.Devices.SmartCards

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

@ABIMarker(SmartCardCryptogramMaterialPossessionProof.ABI::class)
@Signature("rc(Windows.Devices.SmartCards.SmartCardCryptogramMaterialPossessionProof;{e5b9ab8c-a141-4135-9add-b0d2e3aa1fc9})")
@WinRTByReference(brClass = SmartCardCryptogramMaterialPossessionProof.ByReference::class)
public class SmartCardCryptogramMaterialPossessionProof(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardCryptogramMaterialPossessionProof.WithDefault, IWinRTObject {
  private val __1588080189_Interface: ISmartCardCryptogramMaterialPossessionProof.WithDefault by
      lazy {
    as_1588080189()
  }


  public override val __1588080189_Ptr: JNAPointer? by lazy {
    __1588080189_Interface.__1588080189_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1588080189_Interface)

  private fun as_1588080189(): ISmartCardCryptogramMaterialPossessionProof.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardCryptogramMaterialPossessionProof.ABI.makeISmartCardCryptogramMaterialPossessionProof(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardCryptogramMaterialPossessionProof>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardCryptogramMaterialPossessionProof.ABI.makeISmartCardCryptogramMaterialPossessionProof(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SmartCardCryptogramMaterialPossessionProof> {
    public override fun getValue() =
        SmartCardCryptogramMaterialPossessionProof(pointer.getPointer(0))

    public fun setValue(value: SmartCardCryptogramMaterialPossessionProof): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardCryptogramMaterialPossessionProof, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        SmartCardCryptogramMaterialPossessionProof {
      val address = segment.toRawLongValue()
      return SmartCardCryptogramMaterialPossessionProof(Pointer(address))
    }

    public override fun toNative(obj: SmartCardCryptogramMaterialPossessionProof): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
