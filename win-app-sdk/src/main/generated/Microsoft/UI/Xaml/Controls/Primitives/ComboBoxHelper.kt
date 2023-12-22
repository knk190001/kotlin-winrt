package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.ComboBox
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ComboBoxHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.ComboBoxHelper;{5a3c87ac-c399-5e5f-873f-b9d0e8bcceb7})")
@WinRTByReference(brClass = ComboBoxHelper.ByReference::class)
public class ComboBoxHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IComboBoxHelper.WithDefault, IWinRTObject {
  private val __122442236_Interface: IComboBoxHelper.WithDefault by lazy {
    as_122442236()
  }


  public override val __122442236_Ptr: JNAPointer? by lazy {
    __122442236_Interface.__122442236_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__122442236_Interface)

  private fun as_122442236(): IComboBoxHelper.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxHelper.ABI.makeIComboBoxHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxHelper.ABI.makeIComboBoxHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ComboBoxHelper>
      {
    public override fun getValue() = ComboBoxHelper(pointer.getPointer(0))

    public fun setValue(value: ComboBoxHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBoxHelper, MemoryAddress> {
    public val IComboBoxHelperStatics_Instance: IComboBoxHelperStatics by lazy {
      createIComboBoxHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIComboBoxHelperStatics(): IComboBoxHelperStatics {
      val refiid = Guid.REFIID(IComboBoxHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.ComboBoxHelper".toHandle(),refiid,interfacePtr)
      val result = IComboBoxHelperStatics.ABI.makeIComboBoxHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ComboBoxHelper {
      val address = segment.toRawLongValue()
      return ComboBoxHelper(Pointer(address))
    }

    public override fun toNative(obj: ComboBoxHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KeepInteriorCornersSquareProperty() =
        ABI.IComboBoxHelperStatics_Instance.get_KeepInteriorCornersSquareProperty()

    public fun SetKeepInteriorCornersSquare(comboBox: ComboBox, value: Boolean) =
        ABI.IComboBoxHelperStatics_Instance.SetKeepInteriorCornersSquare(comboBox, value)

    public fun GetKeepInteriorCornersSquare(comboBox: ComboBox) =
        ABI.IComboBoxHelperStatics_Instance.GetKeepInteriorCornersSquare(comboBox)
  }
}
