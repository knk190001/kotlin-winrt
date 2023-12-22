package Windows.UI.Xaml.Input

import Windows.UI.Xaml.Input.IStandardUICommandFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(StandardUICommand.ABI::class)
@Signature("rc(Windows.UI.Xaml.Input.StandardUICommand;{d2bf7f43-0504-52d0-8aa6-0cb0f756eb27})")
@WinRTByReference(brClass = StandardUICommand.ByReference::class)
public open class StandardUICommand(
  ptr: JNAPointer? = NULL
) : XamlUICommand(ptr), IStandardUICommand.WithDefault, IStandardUICommand2.WithDefault,
    IWinRTObject {
  private val __1287119844_Interface: IStandardUICommand.WithDefault by lazy {
    as_1287119844()
  }


  private val __1246009550_Interface: IStandardUICommand2.WithDefault by lazy {
    as_1246009550()
  }


  public override val __1287119844_Ptr: JNAPointer? by lazy {
    __1287119844_Interface.__1287119844_Ptr
  }


  public override val __1246009550_Ptr: JNAPointer? by lazy {
    __1246009550_Interface.__1246009550_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1287119844_Interface, __1246009550_Interface)

  public constructor() : this(ABI.activate())

  public constructor(kind: StandardUICommandKind) : this(ABI.activate(kind))

  private fun as_1287119844(): IStandardUICommand.WithDefault {
    if(pointer == NULL) {
      return(IStandardUICommand.ABI.makeIStandardUICommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStandardUICommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStandardUICommand.ABI.makeIStandardUICommand(ref.value))
  }

  private fun as_1246009550(): IStandardUICommand2.WithDefault {
    if(pointer == NULL) {
      return(IStandardUICommand2.ABI.makeIStandardUICommand2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStandardUICommand2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStandardUICommand2.ABI.makeIStandardUICommand2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<StandardUICommand> {
    public override fun getValue() = StandardUICommand(pointer.getPointer(0))

    public fun setValue(value: StandardUICommand): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<StandardUICommand, MemoryAddress> {
    public val IStandardUICommandStatics_Instance: IStandardUICommandStatics by lazy {
      createIStandardUICommandStatics()
    }


    public val IStandardUICommandFactory_Instance: IStandardUICommandFactory by lazy {
      createIStandardUICommandFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIStandardUICommandStatics(): IStandardUICommandStatics {
      val refiid = Guid.REFIID(IStandardUICommandStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.StandardUICommand".toHandle(),refiid,interfacePtr)
      val result = IStandardUICommandStatics.ABI.makeIStandardUICommandStatics(interfacePtr.value)
      return result
    }

    public fun createIStandardUICommandFactory(): IStandardUICommandFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Input.StandardUICommand".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IStandardUICommandFactory.ABI.makeIStandardUICommandFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IStandardUICommandFactory_Instance.CreateInstance(null,
        null)?.pointer

    public fun activate(kind: StandardUICommandKind): JNAPointer? =
        IStandardUICommandFactory_Instance.CreateInstanceWithKind(kind, null, null)?.pointer

    public override fun fromNative(segment: MemoryAddress): StandardUICommand {
      val address = segment.toRawLongValue()
      return StandardUICommand(Pointer(address))
    }

    public override fun toNative(obj: StandardUICommand): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_KindProperty() = ABI.IStandardUICommandStatics_Instance.get_KindProperty()
  }
}
