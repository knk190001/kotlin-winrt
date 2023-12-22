package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.Panel
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(PivotPanel.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.PivotPanel;{8e66cdcf-3bf5-5fe0-b05b-1125e961f0cc})")
@WinRTByReference(brClass = PivotPanel.ByReference::class)
public class PivotPanel(
  ptr: JNAPointer? = NULL
) : Panel(ptr), IPivotPanel.WithDefault, IScrollSnapPointsInfo.WithDefault, IWinRTObject {
  private val __1128162803_Interface: IPivotPanel.WithDefault by lazy {
    as_1128162803()
  }


  private val __1788393063_Interface: IScrollSnapPointsInfo.WithDefault by lazy {
    as_1788393063()
  }


  public override val __1128162803_Ptr: JNAPointer? by lazy {
    __1128162803_Interface.__1128162803_Ptr
  }


  public override val __1788393063_Ptr: JNAPointer? by lazy {
    __1788393063_Interface.__1788393063_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1128162803_Interface, __1788393063_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1128162803(): IPivotPanel.WithDefault {
    if(pointer == NULL) {
      return(IPivotPanel.ABI.makeIPivotPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivotPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivotPanel.ABI.makeIPivotPanel(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PivotPanel> {
    public override fun getValue() = PivotPanel(pointer.getPointer(0))

    public fun setValue(value: PivotPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PivotPanel, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.PivotPanel".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): PivotPanel {
      val address = segment.toRawLongValue()
      return PivotPanel(Pointer(address))
    }

    public override fun toNative(obj: PivotPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
