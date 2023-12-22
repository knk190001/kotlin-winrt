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

@ABIMarker(ValueAndLanguage.ABI::class)
@Signature("rc(Windows.Storage.Search.ValueAndLanguage;{b9914881-a1ee-4bc4-92a5-466968e30436})")
@WinRTByReference(brClass = ValueAndLanguage.ByReference::class)
public class ValueAndLanguage(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IValueAndLanguage.WithDefault, IWinRTObject {
  private val __645035937_Interface: IValueAndLanguage.WithDefault by lazy {
    as_645035937()
  }


  public override val __645035937_Ptr: JNAPointer? by lazy {
    __645035937_Interface.__645035937_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__645035937_Interface)

  public constructor() : this(ABI.activate())

  private fun as_645035937(): IValueAndLanguage.WithDefault {
    if(pointer == NULL) {
      return(IValueAndLanguage.ABI.makeIValueAndLanguage(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IValueAndLanguage>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IValueAndLanguage.ABI.makeIValueAndLanguage(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ValueAndLanguage> {
    public override fun getValue() = ValueAndLanguage(pointer.getPointer(0))

    public fun setValue(value: ValueAndLanguage): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ValueAndLanguage, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Storage.Search.ValueAndLanguage".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ValueAndLanguage {
      val address = segment.toRawLongValue()
      return ValueAndLanguage(Pointer(address))
    }

    public override fun toNative(obj: ValueAndLanguage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
