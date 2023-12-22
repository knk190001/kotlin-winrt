package Windows.Globalization.NumberFormatting

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

@ABIMarker(IncrementNumberRounder.ABI::class)
@Signature("rc(Windows.Globalization.NumberFormatting.IncrementNumberRounder;{5473c375-38ed-4631-b80c-ef34fc48b7f5})")
@WinRTByReference(brClass = IncrementNumberRounder.ByReference::class)
public class IncrementNumberRounder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), INumberRounder.WithDefault, IIncrementNumberRounder.WithDefault, IWinRTObject
    {
  private val __653821297_Interface: INumberRounder.WithDefault by lazy {
    as_653821297()
  }


  private val __606463302_Interface: IIncrementNumberRounder.WithDefault by lazy {
    as_606463302()
  }


  public override val __653821297_Ptr: JNAPointer? by lazy {
    __653821297_Interface.__653821297_Ptr
  }


  public override val __606463302_Ptr: JNAPointer? by lazy {
    __606463302_Interface.__606463302_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__653821297_Interface, __606463302_Interface)

  public constructor() : this(ABI.activate())

  private fun as_653821297(): INumberRounder.WithDefault {
    if(pointer == NULL) {
      return(INumberRounder.ABI.makeINumberRounder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INumberRounder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INumberRounder.ABI.makeINumberRounder(ref.value))
  }

  private fun as_606463302(): IIncrementNumberRounder.WithDefault {
    if(pointer == NULL) {
      return(IIncrementNumberRounder.ABI.makeIIncrementNumberRounder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIncrementNumberRounder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIncrementNumberRounder.ABI.makeIIncrementNumberRounder(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IncrementNumberRounder> {
    public override fun getValue() = IncrementNumberRounder(pointer.getPointer(0))

    public fun setValue(value: IncrementNumberRounder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IncrementNumberRounder, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Globalization.NumberFormatting.IncrementNumberRounder".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): IncrementNumberRounder {
      val address = segment.toRawLongValue()
      return IncrementNumberRounder(Pointer(address))
    }

    public override fun toNative(obj: IncrementNumberRounder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
