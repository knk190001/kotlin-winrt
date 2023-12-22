package Windows.UI.Xaml.Controls

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

@ABIMarker(IconSource.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.IconSource;{92ec8d55-45eb-47a4-863c-91b224044f9b})")
@WinRTByReference(brClass = IconSource.ByReference::class)
public open class IconSource(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IIconSource.WithDefault, IWinRTObject {
  private val __2024113392_Interface: IIconSource.WithDefault by lazy {
    as_2024113392()
  }


  public override val __2024113392_Ptr: JNAPointer? by lazy {
    __2024113392_Interface.__2024113392_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2024113392_Interface)

  private fun as_2024113392(): IIconSource.WithDefault {
    if(pointer == NULL) {
      return(IIconSource.ABI.makeIIconSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIconSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIconSource.ABI.makeIIconSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IconSource> {
    public override fun getValue() = IconSource(pointer.getPointer(0))

    public fun setValue(value: IconSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IconSource, MemoryAddress> {
    public val IIconSourceStatics_Instance: IIconSourceStatics by lazy {
      createIIconSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIconSourceStatics(): IIconSourceStatics {
      val refiid = Guid.REFIID(IIconSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Controls.IconSource".toHandle(),refiid,interfacePtr)
      val result = IIconSourceStatics.ABI.makeIIconSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): IconSource {
      val address = segment.toRawLongValue()
      return IconSource(Pointer(address))
    }

    public override fun toNative(obj: IconSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ForegroundProperty() = ABI.IIconSourceStatics_Instance.get_ForegroundProperty()
  }
}
