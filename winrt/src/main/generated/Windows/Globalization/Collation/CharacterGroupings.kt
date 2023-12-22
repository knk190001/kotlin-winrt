package Windows.Globalization.Collation

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(CharacterGroupings.ABI::class)
@Signature("rc(Windows.Globalization.Collation.CharacterGroupings;{b8d20a75-d4cf-4055-80e5-ce169c226496})")
@WinRTByReference(brClass = CharacterGroupings.ByReference::class)
public class CharacterGroupings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICharacterGroupings.WithDefault, IVectorView<CharacterGrouping?>,
    IIterable<CharacterGrouping?>, IWinRTObject {
  private val __2104786111_Interface: ICharacterGroupings.WithDefault by lazy {
    as_2104786111()
  }


  private val __970637876_Interface: IVectorView<CharacterGrouping?> by lazy {
    as_970637876()
  }


  private val __1449643190_Interface: IIterable<CharacterGrouping?> by lazy {
    as_1449643190()
  }


  public override val __970637876_Type: KType = typeOf<IVectorView<CharacterGrouping?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<CharacterGrouping?>>()

  public override val __2104786111_Ptr: JNAPointer? by lazy {
    __2104786111_Interface.__2104786111_Ptr
  }


  public override val __970637876_Ptr: JNAPointer? by lazy {
    __970637876_Interface.__970637876_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2104786111_Interface, __970637876_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

  public constructor(language: String) : this(ABI.activate(language))

  private fun as_2104786111(): ICharacterGroupings.WithDefault {
    if(pointer == NULL) {
      return(ICharacterGroupings.ABI.makeICharacterGroupings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICharacterGroupings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICharacterGroupings.ABI.makeICharacterGroupings(ref.value))
  }

  private fun as_970637876(): IVectorView<CharacterGrouping?> {
    if(pointer == NULL) {
      return(IVectorView.ABI.makeIVectorView<CharacterGrouping?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVectorView<CharacterGrouping?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVectorView.ABI.makeIVectorView<CharacterGrouping?>(ref.value))
  }

  private fun as_1449643190(): IIterable<CharacterGrouping?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<CharacterGrouping?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<CharacterGrouping?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<CharacterGrouping?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CharacterGroupings> {
    public override fun getValue() = CharacterGroupings(pointer.getPointer(0))

    public fun setValue(value: CharacterGroupings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CharacterGroupings, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICharacterGroupingsFactory_Instance: ICharacterGroupingsFactory by lazy {
      createICharacterGroupingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.Collation.CharacterGroupings".toHandle(),
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

    public fun createICharacterGroupingsFactory(): ICharacterGroupingsFactory {
      val refiid = Guid.REFIID(ICharacterGroupingsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.Collation.CharacterGroupings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICharacterGroupingsFactory.ABI.makeICharacterGroupingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(language: String): JNAPointer? =
        ICharacterGroupingsFactory_Instance.Create(language)?.pointer

    public override fun fromNative(segment: MemoryAddress): CharacterGroupings {
      val address = segment.toRawLongValue()
      return CharacterGroupings(Pointer(address))
    }

    public override fun toNative(obj: CharacterGroupings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
