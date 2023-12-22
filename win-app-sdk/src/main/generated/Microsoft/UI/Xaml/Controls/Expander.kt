package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IExpanderFactory.ABI.IID
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

@ABIMarker(Expander.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Expander;{ca633942-e584-55c2-b7ee-cffc73c8127a})")
@WinRTByReference(brClass = Expander.ByReference::class)
public open class Expander(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), IExpander.WithDefault, IWinRTObject {
  private val __2059977614_Interface: IExpander.WithDefault by lazy {
    as_2059977614()
  }


  public override val __2059977614_Ptr: JNAPointer? by lazy {
    __2059977614_Interface.__2059977614_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2059977614_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2059977614(): IExpander.WithDefault {
    if(pointer == NULL) {
      return(IExpander.ABI.makeIExpander(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpander>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpander.ABI.makeIExpander(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Expander> {
    public override fun getValue() = Expander(pointer.getPointer(0))

    public fun setValue(value: Expander): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Expander, MemoryAddress> {
    public val IExpanderStatics_Instance: IExpanderStatics by lazy {
      createIExpanderStatics()
    }


    public val IExpanderFactory_Instance: IExpanderFactory by lazy {
      createIExpanderFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIExpanderStatics(): IExpanderStatics {
      val refiid = Guid.REFIID(IExpanderStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Expander".toHandle(),refiid,interfacePtr)
      val result = IExpanderStatics.ABI.makeIExpanderStatics(interfacePtr.value)
      return result
    }

    public fun createIExpanderFactory(): IExpanderFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Expander".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IExpanderFactory.ABI.makeIExpanderFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IExpanderFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): Expander {
      val address = segment.toRawLongValue()
      return Expander(Pointer(address))
    }

    public override fun toNative(obj: Expander): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_HeaderProperty() = ABI.IExpanderStatics_Instance.get_HeaderProperty()

    public fun get_HeaderTemplateProperty() =
        ABI.IExpanderStatics_Instance.get_HeaderTemplateProperty()

    public fun get_HeaderTemplateSelectorProperty() =
        ABI.IExpanderStatics_Instance.get_HeaderTemplateSelectorProperty()

    public fun get_IsExpandedProperty() = ABI.IExpanderStatics_Instance.get_IsExpandedProperty()

    public fun get_ExpandDirectionProperty() =
        ABI.IExpanderStatics_Instance.get_ExpandDirectionProperty()
  }
}
