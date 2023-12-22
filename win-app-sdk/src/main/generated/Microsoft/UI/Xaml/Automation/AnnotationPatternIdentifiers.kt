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

@ABIMarker(AnnotationPatternIdentifiers.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Automation.AnnotationPatternIdentifiers;{92d76915-0cd3-59cd-8ae0-c9004628ba1e})")
@WinRTByReference(brClass = AnnotationPatternIdentifiers.ByReference::class)
public class AnnotationPatternIdentifiers(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAnnotationPatternIdentifiers.WithDefault, IWinRTObject {
  private val __720959921_Interface: IAnnotationPatternIdentifiers.WithDefault by lazy {
    as_720959921()
  }


  public override val __720959921_Ptr: JNAPointer? by lazy {
    __720959921_Interface.__720959921_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__720959921_Interface)

  private fun as_720959921(): IAnnotationPatternIdentifiers.WithDefault {
    if(pointer == NULL) {
      return(IAnnotationPatternIdentifiers.ABI.makeIAnnotationPatternIdentifiers(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnnotationPatternIdentifiers>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnnotationPatternIdentifiers.ABI.makeIAnnotationPatternIdentifiers(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnnotationPatternIdentifiers> {
    public override fun getValue() = AnnotationPatternIdentifiers(pointer.getPointer(0))

    public fun setValue(value: AnnotationPatternIdentifiers): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnnotationPatternIdentifiers, MemoryAddress> {
    public val IAnnotationPatternIdentifiersStatics_Instance: IAnnotationPatternIdentifiersStatics
        by lazy {
      createIAnnotationPatternIdentifiersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnnotationPatternIdentifiersStatics(): IAnnotationPatternIdentifiersStatics {
      val refiid = Guid.REFIID(IAnnotationPatternIdentifiersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Automation.AnnotationPatternIdentifiers".toHandle(),refiid,interfacePtr)
      val result =
          IAnnotationPatternIdentifiersStatics.ABI.makeIAnnotationPatternIdentifiersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AnnotationPatternIdentifiers {
      val address = segment.toRawLongValue()
      return AnnotationPatternIdentifiers(Pointer(address))
    }

    public override fun toNative(obj: AnnotationPatternIdentifiers): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AnnotationTypeIdProperty() =
        ABI.IAnnotationPatternIdentifiersStatics_Instance.get_AnnotationTypeIdProperty()

    public fun get_AnnotationTypeNameProperty() =
        ABI.IAnnotationPatternIdentifiersStatics_Instance.get_AnnotationTypeNameProperty()

    public fun get_AuthorProperty() =
        ABI.IAnnotationPatternIdentifiersStatics_Instance.get_AuthorProperty()

    public fun get_DateTimeProperty() =
        ABI.IAnnotationPatternIdentifiersStatics_Instance.get_DateTimeProperty()

    public fun get_TargetProperty() =
        ABI.IAnnotationPatternIdentifiersStatics_Instance.get_TargetProperty()
  }
}
