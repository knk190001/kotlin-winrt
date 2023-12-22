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

@ABIMarker(TransformPattern2Identifiers.ABI::class)
@Signature("rc(Windows.UI.Xaml.Automation.TransformPattern2Identifiers;{08aaa03d-dea7-402f-8097-9a2783d60e5d})")
@WinRTByReference(brClass = TransformPattern2Identifiers.ByReference::class)
public class TransformPattern2Identifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITransformPattern2Identifiers.WithDefault, IWinRTObject {
  private val __992856823_Interface: ITransformPattern2Identifiers.WithDefault by lazy {
    as_992856823()
  }


  public override val __992856823_Ptr: JNAPointer? by lazy {
    __992856823_Interface.__992856823_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__992856823_Interface)

  private fun as_992856823(): ITransformPattern2Identifiers.WithDefault {
    if(pointer == NULL) {
      return(ITransformPattern2Identifiers.ABI.makeITransformPattern2Identifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITransformPattern2Identifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITransformPattern2Identifiers.ABI.makeITransformPattern2Identifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TransformPattern2Identifiers> {
    public override fun getValue() = TransformPattern2Identifiers(pointer.getPointer(0))

    public fun setValue(value: TransformPattern2Identifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TransformPattern2Identifiers, MemoryAddress> {
    public val ITransformPattern2IdentifiersStatics_Instance: ITransformPattern2IdentifiersStatics
        by lazy {
      createITransformPattern2IdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITransformPattern2IdentifiersStatics(): ITransformPattern2IdentifiersStatics {
      val refiid = Guid.REFIID(ITransformPattern2IdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Automation.TransformPattern2Identifiers".toHandle(),refiid,interfacePtr)
      val result =
          ITransformPattern2IdentifiersStatics.ABI.makeITransformPattern2IdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TransformPattern2Identifiers {
      val address = segment.toRawLongValue()
      return TransformPattern2Identifiers(Pointer(address))
    }

    public override fun toNative(obj: TransformPattern2Identifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_CanZoomProperty() =
        ABI.ITransformPattern2IdentifiersStatics_Instance.get_CanZoomProperty()

    public fun get_ZoomLevelProperty() =
        ABI.ITransformPattern2IdentifiersStatics_Instance.get_ZoomLevelProperty()

    public fun get_MaxZoomProperty() =
        ABI.ITransformPattern2IdentifiersStatics_Instance.get_MaxZoomProperty()

    public fun get_MinZoomProperty() =
        ABI.ITransformPattern2IdentifiersStatics_Instance.get_MinZoomProperty()
  }
}
