package Windows.Foundation.Diagnostics

import Windows.Foundation.Diagnostics.ILoggingSessionFactory.ABI.IID
import Windows.Foundation.IClosable
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

@ABIMarker(LoggingSession.ABI::class)
@Signature("rc(Windows.Foundation.Diagnostics.LoggingSession;{6221f306-9380-4ad7-baf5-41ea9310d768})")
@WinRTByReference(brClass = LoggingSession.ByReference::class)
public class LoggingSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILoggingSession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1090824572_Interface: ILoggingSession.WithDefault by lazy {
    as_1090824572()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1090824572_Ptr: JNAPointer? by lazy {
    __1090824572_Interface.__1090824572_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1090824572_Interface, __1260617006_Interface)

  public constructor(name: String) : this(ABI.activate(name))

  private fun as_1090824572(): ILoggingSession.WithDefault {
    if(pointer == NULL) {
      return(ILoggingSession.ABI.makeILoggingSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoggingSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoggingSession.ABI.makeILoggingSession(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<LoggingSession>
      {
    public override fun getValue() = LoggingSession(pointer.getPointer(0))

    public fun setValue(value: LoggingSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoggingSession, MemoryAddress> {
    public val ILoggingSessionFactory_Instance: ILoggingSessionFactory by lazy {
      createILoggingSessionFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILoggingSessionFactory(): ILoggingSessionFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Foundation.Diagnostics.LoggingSession".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILoggingSessionFactory.ABI.makeILoggingSessionFactory(factoryActivatorPtr.value))
    }

    public fun activate(name: String): JNAPointer? =
        ILoggingSessionFactory_Instance.Create(name)?.pointer

    public override fun fromNative(segment: MemoryAddress): LoggingSession {
      val address = segment.toRawLongValue()
      return LoggingSession(Pointer(address))
    }

    public override fun toNative(obj: LoggingSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
