package Windows.UI.Xaml.Input

import Windows.Foundation.Point
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ManipulationPivot.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.ManipulationPivot;{2e3838a5-e6c2-4998-82ac-18748b141666})")
@WinRTByReference(brClass = ManipulationPivot.ByReference::class)
public class ManipulationPivot(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IManipulationPivot.WithDefault, IWinRTObject {
  private val __1144494735_Interface: IManipulationPivot.WithDefault by lazy {
    as_1144494735()
  }


  public override val __1144494735_Ptr: JNAPointer? by lazy {
    __1144494735_Interface.__1144494735_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1144494735_Interface)

  public constructor() : this(ABI.activate())

  public constructor(center: Point, radius: Double) : this(ABI.activate(center, radius))

  private fun as_1144494735(): IManipulationPivot.WithDefault {
    if(pointer == NULL) {
      return(IManipulationPivot.ABI.makeIManipulationPivot(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IManipulationPivot>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IManipulationPivot.ABI.makeIManipulationPivot(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ManipulationPivot> {
    public override fun getValue() = ManipulationPivot(pointer.getPointer(0))

    public fun setValue(value: ManipulationPivot): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ManipulationPivot, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IManipulationPivotFactory_Instance: IManipulationPivotFactory by lazy {
      createIManipulationPivotFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.ManipulationPivot".toHandle(),
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

    public fun createIManipulationPivotFactory(): IManipulationPivotFactory {
      val refiid = Guid.REFIID(IManipulationPivotFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.ManipulationPivot".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IManipulationPivotFactory.ABI.makeIManipulationPivotFactory(factoryActivatorPtr.value))
    }

    public fun activate(center: Point, radius: Double): JNAPointer? =
        IManipulationPivotFactory_Instance.CreateInstanceWithCenterAndRadius(center,
        radius)?.pointer

    public override fun fromNative(segment: MemoryAddress): ManipulationPivot {
      val address = segment.toRawLongValue()
      return ManipulationPivot(Pointer(address))
    }

    public override fun toNative(obj: ManipulationPivot): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
