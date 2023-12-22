package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.DependencyObject
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
@Signature("rc(Microsoft.UI.Xaml.Controls.IconSource;{39e6b320-a2af-5ee3-b7e9-4ba4aa80541a})")
@WinRTByReference(brClass = IconSource.ByReference::class)
public open class IconSource(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IIconSource.WithDefault, IIconSourceOverrides.WithDefault, IWinRTObject {
  private val __1383197957_Interface: IIconSource.WithDefault by lazy {
    as_1383197957()
  }


  private val __1427729044_Interface: IIconSourceOverrides.WithDefault by lazy {
    as_1427729044()
  }


  public override val __1383197957_Ptr: JNAPointer? by lazy {
    __1383197957_Interface.__1383197957_Ptr
  }


  public override val __1427729044_Ptr: JNAPointer? by lazy {
    __1427729044_Interface.__1427729044_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1383197957_Interface, __1427729044_Interface)

  private fun as_1383197957(): IIconSource.WithDefault {
    if(pointer == NULL) {
      return(IIconSource.ABI.makeIIconSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIconSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIconSource.ABI.makeIIconSource(ref.value))
  }

  private fun as_1427729044(): IIconSourceOverrides.WithDefault {
    if(pointer == NULL) {
      return(IIconSourceOverrides.ABI.makeIIconSourceOverrides(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIconSourceOverrides>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIconSourceOverrides.ABI.makeIIconSourceOverrides(ref.value))
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.IconSource".toHandle(),refiid,interfacePtr)
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
