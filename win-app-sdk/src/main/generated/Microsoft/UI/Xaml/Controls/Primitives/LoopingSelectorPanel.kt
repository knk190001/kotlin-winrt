package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Canvas
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
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.LoopingSelectorPanel;{7479c3a4-c5b1-5112-bea9-beef5cc79f57})")
@WinRTByReference(brClass = LoopingSelectorPanel.ByReference::class)
public class LoopingSelectorPanel(
  ptr: JNAPointer? = NULL
) : Canvas(ptr), ILoopingSelectorPanel.WithDefault, IScrollSnapPointsInfo.WithDefault, IWinRTObject
    {
  private val __71660264_Interface: ILoopingSelectorPanel.WithDefault by lazy {
    as_71660264()
  }


  private val __1788393063_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1788393063()
  }


  public override val __71660264_Ptr: JNAPointer? by lazy {
    __71660264_Interface.__71660264_Ptr
  }


  public override val __1788393063_Ptr: JNAPointer? by lazy {
    __1788393063_Interface.__1788393063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__71660264_Interface, __1788393063_Interface)

  private fun as_71660264(): ILoopingSelectorPanel.WithDefault {
    if(pointer == NULL) {
      return(ILoopingSelectorPanel.ABI.makeILoopingSelectorPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoopingSelectorPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoopingSelectorPanel.ABI.makeILoopingSelectorPanel(ref.value))
  }

  private fun as_1788393063(): IScrollSnapPointsInfo.WithDefault {
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
