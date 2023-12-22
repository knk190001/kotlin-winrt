package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.DependencyObject
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(RowDefinition.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.RowDefinition;{4abae829-d80c-4a5e-a48c-f8b3d3b6533d})")
@WinRTByReference(brClass = RowDefinition.ByReference::class)
public class RowDefinition(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IRowDefinition.WithDefault, IWinRTObject {
  private val __788335567_Interface: IRowDefinition.WithDefault by lazy {
    as_788335567()
  }


  public override val __788335567_Ptr: JNAPointer? by lazy {
    __788335567_Interface.__788335567_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__788335567_Interface)

  public constructor() : this(ABI.activate())

  private fun as_788335567(): IRowDefinition.WithDefault {
    if(pointer == NULL) {
      return(IRowDefinition.ABI.makeIRowDefinition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRowDefinition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRowDefinition.ABI.makeIRowDefinition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<RowDefinition>
      {
    public override fun getValue() = RowDefinition(pointer.getPointer(0))

    public fun setValue(value: RowDefinition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RowDefinition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IRowDefinitionStatics_Instance: IRowDefinitionStatics by lazy {
      createIRowDefinitionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RowDefinition".toHandle(),
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

    public fun createIRowDefinitionStatics(): IRowDefinitionStatics {
      val refiid = Guid.REFIID(IRowDefinitionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.RowDefinition".toHandle(),refiid,interfacePtr)
      val result = IRowDefinitionStatics.ABI.makeIRowDefinitionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): RowDefinition {
      val address = segment.toRawLongValue()
      return RowDefinition(Pointer(address))
    }

    public override fun toNative(obj: RowDefinition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeightProperty() = ABI.IRowDefinitionStatics_Instance.get_HeightProperty()

    public fun get_MaxHeightProperty() = ABI.IRowDefinitionStatics_Instance.get_MaxHeightProperty()

    public fun get_MinHeightProperty() = ABI.IRowDefinitionStatics_Instance.get_MinHeightProperty()
  }
}
