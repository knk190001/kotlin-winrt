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
import kotlin.Long
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(LoggingOptions.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.LoggingOptions;{90bc7850-0192-4f5d-ac26-006adaca12d8})")
@WinRTByReference(brClass = LoggingOptions.ByReference::class)
public class LoggingOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILoggingOptions.WithDefault, IWinRTObject {
  private val __30319988_Interface: ILoggingOptions.WithDefault by lazy {
    as_30319988()
  }


  public override val __30319988_Ptr: JNAPointer? by lazy {
    __30319988_Interface.__30319988_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__30319988_Interface)

  public constructor() : this(ABI.activate())

  public constructor(keywords: Long) : this(ABI.activate(keywords))

  private fun as_30319988(): ILoggingOptions.WithDefault {
    if(pointer == NULL) {
      return(ILoggingOptions.ABI.makeILoggingOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingOptions.ABI.makeILoggingOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LoggingOptions>
      {
    public override fun getValue() = LoggingOptions(pointer.getPointer(0))

    public fun setValue(value: LoggingOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoggingOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ILoggingOptionsFactory_Instance: ILoggingOptionsFactory by lazy {
      createILoggingOptionsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.LoggingOptions".toHandle(),
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

    public fun createILoggingOptionsFactory(): ILoggingOptionsFactory {
      val refiid = Guid.REFIID(ILoggingOptionsFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.LoggingOptions".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILoggingOptionsFactory.ABI.makeILoggingOptionsFactory(factoryActivatorPtr.value))
    }

    public fun activate(keywords: Long): JNAPointer? =
        ILoggingOptionsFactory_Instance.CreateWithKeywords(keywords)?.pointer

    public override fun fromNative(segment: MemoryAddress): LoggingOptions {
      val address = segment.toRawLongValue()
      return LoggingOptions(Pointer(address))
    }

    public override fun toNative(obj: LoggingOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
