package Windows.Security.Isolation

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

@ABIMarker(IsolatedWindowsEnvironment.ABI::class)
@Signature("rc(Windows.Security.Isolation.IsolatedWindowsEnvironment;{41d24597-c328-4467-b37f-4dfc6f60b6bc})")
@WinRTByReference(brClass = IsolatedWindowsEnvironment.ByReference::class)
public class IsolatedWindowsEnvironment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIsolatedWindowsEnvironment.WithDefault,
    IIsolatedWindowsEnvironment2.WithDefault, IIsolatedWindowsEnvironment3.WithDefault, IWinRTObject
    {
  private val __2047448519_Interface: IIsolatedWindowsEnvironment.WithDefault by lazy {
    as_2047448519()
  }


  private val __953605301_Interface: IIsolatedWindowsEnvironment2.WithDefault by lazy {
    as_953605301()
  }


  private val __953605300_Interface: IIsolatedWindowsEnvironment3.WithDefault by lazy {
    as_953605300()
  }


  public override val __2047448519_Ptr: JNAPointer? by lazy {
    __2047448519_Interface.__2047448519_Ptr
  }


  public override val __953605301_Ptr: JNAPointer? by lazy {
    __953605301_Interface.__953605301_Ptr
  }


  public override val __953605300_Ptr: JNAPointer? by lazy {
    __953605300_Interface.__953605300_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2047448519_Interface, __953605301_Interface, __953605300_Interface)

  private fun as_2047448519(): IIsolatedWindowsEnvironment.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironment.ABI.makeIIsolatedWindowsEnvironment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironment.ABI.makeIIsolatedWindowsEnvironment(ref.value))
  }

  private fun as_953605301(): IIsolatedWindowsEnvironment2.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironment2.ABI.makeIIsolatedWindowsEnvironment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironment2.ABI.makeIIsolatedWindowsEnvironment2(ref.value))
  }

  private fun as_953605300(): IIsolatedWindowsEnvironment3.WithDefault {
    if(pointer == NULL) {
      return(IIsolatedWindowsEnvironment3.ABI.makeIIsolatedWindowsEnvironment3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIsolatedWindowsEnvironment3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIsolatedWindowsEnvironment3.ABI.makeIIsolatedWindowsEnvironment3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IsolatedWindowsEnvironment> {
    public override fun getValue() = IsolatedWindowsEnvironment(pointer.getPointer(0))

    public fun setValue(value: IsolatedWindowsEnvironment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IsolatedWindowsEnvironment, MemoryAddress> {
    public val IIsolatedWindowsEnvironmentFactory_Instance: IIsolatedWindowsEnvironmentFactory by
        lazy {
      createIIsolatedWindowsEnvironmentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIIsolatedWindowsEnvironmentFactory(): IIsolatedWindowsEnvironmentFactory {
      val refiid = Guid.REFIID(IIsolatedWindowsEnvironmentFactory.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Isolation.IsolatedWindowsEnvironment".toHandle(),refiid,interfacePtr)
      val result =
          IIsolatedWindowsEnvironmentFactory.ABI.makeIIsolatedWindowsEnvironmentFactory(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): IsolatedWindowsEnvironment {
      val address = segment.toRawLongValue()
      return IsolatedWindowsEnvironment(Pointer(address))
    }

    public override fun toNative(obj: IsolatedWindowsEnvironment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync(options: IsolatedWindowsEnvironmentOptions) =
        ABI.IIsolatedWindowsEnvironmentFactory_Instance.CreateAsync(options)

    public fun CreateAsync(options: IsolatedWindowsEnvironmentOptions,
        telemetryParameters: IsolatedWindowsEnvironmentTelemetryParameters) =
        ABI.IIsolatedWindowsEnvironmentFactory_Instance.CreateAsync(options, telemetryParameters)

    public fun GetById(environmentId: String) =
        ABI.IIsolatedWindowsEnvironmentFactory_Instance.GetById(environmentId)

    public fun FindByOwnerId(environmentOwnerId: String) =
        ABI.IIsolatedWindowsEnvironmentFactory_Instance.FindByOwnerId(environmentOwnerId)
  }
}
