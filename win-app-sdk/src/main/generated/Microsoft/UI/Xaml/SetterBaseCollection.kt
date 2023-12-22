package Microsoft.UI.Xaml

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVector
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
import kotlin.reflect.KType
import kotlin.reflect.typeOf

@ABIMarker(SetterBaseCollection.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.SetterBaseCollection;{63bf7c0f-b290-5c0c-9185-3338cd350d7f})")
@WinRTByReference(brClass = SetterBaseCollection.ByReference::class)
public class SetterBaseCollection(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISetterBaseCollection.WithDefault, IVector<SetterBase?>,
    IIterable<SetterBase?>, IWinRTObject {
  private val __1986945397_Interface: ISetterBaseCollection.WithDefault by lazy {
    as_1986945397()
  }


  private val __1070388601_Interface: IVector<SetterBase?> by lazy {
    as_1070388601()
  }


  private val __1449643190_Interface: IIterable<SetterBase?> by lazy {
    as_1449643190()
  }


  public override val __1070388601_Type: KType = typeOf<IVector<SetterBase?>>()

  public override val __1449643190_Type: KType = typeOf<IIterable<SetterBase?>>()

  public override val __1986945397_Ptr: JNAPointer? by lazy {
    __1986945397_Interface.__1986945397_Ptr
  }


  public override val __1070388601_Ptr: JNAPointer? by lazy {
    __1070388601_Interface.__1070388601_Ptr
  }


  public override val __1449643190_Ptr: JNAPointer? by lazy {
    __1449643190_Interface.__1449643190_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1986945397_Interface, __1070388601_Interface, __1449643190_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1986945397(): ISetterBaseCollection.WithDefault {
    if(pointer == NULL) {
      return(ISetterBaseCollection.ABI.makeISetterBaseCollection(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISetterBaseCollection>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISetterBaseCollection.ABI.makeISetterBaseCollection(ref.value))
  }

  private fun as_1070388601(): IVector<SetterBase?> {
    if(pointer == NULL) {
      return(IVector.ABI.makeIVector<SetterBase?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVector<SetterBase?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVector.ABI.makeIVector<SetterBase?>(ref.value))
  }

  private fun as_1449643190(): IIterable<SetterBase?> {
    if(pointer == NULL) {
      return(IIterable.ABI.makeIIterable<SetterBase?>(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIterable<SetterBase?>>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIterable.ABI.makeIIterable<SetterBase?>(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SetterBaseCollection> {
    public override fun getValue() = SetterBaseCollection(pointer.getPointer(0))

    public fun setValue(value: SetterBaseCollection): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SetterBaseCollection, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.SetterBaseCollection".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): SetterBaseCollection {
      val address = segment.toRawLongValue()
      return SetterBaseCollection(Pointer(address))
    }

    public override fun toNative(obj: SetterBaseCollection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
