package Windows.Management

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

@ABIMarker(MdmAlert.ABI::class)
@Signature("rc(Windows.Management.MdmAlert;{b0fbc327-28c1-4b52-a548-c5807caf70b6})")
@WinRTByReference(brClass = MdmAlert.ByReference::class)
public class MdmAlert(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMdmAlert.WithDefault, IWinRTObject {
  private val __1651751841_Interface: IMdmAlert.WithDefault by lazy {
    as_1651751841()
  }


  public override val __1651751841_Ptr: JNAPointer? by lazy {
    __1651751841_Interface.__1651751841_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1651751841_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1651751841(): IMdmAlert.WithDefault {
    if(pointer == NULL) {
      return(IMdmAlert.ABI.makeIMdmAlert(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMdmAlert>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMdmAlert.ABI.makeIMdmAlert(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MdmAlert> {
    public override fun getValue() = MdmAlert(pointer.getPointer(0))

    public fun setValue(value: MdmAlert): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MdmAlert, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Management.MdmAlert".toHandle(), refiid,
          iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): MdmAlert {
      val address = segment.toRawLongValue()
      return MdmAlert(Pointer(address))
    }

    public override fun toNative(obj: MdmAlert): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
