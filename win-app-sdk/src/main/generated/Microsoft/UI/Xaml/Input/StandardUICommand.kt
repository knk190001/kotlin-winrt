package Microsoft.UI.Xaml.Input

import Microsoft.UI.Xaml.Input.IStandardUICommandFactory.ABI.IID
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
@Signature("rc(Microsoft.UI.Xaml.Input.StandardUICommand;{5f395d50-5449-59ab-9cb2-4e3700033f03})")
@WinRTByReference(brClass = StandardUICommand.ByReference::class)
public open class StandardUICommand(
  ptr: JNAPointer? = NULL
) : XamlUICommand(ptr), IStandardUICommand.WithDefault, IWinRTObject {
  private val __2117570127_Interface: IStandardUICommand.WithDefault by lazy {
    as_2117570127()
  }


  public override val __2117570127_Ptr: JNAPointer? by lazy {
    __2117570127_Interface.__2117570127_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2117570127_Interface)

  public constructor() : this(ABI.activate())

  public constructor(kind: StandardUICommandKind) : this(ABI.activate(kind))

  private fun as_2117570127(): IStandardUICommand.WithDefault {
    if(pointer == NULL) {
      return(IStandardUICommand.ABI.makeIStandardUICommand(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IStandardUICommand>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IStandardUICommand.ABI.makeIStandardUICommand(ref.value))
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
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.StandardUICommand".toHandle(),refiid,interfacePtr)
      val result = IStandardUICommandStatics.ABI.makeIStandardUICommandStatics(interfacePtr.value)
      return result
    }

    public fun createIStandardUICommandFactory(): IStandardUICommandFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Input.StandardUICommand".toHandle(),refiid,factoryActivatorPtr)
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
