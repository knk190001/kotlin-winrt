package Windows.Foundation

import Windows.Foundation.IDeferralFactory.ABI.IID
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

@ABIMarker(Deferral.ABI::class)
@Signature("rc(Windows.Foundation.Deferral;{d6269732-3b7f-46a7-b40b-4fdca2a2c693})")
@WinRTByReference(brClass = Deferral.ByReference::class)
public class Deferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeferral.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1705435306_Interface: IDeferral.WithDefault by lazy {
    as_1705435306()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1705435306_Ptr: JNAPointer? by lazy {
    __1705435306_Interface.__1705435306_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1705435306_Interface, __1260617006_Interface)

  public constructor(handler: DeferralCompletedHandler) : this(ABI.activate(handler))

  private fun as_1705435306(): IDeferral.WithDefault {
    if(pointer == NULL) {
      return(IDeferral.ABI.makeIDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeferral.ABI.makeIDeferral(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Deferral> {
    public override fun getValue() = Deferral(pointer.getPointer(0))

    public fun setValue(value: Deferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Deferral, MemoryAddress> {
    public val IDeferralFactory_Instance: IDeferralFactory by lazy {
      createIDeferralFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeferralFactory(): IDeferralFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Deferral".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IDeferralFactory.ABI.makeIDeferralFactory(factoryActivatorPtr.value))
    }

    public fun activate(handler: DeferralCompletedHandler): JNAPointer? =
        IDeferralFactory_Instance.Create(handler)?.pointer

    public override fun fromNative(segment: MemoryAddress): Deferral {
      val address = segment.toRawLongValue()
      return Deferral(Pointer(address))
    }

    public override fun toNative(obj: Deferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
