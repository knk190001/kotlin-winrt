package Microsoft.UI.Xaml.Controls.Primitives

import Microsoft.UI.Xaml.Controls.AutoSuggestBox
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

@ABIMarker(AutoSuggestBoxHelper.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.Primitives.AutoSuggestBoxHelper;{1e56736c-8248-57d9-ac04-e4e7dcc3f9e1})")
@WinRTByReference(brClass = AutoSuggestBoxHelper.ByReference::class)
public class AutoSuggestBoxHelper(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAutoSuggestBoxHelper.WithDefault, IWinRTObject {
  private val __392733739_Interface: IAutoSuggestBoxHelper.WithDefault by lazy {
    as_392733739()
  }


  public override val __392733739_Ptr: JNAPointer? by lazy {
    __392733739_Interface.__392733739_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__392733739_Interface)

  private fun as_392733739(): IAutoSuggestBoxHelper.WithDefault {
    if(pointer == NULL) {
      return(IAutoSuggestBoxHelper.ABI.makeIAutoSuggestBoxHelper(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAutoSuggestBoxHelper>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAutoSuggestBoxHelper.ABI.makeIAutoSuggestBoxHelper(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AutoSuggestBoxHelper> {
    public override fun getValue() = AutoSuggestBoxHelper(pointer.getPointer(0))

    public fun setValue(value: AutoSuggestBoxHelper): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AutoSuggestBoxHelper, MemoryAddress> {
    public val IAutoSuggestBoxHelperStatics_Instance: IAutoSuggestBoxHelperStatics by lazy {
      createIAutoSuggestBoxHelperStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAutoSuggestBoxHelperStatics(): IAutoSuggestBoxHelperStatics {
      val refiid = Guid.REFIID(IAutoSuggestBoxHelperStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.Primitives.AutoSuggestBoxHelper".toHandle(),refiid,interfacePtr)
      val result =
          IAutoSuggestBoxHelperStatics.ABI.makeIAutoSuggestBoxHelperStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AutoSuggestBoxHelper {
      val address = segment.toRawLongValue()
      return AutoSuggestBoxHelper(Pointer(address))
    }

    public override fun toNative(obj: AutoSuggestBoxHelper): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KeepInteriorCornersSquareProperty() =
        ABI.IAutoSuggestBoxHelperStatics_Instance.get_KeepInteriorCornersSquareProperty()

    public fun SetKeepInteriorCornersSquare(autoSuggestBox: AutoSuggestBox, value: Boolean) =
        ABI.IAutoSuggestBoxHelperStatics_Instance.SetKeepInteriorCornersSquare(autoSuggestBox,
        value)

    public fun GetKeepInteriorCornersSquare(autoSuggestBox: AutoSuggestBox) =
        ABI.IAutoSuggestBoxHelperStatics_Instance.GetKeepInteriorCornersSquare(autoSuggestBox)
  }
}
