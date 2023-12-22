package Windows.Storage.Search

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(IndexableContent.ABI::class)
@Signature("rc(Windows.Storage.Search.IndexableContent;{ccf1a05f-d4b5-483a-b06e-e0db1ec420e4})")
@WinRTByReference(brClass = IndexableContent.ByReference::class)
public class IndexableContent(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIndexableContent.WithDefault, IWinRTObject {
  private val __1667156688_Interface: IIndexableContent.WithDefault by lazy {
    as_1667156688()
  }


  public override val __1667156688_Ptr: JNAPointer? by lazy {
    __1667156688_Interface.__1667156688_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1667156688_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1667156688(): IIndexableContent.WithDefault {
    if(pointer == NULL) {
      return(IIndexableContent.ABI.makeIIndexableContent(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIndexableContent>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIndexableContent.ABI.makeIIndexableContent(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IndexableContent> {
    public override fun getValue() = IndexableContent(pointer.getPointer(0))

    public fun setValue(value: IndexableContent): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IndexableContent, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Storage.Search.IndexableContent".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): IndexableContent {
      val address = segment.toRawLongValue()
      return IndexableContent(Pointer(address))
    }

    public override fun toNative(obj: IndexableContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
