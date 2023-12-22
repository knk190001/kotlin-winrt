package Microsoft.UI.Input.DragDrop

import Microsoft.UI.Content.ContentIsland
import Windows.Foundation.IClosable
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(DragDropManager.ABI::class)
@Signature("rc(Microsoft.UI.Input.DragDrop.DragDropManager;{4fea9efc-b073-5fbe-9c95-a4113ef6393f})")
@WinRTByReference(brClass = DragDropManager.ByReference::class)
public class DragDropManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDragDropManager.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __2027805698_Interface: IDragDropManager.WithDefault by lazy {
    as_2027805698()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __2027805698_Ptr: JNAPointer? by lazy {
    __2027805698_Interface.__2027805698_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2027805698_Interface, __1260617006_Interface)

  private fun as_2027805698(): IDragDropManager.WithDefault {
    if(pointer == NULL) {
      return(IDragDropManager.ABI.makeIDragDropManager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragDropManager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragDropManager.ABI.makeIDragDropManager(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragDropManager> {
    public override fun getValue() = DragDropManager(pointer.getPointer(0))

    public fun setValue(value: DragDropManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragDropManager, MemoryAddress> {
    public val IDragDropManagerStatics_Instance: IDragDropManagerStatics by lazy {
      createIDragDropManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDragDropManagerStatics(): IDragDropManagerStatics {
      val refiid = Guid.REFIID(IDragDropManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.DragDrop.DragDropManager".toHandle(),refiid,interfacePtr)
      val result = IDragDropManagerStatics.ABI.makeIDragDropManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DragDropManager {
      val address = segment.toRawLongValue()
      return DragDropManager(Pointer(address))
    }

    public override fun toNative(obj: DragDropManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForIsland(content: ContentIsland) =
        ABI.IDragDropManagerStatics_Instance.GetForIsland(content)
  }
}
