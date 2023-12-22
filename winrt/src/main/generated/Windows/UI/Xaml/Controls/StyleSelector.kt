package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.IStyleSelectorFactory.ABI.IID
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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StyleSelector.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.StyleSelector;{d1113f67-d8c1-4ae4-98f0-d8504502f08b})")
@WinRTByReference(brClass = StyleSelector.ByReference::class)
public open class StyleSelector(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStyleSelector.WithDefault, IStyleSelectorOverrides.WithDefault, IWinRTObject
    {
  private val __1370986988_Interface: IStyleSelector.WithDefault by lazy {
    as_1370986988()
  }


  private val __2042253709_Interface: IStyleSelectorOverrides.WithDefault by lazy {
    as_2042253709()
  }


  public override val __1370986988_Ptr: JNAPointer? by lazy {
    __1370986988_Interface.__1370986988_Ptr
  }


  public override val __2042253709_Ptr: JNAPointer? by lazy {
    __2042253709_Interface.__2042253709_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1370986988_Interface, __2042253709_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1370986988(): IStyleSelector.WithDefault {
    if(pointer == NULL) {
      return(IStyleSelector.ABI.makeIStyleSelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStyleSelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStyleSelector.ABI.makeIStyleSelector(ref.value))
  }

  private fun as_2042253709(): IStyleSelectorOverrides.WithDefault {
    if(pointer == NULL) {
      return(IStyleSelectorOverrides.ABI.makeIStyleSelectorOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStyleSelectorOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStyleSelectorOverrides.ABI.makeIStyleSelectorOverrides(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<StyleSelector>
      {
    public override fun getValue() = StyleSelector(pointer.getPointer(0))

    public fun setValue(value: StyleSelector): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StyleSelector, MemoryAddress> {
    public val IStyleSelectorFactory_Instance: IStyleSelectorFactory by lazy {
      createIStyleSelectorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStyleSelectorFactory(): IStyleSelectorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.StyleSelector".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStyleSelectorFactory.ABI.makeIStyleSelectorFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IStyleSelectorFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): StyleSelector {
      val address = segment.toRawLongValue()
      return StyleSelector(Pointer(address))
    }

    public override fun toNative(obj: StyleSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
