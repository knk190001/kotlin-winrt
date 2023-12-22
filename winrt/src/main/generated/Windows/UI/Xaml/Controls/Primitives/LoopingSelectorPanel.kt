package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Canvas
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LoopingSelectorPanel.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.LoopingSelectorPanel;{40a9ba70-1011-4778-87f7-6bfd20d6377d})")
@WinRTByReference(brClass = LoopingSelectorPanel.ByReference::class)
public class LoopingSelectorPanel(
  ptr: JNAPointer? = NULL
) : Canvas(ptr), ILoopingSelectorPanel.WithDefault, IScrollSnapPointsInfo.WithDefault, IWinRTObject
    {
  private val __701008861_Interface: ILoopingSelectorPanel.WithDefault by lazy {
    as_701008861()
  }


  private val __1877225636_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1877225636()
  }


  public override val __701008861_Ptr: JNAPointer? by lazy {
    __701008861_Interface.__701008861_Ptr
  }


  public override val __1877225636_Ptr: JNAPointer? by lazy {
    __1877225636_Interface.__1877225636_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__701008861_Interface, __1877225636_Interface)

  private fun as_701008861(): ILoopingSelectorPanel.WithDefault {
    if(pointer == NULL) {
      return(ILoopingSelectorPanel.ABI.makeILoopingSelectorPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoopingSelectorPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoopingSelectorPanel.ABI.makeILoopingSelectorPanel(ref.value))
  }

  private fun as_1877225636(): IScrollSnapPointsInfo.WithDefault {
    if(pointer == NULL) {
      return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScrollSnapPointsInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScrollSnapPointsInfo.ABI.makeIScrollSnapPointsInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoopingSelectorPanel> {
    public override fun getValue() = LoopingSelectorPanel(pointer.getPointer(0))

    public fun setValue(value: LoopingSelectorPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoopingSelectorPanel, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LoopingSelectorPanel {
      val address = segment.toRawLongValue()
      return LoopingSelectorPanel(Pointer(address))
    }

    public override fun toNative(obj: LoopingSelectorPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
