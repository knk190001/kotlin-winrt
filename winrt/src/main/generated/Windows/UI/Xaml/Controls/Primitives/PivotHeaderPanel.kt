package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.Canvas
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

@ABIMarker(PivotHeaderPanel.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.PivotHeaderPanel;{21484ebc-9241-4203-bd37-6c08fb096612})")
@WinRTByReference(brClass = PivotHeaderPanel.ByReference::class)
public class PivotHeaderPanel(
  ptr: JNAPointer? = NULL
) : Canvas(ptr), IPivotHeaderPanel.WithDefault, IWinRTObject {
  private val __743941967_Interface: IPivotHeaderPanel.WithDefault by lazy {
    as_743941967()
  }


  public override val __743941967_Ptr: JNAPointer? by lazy {
    __743941967_Interface.__743941967_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__743941967_Interface)

  public constructor() : this(ABI.activate())

  private fun as_743941967(): IPivotHeaderPanel.WithDefault {
    if(pointer == NULL) {
      return(IPivotHeaderPanel.ABI.makeIPivotHeaderPanel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPivotHeaderPanel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPivotHeaderPanel.ABI.makeIPivotHeaderPanel(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PivotHeaderPanel> {
    public override fun getValue() = PivotHeaderPanel(pointer.getPointer(0))

    public fun setValue(value: PivotHeaderPanel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PivotHeaderPanel, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.Primitives.PivotHeaderPanel".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PivotHeaderPanel {
      val address = segment.toRawLongValue()
      return PivotHeaderPanel(Pointer(address))
    }

    public override fun toNative(obj: PivotHeaderPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
