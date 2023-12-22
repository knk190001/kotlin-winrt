package Windows.Foundation.Diagnostics

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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

@ABIMarker(LoggingChannelOptions.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.LoggingChannelOptions;{c3e847ff-0ebb-4a53-8c54-dec24926cb2c})")
@WinRTByReference(brClass = LoggingChannelOptions.ByReference::class)
public class LoggingChannelOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILoggingChannelOptions.WithDefault, IWinRTObject {
  private val __877268077_Interface: ILoggingChannelOptions.WithDefault by lazy {
    as_877268077()
  }


  public override val __877268077_Ptr: JNAPointer? by lazy {
    __877268077_Interface.__877268077_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__877268077_Interface)

  public constructor() : this(ABI.activate())

  public constructor(group: Guid.GUID) : this(ABI.activate(group))

  private fun as_877268077(): ILoggingChannelOptions.WithDefault {
    if(pointer == NULL) {
      return(ILoggingChannelOptions.ABI.makeILoggingChannelOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingChannelOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingChannelOptions.ABI.makeILoggingChannelOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoggingChannelOptions> {
    public override fun getValue() = LoggingChannelOptions(pointer.getPointer(0))

    public fun setValue(value: LoggingChannelOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoggingChannelOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ILoggingChannelOptionsFactory_Instance: ILoggingChannelOptionsFactory by lazy {
      createILoggingChannelOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.LoggingChannelOptions".toHandle(),
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

    public fun createILoggingChannelOptionsFactory(): ILoggingChannelOptionsFactory {
      val refiid = Guid.REFIID(ILoggingChannelOptionsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.LoggingChannelOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILoggingChannelOptionsFactory.ABI.makeILoggingChannelOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(group: Guid.GUID): JNAPointer? =
        ILoggingChannelOptionsFactory_Instance.Create(group)?.pointer

    public override fun fromNative(segment: MemoryAddress): LoggingChannelOptions {
      val address = segment.toRawLongValue()
      return LoggingChannelOptions(Pointer(address))
    }

    public override fun toNative(obj: LoggingChannelOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
