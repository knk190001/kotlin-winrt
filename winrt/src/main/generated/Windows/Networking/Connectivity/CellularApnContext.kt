package Windows.Networking.Connectivity

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

@ABIMarker(CellularApnContext.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.CellularApnContext;{6fa529f4-effd-4542-9ab2-705bbf94943a})")
@WinRTByReference(brClass = CellularApnContext.ByReference::class)
public class CellularApnContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICellularApnContext.WithDefault, ICellularApnContext2.WithDefault,
    IWinRTObject {
  private val __915939811_Interface: ICellularApnContext.WithDefault by lazy {
    as_915939811()
  }


  private val __1670636981_Interface: ICellularApnContext2.WithDefault by lazy {
    as_1670636981()
  }


  public override val __915939811_Ptr: JNAPointer? by lazy {
    __915939811_Interface.__915939811_Ptr
  }


  public override val __1670636981_Ptr: JNAPointer? by lazy {
    __1670636981_Interface.__1670636981_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__915939811_Interface, __1670636981_Interface)

  public constructor() : this(ABI.activate())

  private fun as_915939811(): ICellularApnContext.WithDefault {
    if(pointer == NULL) {
      return(ICellularApnContext.ABI.makeICellularApnContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICellularApnContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICellularApnContext.ABI.makeICellularApnContext(ref.value))
  }

  private fun as_1670636981(): ICellularApnContext2.WithDefault {
    if(pointer == NULL) {
      return(ICellularApnContext2.ABI.makeICellularApnContext2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICellularApnContext2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICellularApnContext2.ABI.makeICellularApnContext2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CellularApnContext> {
    public override fun getValue() = CellularApnContext(pointer.getPointer(0))

    public fun setValue(value: CellularApnContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CellularApnContext, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Connectivity.CellularApnContext".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): CellularApnContext {
      val address = segment.toRawLongValue()
      return CellularApnContext(Pointer(address))
    }

    public override fun toNative(obj: CellularApnContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
