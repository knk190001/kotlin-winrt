package Windows.UI.Xaml.Automation

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

@ABIMarker(TransformPatternIdentifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.TransformPatternIdentifiers;{e4115b8c-c3c8-4a37-b994-2709a7811665})")
@WinRTByReference(brClass = TransformPatternIdentifiers.ByReference::class)
public class TransformPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITransformPatternIdentifiers.WithDefault, IWinRTObject {
  private val __1671564469_Interface: ITransformPatternIdentifiers.WithDefault by lazy {
    as_1671564469()
  }


  public override val __1671564469_Ptr: JNAPointer? by lazy {
    __1671564469_Interface.__1671564469_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1671564469_Interface)

  private fun as_1671564469(): ITransformPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(ITransformPatternIdentifiers.ABI.makeITransformPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITransformPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITransformPatternIdentifiers.ABI.makeITransformPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TransformPatternIdentifiers> {
    public override fun getValue() = TransformPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: TransformPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TransformPatternIdentifiers, MemoryAddress> {
    public val ITransformPatternIdentifiersStatics_Instance: ITransformPatternIdentifiersStatics by
        lazy {
      createITransformPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITransformPatternIdentifiersStatics(): ITransformPatternIdentifiersStatics {
      val refiid = Guid.REFIID(ITransformPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.TransformPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          ITransformPatternIdentifiersStatics.ABI.makeITransformPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TransformPatternIdentifiers {
      val address = segment.toRawLongValue()
      return TransformPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: TransformPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CanMoveProperty() =
        ABI.ITransformPatternIdentifiersStatics_Instance.get_CanMoveProperty()

    public fun get_CanResizeProperty() =
        ABI.ITransformPatternIdentifiersStatics_Instance.get_CanResizeProperty()

    public fun get_CanRotateProperty() =
        ABI.ITransformPatternIdentifiersStatics_Instance.get_CanRotateProperty()
  }
}
