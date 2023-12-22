package Windows.UI.StartScreen

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

@ABIMarker(SecondaryTileVisualElements.ABI::class)
@Signature("rc(Windows.UI.StartScreen.SecondaryTileVisualElements;{1d8df333-815e-413f-9f50-a81da70a96b2})")
@WinRTByReference(brClass = SecondaryTileVisualElements.ByReference::class)
public class SecondaryTileVisualElements(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISecondaryTileVisualElements.WithDefault,
    ISecondaryTileVisualElements2.WithDefault, ISecondaryTileVisualElements3.WithDefault,
    ISecondaryTileVisualElements4.WithDefault, IWinRTObject {
  private val __576668017_Interface: ISecondaryTileVisualElements.WithDefault by lazy {
    as_576668017()
  }


  private val __696839293_Interface: ISecondaryTileVisualElements2.WithDefault by lazy {
    as_696839293()
  }


  private val __696839292_Interface: ISecondaryTileVisualElements3.WithDefault by lazy {
    as_696839292()
  }


  private val __696839291_Interface: ISecondaryTileVisualElements4.WithDefault by lazy {
    as_696839291()
  }


  public override val __576668017_Ptr: JNAPointer? by lazy {
    __576668017_Interface.__576668017_Ptr
  }


  public override val __696839293_Ptr: JNAPointer? by lazy {
    __696839293_Interface.__696839293_Ptr
  }


  public override val __696839292_Ptr: JNAPointer? by lazy {
    __696839292_Interface.__696839292_Ptr
  }


  public override val __696839291_Ptr: JNAPointer? by lazy {
    __696839291_Interface.__696839291_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__576668017_Interface, __696839293_Interface, __696839292_Interface,
        __696839291_Interface)

  private fun as_576668017(): ISecondaryTileVisualElements.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryTileVisualElements.ABI.makeISecondaryTileVisualElements(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryTileVisualElements>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryTileVisualElements.ABI.makeISecondaryTileVisualElements(ref.value))
  }

  private fun as_696839293(): ISecondaryTileVisualElements2.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryTileVisualElements2.ABI.makeISecondaryTileVisualElements2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryTileVisualElements2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryTileVisualElements2.ABI.makeISecondaryTileVisualElements2(ref.value))
  }

  private fun as_696839292(): ISecondaryTileVisualElements3.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryTileVisualElements3.ABI.makeISecondaryTileVisualElements3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryTileVisualElements3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryTileVisualElements3.ABI.makeISecondaryTileVisualElements3(ref.value))
  }

  private fun as_696839291(): ISecondaryTileVisualElements4.WithDefault {
    if(pointer == NULL) {
      return(ISecondaryTileVisualElements4.ABI.makeISecondaryTileVisualElements4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISecondaryTileVisualElements4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISecondaryTileVisualElements4.ABI.makeISecondaryTileVisualElements4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SecondaryTileVisualElements> {
    public override fun getValue() = SecondaryTileVisualElements(pointer.getPointer(0))

    public fun setValue(value: SecondaryTileVisualElements): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SecondaryTileVisualElements, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SecondaryTileVisualElements {
      val address = segment.toRawLongValue()
      return SecondaryTileVisualElements(Pointer(address))
    }

    public override fun toNative(obj: SecondaryTileVisualElements): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
