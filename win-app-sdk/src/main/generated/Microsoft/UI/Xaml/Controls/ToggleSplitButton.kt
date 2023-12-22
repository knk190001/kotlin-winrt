package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IToggleSplitButtonFactory.ABI.IID
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

@ABIMarker(ToggleSplitButton.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ToggleSplitButton;{5c0f247b-bd00-5509-88a8-b09007ae22b0})")
@WinRTByReference(brClass = ToggleSplitButton.ByReference::class)
public open class ToggleSplitButton(
  ptr: JNAPointer? = NULL
) : SplitButton(ptr), IToggleSplitButton.WithDefault, IWinRTObject {
  private val __398009327_Interface: IToggleSplitButton.WithDefault by lazy {
    as_398009327()
  }


  public override val __398009327_Ptr: JNAPointer? by lazy {
    __398009327_Interface.__398009327_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__398009327_Interface)

  public constructor() : this(ABI.activate())

  private fun as_398009327(): IToggleSplitButton.WithDefault {
    if(pointer == NULL) {
      return(IToggleSplitButton.ABI.makeIToggleSplitButton(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleSplitButton>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleSplitButton.ABI.makeIToggleSplitButton(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToggleSplitButton> {
    public override fun getValue() = ToggleSplitButton(pointer.getPointer(0))

    public fun setValue(value: ToggleSplitButton): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleSplitButton, MemoryAddress> {
    public val IToggleSplitButtonStatics_Instance: IToggleSplitButtonStatics by lazy {
      createIToggleSplitButtonStatics()
    }


    public val IToggleSplitButtonFactory_Instance: IToggleSplitButtonFactory by lazy {
      createIToggleSplitButtonFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIToggleSplitButtonStatics(): IToggleSplitButtonStatics {
      val refiid = Guid.REFIID(IToggleSplitButtonStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToggleSplitButton".toHandle(),refiid,interfacePtr)
      val result = IToggleSplitButtonStatics.ABI.makeIToggleSplitButtonStatics(interfacePtr.value)
      return result
    }

    public fun createIToggleSplitButtonFactory(): IToggleSplitButtonFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.ToggleSplitButton".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IToggleSplitButtonFactory.ABI.makeIToggleSplitButtonFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IToggleSplitButtonFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): ToggleSplitButton {
      val address = segment.toRawLongValue()
      return ToggleSplitButton(Pointer(address))
    }

    public override fun toNative(obj: ToggleSplitButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsCheckedProperty() =
        ABI.IToggleSplitButtonStatics_Instance.get_IsCheckedProperty()
  }
}
