package Windows.Data.Text

import Windows.Data.Text.ISemanticTextQueryFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SemanticTextQuery.ABI::class)
@Signature("rc(Windows.Data.Text.SemanticTextQuery;{6a1cab51-1fb2-4909-80b8-35731a2b3e7f})")
@WinRTByReference(brClass = SemanticTextQuery.ByReference::class)
public class SemanticTextQuery(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISemanticTextQuery.WithDefault, IWinRTObject {
  private val __856362798_Interface: ISemanticTextQuery.WithDefault by lazy {
    as_856362798()
  }


  public override val __856362798_Ptr: JNAPointer? by lazy {
    __856362798_Interface.__856362798_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__856362798_Interface)

  public constructor(aqsFilter: String) : this(ABI.activate(aqsFilter))

  public constructor(aqsFilter: String, filterLanguage: String) : this(ABI.activate(aqsFilter,
      filterLanguage))

  private fun as_856362798(): ISemanticTextQuery.WithDefault {
    if(pointer == NULL) {
      return(ISemanticTextQuery.ABI.makeISemanticTextQuery(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISemanticTextQuery>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISemanticTextQuery.ABI.makeISemanticTextQuery(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SemanticTextQuery> {
    public override fun getValue() = SemanticTextQuery(pointer.getPointer(0))

    public fun setValue(value: SemanticTextQuery): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SemanticTextQuery, MemoryAddress> {
    public val ISemanticTextQueryFactory_Instance: ISemanticTextQueryFactory by lazy {
      createISemanticTextQueryFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISemanticTextQueryFactory(): ISemanticTextQueryFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Text.SemanticTextQuery".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISemanticTextQueryFactory.ABI.makeISemanticTextQueryFactory(factoryActivatorPtr.value))
    }

    public fun activate(aqsFilter: String): JNAPointer? =
        ISemanticTextQueryFactory_Instance.Create(aqsFilter)?.pointer

    public fun activate(aqsFilter: String, filterLanguage: String): JNAPointer? =
        ISemanticTextQueryFactory_Instance.CreateWithLanguage(aqsFilter, filterLanguage)?.pointer

    public override fun fromNative(segment: MemoryAddress): SemanticTextQuery {
      val address = segment.toRawLongValue()
      return SemanticTextQuery(Pointer(address))
    }

    public override fun toNative(obj: SemanticTextQuery): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
