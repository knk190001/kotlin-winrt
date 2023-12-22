package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IInkToolbarCustomPenFactory.ABI.IID
import Windows.UI.Xaml.DependencyObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InkToolbarCustomPen.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.InkToolbarCustomPen;{4082207b-2f3d-4e6a-8c27-fe61ef7e70eb})")
@WinRTByReference(brClass = InkToolbarCustomPen.ByReference::class)
public open class InkToolbarCustomPen(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IInkToolbarCustomPen.WithDefault,
    IInkToolbarCustomPenOverrides.WithDefault, IWinRTObject {
  private val __27303657_Interface: IInkToolbarCustomPen.WithDefault by lazy {
    as_27303657()
  }


  private val __843749680_Interface: IInkToolbarCustomPenOverrides.WithDefault by lazy {
    as_843749680()
  }


  public override val __27303657_Ptr: JNAPointer? by lazy {
    __27303657_Interface.__27303657_Ptr
  }


  public override val __843749680_Ptr: JNAPointer? by lazy {
    __843749680_Interface.__843749680_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__27303657_Interface, __843749680_Interface)

  public constructor() : this(ABI.activate())

  private fun as_27303657(): IInkToolbarCustomPen.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarCustomPen.ABI.makeIInkToolbarCustomPen(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarCustomPen>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarCustomPen.ABI.makeIInkToolbarCustomPen(ref.value))
  }

  private fun as_843749680(): IInkToolbarCustomPenOverrides.WithDefault {
    if(pointer == NULL) {
      return(IInkToolbarCustomPenOverrides.ABI.makeIInkToolbarCustomPenOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkToolbarCustomPenOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkToolbarCustomPenOverrides.ABI.makeIInkToolbarCustomPenOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkToolbarCustomPen> {
    public override fun getValue() = InkToolbarCustomPen(pointer.getPointer(0))

    public fun setValue(value: InkToolbarCustomPen): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkToolbarCustomPen, MemoryAddress> {
    public val IInkToolbarCustomPenFactory_Instance: IInkToolbarCustomPenFactory by lazy {
      createIInkToolbarCustomPenFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInkToolbarCustomPenFactory(): IInkToolbarCustomPenFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.InkToolbarCustomPen".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IInkToolbarCustomPenFactory.ABI.makeIInkToolbarCustomPenFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IInkToolbarCustomPenFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): InkToolbarCustomPen {
      val address = segment.toRawLongValue()
      return InkToolbarCustomPen(Pointer(address))
    }

    public override fun toNative(obj: InkToolbarCustomPen): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
