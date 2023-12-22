package Windows.Media.ContentRestrictions

import Windows.Media.ContentRestrictions.IRatedContentDescriptionFactory.ABI.IID
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

@ABIMarker(RatedContentDescription.ABI::class)
@Signature("rc(Windows.Media.ContentRestrictions.RatedContentDescription;{694866df-66b2-4dc3-96b1-f090eedee255})")
@WinRTByReference(brClass = RatedContentDescription.ByReference::class)
public class RatedContentDescription(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRatedContentDescription.WithDefault, IWinRTObject {
  private val __1572684041_Interface: IRatedContentDescription.WithDefault by lazy {
    as_1572684041()
  }


  public override val __1572684041_Ptr: JNAPointer? by lazy {
    __1572684041_Interface.__1572684041_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1572684041_Interface)

  public constructor(
    id: String,
    title: String,
    category: RatedContentCategory
  ) : this(ABI.activate(id, title, category))

  private fun as_1572684041(): IRatedContentDescription.WithDefault {
    if(pointer == NULL) {
      return(IRatedContentDescription.ABI.makeIRatedContentDescription(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRatedContentDescription>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRatedContentDescription.ABI.makeIRatedContentDescription(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RatedContentDescription> {
    public override fun getValue() = RatedContentDescription(pointer.getPointer(0))

    public fun setValue(value: RatedContentDescription): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RatedContentDescription, MemoryAddress> {
    public val IRatedContentDescriptionFactory_Instance: IRatedContentDescriptionFactory by lazy {
      createIRatedContentDescriptionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIRatedContentDescriptionFactory(): IRatedContentDescriptionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.ContentRestrictions.RatedContentDescription".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IRatedContentDescriptionFactory.ABI.makeIRatedContentDescriptionFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      id: String,
      title: String,
      category: RatedContentCategory
    ): JNAPointer? = IRatedContentDescriptionFactory_Instance.Create(id, title, category)?.pointer

    public override fun fromNative(segment: MemoryAddress): RatedContentDescription {
      val address = segment.toRawLongValue()
      return RatedContentDescription(Pointer(address))
    }

    public override fun toNative(obj: RatedContentDescription): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
