package Microsoft.UI.Xaml.Automation

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

@ABIMarker(StylesPatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.StylesPatternIdentifiers;{13aeca5e-b496-5df5-aea5-330e1f0490eb})")
@WinRTByReference(brClass = StylesPatternIdentifiers.ByReference::class)
public class StylesPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IStylesPatternIdentifiers.WithDefault, IWinRTObject {
  private val __1267368002_Interface: IStylesPatternIdentifiers.WithDefault by lazy {
    as_1267368002()
  }


  public override val __1267368002_Ptr: JNAPointer? by lazy {
    __1267368002_Interface.__1267368002_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1267368002_Interface)

  private fun as_1267368002(): IStylesPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IStylesPatternIdentifiers.ABI.makeIStylesPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStylesPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStylesPatternIdentifiers.ABI.makeIStylesPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StylesPatternIdentifiers> {
    public override fun getValue() = StylesPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: StylesPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StylesPatternIdentifiers, MemoryAddress> {
    public val IStylesPatternIdentifiersStatics_Instance: IStylesPatternIdentifiersStatics by lazy {
      createIStylesPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStylesPatternIdentifiersStatics(): IStylesPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IStylesPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.StylesPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IStylesPatternIdentifiersStatics.ABI.makeIStylesPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): StylesPatternIdentifiers {
      val address = segment.toRawLongValue()
      return StylesPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: StylesPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ExtendedPropertiesProperty() =
        ABI.IStylesPatternIdentifiersStatics_Instance.get_ExtendedPropertiesProperty()

    public fun get_FillColorProperty() =
        ABI.IStylesPatternIdentifiersStatics_Instance.get_FillColorProperty()

    public fun get_FillPatternColorProperty() =
        ABI.IStylesPatternIdentifiersStatics_Instance.get_FillPatternColorProperty()

    public fun get_FillPatternStyleProperty() =
        ABI.IStylesPatternIdentifiersStatics_Instance.get_FillPatternStyleProperty()

    public fun get_ShapeProperty() =
        ABI.IStylesPatternIdentifiersStatics_Instance.get_ShapeProperty()

    public fun get_StyleIdProperty() =
        ABI.IStylesPatternIdentifiersStatics_Instance.get_StyleIdProperty()

    public fun get_StyleNameProperty() =
        ABI.IStylesPatternIdentifiersStatics_Instance.get_StyleNameProperty()
  }
}
