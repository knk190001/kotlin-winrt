package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.FrameworkTemplate
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

@ABIMarker(ItemsPanelTemplate.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ItemsPanelTemplate;{14ead768-34b2-4b97-bf3c-e8d73230a2aa})")
@WinRTByReference(brClass = ItemsPanelTemplate.ByReference::class)
public class ItemsPanelTemplate(
  ptr: JNAPointer? = NULL
) : FrameworkTemplate(ptr), IItemsPanelTemplate.WithDefault, IWinRTObject {
  private val __56695846_Interface: IItemsPanelTemplate.WithDefault by lazy {
    as_56695846()
  }


  public override val __56695846_Ptr: JNAPointer? by lazy {
    __56695846_Interface.__56695846_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__56695846_Interface)

  public constructor() : this(ABI.activate())

  private fun as_56695846(): IItemsPanelTemplate.WithDefault {
    if(pointer == NULL) {
      return(IItemsPanelTemplate.ABI.makeIItemsPanelTemplate(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemsPanelTemplate>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemsPanelTemplate.ABI.makeIItemsPanelTemplate(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemsPanelTemplate> {
    public override fun getValue() = ItemsPanelTemplate(pointer.getPointer(0))

    public fun setValue(value: ItemsPanelTemplate): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemsPanelTemplate, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.ItemsPanelTemplate".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ItemsPanelTemplate {
      val address = segment.toRawLongValue()
      return ItemsPanelTemplate(Pointer(address))
    }

    public override fun toNative(obj: ItemsPanelTemplate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
