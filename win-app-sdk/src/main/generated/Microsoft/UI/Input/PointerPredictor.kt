package Microsoft.UI.Input

import Windows.Foundation.IClosable
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

@ABIMarker(PointerPredictor.ABI::class)
@Signature("rc(Microsoft.UI.Input.PointerPredictor;{12c100ec-2100-565f-a60c-f1187f438828})")
@WinRTByReference(brClass = PointerPredictor.ByReference::class)
public class PointerPredictor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPointerPredictor.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __598454728_Interface: IPointerPredictor.WithDefault by lazy {
    as_598454728()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __598454728_Ptr: JNAPointer? by lazy {
    __598454728_Interface.__598454728_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__598454728_Interface, __1260617006_Interface)

  private fun as_598454728(): IPointerPredictor.WithDefault {
    if(pointer == NULL) {
      return(IPointerPredictor.ABI.makeIPointerPredictor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerPredictor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerPredictor.ABI.makeIPointerPredictor(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PointerPredictor> {
    public override fun getValue() = PointerPredictor(pointer.getPointer(0))

    public fun setValue(value: PointerPredictor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerPredictor, MemoryAddress> {
    public val IPointerPredictorStatics_Instance: IPointerPredictorStatics by lazy {
      createIPointerPredictorStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPointerPredictorStatics(): IPointerPredictorStatics {
      val refiid = Guid.REFIID(IPointerPredictorStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.PointerPredictor".toHandle(),refiid,interfacePtr)
      val result = IPointerPredictorStatics.ABI.makeIPointerPredictorStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PointerPredictor {
      val address = segment.toRawLongValue()
      return PointerPredictor(Pointer(address))
    }

    public override fun toNative(obj: PointerPredictor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForInputPointerSource(inputPointerSource: InputPointerSource) =
        ABI.IPointerPredictorStatics_Instance.CreateForInputPointerSource(inputPointerSource)
  }
}
