package Windows.Media.Capture.Frames

import Windows.Foundation.IClosable
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

@ABIMarker(MultiSourceMediaFrameReference.ABI::class)
@Signature("rc(Windows.Media.Capture.Frames.MultiSourceMediaFrameReference;{21964b1a-7fe2-44d6-92e5-298e6d2810e9})")
@WinRTByReference(brClass = MultiSourceMediaFrameReference.ByReference::class)
public class MultiSourceMediaFrameReference(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMultiSourceMediaFrameReference.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __1614057036_Interface: IMultiSourceMediaFrameReference.WithDefault by lazy {
    as_1614057036()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1614057036_Ptr: JNAPointer? by lazy {
    __1614057036_Interface.__1614057036_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1614057036_Interface, __1260617006_Interface)

  private fun as_1614057036(): IMultiSourceMediaFrameReference.WithDefault {
    if(pointer == NULL) {
      return(IMultiSourceMediaFrameReference.ABI.makeIMultiSourceMediaFrameReference(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMultiSourceMediaFrameReference>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMultiSourceMediaFrameReference.ABI.makeIMultiSourceMediaFrameReference(ref.value))
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
      IByReference<MultiSourceMediaFrameReference> {
    public override fun getValue() = MultiSourceMediaFrameReference(pointer.getPointer(0))

    public fun setValue(value: MultiSourceMediaFrameReference): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MultiSourceMediaFrameReference, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MultiSourceMediaFrameReference {
      val address = segment.toRawLongValue()
      return MultiSourceMediaFrameReference(Pointer(address))
    }

    public override fun toNative(obj: MultiSourceMediaFrameReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
