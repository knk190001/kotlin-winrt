package Windows.Foundation.Diagnostics

import Windows.Foundation.Diagnostics.ILoggingChannelFactory2.ABI.IID
import Windows.Foundation.IClosable
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

@ABIMarker(LoggingChannel.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.LoggingChannel;{e9a50343-11d7-4f01-b5ca-cf495278c0a8})")
@WinRTByReference(brClass = LoggingChannel.ByReference::class)
public class LoggingChannel(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILoggingChannel.WithDefault, IClosable.WithDefault,
    ILoggingChannel2.WithDefault, ILoggingTarget.WithDefault, IWinRTObject {
  private val __1958105329_Interface: ILoggingChannel.WithDefault by lazy {
    as_1958105329()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __571723105_Interface: ILoggingChannel2.WithDefault by lazy {
    as_571723105()
  }


  private val __1118672925_Interface: ILoggingTarget.WithDefault by lazy {
    as_1118672925()
  }


  public override val __1958105329_Ptr: JNAPointer? by lazy {
    __1958105329_Interface.__1958105329_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __571723105_Ptr: JNAPointer? by lazy {
    __571723105_Interface.__571723105_Ptr
  }


  public override val __1118672925_Ptr: JNAPointer? by lazy {
    __1118672925_Interface.__1118672925_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1958105329_Interface, __1260617006_Interface, __571723105_Interface,
        __1118672925_Interface)

  public constructor(name: String, options: LoggingChannelOptions) : this(ABI.activate(name,
      options))

  public constructor(
    name: String,
    options: LoggingChannelOptions,
    id: Guid.GUID
  ) : this(ABI.activate(name, options, id))

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_1958105329(): ILoggingChannel.WithDefault {
    if(pointer == NULL) {
      return(ILoggingChannel.ABI.makeILoggingChannel(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingChannel>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingChannel.ABI.makeILoggingChannel(ref.value))
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

  private fun as_571723105(): ILoggingChannel2.WithDefault {
    if(pointer == NULL) {
      return(ILoggingChannel2.ABI.makeILoggingChannel2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingChannel2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingChannel2.ABI.makeILoggingChannel2(ref.value))
  }

  private fun as_1118672925(): ILoggingTarget.WithDefault {
    if(pointer == NULL) {
      return(ILoggingTarget.ABI.makeILoggingTarget(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingTarget>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingTarget.ABI.makeILoggingTarget(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LoggingChannel>
      {
    public override fun getValue() = LoggingChannel(pointer.getPointer(0))

    public fun setValue(value: LoggingChannel): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoggingChannel, MemoryAddress> {
    public val ILoggingChannelFactory2_Instance: ILoggingChannelFactory2 by lazy {
      createILoggingChannelFactory2()
    }


    public val ILoggingChannelFactory_Instance: ILoggingChannelFactory by lazy {
      createILoggingChannelFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILoggingChannelFactory2(): ILoggingChannelFactory2 {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.LoggingChannel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILoggingChannelFactory2.ABI.makeILoggingChannelFactory2(factoryActivatorPtr.value))
    }

    public fun createILoggingChannelFactory(): ILoggingChannelFactory {
      val refiid = Guid.REFIID(ILoggingChannelFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.LoggingChannel".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILoggingChannelFactory.ABI.makeILoggingChannelFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String, options: LoggingChannelOptions): JNAPointer? =
        ILoggingChannelFactory2_Instance.CreateWithOptions(name, options)?.pointer

    public fun activate(
      name: String,
      options: LoggingChannelOptions,
      id: Guid.GUID
    ): JNAPointer? = ILoggingChannelFactory2_Instance.CreateWithOptionsAndId(name, options,
        id)?.pointer

    public fun activate(name: String): JNAPointer? =
        ILoggingChannelFactory_Instance.Create(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): LoggingChannel {
      val address = segment.toRawLongValue()
      return LoggingChannel(Pointer(address))
    }

    public override fun toNative(obj: LoggingChannel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
