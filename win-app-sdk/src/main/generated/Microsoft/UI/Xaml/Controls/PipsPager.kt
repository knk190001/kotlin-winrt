package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IPipsPagerFactory.ABI.IID
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

@ABIMarker(PipsPager.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.PipsPager;{de7fc5d5-9446-5693-bbf3-fd7f943a567c})")
@WinRTByReference(brClass = PipsPager.ByReference::class)
public open class PipsPager(
  ptr: JNAPointer? = NULL
) : Control(ptr), IPipsPager.WithDefault, IWinRTObject {
  private val __1142814080_Interface: IPipsPager.WithDefault by lazy {
    as_1142814080()
  }


  public override val __1142814080_Ptr: JNAPointer? by lazy {
    __1142814080_Interface.__1142814080_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1142814080_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1142814080(): IPipsPager.WithDefault {
    if(pointer == NULL) {
      return(IPipsPager.ABI.makeIPipsPager(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPipsPager>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPipsPager.ABI.makeIPipsPager(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PipsPager> {
    public override fun getValue() = PipsPager(pointer.getPointer(0))

    public fun setValue(value: PipsPager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PipsPager, MemoryAddress> {
    public val IPipsPagerStatics_Instance: IPipsPagerStatics by lazy {
      createIPipsPagerStatics()
    }


    public val IPipsPagerFactory_Instance: IPipsPagerFactory by lazy {
      createIPipsPagerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPipsPagerStatics(): IPipsPagerStatics {
      val refiid = Guid.REFIID(IPipsPagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PipsPager".toHandle(),refiid,interfacePtr)
      val result = IPipsPagerStatics.ABI.makeIPipsPagerStatics(interfacePtr.value)
      return result
    }

    public fun createIPipsPagerFactory(): IPipsPagerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.PipsPager".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPipsPagerFactory.ABI.makeIPipsPagerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPipsPagerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PipsPager {
      val address = segment.toRawLongValue()
      return PipsPager(Pointer(address))
    }

    public override fun toNative(obj: PipsPager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_NumberOfPagesProperty() =
        ABI.IPipsPagerStatics_Instance.get_NumberOfPagesProperty()

    public fun get_SelectedPageIndexProperty() =
        ABI.IPipsPagerStatics_Instance.get_SelectedPageIndexProperty()

    public fun get_MaxVisiblePipsProperty() =
        ABI.IPipsPagerStatics_Instance.get_MaxVisiblePipsProperty()

    public fun get_OrientationProperty() = ABI.IPipsPagerStatics_Instance.get_OrientationProperty()

    public fun get_PreviousButtonVisibilityProperty() =
        ABI.IPipsPagerStatics_Instance.get_PreviousButtonVisibilityProperty()

    public fun get_NextButtonVisibilityProperty() =
        ABI.IPipsPagerStatics_Instance.get_NextButtonVisibilityProperty()

    public fun get_PreviousButtonStyleProperty() =
        ABI.IPipsPagerStatics_Instance.get_PreviousButtonStyleProperty()

    public fun get_NextButtonStyleProperty() =
        ABI.IPipsPagerStatics_Instance.get_NextButtonStyleProperty()

    public fun get_SelectedPipStyleProperty() =
        ABI.IPipsPagerStatics_Instance.get_SelectedPipStyleProperty()

    public fun get_NormalPipStyleProperty() =
        ABI.IPipsPagerStatics_Instance.get_NormalPipStyleProperty()
  }
}
