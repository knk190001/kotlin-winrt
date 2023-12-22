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

@ABIMarker(ConnectionProfileFilter.ABI::class)
@Signature("rc(Windows.Networking.Connectivity.ConnectionProfileFilter;{204c7cc8-bd2d-4e8d-a4b3-455ec337388a})")
@WinRTByReference(brClass = ConnectionProfileFilter.ByReference::class)
public class ConnectionProfileFilter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IConnectionProfileFilter.WithDefault, IConnectionProfileFilter2.WithDefault,
    IConnectionProfileFilter3.WithDefault, IWinRTObject {
  private val __252239968_Interface: IConnectionProfileFilter.WithDefault by lazy {
    as_252239968()
  }


  private val __770495634_Interface: IConnectionProfileFilter2.WithDefault by lazy {
    as_770495634()
  }


  private val __770495635_Interface: IConnectionProfileFilter3.WithDefault by lazy {
    as_770495635()
  }


  public override val __252239968_Ptr: JNAPointer? by lazy {
    __252239968_Interface.__252239968_Ptr
  }


  public override val __770495634_Ptr: JNAPointer? by lazy {
    __770495634_Interface.__770495634_Ptr
  }


  public override val __770495635_Ptr: JNAPointer? by lazy {
    __770495635_Interface.__770495635_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__252239968_Interface, __770495634_Interface, __770495635_Interface)

  public constructor() : this(ABI.activate())

  private fun as_252239968(): IConnectionProfileFilter.WithDefault {
    if(pointer == NULL) {
      return(IConnectionProfileFilter.ABI.makeIConnectionProfileFilter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionProfileFilter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionProfileFilter.ABI.makeIConnectionProfileFilter(ref.value))
  }

  private fun as_770495634(): IConnectionProfileFilter2.WithDefault {
    if(pointer == NULL) {
      return(IConnectionProfileFilter2.ABI.makeIConnectionProfileFilter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionProfileFilter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionProfileFilter2.ABI.makeIConnectionProfileFilter2(ref.value))
  }

  private fun as_770495635(): IConnectionProfileFilter3.WithDefault {
    if(pointer == NULL) {
      return(IConnectionProfileFilter3.ABI.makeIConnectionProfileFilter3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IConnectionProfileFilter3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IConnectionProfileFilter3.ABI.makeIConnectionProfileFilter3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ConnectionProfileFilter> {
    public override fun getValue() = ConnectionProfileFilter(pointer.getPointer(0))

    public fun setValue(value: ConnectionProfileFilter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ConnectionProfileFilter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.Connectivity.ConnectionProfileFilter".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ConnectionProfileFilter {
      val address = segment.toRawLongValue()
      return ConnectionProfileFilter(Pointer(address))
    }

    public override fun toNative(obj: ConnectionProfileFilter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
