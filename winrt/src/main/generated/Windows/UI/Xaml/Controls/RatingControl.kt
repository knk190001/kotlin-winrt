package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IRatingControlFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(RatingControl.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RatingControl;{a7d91ca7-e5cf-4963-a24e-9673fe5ffdd5})")
@WinRTByReference(brClass = RatingControl.ByReference::class)
public open class RatingControl(
  ptr: JNAPointer? = NULL
) : Control(ptr), IRatingControl.WithDefault, IWinRTObject {
  private val __1152195996_Interface: IRatingControl.WithDefault by lazy {
    as_1152195996()
  }


  public override val __1152195996_Ptr: JNAPointer? by lazy {
    __1152195996_Interface.__1152195996_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1152195996_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1152195996(): IRatingControl.WithDefault {
    if(pointer == NULL) {
      return(IRatingControl.ABI.makeIRatingControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRatingControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRatingControl.ABI.makeIRatingControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RatingControl>
      {
    public override fun getValue() = RatingControl(pointer.getPointer(0))

    public fun setValue(value: RatingControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RatingControl, MemoryAddress> {
    public val IRatingControlStatics_Instance: IRatingControlStatics by lazy {
      createIRatingControlStatics()
    }


    public val IRatingControlFactory_Instance: IRatingControlFactory by lazy {
      createIRatingControlFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRatingControlStatics(): IRatingControlStatics {
      val refiid = Guid.REFIID(IRatingControlStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RatingControl".toHandle(),refiid,interfacePtr)
      val result = IRatingControlStatics.ABI.makeIRatingControlStatics(interfacePtr.value)
      return result
    }

    public fun createIRatingControlFactory(): IRatingControlFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RatingControl".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRatingControlFactory.ABI.makeIRatingControlFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IRatingControlFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): RatingControl {
      val address = segment.toRawLongValue()
      return RatingControl(Pointer(address))
    }

    public override fun toNative(obj: RatingControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CaptionProperty() = ABI.IRatingControlStatics_Instance.get_CaptionProperty()

    public fun get_InitialSetValueProperty() =
        ABI.IRatingControlStatics_Instance.get_InitialSetValueProperty()

    public fun get_IsClearEnabledProperty() =
        ABI.IRatingControlStatics_Instance.get_IsClearEnabledProperty()

    public fun get_IsReadOnlyProperty() =
        ABI.IRatingControlStatics_Instance.get_IsReadOnlyProperty()

    public fun get_MaxRatingProperty() = ABI.IRatingControlStatics_Instance.get_MaxRatingProperty()

    public fun get_PlaceholderValueProperty() =
        ABI.IRatingControlStatics_Instance.get_PlaceholderValueProperty()

    public fun get_ItemInfoProperty() = ABI.IRatingControlStatics_Instance.get_ItemInfoProperty()

    public fun get_ValueProperty() = ABI.IRatingControlStatics_Instance.get_ValueProperty()
  }
}
